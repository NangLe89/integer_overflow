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
 * @declaredat /home/anonymous/WHILE/trunk/WHILE.ast:21
 * @production S : {@link ASTNode};

 */
public abstract class S extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public S() {
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
  public S clone() throws CloneNotSupportedException {
    S node = (S) super.clone();
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
  public abstract S fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:64
   */
  public abstract S treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:72
   */
  public abstract S treeCopy();
  /** The initial label of an AST node. 
   * @attribute syn
   * @aspect CFG
   * @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:11
   */
  @ASTNodeAnnotation.Attribute
  public abstract Label init();
  /**
   * @attribute syn
   * @aspect CFG
   * @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:21
   */
  @ASTNodeAnnotation.Attribute
  public abstract Set<Label> finals();
  /** Set of blocks in a statement. 
   * @attribute syn
   * @aspect CFG
   * @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:44
   */
  @ASTNodeAnnotation.Attribute
  public abstract Set<Block> blocks();
  /**
   * @attribute syn
   * @aspect CFG
   * @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:79
   */
  @ASTNodeAnnotation.Attribute
  public abstract Set<Label> labels();
  /** flows inside of a statement 
   * @attribute syn
   * @aspect CFG
   * @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:197
   */
  @ASTNodeAnnotation.Attribute
  public abstract FlowGraph<Label, Label> flows();
  /**
   * @attribute syn
   * @aspect AExp
   * @declaredat /home/anonymous/WHILE/trunk/AExp.jrag:26
   */
  @ASTNodeAnnotation.Attribute
  public abstract Set<Expr> Aexps();
  /**
   * @attribute syn
   * @aspect FreeVars
   * @declaredat /home/anonymous/WHILE/trunk/FreeVars.jrag:9
   */
  @ASTNodeAnnotation.Attribute
  public abstract Set<String> FV();
  /**
   * @attribute syn
   * @aspect Unparse
   * @declaredat /home/anonymous/WHILE/trunk/Unparse.jrag:4
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
    String prettyPrint_value = PPUtility.spacesForIndent(nestingLevel()) + unparse();

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
  /** Flows into a block.
   * @attribute inh
   * @aspect CFG
   * @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:120
   */
  @ASTNodeAnnotation.Attribute
  public Set<Label> inFlows() {
    if (inFlows_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: inFlows in class: org.jastadd.ast.AST.InhDecl");
    }
    inFlows_visited = state().boundariesCrossed;
    Set<Label> inFlows_value = getParent().Define_inFlows(this, null);

    inFlows_visited = -1;
    return inFlows_value;
  }
  /**
   * @apilevel internal
   */
  protected int inFlows_visited = -1;
  /** Next statement in a sequence (lexically), null if none.
   * This is a helping attribute for outFlows. 
   * @attribute inh
   * @aspect CFG
   * @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:149
   */
  @ASTNodeAnnotation.Attribute
  public S next() {
    if (next_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: next in class: org.jastadd.ast.AST.InhDecl");
    }
    next_visited = state().boundariesCrossed;
    S next_value = getParent().Define_next(this, null);

    next_visited = -1;
    return next_value;
  }
  /**
   * @apilevel internal
   */
  protected int next_visited = -1;
  /** Flows out of a block. 
   * @attribute inh
   * @aspect CFG
   * @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:163
   */
  @ASTNodeAnnotation.Attribute
  public Set<Label> outFlows() {
    if (outFlows_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: outFlows in class: org.jastadd.ast.AST.InhDecl");
    }
    outFlows_visited = state().boundariesCrossed;
    Set<Label> outFlows_value = getParent().Define_outFlows(this, null);

    outFlows_visited = -1;
    return outFlows_value;
  }
  /**
   * @apilevel internal
   */
  protected int outFlows_visited = -1;
  /** The set of non-trivial expressions in the program 
   * is broadcast to all blocks. 
   * @attribute inh
   * @aspect AExp
   * @declaredat /home/anonymous/WHILE/trunk/AExp.jrag:80
   */
  @ASTNodeAnnotation.Attribute
  public Set<Expr> AexpStar() {
    if (AexpStar_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: AexpStar in class: org.jastadd.ast.AST.InhDecl");
    }
    AexpStar_visited = state().boundariesCrossed;
    Set<Expr> AexpStar_value = getParent().Define_AexpStar(this, null);

    AexpStar_visited = -1;
    return AexpStar_value;
  }
  /**
   * @apilevel internal
   */
  protected int AexpStar_visited = -1;
  /**
   * @attribute inh
   * @aspect PrettyPrint
   * @declaredat /home/anonymous/WHILE/trunk/PrettyPrint.jrag:5
   */
  @ASTNodeAnnotation.Attribute
  public int nestingLevel() {
    if (nestingLevel_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: nestingLevel in class: org.jastadd.ast.AST.InhDecl");
    }
    nestingLevel_visited = state().boundariesCrossed;
    int nestingLevel_value = getParent().Define_nestingLevel(this, null);

    nestingLevel_visited = -1;
    return nestingLevel_value;
  }
  /**
   * @apilevel internal
   */
  protected int nestingLevel_visited = -1;
  /**
   * @attribute inh
   * @aspect ProgramGlobalAttributes
   * @declaredat /home/anonymous/WHILE/trunk/ProgramGlobalAttributes.jrag:29
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
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
