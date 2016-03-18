/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.13 */
package AST;

import java.util.*;
import utility.SetRepUtility;
import utility.FlowGraph;
import java.util.Set;
import utility.Pair;
import AST.*;
import java.util.Collection;
import java.util.Map;
import utility.PPUtility;
import utility.Type;
import utility.PositionMessage;
import java.util.HashMap;
/**
 * @ast node
 * @declaredat /home/anonymous/WHILE/trunk/WHILE.ast:28
 * @production Label : {@link ASTNode};

 */
public abstract class Label extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Label() {
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
   * @apilevel low-level
   * @declaredat ASTNode:15
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:21
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:27
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:33
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:39
   */
  public void flushRewriteCache() {
    super.flushRewriteCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:45
   */
  public Label clone() throws CloneNotSupportedException {
    Label node = (Label) super.clone();
    return node;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:56
   */
  @Deprecated
  public abstract Label fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:64
   */
  public abstract Label treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:72
   */
  public abstract Label treeCopy();
  /**
   * @attribute syn
   * @aspect Unparse
   * @declaredat /home/anonymous/WHILE/trunk/Unparse.jrag:7
   */
  @ASTNodeAnnotation.Attribute
  public abstract String unparse();
  /**
   * @apilevel internal
   */
  protected int prettyPrint_visited = -1;
  @ASTNodeAnnotation.Attribute
  public String prettyPrint() {
    if (prettyPrint_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: prettyPrint in class: org.jastadd.ast.AST.SynDecl");
    }
    prettyPrint_visited = state().boundariesCrossed;
    String prettyPrint_value = unparse();

    prettyPrint_visited = -1;
    return prettyPrint_value;
  }
  /**
   * @apilevel internal
   */
  protected int toString_visited = -1;
  @ASTNodeAnnotation.Attribute
  public String toString() {
    if (toString_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: toString in class: org.jastadd.ast.AST.SynDecl");
    }
    toString_visited = state().boundariesCrossed;
    String toString_value = unparse();

    toString_visited = -1;
    return toString_value;
  }
  /** Mapping from labels back to blocks. 
   * @attribute inh
   * @aspect CFG
   * @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:114
   */
  @ASTNodeAnnotation.Attribute
  public Block itsBlock() {
    if (itsBlock_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: itsBlock in class: org.jastadd.ast.AST.InhDecl");
    }
    itsBlock_visited = state().boundariesCrossed;
    Block itsBlock_value = getParent().Define_itsBlock(this, null);

    itsBlock_visited = -1;
    return itsBlock_value;
  }
  /**
   * @apilevel internal
   */
  protected int itsBlock_visited = -1;
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
