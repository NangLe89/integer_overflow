/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.0 */
package AST;
/**
 * @ast node
 * @declaredat C:\\Users\\Nang LE\\Documents\\GitHub\\integer_overflow\\picoC\\grammar\\picoC.ast:11
 * @production CompoundS : {@link Stmt} ::= <span class="component">SList:{@link Stmt}*</span>;

 */
public class CompoundS extends Stmt implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public CompoundS() {
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
  public CompoundS(List<Stmt> p0) {
    setChild(p0, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:18
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:24
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:28
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:32
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:36
   */
  public void flushRewriteCache() {
    super.flushRewriteCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
   */
  public CompoundS clone() throws CloneNotSupportedException {
    CompoundS node = (CompoundS) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public CompoundS copy() {
    try {
      CompoundS node = (CompoundS) clone();
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
   * @declaredat ASTNode:64
   */
  @Deprecated
  public CompoundS fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public CompoundS treeCopyNoTransform() {
    CompoundS tree = (CompoundS) copy();
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
   * @declaredat ASTNode:94
   */
  public CompoundS treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:99
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
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
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
