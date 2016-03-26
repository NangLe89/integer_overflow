// Generated from parser/picoC.parser
package AST;
import AST.*;
import utility.LabelUtility; 
import beaver.*;
import java.util.ArrayList;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "PicoCParser.beaver".
 */
public class PicoCParser extends Parser {
	static public class Terminals {
		static public final short EOF = 0;
		static public final short IDENTIFIER = 1;
		static public final short LBRACE = 2;
		static public final short SEMICOLON = 3;
		static public final short FOR = 4;
		static public final short IF = 5;
		static public final short WHILE = 6;
		static public final short SKIP = 7;
		static public final short RPAREN = 8;
		static public final short RBRACE = 9;
		static public final short OR = 10;
		static public final short DO = 11;
		static public final short XOR = 12;
		static public final short AND = 13;
		static public final short LPAREN = 14;
		static public final short NUMBER = 15;
		static public final short TRUE = 16;
		static public final short FALSE = 17;
		static public final short NOT = 18;
		static public final short PLUS = 19;
		static public final short MINUS = 20;
		static public final short EQEQ = 21;
		static public final short NOTEQ = 22;
		static public final short LT = 23;
		static public final short GT = 24;
		static public final short LTEQ = 25;
		static public final short GTEQ = 26;
		static public final short EQ = 27;
		static public final short MULT = 28;
		static public final short DIV = 29;
		static public final short MOD = 30;
		static public final short ELSE = 31;
		static public final short ASSIGN = 32;

