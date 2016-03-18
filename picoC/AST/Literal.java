/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.0 */
package AST;
/**
 * @ast node
 * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\integer_overflow\\picoC\\grammar\\picoC.ast:103
 * @production Literal : {@link PrimaryExpr} ::= <span class="component">&lt;LITERAL:String&gt;</span>;

 */
public abstract class Literal extends PrimaryExpr implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Literal() {
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
  public Literal(String p0) {
    setLITERAL(p0);
  }
  /**
   * @declaredat ASTNode:15
   */
  public Literal(beaver.Symbol p0) {
    setLITERAL(p0);
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
  public Literal clone() throws CloneNotSupportedException {
    Literal node = (Literal) super.clone();
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
  public abstract Literal fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:60
   */
  public abstract Literal treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:68
   */
  public abstract Literal treeCopy();
  /**
   * Replaces the lexeme LITERAL.
   * @param value The new value for the lexeme LITERAL.
   * @apilevel high-level
   */
  public void setLITERAL(String value) {
    tokenString_LITERAL = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_LITERAL;
  /**
   */
  public int LITERALstart;
  /**
   */
  public int LITERALend;
  /**
   * JastAdd-internal setter for lexeme LITERAL using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme LITERAL
   * @apilevel internal
   */
  public void setLITERAL(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setLITERAL is only valid for String lexemes");
    tokenString_LITERAL = (String)symbol.value;
    LITERALstart = symbol.getStart();
    LITERALend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme LITERAL.
   * @return The value for the lexeme LITERAL.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="LITERAL")
  public String getLITERAL() {
    return tokenString_LITERAL != null ? tokenString_LITERAL : "";
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
