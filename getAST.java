import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import beaver.Scanner.Exception;
import AST.*;

public class getAST{
  public Program parse(String filename){
    try{	
       PicoCParser parser = new PicoCParser();
       Reader reader = new FileReader(filename);
       PicoCScanner scanner = new PicoCScanner(reader);
       Program p = (Program)parser.parse(scanner); 		
       reader.close();
       return p;
    }
    catch(Throwable t){ 
      throw new Error();
    }
  }
}
