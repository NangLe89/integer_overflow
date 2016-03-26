/* 3.9 Keywords */
<YYINITIAL> {
// "break"           { return sym(Terminals.BREAK); }
//  "case"            { return sym(Terminals.CASE); }
// "const"           { return sym(Terminals.EOF); }
// "continue"        { return sym(Terminals.CONTINUE); }
//"default"         { return sym(Terminals.DEFAULT); }
// "byte"           { return sym(Terminals.BYTE); }
// "short"           { return sym(Terminals.SHORT); }
// "int"           { return sym(Terminals.INT); }
// "long"           { return sym(Terminals.LONG); }
// "char"           { return sym(Terminals.CHAR); }
// "goto"            { return sym(Terminals.EOF); }
// "return"          { return sym(Terminals.RETURN); }
//  "switch"          { return sym(Terminals.SWITCH); }
  "while"           { return sym(Terminals.WHILE); }
  "do"              { return sym(Terminals.DO); }
  "else"            { return sym(Terminals.ELSE); }
  "for"             { return sym(Terminals.FOR); }
  "if"              { return sym(Terminals.IF); }
}

