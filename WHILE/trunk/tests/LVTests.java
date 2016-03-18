package tests;

import java.io.IOException;
import java.util.Set;

import beaver.Parser.Exception;
import AST.*;

/**
 * JUnit (3) tests for the LV analysis (LVentry and LVexit attributes). 
 * For the tests using the file testsrc/lv1.wh. 
 */
public class LVTests extends WHILETestCase {

	public void testLVentry1() throws IOException, Exception {
		Program p = parseFromFile("testsrc/lv1.wh");
		assertTrue(p.getS() instanceof CompoundS);
		AssignS stmt1 = (AssignS)((CompoundS)p.getS()).getSList(0);
		Set<String> lve1 = stmt1.LVentry();
		assertEquals("lve1", 0, lve1.size());
		Set<String> lve1ex = stmt1.LVexit();
		assertEquals("lve1ex", 0, lve1ex.size());
		AssignS stmt2 = (AssignS)((CompoundS)p.getS()).getSList(1);
		Set<String> lve2 = stmt2.LVentry();
		assertEquals("lve2", 0, lve2.size());
		Set<String> lve2ex = stmt2.LVexit();
		assertEquals("lve2ex", 1, lve2ex.size());
		assertTrue(lve2ex.contains("y"));
		AssignS stmt3 = (AssignS)((CompoundS)p.getS()).getSList(2);
		Set<String> lve3 = stmt3.LVentry();
		assertEquals("lve3", 1, lve3.size());
		Set<String> lve3ex = stmt3.LVexit();
		assertTrue(lve3.contains("y"));
		assertEquals("lve3ex", 2, lve3ex.size());
		assertTrue(lve3ex.contains("x"));
		assertTrue(lve3ex.contains("y"));
	}

	public void testLVentry2() throws IOException, Exception {
		Program p = parseFromFile("testsrc/lv2.wh");
		assertTrue(p.getS() instanceof CompoundS);
/*		AssignS stmt1 = (AssignS)((CompoundS)p.getS()).getSList(0);
		AssignS stmt2 = (AssignS)((CompoundS)p.getS()).getSList(1);
*/		
		// Stmt 3
		WhileS stmt3 = (WhileS)((CompoundS)p.getS()).getSList(2);
		LabeledExpr lbe = (LabeledExpr)stmt3.getLabeledExpr();
		Set<String> lveB = lbe.LVentry();
		assertEquals("lveB", 2, lveB.size());
		assertTrue(lveB.contains("x"));	
		assertTrue(lveB.contains("y"));	
		Set<String> lveBex = lbe.LVexit();
		assertEquals("lveBex", 2, lveBex.size());
		assertTrue(lveBex.contains("x"));
		assertTrue(lveBex.contains("y"));
		AssignS stmt31 = (AssignS)((CompoundS)stmt3.getS()).getSList(0);
		Set<String> lve31 = stmt31.LVentry();
		assertEquals("lve31", 2, lve31.size());
		assertTrue(lve31.contains("x"));	
		assertTrue(lve31.contains("y"));	
		Set<String> lve31ex = stmt31.LVexit();
		assertEquals("lve31ex", 2, lve31ex.size());
		assertTrue(lve31ex.contains("x"));
		assertTrue(lve31ex.contains("y"));
		AssignS stmt32 = (AssignS)((CompoundS)stmt3.getS()).getSList(1);
		Set<String> lve32 = stmt32.LVentry();
		assertEquals("lve32", 2, lve32.size());
		assertTrue(lve32.contains("x"));	
		assertTrue(lve32.contains("y"));	
		Set<String> lve32ex = stmt32.LVexit();
		assertEquals("lve32ex", 2, lve32ex.size());
		assertTrue(lve32ex.contains("x"));
		assertTrue(lve32ex.contains("y"));
		// Stmt 4
		SkipS stmt4 = (SkipS)((CompoundS)p.getS()).getSList(3);
		Set<String> lve4 = stmt4.LVentry();
		assertEquals("lve4", 0, lve4.size());
		Set<String> lve4ex = stmt4.LVexit();
		assertEquals("lve4ex", 0, lve4ex.size());
	}

	public void testkillLV1() throws IOException, Exception {
		Program p = parseFromFile("testsrc/lv1.wh");
		assertTrue(p.getS() instanceof CompoundS);
		AssignS stmt1 = (AssignS)((CompoundS)p.getS()).getSList(0);
		AssignS stmt2 = (AssignS)((CompoundS)p.getS()).getSList(1);
		AssignS stmt3 = (AssignS)((CompoundS)p.getS()).getSList(2);
		AssignS stmt5 = (AssignS)((CompoundS)p.getS()).getSList(4);
		Set<String> k1 = stmt1.killLV();
		assertEquals(1, k1.size());
		assertTrue("k1", k1.contains("x"));
		Set<String> k3 = stmt3.killLV();
		assertEquals(1, k3.size());
		assertTrue("k3", k3.contains("x"));
		Set<String> k5 = stmt5.killLV();
		assertEquals(1, k5.size());
		assertTrue("k5", k5.contains("x"));
		Set<String> k2 = stmt2.killLV();
		assertEquals(1, k2.size());
		assertTrue("k2", k2.contains("y"));
	}

	
	public LVTests(String s) {
		super(s);
	}
	
	public static junit.framework.Test suite() {
		return new junit.framework.TestSuite(LVTests.class);
	}

	public static void main(String args[]) {
		if (args.length == 1 && args[0].equals("-text")) {
			junit.textui.TestRunner.run(LVTests.class);
		} else {
			junit.swingui.TestRunner.run(LVTests.class);
		}
	}
}
