/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.0 */
package AST;
import java.util.*;
import AST.*;
/**
 * @ast node
 * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\grammar\\picoC.ast:20
 * @production LabeledStmt : {@link BranchTargetStmt} ::= <span class="component">&lt;Identifier:String&gt;</span> <span class="component">{@link Stmt}</span>;

 */
public class LabeledStmt extends BranchTargetStmt implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public LabeledStmt() {
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
  public LabeledStmt(int p0, String p1, Stmt p2) {
    setl(p0);
    setIdentifier(p1);
    setChild(p2, 0);
  }
  /**
   * @declaredat ASTNode:18
   */
  public LabeledStmt(int p0, beaver.Symbol p1, Stmt p2) {
    setl(p0);
    setIdentifier(p1);
    setChild(p2, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:24
   */
  protected int numChildren() {
    return 1;
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
  public LabeledStmt clone() throws CloneNotSupportedException {
    LabeledStmt node = (LabeledStmt) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:51
   */
  public LabeledStmt copy() {
    try {
      LabeledStmt node = (LabeledStmt) clone();
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
  public LabeledStmt fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:80
   */
  public LabeledStmt treeCopyNoTransform() {
    LabeledStmt tree = (LabeledStmt) copy();
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
  public LabeledStmt treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:105
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenint_l == ((LabeledStmt) node).tokenint_l) && (tokenString_Identifier == ((LabeledStmt) node).tokenString_Identifier);    
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
   * Replaces the Stmt child.
   * @param node The new node to replace the Stmt child.
   * @apilevel high-level
   */
  public void setStmt(Stmt node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Stmt child.
   * @return The current node used as the Stmt child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Stmt")
  public Stmt getStmt() {
    return (Stmt) getChild(0);
  }
  /**
   * Retrieves the Stmt child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Stmt child.
   * @apilevel low-level
   */
  public Stmt getStmtNoTransform() {
    return (Stmt) getChildNoTransform(0);
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
