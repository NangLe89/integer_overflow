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
 * @declaredat /home/anonymous/WHILE/trunk/WHILEAssert.ast:1
 * @production AssertS : {@link S} ::= <span class="component">{@link LabeledExpr}</span>;

 */
public class AssertS extends S implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public AssertS() {
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
  public AssertS(LabeledExpr p0) {
    setChild(p0, 0);
  }
  /**
   * @apilevel low-level
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
  /**
   * @apilevel internal
   * @declaredat ASTNode:31
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:37
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:43
   */
  public void flushRewriteCache() {
    super.flushRewriteCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:49
   */
  public AssertS clone() throws CloneNotSupportedException {
    AssertS node = (AssertS) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:56
   */
  public AssertS copy() {
    try {
      AssertS node = (AssertS) clone();
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
   * @declaredat ASTNode:75
   */
  @Deprecated
  public AssertS fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:85
   */
  public AssertS treeCopyNoTransform() {
    AssertS tree = (AssertS) copy();
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
   * @declaredat ASTNode:105
   */
  public AssertS treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:112
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the LabeledExpr child.
   * @param node The new node to replace the LabeledExpr child.
   * @apilevel high-level
   */
  public void setLabeledExpr(LabeledExpr node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the LabeledExpr child.
   * @return The current node used as the LabeledExpr child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="LabeledExpr")
  public LabeledExpr getLabeledExpr() {
    return (LabeledExpr) getChild(0);
  }
  /**
   * Retrieves the LabeledExpr child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the LabeledExpr child.
   * @apilevel low-level
   */
  public LabeledExpr getLabeledExprNoTransform() {
    return (LabeledExpr) getChildNoTransform(0);
  }
  /**
   * @apilevel internal
   */
  protected int Aexps_visited = -1;
  @ASTNodeAnnotation.Attribute
  public Set<Expr> Aexps() {
    if (Aexps_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: Aexps in class: org.jastadd.ast.AST.SynDecl");
    }
    Aexps_visited = state().boundariesCrossed;
    Set<Expr> Aexps_value = getLabeledExpr().Aexps();

    Aexps_visited = -1;
    return Aexps_value;
  }
  /**
   * @apilevel internal
   */
  protected int init_visited = -1;
  @ASTNodeAnnotation.Attribute
  public Label init() {
    if (init_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: init in class: org.jastadd.ast.AST.SynDecl");
    }
    init_visited = state().boundariesCrossed;
    Label init_value = getLabeledExpr().getLabelAST();

    init_visited = -1;
    return init_value;
  }
  /**
   * @apilevel internal
   */
  protected int finals_visited = -1;
  @ASTNodeAnnotation.Attribute
  public Set<Label> finals() {
    if (finals_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: finals in class: org.jastadd.ast.AST.SynDecl");
    }
    finals_visited = state().boundariesCrossed;
    Set<Label> finals_value = SetRepUtility.singleton(getLabeledExpr().getLabelAST());

    finals_visited = -1;
    return finals_value;
  }
  /**
   * @apilevel internal
   */
  protected int blocks_visited = -1;
  @ASTNodeAnnotation.Attribute
  public Set<Block> blocks() {
    if (blocks_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: blocks in class: org.jastadd.ast.AST.SynDecl");
    }
    blocks_visited = state().boundariesCrossed;
    Set<Block> blocks_value = SetRepUtility.singleton(this.getLabeledExpr());

    blocks_visited = -1;
    return blocks_value;
  }
  /**
   * @apilevel internal
   */
  protected int labels_visited = -1;
  @ASTNodeAnnotation.Attribute
  public Set<Label> labels() {
    if (labels_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: labels in class: org.jastadd.ast.AST.SynDecl");
    }
    labels_visited = state().boundariesCrossed;
    Set<Label> labels_value = SetRepUtility.singleton(getLabeledExpr().getLabelAST());

    labels_visited = -1;
    return labels_value;
  }
  /**
   * @apilevel internal
   */
  protected int flows_visited = -1;
  @ASTNodeAnnotation.Attribute
  public FlowGraph<Label, Label> flows() {
    if (flows_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: flows in class: org.jastadd.ast.AST.SynDecl");
    }
    flows_visited = state().boundariesCrossed;
    FlowGraph<Label, Label> flows_value = new FlowGraph<Label, Label>();

    flows_visited = -1;
    return flows_value;
  }
  /**
   * @apilevel internal
   */
  protected int FV_visited = -1;
  @ASTNodeAnnotation.Attribute
  public Set<String> FV() {
    if (FV_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: FV in class: org.jastadd.ast.AST.SynDecl");
    }
    FV_visited = state().boundariesCrossed;
    Set<String> FV_value = getLabeledExpr().FV();

    FV_visited = -1;
    return FV_value;
  }
  /**
   * @apilevel internal
   */
  protected int unparse_visited = -1;
  /**
   * @attribute syn
   * @aspect Unparse
   * @declaredat /home/anonymous/WHILE/trunk/Unparse.jrag:4
   */
  @ASTNodeAnnotation.Attribute
  public String unparse() {
    if (unparse_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: unparse in class: org.jastadd.ast.AST.SynDecl");
    }
    unparse_visited = state().boundariesCrossed;
    try {
    		return "assert " + getLabeledExpr().unparse();
    	}
    finally {
      unparse_visited = -1;
    }
  }
  /**
   * @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:114
   * @apilevel internal
   */
  public Block Define_itsBlock(ASTNode caller, ASTNode child) {
    if (caller == getLabeledExprNoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/CFGAssert.jrag:27
      return this.getLabeledExpr();
    }
    else {
      return getParent().Define_itsBlock(this, caller);
    }
  }
  /**
   * @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:120
   * @apilevel internal
   */
  public Set<Label> Define_inFlows(ASTNode caller, ASTNode child) {
    if (caller == getLabeledExprNoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/CFGAssert.jrag:33
      return this.inFlows();
    }
    else {
      return getParent().Define_inFlows(this, caller);
    }
  }
  /**
   * @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:163
   * @apilevel internal
   */
  public Set<Label> Define_outFlows(ASTNode caller, ASTNode child) {
    if (caller == getLabeledExprNoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/CFGAssert.jrag:43
      return this.outFlows();
    }
    else {
      return getParent().Define_outFlows(this, caller);
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
