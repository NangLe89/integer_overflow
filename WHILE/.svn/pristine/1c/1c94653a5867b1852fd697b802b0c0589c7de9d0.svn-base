package tests;

public class ParserTests extends WHILETestCase {
	
	public ParserTests(String s) { super(s); }
  
  public void testSimpleBlock() {
    assertParseOk("{skip}");
  }
  public void testSimpleSkip2() {
    assertParseOk("{ skip; skip }");
  }
  public void testExtraSemi() {
	    assertParseError("{ skip; skip; }");
	  }

  // Statements
  public void testSimpleAssign() {
    assertParseOk("{ x := 3-1*4 }");
  }
  public void testCompoundSWithIf() {
    assertParseOk("{ skip; i := 3; j := i*i-5/7+2; if true then {x := 1} else {x := 0} }");
  }
  public void testNestedStmts() {
    assertParseOk("{i := z + 5*5*4/3-4*6+8-k; j := (3+4)*7;"
    + "{if i < 0 then { x := 1; y := y-x+4*7; skip; while 3 < z do { z := z+1 }"
    +"	} else { if q >= 7 and y <= 5 or 3 != 4 then { skip } else { skip; x := x*4-1 }"
    +"}; s := s+403-1 }; skip }");
  }
  
  
  // utility asserts to test parser
  
  protected static void assertParseOk(String s) {
    try {
      parse(s);
    } catch (Throwable t) {
      fail(t.getMessage());
    }
  }
  
  protected static void assertParseError(String s) {
    try {
      parse(s);
    } catch (Throwable t) {
      return;
    }
    fail("Expected to find parse error in " + s);
  }
}
