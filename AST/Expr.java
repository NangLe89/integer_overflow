/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.0 */
package AST;
import AST.*;
import java.util.*;
import java.util.Set;
/**
 * @ast node
 * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\grammar\\picoC.ast:23
 * @production Expr : {@link ASTNode};

 */
public abstract class Expr extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Expr() {
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
  /** @apilevel low-level 
   * @declaredat ASTNode:13
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:19
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:23
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:27
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:31
   */
  public void flushRewriteCache() {
    super.flushRewriteCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:35
   */
  public Expr clone() throws CloneNotSupportedException {
    Expr node = (Expr) super.clone();
    return node;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:46
   */
  @Deprecated
  public abstract Expr fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:54
   */
  public abstract Expr treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:62
   */
  public abstract Expr treeCopy();
  /**
   * @attribute syn
   * @aspect AExp
   * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\AExp.jrag:59
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="AExp", declaredAt="C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\AExp.jrag:59")
  public abstract Set<Expr> Aexps();
  /**
   * @attribute syn
   * @aspect AE
   * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\AE.jrag:7
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="AE", declaredAt="C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\AE.jrag:7")
  public Set<Expr> killAE(Set<Expr> current) {
    Set<Expr> killAE_Set_Expr__value = new HashSet();
    return killAE_Set_Expr__value;
  }
  /**
   * @attribute syn
   * @aspect FreeVars
   * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\FreeVars.jrag:37
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="FreeVars", declaredAt="C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\FreeVars.jrag:37")
  public Set<String> FV() {
    Set<String> FV_value = new HashSet();
    return FV_value;
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
