package tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import beaver.Parser.Exception;

import AST.*;
import junit.framework.TestCase;

public abstract class WHILETestCase extends TestCase {

	public WHILETestCase(String s) {
		super(s);
	}

	/** Parse a string, returning the AST for the program. */
	protected static Program parse(String s) {
		try {
			WHILEParser parser = new WHILEParser();
			Reader reader = new StringReader(s);
			WHILEScanner scanner = new WHILEScanner(new BufferedReader(reader));
			Program p = (Program) parser.parse(scanner);
			reader.close();
			return p;
		} catch (Throwable t) {
			fail(t.getMessage());
			throw new Error("This should not happen");
		}
	}

	/** Parse a file, returning the AST for the program. */
	protected Program parseFromFile(String sourceFile) throws IOException,
			Exception {
		WHILEParser parser = new WHILEParser();
		Reader reader = new FileReader(sourceFile);
		WHILEScanner scanner = new WHILEScanner(new BufferedReader(reader));
		Program p = (Program) parser.parse(scanner);
		reader.close();
		return p;
	}

}
