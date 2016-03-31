package AST;

import java.io.*;
import beaver.Symbol;
import beaver.Scanner;
import AST.PicoCParser.Terminals;

%%

%public
%final
%class PicoCScanner
%extends Scanner

%type Symbol
%function nextToken
%yylexthrow Scanner.Exception

%unicode
%line %column

%{
  StringBuffer strbuf = new StringBuffer(128);
  int sub_line;
  int sub_column;
  int strlit_start_line, strlit_start_column;

  private Symbol sym(short id) {
    return new Symbol(id, yyline + 1, yycolumn + 1, len(), str());
  }

  private Symbol sym(short id, String value) {
    return new Symbol(id, yyline + 1, yycolumn + 1, len(), value);
  }

  private Symbol sym(short id, String value, int start_line, int start_column, int len) {
    return new Symbol(id, start_line, start_column, len, value);
  }

  private String str() { return yytext(); }
  private int len() { return yylength(); }

  private void error(String msg) throws Scanner.Exception {
    throw new Scanner.Exception(yyline + 1, yycolumn + 1, msg);
  }
%}


/* 3.4 Line Terminators */
LineTerminator = \n|\r|\r\n
InputCharacter = [^\r\n]

/* 3.6 White Space */
WhiteSpace = [ ] | \t | \f | {LineTerminator}

/* 3.7 Comments */
Comment = {TraditionalComment} | {EndOfLineComment}

TraditionalComment = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment = "//" {InputCharacter}* {LineTerminator}?

/* 3.8 Identifiers */
Identifier = [:jletter:][:jletterdigit:]*

/* 3.10.1 Integer Literals */
DecimalNumeral = 0 | {NonZeroDigit} {Digits}?
HexNumeral = 0 [xX] [0-9a-fA-F]+
OctalNumeral = 0 [0-7]+

Digits = {Digit}+
Digit = 0 | {NonZeroDigit}
NonZeroDigit = [1-9]

/* 3.10.2 Floating-Point Literals */
FloatingPointLiteral = {Digits} \. {Digits}? {ExponentPart}?
                     | \. {Digits} {ExponentPart}?
                     | {Digits} {ExponentPart}
ExponentPart = [eE] [+-]? [0-9]+

/* 3.10.4 Character Literals */
SingleCharacter = [^\r\n\'\\]

/* 3.10.5 String Literals */
StringCharacter = [^\r\n\"\\]

/* 3.10.6 Escape Sequences for Character and String Literals */
OctalEscape = \\ {OctalDigit}
            | \\ {OctalDigit} {OctalDigit}
            | \\  {ZeroToThree} {OctalDigit} {OctalDigit}
OctalDigit = [0-7]
ZeroToThree = [0-3]

%state STRING

%%

/* 3.6 White Space */
<YYINITIAL> {WhiteSpace} { }

/* 3.7 Comments */
<YYINITIAL> {
  {Comment} { }
}

/* 3.9 Keywords */
<YYINITIAL> {
  "break"           { return sym(Terminals.BREAK); }
//  "case"            { return sym(Terminals.CASE); }
//  "const"           { return sym(Terminals.EOF); }
  "continue"        { return sym(Terminals.CONTINUE); }
//  "default"         { return sym(Terminals.DEFAULT); }
  "do"              { return sym(Terminals.DO); }
  "else"            { return sym(Terminals.ELSE); }
  "for"             { return sym(Terminals.FOR); }
  "goto"            { return sym(Terminals.GOTO); }
  "if"              { return sym(Terminals.IF); }
//  "return"          { return sym(Terminals.RETURN); }
//  "switch"          { return sym(Terminals.SWITCH); }
  "while"           { return sym(Terminals.WHILE); }
  "byte"           { return sym(Terminals.BYTE); }
  "short"           { return sym(Terminals.SHORT); }
  "int"           { return sym(Terminals.INT); }
  "long"           { return sym(Terminals.LONG); }
  "char"           { return sym(Terminals.CHAR); }
}

/* 3.10 Literals */
<YYINITIAL> {
  /* 3.10.1 Integer Literals */
  {DecimalNumeral}               { return sym(Terminals.INTEGER_LITERAL); }
  {DecimalNumeral} [lL]          { return sym(Terminals.LONG_LITERAL); }

  {HexNumeral}                   { return sym(Terminals.INTEGER_LITERAL); }
  {HexNumeral} [lL]              { return sym(Terminals.LONG_LITERAL); }

  {OctalNumeral}                 { return sym(Terminals.INTEGER_LITERAL); }
  {OctalNumeral} [lL]            { return sym(Terminals.LONG_LITERAL); }

  /* 3.10.2 Floating-Point Literals */
  {FloatingPointLiteral} [fF]    { return sym(Terminals.FLOATING_POINT_LITERAL); }
  {FloatingPointLiteral} [dD]    { return sym(Terminals.DOUBLE_LITERAL); }
  {FloatingPointLiteral}         { return sym(Terminals.DOUBLE_LITERAL); }
  [0-9]+ {ExponentPart}? [fF]    { return sym(Terminals.FLOATING_POINT_LITERAL); }
  [0-9]+ {ExponentPart}? [dD]    { return sym(Terminals.DOUBLE_LITERAL); }


  /* 3.10.4 Character Literals */
  \'{SingleCharacter}\'          { return sym(Terminals.CHARACTER_LITERAL, str().substring(1, len() - 1)); }
  /* 3.10.6 Escape Sequences for Character Literals */
  \'"\\b"\'                      { return sym(Terminals.CHARACTER_LITERAL, "\b"); }
  \'"\\t"\'                      { return sym(Terminals.CHARACTER_LITERAL, "\t"); }
  \'"\\n"\'                      { return sym(Terminals.CHARACTER_LITERAL, "\n"); }
  \'"\\f"\'                      { return sym(Terminals.CHARACTER_LITERAL, "\f"); }
  \'"\\r"\'                      { return sym(Terminals.CHARACTER_LITERAL, "\r"); }
  \'"\\\""\'                     { return sym(Terminals.CHARACTER_LITERAL, "\""); }
  \'"\\'"\'                      { return sym(Terminals.CHARACTER_LITERAL, "\'"); }
  \'"\\\\"\'                     { return sym(Terminals.CHARACTER_LITERAL, "\\"); }
  \'{OctalEscape}\'              { int val = Integer.parseInt(str().substring(2, len() - 1), 8);
                                   return sym(Terminals.CHARACTER_LITERAL, "" + ((char) val)); }
  /* Character Literal errors */
  \'\\.                          { error("illegal escape sequence \""+str()+"\""); }
  \'{LineTerminator}             { error("unterminated character literal at end of line"); }

  /* 3.10.5 String Literals */
  \" {
    yybegin(STRING);
    /* remember start position of string literal so we can */
    /* set its position correctly in the end */
    strlit_start_line = yyline+1;
    strlit_start_column = yycolumn+1;
    strbuf.setLength(0);
  }

  /* 3.10.7 The Null Literal */
}

