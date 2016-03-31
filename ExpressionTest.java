import AST.*;

public class ExpressionTest {
  public static void main(String[] args){
    Program p = new getAST().parse("examples/expressiontest.pc");
    Block b = (Block)p.getStmt();  // program is a block statement.
    ExprStmt es = (ExprStmt)b.getStmt(0); // get first statement of block.  
    AssignExpr e = (AssignExpr)es.getExpr(); // e has (x*5+30/3-100%2)
    Access a = (Access)e.getDest();  //get variable a.
    String var_name = a.getID(); // get name
    System.out.println(var_name); 
    Binary m = (Binary)e.getSource(); // get RHS
    Access x = (Access)m.getLeftOperand();
    String x_name = x.getID(); // get name
    System.out.println(x_name); 
    Literal five = (Literal)m.getRightOperand();   
    System.out.println(five.getLITERAL());
//   // Literal five = (Literal)five_prime;
//    String number_five = five.getID();  
//    System.out.println(number_five);
  }
}
