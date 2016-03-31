/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.0 */
package AST;
import AST.*;
import java.util.*;
import java.util.Set;
/**
 * @ast node
 * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\grammar\\picoC.ast:9
 * @production ContinueStmt : {@link Stmt} ::= <span class="component">&lt;Identifier:String&gt;</span>;

 */
public class ContinueStmt extends Stmt implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public ContinueStmt() {
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
  public ContinueStmt(int p0, String p1) {
    setl(p0);
    setIdentifier(p1);
  }
  /**
   * @declaredat ASTNode:16
   */
  public ContinueStmt(int p0, beaver.Symbol p1) {
    setl(p0);
    setIdentifier(p1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:21
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:27
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:31
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:35
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:39
   */
  public void flushRewriteCache() {
    super.flushRewriteCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:43
   */
  public ContinueStmt clone() throws CloneNotSupportedException {
    ContinueStmt node = (ContinueStmt) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:48
   */
  public ContinueStmt copy() {
    try {
      ContinueStmt node = (ContinueStmt) clone();
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
   * @declaredat ASTNode:67
   */
  @Deprecated
  public ContinueStmt fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:77
   */
  public ContinueStmt treeCopyNoTransform() {
    ContinueStmt tree = (ContinueStmt) copy();
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
   * @declaredat ASTNode:97
   */
  public ContinueStmt treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:102
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenint_l == ((ContinueStmt) node).tokenint_l) && (tokenString_Identifier == ((ContinueStmt) node).tokenString_Identifier);    
  }
  /**
   * Replaces the lexeme l.
   * @param value The new value for the lexeme l.
   * @apilevel high-level
   */
  public void setl(int value) {
    tokenint_l = value;
  }
  /**
   * Retrieves the value for the lexeme l.
   * @return The value for the lexeme l.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="l")
  public int getl() {
    return tokenint_l;
  }
  /**
   * Replaces the lexeme Identifier.
   * @param value The new value for the lexeme Identifier.
   * @apilevel high-level
   */
  public void setIdentifier(String value) {
    tokenString_Identifier = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Identifier;
  /**
   */
  public int Identifierstart;
  /**
   */
  public int Identifierend;
  /**
   * JastAdd-internal setter for lexeme Identifier using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme Identifier
   * @apilevel internal
   */
  public void setIdentifier(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setIdentifier is only valid for String lexemes");
    tokenString_Identifier = (String)symbol.value;
    Identifierstart = symbol.getStart();
    Identifierend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme Identifier.
   * @return The value for the lexeme Identifier.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Identifier")
  public String getIdentifier() {
    return tokenString_Identifier != null ? tokenString_Identifier : "";
  }
  /**
   * @attribute syn
   * @aspect AExp
   * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\AExp.jrag:9
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="AExp", declaredAt="C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\AExp.jrag:9")
  public Set<Expr> Aexps() {
    Set<Expr> Aexps_value = new HashSet();
    return Aexps_value;
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
