/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.0 */
package AST;
import AST.*;
import java.util.*;
import java.util.Set;
/**
 * @ast node
 * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\grammar\\picoC.ast:5
 * @production Stmt : {@link ASTNode} ::= <span class="component">&lt;l:int&gt;</span>;

 */
public abstract class Stmt extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect CFG
   * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\CFG\\CFG.jrag:128
   */
  public boolean equals(Object oth){
    if(oth == null || !(oth instanceof Stmt)) { return false; }
    Stmt b = (Stmt) oth;
    return Label().equals(b.Label());
}
  /**
   * @declaredat ASTNode:1
   */
  public Stmt() {
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
  public Stmt(int p0) {
    setl(p0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:16
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:22
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:26
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:30
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:34
   */
  public void flushRewriteCache() {
    super.flushRewriteCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:38
   */
  public Stmt clone() throws CloneNotSupportedException {
    Stmt node = (Stmt) super.clone();
    return node;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:49
   */
  @Deprecated
  public abstract Stmt fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:57
   */
  public abstract Stmt treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:65
   */
  public abstract Stmt treeCopy();
  /**
   * Replaces the lexeme l.
   * @param value The new value for the lexeme l.
   * @apilevel high-level
   */
  public void setl(int value) {
    tokenint_l = value;
  }
  /** @apilevel internal 
   */
  protected int tokenint_l;
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
   * @attribute syn
   * @aspect AExp
   * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\AExp.jrag:9
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="AExp", declaredAt="C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\AExp.jrag:9")
  public abstract Set<Expr> Aexps();
  /**
   * @attribute syn
   * @aspect CFG
   * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\CFG\\CFG.jrag:4
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="CFG", declaredAt="C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\CFG\\CFG.jrag:4")
  public Integer Label() {
    Integer Label_value = new Integer(getl());
    return Label_value;
  }
  /**
   * @attribute syn
   * @aspect CFG
   * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\CFG\\CFG.jrag:6
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="CFG", declaredAt="C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\CFG\\CFG.jrag:6")
  public Integer init() {
    Integer init_value = Label();
    return init_value;
  }
  /**
   * @attribute syn
   * @aspect CFG
   * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\CFG\\CFG.jrag:12
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="CFG", declaredAt="C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\CFG\\CFG.jrag:12")
  public Set<Integer> finals() {
    {
        Set<Integer> ret = new HashSet<Integer>();
        ret.add(Label());
        return ret;
      }
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
    Set<Pair> flow_value = new HashSet<Pair>();
    return flow_value;
  }
  /**
   * @attribute syn
   * @aspect FreeVars
   * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\FreeVars.jrag:8
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="FreeVars", declaredAt="C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\FreeVars.jrag:8")
  public Set<String> FV() {
    Set<String> FV_value = new HashSet();
    return FV_value;
  }
  /**
   * @attribute inh
   * @aspect AExp
   * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\AExp.jrag:97
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="AExp", declaredAt="C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\AExp.jrag:97")
  public Set<Expr> AexpStar() {
    Set<Expr> AexpStar_value = getParent().Define_AexpStar(this, null);
    return AexpStar_value;
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
