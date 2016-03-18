package tests;

import java.io.IOException;
import java.util.Collection;

import beaver.Parser.Exception;
import AST.*;

/** JUnit (3) tests for Type Checking. */
public class TypeCheckTests extends WHILETestCase {
	
	public void testTC1() throws IOException, Exception {
		Program p = parseFromFile("testsrc/tc1.wh");
		assertTrue(p.getS() instanceof CompoundS);
		AssignS stmt1 = (AssignS)((CompoundS)p.getS()).getSList(0);
		Collection errs = p.errors();
		assertEquals(2, errs.size());
		assertTrue(errs.contains("line 2: left operand of `+' (true) is not of type Int"));
		assertTrue(errs.contains("line 2: right operand of `+' (false) is not of type Int"));
	}

	public void testTC2() throws IOException, Exception {
		Program p = parseFromFile("testsrc/tc2.wh");
		assertTrue(p.getS() instanceof CompoundS);
		AssignS stmt1 = (AssignS)((CompoundS)p.getS()).getSList(0);
		Collection errs = p.errors();
		assertEquals(1, errs.size());
		assertTrue(errs.contains("line 2: right operand of `*' (true) is not of type Int"));
	}
	
	public void testTC3() throws IOException, Exception {
		Program p = parseFromFile("testsrc/tc3.wh");
		assertTrue(p.getS() instanceof CompoundS);
		IfS stmt1 = (IfS)((CompoundS)p.getS()).getSList(0);
		Collection errs = p.errors();
		assertEquals(1, errs.size());
		assertTrue(errs.contains("line 2: test in `if' (x + 3) is not of type Bool"));
	}

	public TypeCheckTests(String s) {
		super(s);
	}
	
	public static junit.framework.Test suite() {
		return new junit.framework.TestSuite(TypeCheckTests.class);
	}

	public static void main(String args[]) {
		if (args.length == 1 && args[0].equals("-text")) {
			junit.textui.TestRunner.run(TypeCheckTests.class);
		} else {
			junit.swingui.TestRunner.run(TypeCheckTests.class);
		}
	}

}
