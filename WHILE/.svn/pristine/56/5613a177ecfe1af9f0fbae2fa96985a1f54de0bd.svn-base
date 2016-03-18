package apps;
import AST.*;

import java.io.*;

/** 
 * Common code for applications on the WHILE language. 
 * This class uses the template method pattern.
 * @author Gary T. Leavens
 */
public abstract class AbstractWhileCompiler {
	
  /** The main work on the AST p. 
 * @param fname the file name that is the source for the program
 * @param p the AST for the program */
  public abstract void process(String fname, Program p);
  
  /** A template method that handles exceptions and forming the AST. */
  public void run(String pname, String args[]) {
    if(args.length < 1) {
      System.err.println(pname + " expects a one or more file names as command line arguments");
      System.exit(1);
    }
    WHILEParser parser = new WHILEParser();
    try {
    	for (String fname : args) {
    		Reader reader = new FileReader(fname);
    		WHILEScanner scanner = new WHILEScanner(new BufferedReader(reader));
    		Program p = (Program)parser.parse(scanner);
    		reader.close();
    		process(fname, p); 
    	}
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      return;
    } catch (IOException e) {
      System.err.println(e);
      e.printStackTrace();
      return;
    } catch (Exception e) {
      System.err.println(e);
      e.printStackTrace();
      return;
    }
  }
}