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
 * @declaredat /home/anonymous/WHILE/trunk/WHILE.ast:8
 * @production Expr : {@link ASTNode};

 */
public abstract class Expr extends ASTNode<ASTNode> implements Cloneable {
  /** Are these Exprs equal? 
   * @aspect AExp
   * @declaredat /home/anonymous/WHILE/trunk/AExp.jrag:87
   */
  public boolean equals(Object oth) {
       if (oth == null || !(oth instanceof Expr)) { return false; }
       Expr e = (Expr) oth;
       return unparse().equals(e.unparse());
    }
  /** Return the hash code for this Expr. 
   * @aspect AExp
   * @declaredat /home/anonymous/WHILE/trunk/AExp.jrag:93
   */
  public int hashCode() {
       return unparse().hashCode();
    }
  /**
   * @declaredat ASTNode:1
   */
  public Expr() {
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
  public Expr clone() throws CloneNotSupportedException {
    Expr node = (Expr) super.clone();
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
  public abstract Expr fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:64
   */
  public abstract Expr treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:72
   */
  public abstract Expr treeCopy();
  /** Is this expression a non-trivial arithmetic expression? 
   * @attribute syn
   * @aspect AExp
   * @declaredat /home/anonymous/WHILE/trunk/AExp.jrag:13
   */
  @ASTNodeAnnotation.Attribute
  public abstract boolean nontrivial();
  /** The set of non-trivial arithmetic expressions in an expression. 
   * @attribute syn
   * @aspect AExp
   * @declaredat /home/anonymous/WHILE/trunk/AExp.jrag:49
   */
  @ASTNodeAnnotation.Attribute
  public abstract Set<Expr> Aexps();
  /**
   * @attribute syn
   * @aspect FreeVars
   * @declaredat /home/anonymous/WHILE/trunk/FreeVars.jrag:35
   */
  @ASTNodeAnnotation.Attribute
  public abstract Set<String> FV();
  /**
   * @attribute syn
   * @aspect TypeInference
   * @declaredat /home/anonymous/WHILE/trunk/TypeChecking.jrag:17
   */
  @ASTNodeAnnotation.Attribute
  public abstract Type type();
  /**
   * @attribute syn
   * @aspect Unparse
   * @declaredat /home/anonymous/WHILE/trunk/Unparse.jrag:5
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
  /**
   * @attribute inh
   * @aspect ProgramGlobalAttributes
   * @declaredat /home/anonymous/WHILE/trunk/ProgramGlobalAttributes.jrag:30
   */
  @ASTNodeAnnotation.Attribute
  public Program progAST() {
    if (progAST_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: progAST in class: org.jastadd.ast.AST.InhDecl");
    }
    progAST_visited = state().boundariesCrossed;
    Program progAST_value = getParent().Define_progAST(this, null);

    progAST_visited = -1;
    return progAST_value;
  }
  /**
   * @apilevel internal
   */
  protected int progAST_visited = -1;
  /**
   * @attribute inh
   * @aspect TypeInference
   * @declaredat /home/anonymous/WHILE/trunk/TypeChecking.jrag:15
   */
  @ASTNodeAnnotation.Attribute
  public Map<String,Type> typeEnv() {
    if (typeEnv_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: typeEnv in class: org.jastadd.ast.AST.InhDecl");
    }
    typeEnv_visited = state().boundariesCrossed;
    Map<String,Type> typeEnv_value = getParent().Define_typeEnv(this, null);

    typeEnv_visited = -1;
    return typeEnv_value;
  }
  /**
   * @apilevel internal
   */
  protected int typeEnv_visited = -1;
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
