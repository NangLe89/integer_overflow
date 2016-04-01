import AST.*;

public class Test {
  public static void main(String[] args) {
    Program p = new getAST().parse("examples/block.pc");
    p.PrintCFG();
  }
}		