		static public final String[] NAMES = {
			"EOF",
			"IDENTIFIER",
			"LBRACE",
			"SEMICOLON",
			"FOR",
			"IF",
			"WHILE",
			"SKIP",
			"RPAREN",
			"RBRACE",
			"OR",
			"DO",
			"XOR",
			"AND",
			"LPAREN",
			"NUMBER",
			"TRUE",
			"FALSE",
			"NOT",
			"PLUS",
			"MINUS",
			"EQEQ",
			"NOTEQ",
			"LT",
			"GT",
			"LTEQ",
			"GTEQ",
			"EQ",
			"MULT",
			"DIV",
			"MOD",
			"ELSE",
			"ASSIGN"
		};
	}

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9pjLqjiL5KO$kwz0wtJKf4o5A50XndQeIqjeY3AGomFGHuLM1Y3AwEfX8qRmbO4N1aJ4rs" +
		"wGO8BDoIkD865CN416nCUIijJtg$og40BUFtEcNFdthdt$k4ojIOOxvT$$l$yv$$E#UUVUy" +
		"wS0wIwtNCIK40MxVmS5#cfntJaqUnUbg2v7Vni5MDkIj3SsKXZaHZJBq5pvy1nNJ7cXWJDV" +
		"GdZKIt6N9UWkVCm2Janvfe4JC4oVjiqPeWnLoMW1GuMemjlY37d9P3v9jQ3JwJ7#tqlIK3f" +
		"4MCkIWXmfPWB4W9SAUQAX01NYlb3Ge0Rxl5gTLQ2pyLpc8asp48dNi2BcEkUaL3ESKzB2CM" +
		"TaX2AEoaX57T2GYYkJq8exhTueCuzBkBtU93JA#9e753h7ei3Qf5n1tnWFaOptrVmAbx3P4" +
		"n00oRYUVUl63m80sdtOGH34Gn6S3#2Un7SZU3F20OYk1N1xGZkHF0e35HnlrY2LNWT2$0ow" +
		"pCgv7ahr5OxubZMSZcQJ2sdOIgUAVbNblaRI$xHPVw5WdzfQBR7jTQ4yb9FataprNXhGvpv" +
		"s82CcMyTBI1bejEKqbiHi8hZPc2RSJCSjwPekKS4ZczbT6HmLcZVwWfvtGbuNiOePJmcGPv" +
		"U$J9urbIac4EIFFtef3oBzNHO#r7y$QjGpVSdpQhMCjCizzsS$gpdVtQcn9X4TYF$KwUEA5" +
		"UrAkNQ$DQLvzmq36ws0cureKudbN2pxCcZZYlXoRasUNcUuzmdvxgbvt$kCBX9EV$vk7#f9" +
		"va$ptk2otD$WMV9Ekx1Otco6iST9SgE6oz9r5FlONsYCUNjuex8MgBPrBAL9$FsVynVFblo" +
		"bXvFlv7DvisC6q$DPvdv75YCccMYqnJ$hV2jOfwMlgceE4kDQwmEWUDRbeuCpAfuQjQHuta" +
		"PUvLG6Jy#Jwz#jBpw5ND8aASVdPW7RFouU9RvaB85SFAKUi3#al8jVPlP$epsrzHVKAlsNk" +
		"gvrDzHTt7XVaDxdvuDpa$aJA4ieBn3sKRvYlvVgB#dFaJz0#LNShTIkYdlijtFFjxUB9xW7" +
		"DvMhJPgtjAjLPGUsaFKkwWvXxMVXrcUPYsEaPf0VPvwClKWDK#2DiT8pQ7EKlPHE9$DlEo3" +
		"zAkJFtC6vx8FKtWJjDMjd7Pg8VMFd6CJVSm7FzD#Z$PzsZTfg#$#4TlRgJ#dxA0qiky1jKL" +
		"95slfx3IQUTiVADiJ#cgCtc5qdz7tl1YMiT$y9Zr1hZy6TXbEGro$YVdKw3r67mZqZJ7pN3" +
		"DjapSAHgym#dsZFucVmycP$lqnVPr6rmHy3G5xj#9JtZRj0uf3epUGftfQqQ5NlSCrPr5ih" +
		"aL7hyToIPNicTmxMxXV5hZNPFMA2efDSRZ6B8fJ9cftoMdjS2$a#jCwAgrwxt6ugraKH#zj" +
		"xTITVmEMoc9e");

	public PicoCParser() {
		super(PARSING_TABLES);
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		switch(rule_num) {
			case 0: // goal = block.block
			{
					final Symbol _symbol_block = _symbols[offset + 1];
					final Stmt block = (Stmt) _symbol_block.value;
					 return new Program(block);
			}
			case 1: // block = LBRACE.LBRACE block_statements.l RBRACE.RBRACE
			{
					final Symbol LBRACE = _symbols[offset + 1];
					final Symbol _symbol_l = _symbols[offset + 2];
					final List l = (List) _symbol_l.value;
					final Symbol RBRACE = _symbols[offset + 3];
					 return new CompoundS(l);
			}
			case 2: // block_statements = statement.s
			{
					final Symbol _symbol_s = _symbols[offset + 1];
					final Stmt s = (Stmt) _symbol_s.value;
					 return new List().add(s);
			}
			case 3: // block_statements = block_statements.l statement.s
			{
					final Symbol _symbol_l = _symbols[offset + 1];
					final List l = (List) _symbol_l.value;
					final Symbol _symbol_s = _symbols[offset + 2];
					final Stmt s = (Stmt) _symbol_s.value;
					 return l.add(s);
			}
			case 4: // statement = IDENTIFIER.IDENTIFIER ASSIGN.ASSIGN expression.e
			{
					final Symbol IDENTIFIER = _symbols[offset + 1];
					final Symbol ASSIGN = _symbols[offset + 2];
					final Symbol _symbol_e = _symbols[offset + 3];
					final Expr e = (Expr) _symbol_e.value;
					 return new AssignStmt(new NumLabel(LabelUtility.nextLabel()), IDENTIFIER, e);
			}
			case 5: // statement = SKIP.SKIP
			{
					final Symbol SKIP = _symbols[offset + 1];
					 return new SkipStmt(new NumLabel(LabelUtility.nextLabel()), SKIP);
			}
			case 6: // statement = block.block
			{
					final Symbol _symbol_block = _symbols[offset + 1];
					final Stmt block = (Stmt) _symbol_block.value;
					 return block;
			}
			case 9: // statement = WHILE.WHILE expression.be DO.DO block.block
			{
					final Symbol WHILE = _symbols[offset + 1];
					final Symbol _symbol_be = _symbols[offset + 2];
					final Expr be = (Expr) _symbol_be.value;
					final Symbol DO = _symbols[offset + 3];
					final Symbol _symbol_block = _symbols[offset + 4];
					final Stmt block = (Stmt) _symbol_block.value;
					 return new WhileStmt(new LabeledExpr(new NumLabel(LabelUtility.nextLabel()), be), block);
			}
			case 11: // statement = SEMICOLON.SEMICOLON
			{
					final Symbol SEMICOLON = _symbols[offset + 1];
					 return new EmptyStmt();
			}
			case 12: // for_stmt = FOR.FOR LPAREN.LPAREN block_statements.i SEMICOLON.SEMICOLON expression.e SEMICOLON.SEMICOLON_ block_statements.u RPAREN.RPAREN block.s
			{
					final Symbol FOR = _symbols[offset + 1];
					final Symbol LPAREN = _symbols[offset + 2];
					final Symbol _symbol_i = _symbols[offset + 3];
					final List i = (List) _symbol_i.value;
					final Symbol SEMICOLON = _symbols[offset + 4];
					final Symbol _symbol_e = _symbols[offset + 5];
					final Expr e = (Expr) _symbol_e.value;
					final Symbol SEMICOLON_ = _symbols[offset + 6];
					final Symbol _symbol_u = _symbols[offset + 7];
					final List u = (List) _symbol_u.value;
					final Symbol RPAREN = _symbols[offset + 8];
					final Symbol _symbol_s = _symbols[offset + 9];
					final Stmt s = (Stmt) _symbol_s.value;
					 return new ForStmt(i, new LabeledExpr(new NumLabel(LabelUtility.nextLabel()), e), u, s);
			}
			case 13: // if_then_else_statement = IF.IF LPAREN.LPAREN expression.e RPAREN.RPAREN statement.t SEMICOLON.SEMICOLON ELSE.ELSE statement.els
			{
					final Symbol IF = _symbols[offset + 1];
					final Symbol LPAREN = _symbols[offset + 2];
					final Symbol _symbol_e = _symbols[offset + 3];
					final Expr e = (Expr) _symbol_e.value;
					final Symbol RPAREN = _symbols[offset + 4];
					final Symbol _symbol_t = _symbols[offset + 5];
					final Stmt t = (Stmt) _symbol_t.value;
					final Symbol SEMICOLON = _symbols[offset + 6];
					final Symbol ELSE = _symbols[offset + 7];
					final Symbol _symbol_els = _symbols[offset + 8];
					final Stmt els = (Stmt) _symbol_els.value;
					 return new IfStmt(new LabeledExpr(new NumLabel(LabelUtility.nextLabel()), e), t, new Opt(els));
			}
			case 14: // if_then_statement = IF.IF LPAREN.LPAREN expression.e RPAREN.RPAREN statement.s
			{
					final Symbol IF = _symbols[offset + 1];
					final Symbol LPAREN = _symbols[offset + 2];
					final Symbol _symbol_e = _symbols[offset + 3];
					final Expr e = (Expr) _symbol_e.value;
					final Symbol RPAREN = _symbols[offset + 4];
					final Symbol _symbol_s = _symbols[offset + 5];
					final Stmt s = (Stmt) _symbol_s.value;
					 return new IfStmt(new LabeledExpr(new NumLabel(LabelUtility.nextLabel()), e), s, new Opt());
			}
			case 15: // primary = IDENTIFIER.IDENTIFIER
			{
					final Symbol IDENTIFIER = _symbols[offset + 1];
					 return new VarRefExpr(IDENTIFIER);
			}
			case 16: // primary = NUMBER.NUMBER
			{
					final Symbol NUMBER = _symbols[offset + 1];
					 return new NumLitExpr(NUMBER);
			}
			case 17: // primary = TRUE.TRUE
			{
					final Symbol TRUE = _symbols[offset + 1];
					 return new BoolLitExpr(TRUE);
			}
			case 18: // primary = FALSE.FALSE
			{
					final Symbol FALSE = _symbols[offset + 1];
					 return new BoolLitExpr(FALSE);
			}
			case 19: // primary = NOT.NOT primary.e
			{
					final Symbol NOT = _symbols[offset + 1];
					final Symbol _symbol_e = _symbols[offset + 2];
					final Expr e = (Expr) _symbol_e.value;
					 return new NotExpr(e);
			}
			case 20: // primary = LPAREN.LPAREN expression.e RPAREN.RPAREN
			{
					final Symbol LPAREN = _symbols[offset + 1];
					final Symbol _symbol_e = _symbols[offset + 2];
					final Expr e = (Expr) _symbol_e.value;
					final Symbol RPAREN = _symbols[offset + 3];
					 return e;
			}
			case 21: // simplefact_exp = primary.p
			{
					final Symbol _symbol_p = _symbols[offset + 1];
					final Expr p = (Expr) _symbol_p.value;
					 return p;
			}
			case 22: // simplefact_exp = simplefact_exp.s EQ.EQ primary.p
			{
					final Symbol _symbol_s = _symbols[offset + 1];
					final Expr s = (Expr) _symbol_s.value;
					final Symbol EQ = _symbols[offset + 2];
					final Symbol _symbol_p = _symbols[offset + 3];
					final Expr p = (Expr) _symbol_p.value;
					 return new ABinaryExpr(s, new Op_arth(EQ), p);
			}
			case 23: // simplefact_exp = simplefact_exp.s MULT.MULT primary.p
			{
					final Symbol _symbol_s = _symbols[offset + 1];
					final Expr s = (Expr) _symbol_s.value;
					final Symbol MULT = _symbols[offset + 2];
					final Symbol _symbol_p = _symbols[offset + 3];
					final Expr p = (Expr) _symbol_p.value;
					 return new ABinaryExpr(s, new Op_arth(MULT), p);
			}
			case 24: // simplefact_exp = simplefact_exp.s DIV.DIV primary.p
			{
					final Symbol _symbol_s = _symbols[offset + 1];
					final Expr s = (Expr) _symbol_s.value;
					final Symbol DIV = _symbols[offset + 2];
					final Symbol _symbol_p = _symbols[offset + 3];
					final Expr p = (Expr) _symbol_p.value;
					 return new ABinaryExpr(s, new Op_arth(DIV), p);
			}
			case 25: // simplefact_exp = simplefact_exp.s MOD.MOD primary.p
			{
					final Symbol _symbol_s = _symbols[offset + 1];
					final Expr s = (Expr) _symbol_s.value;
					final Symbol MOD = _symbols[offset + 2];
					final Symbol _symbol_p = _symbols[offset + 3];
					final Expr p = (Expr) _symbol_p.value;
					 return new ABinaryExpr(s, new Op_arth(MOD), p);
			}
			case 26: // simpleae = simplefact_exp.se
			{
					final Symbol _symbol_se = _symbols[offset + 1];
					final Expr se = (Expr) _symbol_se.value;
					 return se;
			}
			case 27: // simpleae = simpleae.a PLUS.PLUS simplefact_exp.s
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol PLUS = _symbols[offset + 2];
					final Symbol _symbol_s = _symbols[offset + 3];
					final Expr s = (Expr) _symbol_s.value;
					 return new ABinaryExpr(a, new Op_arth(PLUS), s);
			}
			case 28: // simpleae = simpleae.a MINUS.MINUS simplefact_exp.s
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol MINUS = _symbols[offset + 2];
					final Symbol _symbol_s = _symbols[offset + 3];
					final Expr s = (Expr) _symbol_s.value;
					 return new ABinaryExpr(a, new Op_arth(MINUS), s);
			}
			case 29: // relexp = simpleae.s
			{
					final Symbol _symbol_s = _symbols[offset + 1];
					final Expr s = (Expr) _symbol_s.value;
					 return s;
			}
			case 30: // relexp = simpleae.a EQEQ.EQEQ simpleae.b
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol EQEQ = _symbols[offset + 2];
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new RelExpr(a, new Op_rel(EQEQ), b);
			}
			case 31: // relexp = simpleae.a NOTEQ.NOTEQ simpleae.b
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol NOTEQ = _symbols[offset + 2];
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new RelExpr(a, new Op_rel(NOTEQ), b);
			}
			case 32: // relexp = simpleae.a LT.LT simpleae.b
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol LT = _symbols[offset + 2];
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new RelExpr(a, new Op_rel(LT), b);
			}
			case 33: // relexp = simpleae.a GT.GT simpleae.b
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol GT = _symbols[offset + 2];
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new RelExpr(a, new Op_rel(GT), b);
			}
			case 34: // relexp = simpleae.a LTEQ.LTEQ simpleae.b
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol LTEQ = _symbols[offset + 2];
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new RelExpr(a, new Op_rel(LTEQ), b);
			}
			case 35: // relexp = simpleae.a GTEQ.GTEQ simpleae.b
			{
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol GTEQ = _symbols[offset + 2];
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new RelExpr(a, new Op_rel(GTEQ), b);
			}
			case 36: // and_expression = relexp.re
			{
					final Symbol _symbol_re = _symbols[offset + 1];
					final Expr re = (Expr) _symbol_re.value;
					 return re;
			}
			case 37: // and_expression = and_expression.e AND.AND relexp.r
			{
					final Symbol _symbol_e = _symbols[offset + 1];
					final Expr e = (Expr) _symbol_e.value;
					final Symbol AND = _symbols[offset + 2];
					final Symbol _symbol_r = _symbols[offset + 3];
					final Expr r = (Expr) _symbol_r.value;
					 return new LogicExpr(e, new Op_bool(AND), r);
			}
			case 38: // exclusive_or_expression = and_expression.ae
			{
					final Symbol _symbol_ae = _symbols[offset + 1];
					final Expr ae = (Expr) _symbol_ae.value;
					 return ae;
			}
			case 39: // exclusive_or_expression = exclusive_or_expression.e XOR.XOR and_expression.a
			{
					final Symbol _symbol_e = _symbols[offset + 1];
					final Expr e = (Expr) _symbol_e.value;
					final Symbol XOR = _symbols[offset + 2];
					final Symbol _symbol_a = _symbols[offset + 3];
					final Expr a = (Expr) _symbol_a.value;
					 return new LogicExpr(e, new Op_bool(XOR), a);
			}
			case 40: // expression = exclusive_or_expression.ee
			{
					final Symbol _symbol_ee = _symbols[offset + 1];
					final Expr ee = (Expr) _symbol_ee.value;
					 return ee;
			}
			case 41: // expression = expression.ie OR.OR exclusive_or_expression.ee
			{
					final Symbol _symbol_ie = _symbols[offset + 1];
					final Expr ie = (Expr) _symbol_ie.value;
					final Symbol OR = _symbols[offset + 2];
					final Symbol _symbol_ee = _symbols[offset + 3];
					final Expr ee = (Expr) _symbol_ee.value;
					 return new LogicExpr(ie, new Op_bool(OR), ee);
			}
			case 7: // statement = if_then_else_statement.if_then_else_statement
			case 8: // statement = if_then_statement.if_then_statement
			case 10: // statement = for_stmt.for_stmt
			{
				return _symbols[offset + 1];
			}
			default:
				throw new IllegalArgumentException("unknown production #" + rule_num);
		}
	}
}
