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
 * @declaredat /home/anonymous/WHILE/trunk/WHILE.ast:12
 * @production ABinaryExpr : {@link Expr} ::= <span class="component">Left:{@link Expr}</span> <span class="component">Op:{@link Op_a}</span> <span class="component">Right:{@link Expr}</span>;

 */
public class ABinaryExpr extends Expr implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public ABinaryExpr() {
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
  public ABinaryExpr(Expr p0, Op_a p1, Expr p2) {
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
  public ABinaryExpr clone() throws CloneNotSupportedException {
    ABinaryExpr node = (ABinaryExpr) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:58
   */
  public ABinaryExpr copy() {
    try {
      ABinaryExpr node = (ABinaryExpr) clone();
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
  public ABinaryExpr fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:87
   */
  public ABinaryExpr treeCopyNoTransform() {
    ABinaryExpr tree = (ABinaryExpr) copy();
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
  public ABinaryExpr treeCopy() {
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
   * Replaces the Left child.
   * @param node The new node to replace the Left child.
   * @apilevel high-level
   */
  public void setLeft(Expr node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Left child.
   * @return The current node used as the Left child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Left")
  public Expr getLeft() {
    return (Expr) getChild(0);
  }
  /**
   * Retrieves the Left child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Left child.
   * @apilevel low-level
   */
  public Expr getLeftNoTransform() {
    return (Expr) getChildNoTransform(0);
  }
  /**
   * Replaces the Op child.
   * @param node The new node to replace the Op child.
   * @apilevel high-level
   */
  public void setOp(Op_a node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Op child.
   * @return The current node used as the Op child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Op")
  public Op_a getOp() {
    return (Op_a) getChild(1);
  }
  /**
   * Retrieves the Op child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Op child.
   * @apilevel low-level
   */
  public Op_a getOpNoTransform() {
    return (Op_a) getChildNoTransform(1);
  }
  /**
   * Replaces the Right child.
   * @param node The new node to replace the Right child.
   * @apilevel high-level
   */
  public void setRight(Expr node) {
    setChild(node, 2);
  }
  /**
   * Retrieves the Right child.
   * @return The current node used as the Right child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Right")
  public Expr getRight() {
    return (Expr) getChild(2);
  }
  /**
   * Retrieves the Right child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Right child.
   * @apilevel low-level
   */
  public Expr getRightNoTransform() {
    return (Expr) getChildNoTransform(2);
  }
  /**
   * @apilevel internal
   */
  protected int nontrivial_visited = -1;
  @ASTNodeAnnotation.Attribute
  public boolean nontrivial() {
    if (nontrivial_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: nontrivial in class: org.jastadd.ast.AST.SynDecl");
    }
    nontrivial_visited = state().boundariesCrossed;
    boolean nontrivial_value = true;

    nontrivial_visited = -1;
    return nontrivial_value;
  }
  /**
   * @apilevel internal
   */
  protected int Aexps_visited = -1;
  /** The set of non-trivial arithmetic expressions in an expression. 
   * @attribute syn
   * @aspect AExp
   * @declaredat /home/anonymous/WHILE/trunk/AExp.jrag:49
   */
  @ASTNodeAnnotation.Attribute
  public Set<Expr> Aexps() {
    if (Aexps_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: Aexps in class: org.jastadd.ast.AST.SynDecl");
    }
    Aexps_visited = state().boundariesCrossed;
    try {
              Set<Expr> ret = SetRepUtility.singleton(this);
              ret.addAll(getLeft().Aexps());
              ret.addAll(getRight().Aexps());
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
   * @declaredat /home/anonymous/WHILE/trunk/FreeVars.jrag:35
   */
  @ASTNodeAnnotation.Attribute
  public Set<String> FV() {
    if (FV_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: FV in class: org.jastadd.ast.AST.SynDecl");
    }
    FV_visited = state().boundariesCrossed;
    try {
    	   Set<String> ret = getLeft().FV();
    	   ret.addAll(getRight().FV());
    	   return ret;
    	}
    finally {
      FV_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int type_visited = -1;
  @ASTNodeAnnotation.Attribute
  public Type type() {
    if (type_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: type in class: org.jastadd.ast.AST.SynDecl");
    }
    type_visited = state().boundariesCrossed;
    Type type_value = Type.Int;

    type_visited = -1;
    return type_value;
  }
  /**
   * @apilevel internal
   */
  protected int unparse_visited = -1;
  /**
   * @attribute syn
   * @aspect Unparse
   * @declaredat /home/anonymous/WHILE/trunk/Unparse.jrag:5
   */
  @ASTNodeAnnotation.Attribute
  public String unparse() {
    if (unparse_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: unparse in class: org.jastadd.ast.AST.SynDecl");
    }
    unparse_visited = state().boundariesCrossed;
    try { return "(" + getLeft().unparse() + " " + getOp().unparse() + " " + getRight().unparse() + ")";}
    finally {
      unparse_visited = -1;
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
   * @declaredat /home/anonymous/WHILE/trunk/TypeChecking.jrag:21
   */
    if (getLeft().type() != Type.Int) {
      {
        Program ref = (Program) (progAST());
        if (ref != null) {
          ref.Program_errors_contributors().add(this);
        }
      }
    }
  /**
   * @attribute coll
   * @aspect TypeInference
   * @declaredat /home/anonymous/WHILE/trunk/TypeChecking.jrag:28
   */
    if (getRight().type() != Type.Int) {
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
    if (getLeft().type() != Type.Int)
      collection.add((PositionMessage.posInfo(getLeft())
	  			  + ": left operand of `" + getOp().unparse() + "' (" 
	  			  + getLeft().unparse()
			      + ") is not of type Int"));
    if (getRight().type() != Type.Int)
      collection.add((PositionMessage.posInfo(getRight()) 
	  			  + ": right operand of `" + getOp().unparse() + "' (" 
	  			  + getRight().unparse()
			      + ") is not of type Int"));
  }

}
