/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.0 */
package AST;
/**
 * @ast node
 * @production List : {@link ASTNode};

 */
public class List<T extends ASTNode> extends ASTNode<T> implements Cloneable, Iterable<T> {
  /**
   * @declaredat ASTNode:1
   */
  public List() {
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
  public List(T... initialChildren) {
    children = new ASTNode[initialChildren.length];
    for (int i = 0; i < children.length; ++i) {
      addChild(initialChildren[i]);
    }
  }
  /**
   * @declaredat ASTNode:19
   */
  private boolean list$touched = true;
  /**
   * @declaredat ASTNode:21
   */
  public List<T> add(T node) {
    addChild(node);
    return this;
  }
  /**
   * @declaredat ASTNode:26
   */
  public List<T> addAll(java.util.Collection<? extends T> c) {
    for (T node : c) {
      addChild(node);
    }
    return this;
  }
  /**
   * @declaredat ASTNode:33
   */
  public void insertChild(ASTNode node, int i) {
    list$touched = true;
    super.insertChild(node, i);
  }
  /**
   * @declaredat ASTNode:38
   */
  public void addChild(T node) {
    list$touched = true;
    super.addChild(node);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:44
   */
  public void removeChild(int i) {
    list$touched = true;
    super.removeChild(i);
  }
  /**
   * @declaredat ASTNode:49
   */
  public int getNumChild() {
    if (list$touched) {
      for (int i = 0; i < getNumChildNoTransform(); i++) {
        getChild(i);
      }
      list$touched = false;
    }
    return getNumChildNoTransform();
  }
  /** @return an iterator to iterate over elements in this list node. 
   * @declaredat ASTNode:60
   */
  @Override
  public java.util.Iterator<T> iterator() {
    return astChildIterator();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:67
   */
  public boolean mayHaveRewrite() {
    return true;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:71
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:75
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:79
   */
  public void flushRewriteCache() {
    super.flushRewriteCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:83
   */
  public List<T> clone() throws CloneNotSupportedException {
    List node = (List) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:88
   */
  public List<T> copy() {
    try {
      List node = (List) clone();
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
   * @declaredat ASTNode:107
   */
  @Deprecated
  public List<T> fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:117
   */
  public List<T> treeCopyNoTransform() {
    List tree = (List) copy();
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
   * @declaredat ASTNode:137
   */
  public List<T> treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:142
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    if (list$touched) {
      for(int i = 0 ; i < getNumChildNoTransform(); i++) {
        getChild(i);
      }
      list$touched = false;
      return this;
    }
    return super.rewriteTo();
  }
}
