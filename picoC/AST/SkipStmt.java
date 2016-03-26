/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.0 */
package AST;
/**
 * @ast node
 * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\integer_overflow\\picoC\\grammar\\picoC.ast:9
 * @production SkipStmt : {@link Stmt} ::= <span class="component">LabelAST:{@link Label}</span> <span class="component">&lt;String:String&gt;</span>;

 */
public class SkipStmt extends Stmt implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public SkipStmt() {
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
    children = new ASTNode[1];
  }
  /**
   * @declaredat ASTNode:13
   */
  public SkipStmt(Label p0, String p1) {
    setChild(p0, 0);
    setString(p1);
  }
  /**
   * @declaredat ASTNode:17
   */
  public SkipStmt(Label p0, beaver.Symbol p1) {
    setChild(p0, 0);
    setString(p1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:22
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:28
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:32
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:36
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
   */
  public void flushRewriteCache() {
    super.flushRewriteCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:44
   */
  public SkipStmt clone() throws CloneNotSupportedException {
    SkipStmt node = (SkipStmt) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:49
   */
  public SkipStmt copy() {
    try {
      SkipStmt node = (SkipStmt) clone();
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
   * @declaredat ASTNode:68
   */
  @Deprecated
  public SkipStmt fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:78
   */
  public SkipStmt treeCopyNoTransform() {
    SkipStmt tree = (SkipStmt) copy();
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
   * @declaredat ASTNode:98
   */
  public SkipStmt treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:103
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_String == ((SkipStmt) node).tokenString_String);    
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
   * Replaces the lexeme String.
   * @param value The new value for the lexeme String.
   * @apilevel high-level
   */
  public void setString(String value) {
    tokenString_String = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_String;
  /**
   */
  public int Stringstart;
  /**
   */
  public int Stringend;
  /**
   * JastAdd-internal setter for lexeme String using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme String
   * @apilevel internal
   */
  public void setString(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setString is only valid for String lexemes");
    tokenString_String = (String)symbol.value;
    Stringstart = symbol.getStart();
    Stringend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme String.
   * @return The value for the lexeme String.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="String")
  public String getString() {
    return tokenString_String != null ? tokenString_String : "";
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
