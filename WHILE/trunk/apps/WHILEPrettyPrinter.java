package apps;
import AST.*;

/** Application to run the pretty printer. */
public class WHILEPrettyPrinter extends AbstractWhileCompiler {
	/** Pretty print the given program. */
	public void process(String fname, Program p) {
		System.out.println(p.prettyPrint());
	}

	/** Pretty print the program given in the arguments. */
	public static void main(String args[]) {
		WHILEPrettyPrinter pp = new WHILEPrettyPrinter();
		pp.run("WHILEPrettyPrinter", args);
	}
}
