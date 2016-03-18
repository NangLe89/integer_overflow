package tests;

import java.io.IOException;
import java.util.Set;

import beaver.Parser.Exception;
import AST.*;

/**
 * JUnit (3) tests for the AE analysis (AEentry and AEexit attributes). 
 * For the tests using the file testsrc/ae1.wh. 
 */
public class AETests extends WHILETestCase {

	public void testAEStar() throws IOException, Exception {
		Program p = parseFromFile("testsrc/ae1.wh");
		// System.out.println("p.AexpStar() is: " + p.AexpStar().toString());
		assertEquals("Aexp* size", 3, p.AexpStar().size());		
	}
	
	public void testAEentry1() throws IOException, Exception {
		Program p = parseFromFile("testsrc/ae1.wh");
		assertEquals("Aexp* size", 3, p.AexpStar().size());
		assertTrue(p.getS() instanceof CompoundS);
		CompoundS body = (CompoundS)p.getS();
		AssignS stmt1 = (AssignS)body.getSList(0);
		Set<Expr> ae1n = stmt1.AEentry();
		assertEquals("ae1n", 0, ae1n.size());
		Set<Expr> ae1ex = stmt1.AEexit();
		assertEquals("ae1ex", 1, ae1ex.size());
		assertTrue("ae1ex value", ae1ex.contains(stmt1.getExpr()));
		AssignS stmt2 = (AssignS)body.getSList(1);
		Set<Expr> ae2n = stmt2.AEentry();
		assertEquals("ae2n", 1, ae2n.size());
		assertTrue("ae2n value", ae2n.contains(stmt1.getExpr()));
		Set<Expr> ae2ex = stmt2.AEexit();
		assertEquals("ae2ex", 2, ae2ex.size());
		assertTrue("ae2ex value", ae2ex.contains(stmt1.getExpr()));
		assertTrue(ae2ex.contains(stmt2.getExpr()));
		WhileS stmt3 = (WhileS)body.getSList(2);
		LabeledExpr test = stmt3.getLabeledExpr();
		Set<Expr> ae3n = test.AEentry();
		// System.out.println("ae3n is: " + ae3n.toString());
		assertEquals("ae3n", 1, ae3n.size());
		assertTrue(ae3n.contains(stmt1.getExpr()));
		Set<Expr> ae3ex = test.AEexit();
		assertEquals("ae3ex", 1, ae3ex.size());
		assertTrue(ae3ex.contains(stmt1.getExpr()));
		CompoundS whb = (CompoundS) stmt3.getS();
		AssignS stmt4 = (AssignS) whb.getSList(0);
		Set<Expr> ae4n = stmt4.AEentry();
		assertEquals("ae4n", 1, ae4n.size());
		assertTrue(ae4n.contains(stmt1.getExpr()));
		Set<Expr> ae4ex = stmt4.AEexit();
		assertEquals("ae4ex", 0, ae4ex.size());
		AssignS stmt5 = (AssignS) whb.getSList(1);
		Set<Expr> ae5n = stmt5.AEentry();
		assertEquals("ae5n", 0, ae5n.size());
		Set<Expr> ae5ex = stmt5.AEexit();
		assertEquals("ae5ex", 1, ae5ex.size());
	}
	
	public AETests(String s) {
		super(s);
	}
	
	public static junit.framework.Test suite() {
		return new junit.framework.TestSuite(AETests.class);
	}

	public static void main(String args[]) {
		if (args.length == 1 && args[0].equals("-text")) {
			junit.textui.TestRunner.run(AETests.class);
		} 
	}
}
