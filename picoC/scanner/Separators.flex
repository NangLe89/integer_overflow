/* 3.11 Separators */
<YYINITIAL> {
  "("   { return sym(Terminals.LPAREN); }
  ")"   { return sym(Terminals.RPAREN); }
  "{"   { return sym(Terminals.LBRACE); }
  "}"   { return sym(Terminals.RBRACE); }
  ";"   { return sym(Terminals.SEMICOLON); }
//  ","   { return sym(Terminals.COMMA); }
}

