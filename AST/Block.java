/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.0 */
package AST;
import AST.*;
import java.util.*;
import java.util.Set;
/**
 * @ast node
 * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\grammar\\picoC.ast:12
 * @production Block : {@link Stmt} ::= <span class="component">SList:{@link Stmt}*</span>;

 */
public class Block extends Stmt implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Block() {
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
    setChild(new List(), 0);
  }
  /**
   * @declaredat ASTNode:14
   */
  public Block(int p0, List<Stmt> p1) {
    setl(p0);
    setChild(p1, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:19
   */
  protected int numChildren() {
    return 1;
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
  public Block clone() throws CloneNotSupportedException {
    Block node = (Block) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public Block copy() {
    try {
      Block node = (Block) clone();
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
  public Block fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public Block treeCopyNoTransform() {
    Block tree = (Block) copy();
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
  public Block treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:100
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenint_l == ((Block) node).tokenint_l);    
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
   * Replaces the SList list.
   * @param list The new list node to be used as the SList list.
   * @apilevel high-level
   */
  public void setSListList(List<Stmt> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the SList list.
   * @return Number of children in the SList list.
   * @apilevel high-level
   */
  public int getNumSList() {
    return getSListList().getNumChild();
  }
  /**
   * Retrieves the number of children in the SList list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the SList list.
   * @apilevel low-level
   */
  public int getNumSListNoTransform() {
    return getSListListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the SList list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the SList list.
   * @apilevel high-level
   */
  public Stmt getSList(int i) {
    return (Stmt) getSListList().getChild(i);
  }
  /**
   * Check whether the SList list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasSList() {
    return getSListList().getNumChild() != 0;
  }
  /**
   * Append an element to the SList list.
   * @param node The element to append to the SList list.
   * @apilevel high-level
   */
  public void addSList(Stmt node) {
    List<Stmt> list = (parent == null) ? getSListListNoTransform() : getSListList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addSListNoTransform(Stmt node) {
    List<Stmt> list = getSListListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the SList list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setSList(Stmt node, int i) {
    List<Stmt> list = getSListList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the SList list.
   * @return The node representing the SList list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="SList")
  public List<Stmt> getSListList() {
    List<Stmt> list = (List<Stmt>) getChild(0);
    return list;
  }
  /**
   * Retrieves the SList list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SList list.
   * @apilevel low-level
   */
  public List<Stmt> getSListListNoTransform() {
    return (List<Stmt>) getChildNoTransform(0);
  }
  /**
   * Retrieves the SList list.
   * @return The node representing the SList list.
   * @apilevel high-level
   */
  public List<Stmt> getSLists() {
    return getSListList();
  }
  /**
   * Retrieves the SList list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SList list.
   * @apilevel low-level
   */
  public List<Stmt> getSListsNoTransform() {
    return getSListListNoTransform();
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
            Set<Expr> ret = new HashSet();
            for (int i=0; i < getNumSList() ; i++){
                ret.addAll(getSList(i).Aexps());
            }
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
    Integer init_value = getSList(0).init();
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
    Set<Integer> finals_value = getSList(getNumSList()-1).finals();
    return finals_value;
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
        for(Stmt s : getSLists())
          ret.addAll(s.blocks());
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
        for(Stmt s : getSLists())
          ret.addAll(s.flow());
        for(int i = 0; i < getNumSList()-1; i++)
          for(Integer l : getSList(i).finals())
            ret.add(new Pair(l, getSList(i+1).init())); 
        return ret; 
      }
  }
  /**
   * @attribute syn
   * @aspect FreeVars
   * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\FreeVars.jrag:8
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="FreeVars", declaredAt="C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\FreeVars.jrag:8")
  public Set<String> FV() {
    {
    	   Set<String> ret = new HashSet();
    	   for (int i = 0; i < getNumSList(); i++) {
    	      ret.addAll(getSList(i).FV());
    	   }
    	   return ret;
    	}
  }
  /**
   * @attribute inh
   * @aspect AExp
   * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\AExp.jrag:100
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="AExp", declaredAt="C:\\Users\\Nang LE\\Documents\\GitHub\\anyname\\integer_overflow\\AExp.jrag:100")
  public Set<Expr> AexpStar() {
    Set<Expr> AexpStar_value = getParent().Define_AexpStar(this, null);
    return AexpStar_value;
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
