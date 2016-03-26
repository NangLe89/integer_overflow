/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.0 */
package AST;
/**
 * @ast node
 * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\integer_overflow\\picoC\\grammar\\picoC.ast:7
 * @production AssignStmt : {@link Stmt} ::= <span class="component">LabelAST:{@link Label}</span> <span class="component">&lt;Var:String&gt;</span> <span class="component">{@link Expr}</span>;

 */
public class AssignStmt extends Stmt implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public AssignStmt() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:10
   */
  public void init$Children() {
    children = new ASTNode[2];
  }
  /**
   * @declaredat ASTNode:13
   */
  public AssignStmt(Label p0, String p1, Expr p2) {
    setChild(p0, 0);
    setVar(p1);
    setChild(p2, 1);
  }
  /**
   * @declaredat ASTNode:18
   */
  public AssignStmt(Label p0, beaver.Symbol p1, Expr p2) {
    setChild(p0, 0);
    setVar(p1);
    setChild(p2, 1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:24
   */
  protected int numChildren() {
    return 2;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:30
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:34
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:38
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
   */
  public void flushRewriteCache() {
    super.flushRewriteCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public AssignStmt clone() throws CloneNotSupportedException {
    AssignStmt node = (AssignStmt) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:51
   */
  public AssignStmt copy() {
    try {
      AssignStmt node = (AssignStmt) clone();
      node.parent = null;
      if (children != null) {
        node.children = (ASTNode[]) children.clone();
      }
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:70
   */
  @Deprecated
  public AssignStmt fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:80
   */
  public AssignStmt treeCopyNoTransform() {
    AssignStmt tree = (AssignStmt) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if (child != null) {
          child = child.treeCopyNoTransform();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:100
   */
  public AssignStmt treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:105
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Var == ((AssignStmt) node).tokenString_Var);    
  }
  /**
   * Replaces the LabelAST child.
   * @param node The new node to replace the LabelAST child.
   * @apilevel high-level
   */
  public void setLabelAST(Label node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the LabelAST child.
   * @return The current node used as the LabelAST child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="LabelAST")
  public Label getLabelAST() {
    return (Label) getChild(0);
  }
  /**
   * Retrieves the LabelAST child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the LabelAST child.
   * @apilevel low-level
   */
  public Label getLabelASTNoTransform() {
    return (Label) getChildNoTransform(0);
  }
  /**
   * Replaces the lexeme Var.
   * @param value The new value for the lexeme Var.
   * @apilevel high-level
   */
  public void setVar(String value) {
    tokenString_Var = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Var;
  /**
   */
  public int Varstart;
  /**
   */
  public int Varend;
  /**
   * JastAdd-internal setter for lexeme Var using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme Var
   * @apilevel internal
   */
  public void setVar(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setVar is only valid for String lexemes");
    tokenString_Var = (String)symbol.value;
    Varstart = symbol.getStart();
    Varend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme Var.
   * @return The value for the lexeme Var.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Var")
  public String getVar() {
    return tokenString_Var != null ? tokenString_Var : "";
  }
  /**
   * Replaces the Expr child.
   * @param node The new node to replace the Expr child.
   * @apilevel high-level
   */
  public void setExpr(Expr node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Expr child.
   * @return The current node used as the Expr child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Expr")
  public Expr getExpr() {
    return (Expr) getChild(1);
  }
  /**
   * Retrieves the Expr child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Expr child.
   * @apilevel low-level
   */
  public Expr getExprNoTransform() {
    return (Expr) getChildNoTransform(1);
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
