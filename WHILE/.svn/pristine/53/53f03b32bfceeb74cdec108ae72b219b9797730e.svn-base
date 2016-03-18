package tests;

import java.io.IOException;
import java.util.Set;

import beaver.Parser.Exception;
import AST.*;

/**
 * JUnit (3) tests for inFlows and outFlows attributes. 
 * For the tests using the file testsrc/cfg1.wh, 
 * see cfg1.wh-prettyprint for what the labels are.
 */
public class CFGTests extends WHILETestCase {
	
	public void testCFGInit() throws IOException, Exception {
		Program p = parseFromFile("testsrc/cfg1.wh");
		S pbody = p.getS();
		assertTrue(((NumLabel)pbody.init()).getNum().equals("1"));
	}

	public void testOutFlowsProg() throws IOException, Exception {
		Program p = parseFromFile("testsrc/cfg1.wh");
		S pbody = p.getS();
		Set<Label> outs = pbody.outFlows();
		assertEquals(0, outs.size());
	}

	public void testOutFlows1() throws IOException, Exception {
		Program p = parseFromFile("testsrc/cfg1.wh");
		assertTrue(p.getS() instanceof CompoundS);
		S stmt1 = ((CompoundS)p.getS()).getSList(0);
		Set<Label> outs = stmt1.outFlows();
		assertEquals(1, outs.size());
		assertTrue(outs.contains(new NumLabel("2")));
	}

	public void testOutFlows2() throws IOException, Exception {
		Program p = parseFromFile("testsrc/cfg1.wh");
		assertTrue(p.getS() instanceof CompoundS);
		S stmt2 = ((CompoundS)p.getS()).getSList(1);
		Set<Label> outs = stmt2.outFlows();
		assertEquals(1, outs.size());
		assertTrue(outs.contains(new NumLabel("6")));
	}
	
	public void testOutFlows3() throws IOException, Exception {
		Program p = parseFromFile("testsrc/cfg1.wh");
		assertTrue(p.getS() instanceof CompoundS);
		S stmt3 = ((CompoundS)p.getS()).getSList(2);
		assertTrue(stmt3 instanceof WhileS);
		WhileS wh = (WhileS)stmt3;
		LabeledExpr blk6 = wh.getLabeledExpr();
		Set<Label> outs = blk6.outFlows();
		assertEquals(2, outs.size());
		assertTrue(outs.contains(new NumLabel("3")));
		assertTrue(outs.contains(new NumLabel("7")));
	}
	
	public void testInFlows3() throws IOException, Exception {
		Program p = parseFromFile("testsrc/cfg1.wh");
		assertTrue(p.getS() instanceof CompoundS);
		S stmt3 = ((CompoundS)p.getS()).getSList(2);
		assertTrue(stmt3 instanceof WhileS);
		WhileS wh = (WhileS)stmt3;
		LabeledExpr blk6 = wh.getLabeledExpr();
		Set<Label> ins = blk6.inFlows();
		assertEquals(2, ins.size());
		assertTrue(ins.contains(new NumLabel("5")));
		assertTrue(ins.contains(new NumLabel("2")));
	}

	public void testWhileBodyFlows() throws IOException, Exception {
		Program p = parseFromFile("testsrc/cfg1.wh");
		assertTrue(p.getS() instanceof CompoundS);
		S stmt6 = ((CompoundS)p.getS()).getSList(2);
		assertTrue(stmt6 instanceof WhileS);
		WhileS wh = (WhileS)stmt6;
		CompoundS body = (CompoundS)wh.getS();
		S stmt3 = body.getSList(0);
		Set<Label> ins = stmt3.inFlows();
		assertEquals(1, ins.size());
		assertTrue(ins.contains(new NumLabel("6")));
		Set<Label> outs = stmt3.outFlows();
		assertEquals(1, outs.size());
		assertTrue(outs.contains(new NumLabel("4")));
	}
	
	public void testProgLabels() throws IOException, Exception {
		Program p = parseFromFile("testsrc/cfg1.wh");
		assertTrue(p.getS() instanceof CompoundS);
		S stmt6 = ((CompoundS)p.getS()).getSList(2);
		assertTrue(stmt6 instanceof WhileS);
		WhileS wh = (WhileS)stmt6;
		CompoundS body = (CompoundS)wh.getS();
		AssignS stmt3 = (AssignS) body.getSList(0);
		Set<Label> labs = stmt3.progLabels();
		assertEquals(7, labs.size());
		assertTrue(labs.contains(new NumLabel("1")));
		assertTrue(labs.contains(new NumLabel("2")));
		assertTrue(labs.contains(new NumLabel("3")));
		assertTrue(labs.contains(new NumLabel("4")));
		assertTrue(labs.contains(new NumLabel("5")));
		assertTrue(labs.contains(new NumLabel("6")));
		assertTrue(labs.contains(new NumLabel("7")));
	}

	public void testProgFVs() throws IOException, Exception {
		Program p = parseFromFile("testsrc/cfg1.wh");
		assertTrue(p.getS() instanceof CompoundS);
		S stmt6 = ((CompoundS)p.getS()).getSList(2);
		assertTrue(stmt6 instanceof WhileS);
		WhileS wh = (WhileS)stmt6;
		CompoundS body = (CompoundS)wh.getS();
		AssignS stmt3 = (AssignS) body.getSList(0);
		Set<String> vars = stmt3.progFV();
		assertEquals(4, vars.size());
		assertTrue(vars.contains("q"));
		assertTrue(vars.contains("r"));
		assertTrue(vars.contains("x"));
		assertTrue(vars.contains("y"));
	}

	public CFGTests(String s) {
		super(s);
	}
	
	public static junit.framework.Test suite() {
		return new junit.framework.TestSuite(tests.CFGTests.class);
	}

	public static void main(String args[]) {
		if (args.length == 1 && args[0].equals("-text")) {
			junit.textui.TestRunner.run(CFGTests.class);
		} else {
			junit.swingui.TestRunner.run(CFGTests.class);
		}
	}

}
