/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.0 */
package AST;
/**
 * @ast node
 * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\integer_overflow\\picoC\\grammar\\picoC.ast:4
 * @production NumLabel : {@link Label} ::= <span class="component">&lt;Num:String&gt;</span>;

 */
public class NumLabel extends Label implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public NumLabel() {
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
  }
  /**
   * @declaredat ASTNode:12
   */
  public NumLabel(String p0) {
    setNum(p0);
  }
  /**
   * @declaredat ASTNode:15
   */
  public NumLabel(beaver.Symbol p0) {
    setNum(p0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:19
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:25
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:29
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:33
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:37
   */
  public void flushRewriteCache() {
    super.flushRewriteCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public NumLabel clone() throws CloneNotSupportedException {
    NumLabel node = (NumLabel) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public NumLabel copy() {
    try {
      NumLabel node = (NumLabel) clone();
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
   * @declaredat ASTNode:65
   */
  @Deprecated
  public NumLabel fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public NumLabel treeCopyNoTransform() {
    NumLabel tree = (NumLabel) copy();
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
   * @declaredat ASTNode:95
   */
  public NumLabel treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:100
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Num == ((NumLabel) node).tokenString_Num);    
  }
  /**
   * Replaces the lexeme Num.
   * @param value The new value for the lexeme Num.
   * @apilevel high-level
   */
  public void setNum(String value) {
    tokenString_Num = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Num;
  /**
   */
  public int Numstart;
  /**
   */
  public int Numend;
  /**
   * JastAdd-internal setter for lexeme Num using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme Num
   * @apilevel internal
   */
  public void setNum(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setNum is only valid for String lexemes");
    tokenString_Num = (String)symbol.value;
    Numstart = symbol.getStart();
    Numend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme Num.
   * @return The value for the lexeme Num.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Num")
  public String getNum() {
    return tokenString_Num != null ? tokenString_Num : "";
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