/* 3.10.5 String Literals */
<STRING> {
  \"                             { yybegin(YYINITIAL);
                                   return sym(Terminals.STRING_LITERAL, strbuf.toString(), strlit_start_line, strlit_start_column, strbuf.length()+2); }

  {StringCharacter}+             { strbuf.append(str()); }

  /* 3.10.6 Escape sequences for String Literals */
  "\\b"                          { strbuf.append( '\b' ); }
  "\\t"                          { strbuf.append( '\t' ); }
  "\\n"                          { strbuf.append( '\n' ); }
  "\\f"                          { strbuf.append( '\f' ); }
  "\\r"                          { strbuf.append( '\r' ); }
  "\\\""                         { strbuf.append( '\"' ); }
  "\\'"                          { strbuf.append( '\'' ); }
  "\\\\"                         { strbuf.append( '\\' ); }
  {OctalEscape}                  { strbuf.append((char)Integer.parseInt(str().substring(1),8)); }

  /* String Literal errors */
  \\.                            { error("illegal escape sequence \""+str()+"\""); }
  {LineTerminator}               { error("unterminated string at end of line"); }
}


/* 3.11 Separators */
<YYINITIAL> {
  "("   { return sym(Terminals.LPAREN); }
  ")"   { return sym(Terminals.RPAREN); }
  "{"   { return sym(Terminals.LBRACE); }
  "}"   { return sym(Terminals.RBRACE); }
  ";"   { return sym(Terminals.SEMICOLON); }
  ","   { return sym(Terminals.COMMA); }
}

/* 3.12 Operators */
<YYINITIAL> {
  "="                            { return sym(Terminals.EQ); }
  ">"                            { return sym(Terminals.GT); }
  "<"                            { return sym(Terminals.LT); }
  "!"                            { return sym(Terminals.NOT); }
  "~"                            { return sym(Terminals.COMP); }
  "?"                            { return sym(Terminals.QUESTION); }
  ":"                            { return sym(Terminals.COLON); }
  "=="                           { return sym(Terminals.EQEQ); }
  "<="                           { return sym(Terminals.LTEQ); }
  ">="                           { return sym(Terminals.GTEQ); }
  "!="                           { return sym(Terminals.NOTEQ); }
  "&&"                           { return sym(Terminals.ANDAND); }
  "||"                           { return sym(Terminals.OROR); }
  "++"                           { return sym(Terminals.PLUSPLUS); }
  "--"                           { return sym(Terminals.MINUSMINUS); }
  "+"                            { return sym(Terminals.PLUS); }
  "-"                            { return sym(Terminals.MINUS); }
  "*"                            { return sym(Terminals.MULT); }
  "/"                            { return sym(Terminals.DIV); }
  "&"                            { return sym(Terminals.AND); }
  "|"                            { return sym(Terminals.OR); }
  "^"                            { return sym(Terminals.XOR); }
  "%"                            { return sym(Terminals.MOD); }
  "<<"                           { return sym(Terminals.LSHIFT); }
  ">>"                           { return sym(Terminals.RSHIFT); }
  "+="                           { return sym(Terminals.PLUSEQ); }
  "-="                           { return sym(Terminals.MINUSEQ); }
  "*="                           { return sym(Terminals.MULTEQ); }
  "/="                           { return sym(Terminals.DIVEQ); }
  "&="                           { return sym(Terminals.ANDEQ); }
  "|="                           { return sym(Terminals.OREQ); }
  "^="                           { return sym(Terminals.XOREQ); }
  "%="                           { return sym(Terminals.MODEQ); }
  "<<="                          { return sym(Terminals.LSHIFTEQ); }
  ">>="                          { return sym(Terminals.RSHIFTEQ); }
}

/* 3.8 Identifiers
 * Located at end of current state due to rule priority disambiguation
 */
<YYINITIAL> {
  {Identifier}  { return sym(Terminals.IDENTIFIER); }
}
/* hack to detect the SUB character as the last input character */
\u001a {
  if(sub_line == 0 && sub_column == 0) {
    sub_line = yyline; sub_column = yycolumn;
  }
}

/* fall through errors */
[^] {
  error("illegal character \""+str()+ "\"");
}

<<EOF>> {
  /* detect position of first SUB character */
  if (!(sub_line == 0 && sub_column == 0) && (sub_line != yyline || sub_column != yycolumn-1)) {
    /* reset to only return error once */
    sub_line = 0;
    sub_column = 0;
    /* return error */
    error("error");
  }
  return sym(Terminals.EOF);
}
