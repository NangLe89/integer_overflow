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
 * @declaredat /home/anonymous/WHILE/trunk/WHILE.ast:1
 * @production Program : {@link ASTNode} ::= <span class="component">{@link S}</span>;

 */
public class Program extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Program() {
    super();
    is$Final(true);
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:11
   */
  public void init$Children() {
    children = new ASTNode[1];
  }
  /**
   * @declaredat ASTNode:14
   */
  public Program(S p0) {
    setChild(p0, 0);
    is$Final(true);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:21
   */
  protected int numChildren() {
    return 1;
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
    Program_errors_visited = -1;
    Program_errors_computed = false;
    Program_errors_value = null;
    Program_errors_contributors = null;
    collect_contributors_Program_errors = false;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:50
   */
  public void flushRewriteCache() {
    super.flushRewriteCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:56
   */
  public Program clone() throws CloneNotSupportedException {
    Program node = (Program) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:63
   */
  public Program copy() {
    try {
      Program node = (Program) clone();
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
   * @declaredat ASTNode:82
   */
  @Deprecated
  public Program fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:92
   */
  public Program treeCopyNoTransform() {
    Program tree = (Program) copy();
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
   * @declaredat ASTNode:112
   */
  public Program treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:119
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the S child.
   * @param node The new node to replace the S child.
   * @apilevel high-level
   */
  public void setS(S node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the S child.
   * @return The current node used as the S child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="S")
  public S getS() {
    return (S) getChild(0);
  }
  /**
   * Retrieves the S child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the S child.
   * @apilevel low-level
   */
  public S getSNoTransform() {
    return (S) getChildNoTransform(0);
  }
  /**
   * @aspect <NoAspect>
   * @declaredat /home/anonymous/WHILE/trunk/ErrorCheck.jadd:5
   */
    private boolean collect_contributors_Program_errors = false;
  protected void collect_contributors_Program_errors() {
    if (collect_contributors_Program_errors) return;
    super.collect_contributors_Program_errors();
    collect_contributors_Program_errors = true;
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
    Set<Label> finals_value = getS().finals();

    finals_visited = -1;
    return finals_value;
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
    Set<Expr> Aexps_value = getS().Aexps();

    Aexps_visited = -1;
    return Aexps_value;
  }
  /**
   * @apilevel internal
   */
  protected int AexpStar_visited = -1;
  @ASTNodeAnnotation.Attribute
  public Set<Expr> AexpStar() {
    if (AexpStar_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: AexpStar in class: org.jastadd.ast.AST.SynDecl");
    }
    AexpStar_visited = state().boundariesCrossed;
    Set<Expr> AexpStar_value = getS().Aexps();

    AexpStar_visited = -1;
    return AexpStar_value;
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
    Set<String> FV_value = getS().FV();

    FV_visited = -1;
    return FV_value;
  }
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
    String prettyPrint_value = getS().prettyPrint();

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
   * @apilevel internal
   */
  protected int unparse_visited = -1;
  @ASTNodeAnnotation.Attribute
  public String unparse() {
    if (unparse_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: unparse in class: org.jastadd.ast.AST.SynDecl");
    }
    unparse_visited = state().boundariesCrossed;
    String unparse_value = getS().unparse();

    unparse_visited = -1;
    return unparse_value;
  }
  /**
   * @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:120
   * @apilevel internal
   */
  public Set<Label> Define_inFlows(ASTNode caller, ASTNode child) {
    if (caller == getSNoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:121
      return SetRepUtility.emptySet();
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
    if (caller == getSNoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:157
      return null;
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
    if (caller == getSNoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:164
      return SetRepUtility.emptySet();
    }
    else {
      return getParent().Define_outFlows(this, caller);
    }
  }
  /**
   * @declaredat /home/anonymous/WHILE/trunk/AExp.jrag:83
   * @apilevel internal
   */
  public Set<Expr> Define_AexpStar(ASTNode caller, ASTNode child) {
    if (caller == getSNoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/AExp.jrag:81
      return getS().Aexps();
    }
    else {
      return getParent().Define_AexpStar(this, caller);
    }
  }
  /**
   * @declaredat /home/anonymous/WHILE/trunk/PrettyPrint.jrag:5
   * @apilevel internal
   */
  public int Define_nestingLevel(ASTNode caller, ASTNode child) {
    if (caller == getSNoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/PrettyPrint.jrag:6
      return 0;
    }
    else {
      return getParent().Define_nestingLevel(this, caller);
    }
  }
  /**
   * @declaredat /home/anonymous/WHILE/trunk/ProgramGlobalAttributes.jrag:13
   * @apilevel internal
   */
  public Set<Label> Define_progLabels(ASTNode caller, ASTNode child) {
    if (caller == getSNoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/ProgramGlobalAttributes.jrag:12
      return getS().labels();
    }
    else {
      return getParent().Define_progLabels(this, caller);
    }
  }
  /**
   * @declaredat /home/anonymous/WHILE/trunk/ProgramGlobalAttributes.jrag:17
   * @apilevel internal
   */
  public Label Define_progInitLabel(ASTNode caller, ASTNode child) {
    if (caller == getSNoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/ProgramGlobalAttributes.jrag:16
      return getS().init();
    }
    else {
      return getParent().Define_progInitLabel(this, caller);
    }
  }
  /**
   * @declaredat /home/anonymous/WHILE/trunk/ProgramGlobalAttributes.jrag:21
   * @apilevel internal
   */
  public Set<Label> Define_progFinals(ASTNode caller, ASTNode child) {
    if (caller == getSNoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/ProgramGlobalAttributes.jrag:20
      return getS().finals();
    }
    else {
      return getParent().Define_progFinals(this, caller);
    }
  }
  /**
   * @declaredat /home/anonymous/WHILE/trunk/ProgramGlobalAttributes.jrag:25
   * @apilevel internal
   */
  public Set<String> Define_progFV(ASTNode caller, ASTNode child) {
    if (caller == getSNoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/ProgramGlobalAttributes.jrag:24
      return getS().FV();
    }
    else {
      return getParent().Define_progFV(this, caller);
    }
  }
  /**
   * @declaredat /home/anonymous/WHILE/trunk/ProgramGlobalAttributes.jrag:29
   * @apilevel internal
   */
  public Program Define_progAST(ASTNode caller, ASTNode child) {
    if (caller == getSNoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/ProgramGlobalAttributes.jrag:28
      return this;
    }
    else {
      return getParent().Define_progAST(this, caller);
    }
  }
  /**
   * @declaredat /home/anonymous/WHILE/trunk/ProgramGlobalAttributes.jrag:34
   * @apilevel internal
   */
  public FlowGraph<Label,Label> Define_progCFG(ASTNode caller, ASTNode child) {
    if (caller == getSNoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/ProgramGlobalAttributes.jrag:33
      return getS().flows();
    }
    else {
      return getParent().Define_progCFG(this, caller);
    }
  }
  /**
   * @declaredat /home/anonymous/WHILE/trunk/TypeChecking.jrag:15
   * @apilevel internal
   */
  public Map<String,Type> Define_typeEnv(ASTNode caller, ASTNode child) {
    if (caller == getSNoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/TypeChecking.jrag:8
      {
      		Map<String,Type> tenv = new HashMap<String,Type>();
      		for (String v : this.FV()) {
      			tenv.put(v, Type.Int);  // assume all variables are of type Int
      		}
      		return tenv;
      	}
    }
    else {
      return getParent().Define_typeEnv(this, caller);
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /**
   * @attribute coll
   * @aspect Errors
   * @declaredat /home/anonymous/WHILE/trunk/ErrorCheck.jadd:5
   */
  @ASTNodeAnnotation.Attribute
  public Collection<String> errors() {
    ASTNode$State state = state();
    if (Program_errors_computed) {
      return Program_errors_value;
    }
    if (Program_errors_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: errors in class: org.jastadd.ast.AST.CollDecl");
    }
    Program_errors_visited = state().boundariesCrossed;
    boolean intermediate = state.INTERMEDIATE_VALUE;
    state.INTERMEDIATE_VALUE = false;
    int num = state.boundariesCrossed;
    boolean isFinal = this.is$Final();
    Program_errors_value = errors_compute();
    if (isFinal && num == state().boundariesCrossed) {
      Program_errors_computed = true;
    } else {
    }
    state.INTERMEDIATE_VALUE |= intermediate;

    Program_errors_visited = -1;
    return Program_errors_value;
  }
  java.util.Collection Program_errors_contributors;

  /**
   * @apilevel internal
   * @return the contributor set for errors
   */
  public java.util.Collection Program_errors_contributors() {
    if (Program_errors_contributors == null)
      Program_errors_contributors  = new java.util.LinkedList();
    return Program_errors_contributors;
  }

  /**
   * @apilevel internal
   */
  private Collection<String> errors_compute() {
    ASTNode node = this;
    while(node.getParent() != null && !(node instanceof Program)) {
      node = node.getParent();
    }
    Program root = (Program) node;
    root.collect_contributors_Program_errors();
    Program_errors_value = SetRepUtility.emptySet();
    if (Program_errors_contributors != null) {
      for (java.util.Iterator iter = Program_errors_contributors.iterator(); iter.hasNext(); ) {
        ASTNode contributor = (ASTNode) iter.next();
        contributor.contributeTo_Program_Program_errors(Program_errors_value);
      }
    }
    // TODO: disabled temporarily since collections may not be cached
    //Program_errors_contributors = null;
    return Program_errors_value;
  }
  /**
   * @apilevel internal
   */
  protected int Program_errors_visited = -1;
  /**
   * @apilevel internal
   */
  protected boolean Program_errors_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<String> Program_errors_value;
  /**
   * @apilevel internal
   */
  private void Program_errors_reset() {
    Program_errors_computed = false;
    Program_errors_value = null;
    Program_errors_visited = -1;
  }
}
