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
 * @declaredat /home/anonymous/WHILE/trunk/WHILE.ast:25
 * @production IfS : {@link S} ::= <span class="component">{@link LabeledExpr}</span> <span class="component">S1:{@link S}</span> <span class="component">S2:{@link S}</span>;

 */
public class IfS extends S implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public IfS() {
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
    children = new ASTNode[3];
  }
  /**
   * @declaredat ASTNode:13
   */
  public IfS(LabeledExpr p0, S p1, S p2) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:21
   */
  protected int numChildren() {
    return 3;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:27
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:33
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:39
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:45
   */
  public void flushRewriteCache() {
    super.flushRewriteCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:51
   */
  public IfS clone() throws CloneNotSupportedException {
    IfS node = (IfS) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:58
   */
  public IfS copy() {
    try {
      IfS node = (IfS) clone();
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
   * @declaredat ASTNode:77
   */
  @Deprecated
  public IfS fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:87
   */
  public IfS treeCopyNoTransform() {
    IfS tree = (IfS) copy();
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
   * @declaredat ASTNode:107
   */
  public IfS treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:114
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
   * Replaces the S1 child.
   * @param node The new node to replace the S1 child.
   * @apilevel high-level
   */
  public void setS1(S node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the S1 child.
   * @return The current node used as the S1 child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="S1")
  public S getS1() {
    return (S) getChild(1);
  }
  /**
   * Retrieves the S1 child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the S1 child.
   * @apilevel low-level
   */
  public S getS1NoTransform() {
    return (S) getChildNoTransform(1);
  }
  /**
   * Replaces the S2 child.
   * @param node The new node to replace the S2 child.
   * @apilevel high-level
   */
  public void setS2(S node) {
    setChild(node, 2);
  }
  /**
   * Retrieves the S2 child.
   * @return The current node used as the S2 child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="S2")
  public S getS2() {
    return (S) getChild(2);
  }
  /**
   * Retrieves the S2 child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the S2 child.
   * @apilevel low-level
   */
  public S getS2NoTransform() {
    return (S) getChildNoTransform(2);
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
  /**
   * @attribute syn
   * @aspect CFG
   * @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:21
   */
  @ASTNodeAnnotation.Attribute
  public Set<Label> finals() {
    if (finals_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: finals in class: org.jastadd.ast.AST.SynDecl");
    }
    finals_visited = state().boundariesCrossed;
    try {
    		 Set<Label> ret = getS1().finals();
    		 ret.addAll(getS2().finals());
    		 return ret;
    	   }
    finally {
      finals_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int blocks_visited = -1;
  /** Set of blocks in a statement. 
   * @attribute syn
   * @aspect CFG
   * @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:44
   */
  @ASTNodeAnnotation.Attribute
  public Set<Block> blocks() {
    if (blocks_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: blocks in class: org.jastadd.ast.AST.SynDecl");
    }
    blocks_visited = state().boundariesCrossed;
    try {
    	     Set<Block> ret = getS1().blocks();
    	     ret.addAll(getS2().blocks());
    	     ret.add(getLabeledExpr());
    	     return ret;
    	   }
    finally {
      blocks_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int labels_visited = -1;
  /**
   * @attribute syn
   * @aspect CFG
   * @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:79
   */
  @ASTNodeAnnotation.Attribute
  public Set<Label> labels() {
    if (labels_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: labels in class: org.jastadd.ast.AST.SynDecl");
    }
    labels_visited = state().boundariesCrossed;
    try {
    	     Set ret = SetRepUtility.singleton(getLabeledExpr().getLabelAST());
    	     ret.addAll(getS1().labels());
    	     ret.addAll(getS2().labels());
    	     return ret;
    	   }
    finally {
      labels_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int flows_visited = -1;
  /** flows inside of a statement 
   * @attribute syn
   * @aspect CFG
   * @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:197
   */
  @ASTNodeAnnotation.Attribute
  public FlowGraph<Label, Label> flows() {
    if (flows_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: flows in class: org.jastadd.ast.AST.SynDecl");
    }
    flows_visited = state().boundariesCrossed;
    try {
    	     FlowGraph<Label, Label> ret = getS1().flows();
    	     ret.putAll(getS2().flows());
    	     ret.put(getLabeledExpr().getLabelAST(), getS1().init());
    	     ret.put(getLabeledExpr().getLabelAST(), getS2().init());
    	     return ret;
    	  }
    finally {
      flows_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int Aexps_visited = -1;
  /**
   * @attribute syn
   * @aspect AExp
   * @declaredat /home/anonymous/WHILE/trunk/AExp.jrag:26
   */
  @ASTNodeAnnotation.Attribute
  public Set<Expr> Aexps() {
    if (Aexps_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: Aexps in class: org.jastadd.ast.AST.SynDecl");
    }
    Aexps_visited = state().boundariesCrossed;
    try {
              Set<Expr> ret = getLabeledExpr().Aexps();
              ret.addAll(getS1().Aexps());
              ret.addAll(getS2().Aexps());
              return ret;
           }
    finally {
      Aexps_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int FV_visited = -1;
  /**
   * @attribute syn
   * @aspect FreeVars
   * @declaredat /home/anonymous/WHILE/trunk/FreeVars.jrag:9
   */
  @ASTNodeAnnotation.Attribute
  public Set<String> FV() {
    if (FV_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: FV in class: org.jastadd.ast.AST.SynDecl");
    }
    FV_visited = state().boundariesCrossed;
    try {
    	   Set<String> ret = getLabeledExpr().FV();
    	   ret.addAll(getS1().FV());
    	   ret.addAll(getS2().FV());
    	   return ret;
    	}
    finally {
      FV_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int prettyPrint_visited = -1;
  /**
   * @attribute syn
   * @aspect PrettyPrint
   * @declaredat /home/anonymous/WHILE/trunk/PrettyPrint.jrag:13
   */
  @ASTNodeAnnotation.Attribute
  public String prettyPrint() {
    if (prettyPrint_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: prettyPrint in class: org.jastadd.ast.AST.SynDecl");
    }
    prettyPrint_visited = state().boundariesCrossed;
    try {
                String indent = PPUtility.spacesForIndent(nestingLevel()); 
                return indent + "if " + getLabeledExpr().prettyPrint() 
                       + " then\n" + getS1().prettyPrint() 
                       + " else\n" + getS2().prettyPrint();
            }
    finally {
      prettyPrint_visited = -1;
    }
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
    	    return "if " + getLabeledExpr().unparse() 
    	           + " then " + getS1().unparse() 
    	           + " else " + getS2().unparse();
    	}
    finally {
      unparse_visited = -1;
    }
  }
  /**
   * @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:120
   * @apilevel internal
   */
  public Set<Label> Define_inFlows(ASTNode caller, ASTNode child) {
    if (caller == getLabeledExprNoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:140
      return this.inFlows();
    }
    else if (caller == getS2NoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:125
      {
      	    return SetRepUtility.singleton(getLabeledExpr().getLabelAST());
      	}
    }
    else if (caller == getS1NoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:122
      {
      	    return SetRepUtility.singleton(getLabeledExpr().getLabelAST());
      	}
    }
    else {
      return getParent().Define_inFlows(this, caller);
    }
  }
  /**
   * @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:149
   * @apilevel internal
   */
  public S Define_next(ASTNode caller, ASTNode child) {
    if (caller == getS2NoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:159
      return next();
    }
    else if (caller == getS1NoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:158
      return next();
    }
    else {
      return getParent().Define_next(this, caller);
    }
  }
  /**
   * @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:163
   * @apilevel internal
   */
  public Set<Label> Define_outFlows(ASTNode caller, ASTNode child) {
    if (caller == getLabeledExprNoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:185
      {
      	    Set<Label> ret = SetRepUtility.singleton(getS1().init());
      	    ret.add(getS2().init());
      	    return ret;
      	}
    }
    else if (caller == getS2NoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:169
      {
      	    return next() == null ? SetRepUtility.emptySet() 
      	    		: SetRepUtility.singleton(next().init());
      	}
    }
    else if (caller == getS1NoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:165
      {
      	    return next() == null ? SetRepUtility.emptySet() 
      	    		: SetRepUtility.singleton(next().init());
      	}
    }
    else {
      return getParent().Define_outFlows(this, caller);
    }
  }
  /**
   * @declaredat /home/anonymous/WHILE/trunk/PrettyPrint.jrag:5
   * @apilevel internal
   */
  public int Define_nestingLevel(ASTNode caller, ASTNode child) {
    if (caller == getS2NoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/PrettyPrint.jrag:9
      return nestingLevel();
    }
    else if (caller == getS1NoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/PrettyPrint.jrag:8
      return nestingLevel();
    }
    else {
      return getParent().Define_nestingLevel(this, caller);
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  protected void collect_contributors_Program_errors() {
  /**
   * @attribute coll
   * @aspect TypeInference
   * @declaredat /home/anonymous/WHILE/trunk/TypeChecking.jrag:80
   */
    if (getLabeledExpr().type() != Type.Bool) {
      {
        Program ref = (Program) (progAST());
        if (ref != null) {
          ref.Program_errors_contributors().add(this);
        }
      }
    }
    super.collect_contributors_Program_errors();
  }
  protected void contributeTo_Program_Program_errors(Collection<String> collection) {
    super.contributeTo_Program_Program_errors(collection);
    if (getLabeledExpr().type() != Type.Bool)
      collection.add((PositionMessage.posInfo(getLabeledExpr().getExpr())
	  			+ ": test in `if' " + getLabeledExpr().getExpr().unparse()
	  			+ " is not of type Bool"));
  }

}
