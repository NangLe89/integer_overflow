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
 * @declaredat /home/anonymous/WHILE/trunk/WHILE.ast:10
 * @production VarRefExpr : {@link Expr} ::= <span class="component">&lt;Contents:String&gt;</span>;

 */
public class VarRefExpr extends Expr implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public VarRefExpr() {
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
  public VarRefExpr(String p0) {
    setContents(p0);
  }
  /**
   * @declaredat ASTNode:15
   */
  public VarRefExpr(beaver.Symbol p0) {
    setContents(p0);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:21
   */
  protected int numChildren() {
    return 0;
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
  public VarRefExpr clone() throws CloneNotSupportedException {
    VarRefExpr node = (VarRefExpr) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:58
   */
  public VarRefExpr copy() {
    try {
      VarRefExpr node = (VarRefExpr) clone();
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
  public VarRefExpr fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:87
   */
  public VarRefExpr treeCopyNoTransform() {
    VarRefExpr tree = (VarRefExpr) copy();
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
  public VarRefExpr treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:114
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Contents == ((VarRefExpr)node).tokenString_Contents);    
  }
  /**
   * Replaces the lexeme Contents.
   * @param value The new value for the lexeme Contents.
   * @apilevel high-level
   */
  public void setContents(String value) {
    tokenString_Contents = value;
  }
  /**
   * @apilevel internal
   */
  protected String tokenString_Contents;
  /**
   */
  public int Contentsstart;
  /**
   */
  public int Contentsend;
  /**
   * JastAdd-internal setter for lexeme Contents using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme Contents
   * @apilevel internal
   */
  public void setContents(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setContents is only valid for String lexemes");
    tokenString_Contents = (String)symbol.value;
    Contentsstart = symbol.getStart();
    Contentsend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme Contents.
   * @return The value for the lexeme Contents.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Contents")
  public String getContents() {
    return tokenString_Contents != null ? tokenString_Contents : "";
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
    boolean nontrivial_value = false;

    nontrivial_visited = -1;
    return nontrivial_value;
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
    Set<Expr> Aexps_value = SetRepUtility.emptySet();

    Aexps_visited = -1;
    return Aexps_value;
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
    Set<String> FV_value = SetRepUtility.singleton(getContents());

    FV_visited = -1;
    return FV_value;
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
    Type type_value = typeEnv().get(getContents());

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
    try { return getContents();}
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
}
