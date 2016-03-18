package apps;
import AST.*;

/** Application to run the unparser. */
public class WHILEUnparser extends AbstractWhileCompiler {
	/** Unparse the given program to System.out. */
	public void process(String fname, Program p) {
		System.out.println(p.unparse());
	}

	/** Unparse the program given in the file name argument. */
	public static void main(String args[]) {
		WHILEUnparser up = new WHILEUnparser();
		up.run("WHILEUnparser", args);
	}
}
