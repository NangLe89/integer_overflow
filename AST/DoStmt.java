/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.0 */
package AST;
import AST.*;
import java.util.*;
import java.util.Set;
/**
 * @ast node
 * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\grammar\\picoC.ast:21
 * @production DoStmt : {@link BranchTargetStmt} ::= <span class="component">{@link Stmt}</span> <span class="component">Condition:{@link Expr}</span>;

 */
public class DoStmt extends BranchTargetStmt implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public DoStmt() {
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
  public DoStmt(int p0, Stmt p1, Expr p2) {
    setl(p0);
    setChild(p1, 0);
    setChild(p2, 1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:19
   */
  protected int numChildren() {
    return 2;
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
  public DoStmt clone() throws CloneNotSupportedException {
    DoStmt node = (DoStmt) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public DoStmt copy() {
    try {
      DoStmt node = (DoStmt) clone();
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
  public DoStmt fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public DoStmt treeCopyNoTransform() {
    DoStmt tree = (DoStmt) copy();
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
  public DoStmt treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:100
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenint_l == ((DoStmt) node).tokenint_l);    
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
  /**
   * Replaces the Condition child.
   * @param node The new node to replace the Condition child.
   * @apilevel high-level
   */
  public void setCondition(Expr node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Condition child.
   * @return The current node used as the Condition child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Condition")
  public Expr getCondition() {
    return (Expr) getChild(1);
  }
  /**
   * Retrieves the Condition child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Condition child.
   * @apilevel low-level
   */
  public Expr getConditionNoTransform() {
    return (Expr) getChildNoTransform(1);
  }
  /**
   * @attribute syn
   * @aspect AExp
   * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\AExp.jrag:9
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="AExp", declaredAt="C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\AExp.jrag:9")
  public Set<Expr> Aexps() {
    {
    		Set<Expr> ret = getCondition().Aexps();
    		ret.addAll(getStmt().Aexps());
    		return ret;
    	}
  }
  /**
   * @attribute syn
   * @aspect CFG
   * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\CFG\\CFG.jrag:6
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="CFG", declaredAt="C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\CFG\\CFG.jrag:6")
  public Integer init() {
    Integer init_value = getStmt().init();
    return init_value;
  }
  /**
   * @attribute syn
   * @aspect CFG
   * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\CFG\\CFG.jrag:26
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="CFG", declaredAt="C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\CFG\\CFG.jrag:26")
  public Set<Stmt> blocks() {
    {
        Set<Stmt> ret = new HashSet<Stmt>();
        ret.add(this);
        ret.addAll(getStmt().blocks());
        return ret;
      }
  }
  /**
   * @attribute syn
   * @aspect CFG
   * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\CFG\\CFG.jrag:75
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="CFG", declaredAt="C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\CFG\\CFG.jrag:75")
  public Set<Pair> flow() {
    {
        Set<Pair> ret = new HashSet<Pair>();
        ret.add(new Pair(Label(), getStmt().init()));
        for(Integer l : getStmt().finals())
          ret.add(new Pair(l, Label()));
        ret.addAll(getStmt().flow());
        return ret;
      }
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
