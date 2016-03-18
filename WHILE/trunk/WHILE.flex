// Scanner for the WHILE language of "Principles of Program Analysis", adapted from JastAdd's PicoJava scanner
//
// AUTHOR: Gary T. Leavens (with help from Rochelle Elva and Ghaith Haddad)

package AST;

import beaver.Symbol;
import beaver.Scanner;
import AST.WHILEParser.Terminals;

%%
%public
%final
%class WHILEScanner
%extends Scanner
%unicode
%function nextToken
%type Symbol
%yylexthrow Scanner.Exception
%line
%column

%{
  private Symbol sym(short id) {
    return new Symbol(id, yyline + 1, yycolumn + 1, yylength(), yytext());
  }
%}

// Helper Definitions
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

WhiteSpace = {LineTerminator} | [ \t\f]
Comment = [%] {InputCharacter}* {LineTerminator}?
IdChar = ([:letter:]|['_])
Identifier = {IdChar}({IdChar} | [:digit:])*

%% 
{Comment}     { /* discard token */ }
{WhiteSpace}  { /* discard token */ }

// Rules
":="                 { return sym(Terminals.ASSIGN); }
";"                  { return sym(Terminals.SEMICOLON); }
"if"                 { return sym(Terminals.IF); }
"then"				 { return sym(Terminals.THEN); }
"else"			     { return sym(Terminals.ELSE); }
"while"              { return sym(Terminals.WHILE); }
"do"				 { return sym(Terminals.DO); }
"skip"               { return sym(Terminals.SKIP); }
"not"                { return sym(Terminals.NOT); }
"true"               { return sym(Terminals.TRUE); }
"false"              { return sym(Terminals.FALSE); }
"assert"			 { return sym(Terminals.ASSERT); }

// Operators
"and"                { return sym(Terminals.AND); }
"or"                 { return sym(Terminals.OR); }
("=="|"!="|"<"|"<="|">="|">")   { return sym(Terminals.OPRELATIONAL); }
// split + and - so later could handle unary minus separately...
"+"                       { return sym(Terminals.OPPLUS); }
"-"                       { return sym(Terminals.OPMINUS); }
("*"|"/")                       { return sym(Terminals.OPMUL); }

// Separators
"("                             { return sym(Terminals.LPAREN); }
")"                             { return sym(Terminals.RPAREN); }
"{"                             { return sym(Terminals.LBRACE); }
"}"                             { return sym(Terminals.RBRACE); }
"assert"			 { return sym(Terminals.ASSERT); }

"read"                           { return sym(Terminals.READ); }
"sanitize"                       { return sym(Terminals.SANITIZE); }
"print"                          { return sym(Terminals.PRINT); }

  
[:digit:]+    { return sym(Terminals.NUMBER); }
{Identifier}  { return sym(Terminals.IDENTIFIER); }

<<EOF>>       { return sym(Terminals.EOF); }
.          { throw new RuntimeException("Illegal character \""+yytext()+ "\" at line "+yyline+", column "+yycolumn); }