package apps;
import AST.*;
import java.util.Collection;
import java.util.Iterator;
/** Application to run the type checker. */
public class WHILEChecker extends AbstractWhileCompiler {
	/** Print all the errors in the program. */
	public void process(String fname, Program p) {
		Collection<String> errors = p.errors();
		if(!errors.isEmpty()) {
			System.err.println("Errors found in " + fname);
			for(Iterator<String> iter = errors.iterator(); iter.hasNext(); )
				System.err.println(iter.next());
		}
		else {
			System.out.println(fname + " checked OK!");
		}
	}

	/** Run the WHILE checker. */
	public static void main(String args[]) {
		WHILEChecker c = new WHILEChecker();
		c.run("WHILEChecker", args);
	}
}
