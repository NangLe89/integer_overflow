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
 * @declaredat /home/anonymous/WHILE/trunk/WHILE.ast:22
 * @production CompoundS : {@link S} ::= <span class="component">SList:{@link S}*</span>;

 */
public class CompoundS extends S implements Cloneable {
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
  public CompoundS(List<S> p0) {
    setChild(p0, 0);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:20
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:26
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:32
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:38
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:44
   */
  public void flushRewriteCache() {
    super.flushRewriteCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:50
   */
  public CompoundS clone() throws CloneNotSupportedException {
    CompoundS node = (CompoundS) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:57
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
   * @declaredat ASTNode:76
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
   * @declaredat ASTNode:86
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
   * @declaredat ASTNode:106
   */
  public CompoundS treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:113
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the SList list.
   * @param list The new list node to be used as the SList list.
   * @apilevel high-level
   */
  public void setSListList(List<S> list) {
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
  public S getSList(int i) {
    return (S) getSListList().getChild(i);
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
  public void addSList(S node) {
    List<S> list = (parent == null) ? getSListListNoTransform() : getSListList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   */
  public void addSListNoTransform(S node) {
    List<S> list = getSListListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the SList list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setSList(S node, int i) {
    List<S> list = getSListList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the SList list.
   * @return The node representing the SList list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="SList")
  public List<S> getSListList() {
    List<S> list = (List<S>) getChild(0);
    return list;
  }
  /**
   * Retrieves the SList list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SList list.
   * @apilevel low-level
   */
  public List<S> getSListListNoTransform() {
    return (List<S>) getChildNoTransform(0);
  }
  /**
   * Retrieves the SList list.
   * @return The node representing the SList list.
   * @apilevel high-level
   */
  public List<S> getSLists() {
    return getSListList();
  }
  /**
   * Retrieves the SList list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SList list.
   * @apilevel low-level
   */
  public List<S> getSListsNoTransform() {
    return getSListListNoTransform();
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
    Label init_value = getSList(0).init();

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
    Set<Label> finals_value = getSList(getNumSList()-1).finals();

    finals_visited = -1;
    return finals_value;
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
    	     Set<Block> ret = SetRepUtility.emptySet();
    	     for (int i =0; i < getNumSList(); i++) {
    	        ret.addAll(getSList(i).blocks());
    	     }
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
    	     Set ret = SetRepUtility.emptySet();
    	     for (int i = 0; i < getNumSList(); i++) {
    	       ret.addAll(getSList(i).labels());
    	     }
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
    	     FlowGraph<Label, Label> ret = new FlowGraph<Label, Label>();
    	     for (int i = 1; i < getNumSList()-1; i++) {
    	        ret.putAll(getSList(i-1).flows());
    	        Set<Label> finalsM1 = getSList(i-1).finals();
    	        ret.putAll(FlowGraph.crossWith(finalsM1, getSList(i).init()));
    	     }
    	     ret.putAll(getSList(getNumSList()-1).flows());
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
              Set<Expr> ret = SetRepUtility.emptySet();
              for (int i =0; i < getNumSList(); i++) {
                 ret.addAll(getSList(i).Aexps());
              }
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
    	   Set<String> ret = SetRepUtility.emptySet();
    	   for (int i = 0; i < getNumSList(); i++) {
    	      ret.addAll(getSList(i).FV());
    	   }
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
                    StringBuffer s = new StringBuffer();
                    String indent = PPUtility.spacesForIndent(nestingLevel());
                    s.append(indent);
                    s.append("{\n");
                    int len = getNumSList();
                    for (int i = 0; i < len; i++) {
                            s.append(getSList(i).prettyPrint());
                            if (i < len-1) { s.append(";\n"); }     
                    }
                    s.append(PPUtility.spacesForIndent(nestingLevel()));
                    s.append('\n'); s.append(indent); s.append("}");
                    return s.toString();
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
    		StringBuffer s = new StringBuffer();
    		s.append("{\n");
    		int len = getNumSList();
    		for (int i = 0; i < len; i++) {
    			s.append(getSList(i).unparse());
    			if (i < len-1) { s.append(";\n"); }	
    		}
    		s.append("\n}");
    		return s.toString();
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
    if (caller == getSListListNoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:131
      int index = caller.getIndexOfChild(child);
      {
      		if (index == 0) {
      			return inFlows();
      		} else { 
      			return getSList(index-1).finals();
      		}
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
    if (caller == getSListListNoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:150
      int index = caller.getIndexOfChild(child);
      {
      		if (index == getNumSList()-1) {
      			return next();
      		} else {
      			return getSList(index+1);
      		}
      	}
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
    if (caller == getSListListNoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:176
      int index = caller.getIndexOfChild(child);
      {
      		if (index == getNumSList()-1) {
      			return outFlows();
      		} else { 
      			return SetRepUtility.singleton(getSList(index+1).init());
      		}
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
    if (caller == getSListListNoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/PrettyPrint.jrag:7
      int index = caller.getIndexOfChild(child);
      return nestingLevel()+1;
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
}
