/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.0 */
package AST;
/**
 * @ast node
 * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\integer_overflow\\picoC\\grammar\\picoC.ast:16
 * @production Op : {@link ASTNode} ::= <span class="component">&lt;Contents:String&gt;</span>;

 */
public abstract class Op extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Op() {
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
  public Op(String p0) {
    setContents(p0);
  }
  /**
   * @declaredat ASTNode:15
   */
  public Op(beaver.Symbol p0) {
    setContents(p0);
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
  public Op clone() throws CloneNotSupportedException {
    Op node = (Op) super.clone();
    return node;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:52
   */
  @Deprecated
  public abstract Op fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:60
   */
  public abstract Op treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:68
   */
  public abstract Op treeCopy();
  /**
   * Replaces the lexeme Contents.
   * @param value The new value for the lexeme Contents.
   * @apilevel high-level
   */
  public void setContents(String value) {
    tokenString_Contents = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Contents;
  /**
   */
  public int Contentsstart;
  /**
   */
  public int Contentsend;
  /**
   * JastAdd-internal setter for lexeme Contents using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme Contents
   * @apilevel internal
   */
  public void setContents(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setContents is only valid for String lexemes");
    tokenString_Contents = (String)symbol.value;
    Contentsstart = symbol.getStart();
    Contentsend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme Contents.
   * @return The value for the lexeme Contents.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Contents")
  public String getContents() {
    return tokenString_Contents != null ? tokenString_Contents : "";
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
