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
 * @declaredat /home/anonymous/WHILE/trunk/WHILETaint.ast:3
 * @production PrintS : {@link S} ::= <span class="component">LabelAST:{@link Label}</span> <span class="component">{@link Expr}</span>;

 */
public class PrintS extends S implements Cloneable, Block {
  /** Are these Blocks equal? 
   * @aspect CFG
   * @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:68
   */
  public boolean equals(Object oth) {
  	    if (oth == null || !(oth instanceof Block)) { return false; }
 	    Block b = (Block) oth;
	    return toString().equals(b.toString());
        }
  /** Return the hash code for this Block. 
   * @aspect CFG
   * @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:74
   */
  public int hashCode() {
	    return toString().hashCode();
	}
  /**
   * @declaredat ASTNode:1
   */
  public PrintS() {
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
    children = new ASTNode[2];
  }
  /**
   * @declaredat ASTNode:13
   */
  public PrintS(Label p0, Expr p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:20
   */
  protected int numChildren() {
    return 2;
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
    AEentry_reset();
    AEexit_reset();
    LVentry_reset();
    LVexit_reset();
    RDentry_reset();
    RDexit_reset();
    VBexit_reset();
    VBentry_reset();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:46
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:52
   */
  public void flushRewriteCache() {
    super.flushRewriteCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:58
   */
  public PrintS clone() throws CloneNotSupportedException {
    PrintS node = (PrintS) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:65
   */
  public PrintS copy() {
    try {
      PrintS node = (PrintS) clone();
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
   * @declaredat ASTNode:84
   */
  @Deprecated
  public PrintS fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:94
   */
  public PrintS treeCopyNoTransform() {
    PrintS tree = (PrintS) copy();
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
   * @declaredat ASTNode:114
   */
  public PrintS treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:121
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the LabelAST child.
   * @param node The new node to replace the LabelAST child.
   * @apilevel high-level
   */
  public void setLabelAST(Label node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the LabelAST child.
   * @return The current node used as the LabelAST child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="LabelAST")
  public Label getLabelAST() {
    return (Label) getChild(0);
  }
  /**
   * Retrieves the LabelAST child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the LabelAST child.
   * @apilevel low-level
   */
  public Label getLabelASTNoTransform() {
    return (Label) getChildNoTransform(0);
  }
  /**
   * Replaces the Expr child.
   * @param node The new node to replace the Expr child.
   * @apilevel high-level
   */
  public void setExpr(Expr node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Expr child.
   * @return The current node used as the Expr child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Expr")
  public Expr getExpr() {
    return (Expr) getChild(1);
  }
  /**
   * Retrieves the Expr child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Expr child.
   * @apilevel low-level
   */
  public Expr getExprNoTransform() {
    return (Expr) getChildNoTransform(1);
  }
  /**
   * @apilevel internal
   */
  protected java.util.Map killAE_Set_Expr__visited;
  @ASTNodeAnnotation.Attribute
  public Set<Expr> killAE(Set<Expr> current) {
    Object _parameters = current;
    if (killAE_Set_Expr__visited == null) killAE_Set_Expr__visited = new java.util.HashMap(4);
    if (Integer.valueOf(state().boundariesCrossed).equals(killAE_Set_Expr__visited.get(_parameters))) {
      throw new RuntimeException("Circular definition of attr: killAE in class: org.jastadd.ast.AST.SynDecl");
    }
    killAE_Set_Expr__visited.put(_parameters, Integer.valueOf(state().boundariesCrossed));
    Set<Expr> killAE_Set_Expr__value = SetRepUtility.emptySet();

    killAE_Set_Expr__visited.remove(_parameters);
    return killAE_Set_Expr__value;
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
    Set<Expr> Aexps_value = getExpr().Aexps();

    Aexps_visited = -1;
    return Aexps_value;
  }
  /**
   * @apilevel internal
   */
  protected int genAE_visited = -1;
  /** The gen function for available expressions. 
   * @attribute syn
   * @aspect AE
   * @declaredat /home/anonymous/WHILE/trunk/AE.jrag:26
   */
  @ASTNodeAnnotation.Attribute
  public Set<Expr> genAE() {
    if (genAE_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: genAE in class: org.jastadd.ast.AST.SynDecl");
    }
    genAE_visited = state().boundariesCrossed;
    try {
    		Set<Expr> ret = SetRepUtility.emptySet();
    		Expr exp = getExpr();
    		if (exp.nontrivial()) {
    			ret.add(exp);
    		}
    		return ret;
    	}
    finally {
      genAE_visited = -1;
    }
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
    Label init_value = getLabelAST();

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
    Set<Label> finals_value = SetRepUtility.singleton(getLabelAST());

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
    Set<Block> blocks_value = SetRepUtility.singleton(this);

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
    Set<Label> labels_value = SetRepUtility.singleton(getLabelAST());

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
    Set<String> FV_value = getExpr().FV();

    FV_visited = -1;
    return FV_value;
  }
  /**
   * @apilevel internal
   */
  protected int killLV_visited = -1;
  @ASTNodeAnnotation.Attribute
  public Set<String> killLV() {
    if (killLV_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: killLV in class: org.jastadd.ast.AST.SynDecl");
    }
    killLV_visited = state().boundariesCrossed;
    Set<String> killLV_value = SetRepUtility.emptySet();

    killLV_visited = -1;
    return killLV_value;
  }
  /**
   * @apilevel internal
   */
  protected int genLV_visited = -1;
  @ASTNodeAnnotation.Attribute
  public Set<String> genLV() {
    if (genLV_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: genLV in class: org.jastadd.ast.AST.SynDecl");
    }
    genLV_visited = state().boundariesCrossed;
    Set<String> genLV_value = getExpr().FV();

    genLV_visited = -1;
    return genLV_value;
  }
  /**
   * @apilevel internal
   */
  protected int killRD_visited = -1;
  @ASTNodeAnnotation.Attribute
  public Set<Map.Entry> killRD() {
    if (killRD_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: killRD in class: org.jastadd.ast.AST.SynDecl");
    }
    killRD_visited = state().boundariesCrossed;
    Set<Map.Entry> killRD_value = SetRepUtility.emptySet();

    killRD_visited = -1;
    return killRD_value;
  }
  /**
   * @apilevel internal
   */
  protected int genRD_visited = -1;
  @ASTNodeAnnotation.Attribute
  public Set<Map.Entry> genRD() {
    if (genRD_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: genRD in class: org.jastadd.ast.AST.SynDecl");
    }
    genRD_visited = state().boundariesCrossed;
    Set<Map.Entry> genRD_value = SetRepUtility.emptySet();

    genRD_visited = -1;
    return genRD_value;
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
    String unparse_value = "[" + "print " + getExpr().unparse() + "]^" + getLabelAST().unparse();

    unparse_visited = -1;
    return unparse_value;
  }
  /**
   * @apilevel internal
   */
  protected java.util.Map killVB_Set_Expr__visited;
  @ASTNodeAnnotation.Attribute
  public Set<Expr> killVB(Set<Expr> current) {
    Object _parameters = current;
    if (killVB_Set_Expr__visited == null) killVB_Set_Expr__visited = new java.util.HashMap(4);
    if (Integer.valueOf(state().boundariesCrossed).equals(killVB_Set_Expr__visited.get(_parameters))) {
      throw new RuntimeException("Circular definition of attr: killVB in class: org.jastadd.ast.AST.SynDecl");
    }
    killVB_Set_Expr__visited.put(_parameters, Integer.valueOf(state().boundariesCrossed));
    Set<Expr> killVB_Set_Expr__value = SetRepUtility.emptySet();

    killVB_Set_Expr__visited.remove(_parameters);
    return killVB_Set_Expr__value;
  }
  /**
   * @apilevel internal
   */
  protected int genVB_visited = -1;
  @ASTNodeAnnotation.Attribute
  public Set<Expr> genVB() {
    if (genVB_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: genVB in class: org.jastadd.ast.AST.SynDecl");
    }
    genVB_visited = state().boundariesCrossed;
    Set<Expr> genVB_value = getExpr().Aexps();

    genVB_visited = -1;
    return genVB_value;
  }
  /**
   * @apilevel internal
   */
  protected int AEentry_visited = -1;
  /**
   * @apilevel internal
   */
  private void AEentry_reset() {
    AEentry_computed = false;
    AEentry_initialized = false;
    AEentry_value = null;
    AEentry_visited = -1;
  }
  /**
   * @apilevel internal
   */
  protected boolean AEentry_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean AEentry_initialized = false;
  /**
   * @apilevel internal
   */
  protected Set<Expr> AEentry_value;
  @ASTNodeAnnotation.Attribute
  public Set<Expr> AEentry() {
    if (AEentry_computed) {
      return AEentry_value;
    }
    ASTNode$State state = state();
    Set<Expr> new_AEentry_value;
    if (!AEentry_initialized) {
      AEentry_initialized = true;
      AEentry_value = AexpStar();
    }
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      do {
        AEentry_visited = state.CIRCLE_INDEX;
        state.CHANGE = false;
        new_AEentry_value = AEentry_compute();
        if ((new_AEentry_value==null && AEentry_value!=null) || (new_AEentry_value!=null && !new_AEentry_value.equals(AEentry_value))) {
          state.CHANGE = true;
        }
        AEentry_value = new_AEentry_value;
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
      if (isFinal && num == state().boundariesCrossed) {
        AEentry_computed = true;
        state.LAST_CYCLE = true;
        Set<Expr> $tmp = AEentry_compute();
        state.LAST_CYCLE = false;
      } else {
        state.RESET_CYCLE = true;
        Set<Expr> $tmp = AEentry_compute();
        state.RESET_CYCLE = false;
        AEentry_computed = false;
        AEentry_initialized = false;
      }
      state.IN_CIRCLE = false;
      state.INTERMEDIATE_VALUE = false;
      return AEentry_value;
    }
    if (AEentry_visited != state.CIRCLE_INDEX) {
      AEentry_visited = state.CIRCLE_INDEX;
      if (state.LAST_CYCLE) {
        AEentry_computed = true;
        new_AEentry_value = AEentry_compute();
        return new_AEentry_value;
      }
      if (state.RESET_CYCLE) {
        AEentry_computed = false;
        AEentry_initialized = false;
        AEentry_visited = -1;
        return AEentry_value;
      }
      new_AEentry_value = AEentry_compute();
      if ((new_AEentry_value==null && AEentry_value!=null) || (new_AEentry_value!=null && !new_AEentry_value.equals(AEentry_value))) {
        state.CHANGE = true;
      }
      AEentry_value = new_AEentry_value;
      state.INTERMEDIATE_VALUE = true;
      return AEentry_value;
    }
    state.INTERMEDIATE_VALUE = true;
    return AEentry_value;
  }
  /**
   * @apilevel internal
   */
  private Set<Expr> AEentry_compute() {
  		Set<Expr> ret; 
  		if (getLabelAST().equals(progInitLabel())) {
  			ret = SetRepUtility.emptySet();
  		} else {
  			Set<Set<Expr>> inputs = SetRepUtility.map(
  				new SetRepUtility.Fun<Label, Set<Expr>>() {
  					public Set<Expr> run(Label l) {
  						Block b = l.itsBlock();
  						return b.AEexit();
  					}
  				}, 
  				inFlows());
  			ret = SetRepUtility.intersect(inputs);
  		}
  		return ret;
  	}
  /**
   * @apilevel internal
   */
  protected int AEexit_visited = -1;
  /**
   * @apilevel internal
   */
  private void AEexit_reset() {
    AEexit_computed = false;
    AEexit_initialized = false;
    AEexit_value = null;
    AEexit_visited = -1;
  }
  /**
   * @apilevel internal
   */
  protected boolean AEexit_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean AEexit_initialized = false;
  /**
   * @apilevel internal
   */
  protected Set<Expr> AEexit_value;
  @ASTNodeAnnotation.Attribute
  public Set<Expr> AEexit() {
    if (AEexit_computed) {
      return AEexit_value;
    }
    ASTNode$State state = state();
    Set<Expr> new_AEexit_value;
    if (!AEexit_initialized) {
      AEexit_initialized = true;
      AEexit_value = AexpStar();
    }
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      do {
        AEexit_visited = state.CIRCLE_INDEX;
        state.CHANGE = false;
        new_AEexit_value = AEexit_compute();
        if ((new_AEexit_value==null && AEexit_value!=null) || (new_AEexit_value!=null && !new_AEexit_value.equals(AEexit_value))) {
          state.CHANGE = true;
        }
        AEexit_value = new_AEexit_value;
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
      if (isFinal && num == state().boundariesCrossed) {
        AEexit_computed = true;
        state.LAST_CYCLE = true;
        Set<Expr> $tmp = AEexit_compute();
        state.LAST_CYCLE = false;
      } else {
        state.RESET_CYCLE = true;
        Set<Expr> $tmp = AEexit_compute();
        state.RESET_CYCLE = false;
        AEexit_computed = false;
        AEexit_initialized = false;
      }
      state.IN_CIRCLE = false;
      state.INTERMEDIATE_VALUE = false;
      return AEexit_value;
    }
    if (AEexit_visited != state.CIRCLE_INDEX) {
      AEexit_visited = state.CIRCLE_INDEX;
      if (state.LAST_CYCLE) {
        AEexit_computed = true;
        new_AEexit_value = AEexit_compute();
        return new_AEexit_value;
      }
      if (state.RESET_CYCLE) {
        AEexit_computed = false;
        AEexit_initialized = false;
        AEexit_visited = -1;
        return AEexit_value;
      }
      new_AEexit_value = AEexit_compute();
      if ((new_AEexit_value==null && AEexit_value!=null) || (new_AEexit_value!=null && !new_AEexit_value.equals(AEexit_value))) {
        state.CHANGE = true;
      }
      AEexit_value = new_AEexit_value;
      state.INTERMEDIATE_VALUE = true;
      return AEexit_value;
    }
    state.INTERMEDIATE_VALUE = true;
    return AEexit_value;
  }
  /**
   * @apilevel internal
   */
  private Set<Expr> AEexit_compute() {
  		Set<Expr> ret = SetRepUtility.emptySet(); // start with a fresh set!
  		ret.addAll(this.AEentry());
  		ret.removeAll(this.killAE(ret));
  		ret.addAll(this.genAE());		
  		return ret;
  	}
  /**
   * @apilevel internal
   */
  protected int LVentry_visited = -1;
  /**
   * @apilevel internal
   */
  private void LVentry_reset() {
    LVentry_computed = false;
    LVentry_initialized = false;
    LVentry_value = null;
    LVentry_visited = -1;
  }
  /**
   * @apilevel internal
   */
  protected boolean LVentry_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean LVentry_initialized = false;
  /**
   * @apilevel internal
   */
  protected Set<String> LVentry_value;
  @ASTNodeAnnotation.Attribute
  public Set<String> LVentry() {
    if (LVentry_computed) {
      return LVentry_value;
    }
    ASTNode$State state = state();
    Set<String> new_LVentry_value;
    if (!LVentry_initialized) {
      LVentry_initialized = true;
      LVentry_value = SetRepUtility.emptySet();
    }
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      do {
        LVentry_visited = state.CIRCLE_INDEX;
        state.CHANGE = false;
        new_LVentry_value = LVentry_compute();
        if ((new_LVentry_value==null && LVentry_value!=null) || (new_LVentry_value!=null && !new_LVentry_value.equals(LVentry_value))) {
          state.CHANGE = true;
        }
        LVentry_value = new_LVentry_value;
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
      if (isFinal && num == state().boundariesCrossed) {
        LVentry_computed = true;
        state.LAST_CYCLE = true;
        Set<String> $tmp = LVentry_compute();
        state.LAST_CYCLE = false;
      } else {
        state.RESET_CYCLE = true;
        Set<String> $tmp = LVentry_compute();
        state.RESET_CYCLE = false;
        LVentry_computed = false;
        LVentry_initialized = false;
      }
      state.IN_CIRCLE = false;
      state.INTERMEDIATE_VALUE = false;
      return LVentry_value;
    }
    if (LVentry_visited != state.CIRCLE_INDEX) {
      LVentry_visited = state.CIRCLE_INDEX;
      if (state.LAST_CYCLE) {
        LVentry_computed = true;
        new_LVentry_value = LVentry_compute();
        return new_LVentry_value;
      }
      if (state.RESET_CYCLE) {
        LVentry_computed = false;
        LVentry_initialized = false;
        LVentry_visited = -1;
        return LVentry_value;
      }
      new_LVentry_value = LVentry_compute();
      if ((new_LVentry_value==null && LVentry_value!=null) || (new_LVentry_value!=null && !new_LVentry_value.equals(LVentry_value))) {
        state.CHANGE = true;
      }
      LVentry_value = new_LVentry_value;
      state.INTERMEDIATE_VALUE = true;
      return LVentry_value;
    }
    state.INTERMEDIATE_VALUE = true;
    return LVentry_value;
  }
  /**
   * @apilevel internal
   */
  private Set<String> LVentry_compute() {
  		Set<String> ret = SetRepUtility.emptySet(); // start with a fresh set!
  		ret.addAll(this.LVexit());
  		ret.removeAll(this.killLV());
  		ret.addAll(this.genLV());		
  		return ret;
  	}
  /**
   * @apilevel internal
   */
  protected int LVexit_visited = -1;
  /**
   * @apilevel internal
   */
  private void LVexit_reset() {
    LVexit_computed = false;
    LVexit_initialized = false;
    LVexit_value = null;
    LVexit_visited = -1;
  }
  /**
   * @apilevel internal
   */
  protected boolean LVexit_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean LVexit_initialized = false;
  /**
   * @apilevel internal
   */
  protected Set<String> LVexit_value;
  @ASTNodeAnnotation.Attribute
  public Set<String> LVexit() {
    if (LVexit_computed) {
      return LVexit_value;
    }
    ASTNode$State state = state();
    Set<String> new_LVexit_value;
    if (!LVexit_initialized) {
      LVexit_initialized = true;
      LVexit_value = SetRepUtility.emptySet();
    }
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      do {
        LVexit_visited = state.CIRCLE_INDEX;
        state.CHANGE = false;
        new_LVexit_value = LVexit_compute();
        if ((new_LVexit_value==null && LVexit_value!=null) || (new_LVexit_value!=null && !new_LVexit_value.equals(LVexit_value))) {
          state.CHANGE = true;
        }
        LVexit_value = new_LVexit_value;
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
      if (isFinal && num == state().boundariesCrossed) {
        LVexit_computed = true;
        state.LAST_CYCLE = true;
        Set<String> $tmp = LVexit_compute();
        state.LAST_CYCLE = false;
      } else {
        state.RESET_CYCLE = true;
        Set<String> $tmp = LVexit_compute();
        state.RESET_CYCLE = false;
        LVexit_computed = false;
        LVexit_initialized = false;
      }
      state.IN_CIRCLE = false;
      state.INTERMEDIATE_VALUE = false;
      return LVexit_value;
    }
    if (LVexit_visited != state.CIRCLE_INDEX) {
      LVexit_visited = state.CIRCLE_INDEX;
      if (state.LAST_CYCLE) {
        LVexit_computed = true;
        new_LVexit_value = LVexit_compute();
        return new_LVexit_value;
      }
      if (state.RESET_CYCLE) {
        LVexit_computed = false;
        LVexit_initialized = false;
        LVexit_visited = -1;
        return LVexit_value;
      }
      new_LVexit_value = LVexit_compute();
      if ((new_LVexit_value==null && LVexit_value!=null) || (new_LVexit_value!=null && !new_LVexit_value.equals(LVexit_value))) {
        state.CHANGE = true;
      }
      LVexit_value = new_LVexit_value;
      state.INTERMEDIATE_VALUE = true;
      return LVexit_value;
    }
    state.INTERMEDIATE_VALUE = true;
    return LVexit_value;
  }
  /**
   * @apilevel internal
   */
  private Set<String> LVexit_compute() {
  		Set<String> ret = SetRepUtility.emptySet();
  		if (progAST().finals().contains(getLabelAST())) {
  			; // use the empty set, which is already in ret
  		} else {
  			for (Label lprime : outFlows()) {
  				Block b = lprime.itsBlock();
  				ret.addAll(b.LVentry());
  			}
  		}		
  		return ret;
  	}
  /**
   * @apilevel internal
   */
  protected int RDentry_visited = -1;
  /**
   * @apilevel internal
   */
  private void RDentry_reset() {
    RDentry_computed = false;
    RDentry_initialized = false;
    RDentry_value = null;
    RDentry_visited = -1;
  }
  /**
   * @apilevel internal
   */
  protected boolean RDentry_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean RDentry_initialized = false;
  /**
   * @apilevel internal
   */
  protected Set<Map.Entry> RDentry_value;
  @ASTNodeAnnotation.Attribute
  public Set<Map.Entry> RDentry() {
    if (RDentry_computed) {
      return RDentry_value;
    }
    ASTNode$State state = state();
    Set<Map.Entry> new_RDentry_value;
    if (!RDentry_initialized) {
      RDentry_initialized = true;
      RDentry_value = SetRepUtility.emptySet();
    }
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      do {
        RDentry_visited = state.CIRCLE_INDEX;
        state.CHANGE = false;
        new_RDentry_value = RDentry_compute();
        if ((new_RDentry_value==null && RDentry_value!=null) || (new_RDentry_value!=null && !new_RDentry_value.equals(RDentry_value))) {
          state.CHANGE = true;
        }
        RDentry_value = new_RDentry_value;
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
      if (isFinal && num == state().boundariesCrossed) {
        RDentry_computed = true;
        state.LAST_CYCLE = true;
        Set<Map.Entry> $tmp = RDentry_compute();
        state.LAST_CYCLE = false;
      } else {
        state.RESET_CYCLE = true;
        Set<Map.Entry> $tmp = RDentry_compute();
        state.RESET_CYCLE = false;
        RDentry_computed = false;
        RDentry_initialized = false;
      }
      state.IN_CIRCLE = false;
      state.INTERMEDIATE_VALUE = false;
      return RDentry_value;
    }
    if (RDentry_visited != state.CIRCLE_INDEX) {
      RDentry_visited = state.CIRCLE_INDEX;
      if (state.LAST_CYCLE) {
        RDentry_computed = true;
        new_RDentry_value = RDentry_compute();
        return new_RDentry_value;
      }
      if (state.RESET_CYCLE) {
        RDentry_computed = false;
        RDentry_initialized = false;
        RDentry_visited = -1;
        return RDentry_value;
      }
      new_RDentry_value = RDentry_compute();
      if ((new_RDentry_value==null && RDentry_value!=null) || (new_RDentry_value!=null && !new_RDentry_value.equals(RDentry_value))) {
        state.CHANGE = true;
      }
      RDentry_value = new_RDentry_value;
      state.INTERMEDIATE_VALUE = true;
      return RDentry_value;
    }
    state.INTERMEDIATE_VALUE = true;
    return RDentry_value;
  }
  /**
   * @apilevel internal
   */
  private Set<Map.Entry> RDentry_compute() {
  		Set<Map.Entry> ret = SetRepUtility.emptySet();
  		if (getLabelAST().equals(progInitLabel())) {
  			ret.addAll(SetRepUtility.crossWith(progFV(), new NumLabel("?")));
  		} else {
  			for (Label l : inFlows()) {
  				Block b = l.itsBlock();
  				ret.addAll(b.RDexit());
  			}
  		}		
  		return ret;
  	}
  /**
   * @apilevel internal
   */
  protected int RDexit_visited = -1;
  /**
   * @apilevel internal
   */
  private void RDexit_reset() {
    RDexit_computed = false;
    RDexit_initialized = false;
    RDexit_value = null;
    RDexit_visited = -1;
  }
  /**
   * @apilevel internal
   */
  protected boolean RDexit_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean RDexit_initialized = false;
  /**
   * @apilevel internal
   */
  protected Set<Map.Entry> RDexit_value;
  @ASTNodeAnnotation.Attribute
  public Set<Map.Entry> RDexit() {
    if (RDexit_computed) {
      return RDexit_value;
    }
    ASTNode$State state = state();
    Set<Map.Entry> new_RDexit_value;
    if (!RDexit_initialized) {
      RDexit_initialized = true;
      RDexit_value = SetRepUtility.emptySet();
    }
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      do {
        RDexit_visited = state.CIRCLE_INDEX;
        state.CHANGE = false;
        new_RDexit_value = RDexit_compute();
        if ((new_RDexit_value==null && RDexit_value!=null) || (new_RDexit_value!=null && !new_RDexit_value.equals(RDexit_value))) {
          state.CHANGE = true;
        }
        RDexit_value = new_RDexit_value;
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
      if (isFinal && num == state().boundariesCrossed) {
        RDexit_computed = true;
        state.LAST_CYCLE = true;
        Set<Map.Entry> $tmp = RDexit_compute();
        state.LAST_CYCLE = false;
      } else {
        state.RESET_CYCLE = true;
        Set<Map.Entry> $tmp = RDexit_compute();
        state.RESET_CYCLE = false;
        RDexit_computed = false;
        RDexit_initialized = false;
      }
      state.IN_CIRCLE = false;
      state.INTERMEDIATE_VALUE = false;
      return RDexit_value;
    }
    if (RDexit_visited != state.CIRCLE_INDEX) {
      RDexit_visited = state.CIRCLE_INDEX;
      if (state.LAST_CYCLE) {
        RDexit_computed = true;
        new_RDexit_value = RDexit_compute();
        return new_RDexit_value;
      }
      if (state.RESET_CYCLE) {
        RDexit_computed = false;
        RDexit_initialized = false;
        RDexit_visited = -1;
        return RDexit_value;
      }
      new_RDexit_value = RDexit_compute();
      if ((new_RDexit_value==null && RDexit_value!=null) || (new_RDexit_value!=null && !new_RDexit_value.equals(RDexit_value))) {
        state.CHANGE = true;
      }
      RDexit_value = new_RDexit_value;
      state.INTERMEDIATE_VALUE = true;
      return RDexit_value;
    }
    state.INTERMEDIATE_VALUE = true;
    return RDexit_value;
  }
  /**
   * @apilevel internal
   */
  private Set<Map.Entry> RDexit_compute() {
  		Set<Map.Entry> ret = SetRepUtility.emptySet(); // start with a fresh set!
  		ret.addAll(this.RDentry());
  		ret.removeAll(this.killRD());
  		ret.addAll(this.genRD());		
  		return ret;
  	}
  /**
   * @apilevel internal
   */
  protected int VBexit_visited = -1;
  /**
   * @apilevel internal
   */
  private void VBexit_reset() {
    VBexit_computed = false;
    VBexit_initialized = false;
    VBexit_value = null;
    VBexit_visited = -1;
  }
  /**
   * @apilevel internal
   */
  protected boolean VBexit_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean VBexit_initialized = false;
  /**
   * @apilevel internal
   */
  protected Set<Expr> VBexit_value;
  @ASTNodeAnnotation.Attribute
  public Set<Expr> VBexit() {
    if (VBexit_computed) {
      return VBexit_value;
    }
    ASTNode$State state = state();
    Set<Expr> new_VBexit_value;
    if (!VBexit_initialized) {
      VBexit_initialized = true;
      VBexit_value = AexpStar();
    }
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      do {
        VBexit_visited = state.CIRCLE_INDEX;
        state.CHANGE = false;
        new_VBexit_value = VBexit_compute();
        if ((new_VBexit_value==null && VBexit_value!=null) || (new_VBexit_value!=null && !new_VBexit_value.equals(VBexit_value))) {
          state.CHANGE = true;
        }
        VBexit_value = new_VBexit_value;
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
      if (isFinal && num == state().boundariesCrossed) {
        VBexit_computed = true;
        state.LAST_CYCLE = true;
        Set<Expr> $tmp = VBexit_compute();
        state.LAST_CYCLE = false;
      } else {
        state.RESET_CYCLE = true;
        Set<Expr> $tmp = VBexit_compute();
        state.RESET_CYCLE = false;
        VBexit_computed = false;
        VBexit_initialized = false;
      }
      state.IN_CIRCLE = false;
      state.INTERMEDIATE_VALUE = false;
      return VBexit_value;
    }
    if (VBexit_visited != state.CIRCLE_INDEX) {
      VBexit_visited = state.CIRCLE_INDEX;
      if (state.LAST_CYCLE) {
        VBexit_computed = true;
        new_VBexit_value = VBexit_compute();
        return new_VBexit_value;
      }
      if (state.RESET_CYCLE) {
        VBexit_computed = false;
        VBexit_initialized = false;
        VBexit_visited = -1;
        return VBexit_value;
      }
      new_VBexit_value = VBexit_compute();
      if ((new_VBexit_value==null && VBexit_value!=null) || (new_VBexit_value!=null && !new_VBexit_value.equals(VBexit_value))) {
        state.CHANGE = true;
      }
      VBexit_value = new_VBexit_value;
      state.INTERMEDIATE_VALUE = true;
      return VBexit_value;
    }
    state.INTERMEDIATE_VALUE = true;
    return VBexit_value;
  }
  /**
   * @apilevel internal
   */
  private Set<Expr> VBexit_compute() {
  		Set<Expr> ret = SetRepUtility.emptySet(); // a fresh set!
  		if (!progFinals().contains(getLabelAST())) {
  		   Set<Expr> out = SetRepUtility.emptySet();
  		   for (Label lab : this.outFlows()) {
  		       out.addAll(lab.itsBlock().VBentry());
  		   }
  		   ret.retainAll(out);
  		}
  		return ret;
  	}
  /**
   * @apilevel internal
   */
  protected int VBentry_visited = -1;
  /**
   * @apilevel internal
   */
  private void VBentry_reset() {
    VBentry_computed = false;
    VBentry_initialized = false;
    VBentry_value = null;
    VBentry_visited = -1;
  }
  /**
   * @apilevel internal
   */
  protected boolean VBentry_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean VBentry_initialized = false;
  /**
   * @apilevel internal
   */
  protected Set<Expr> VBentry_value;
  @ASTNodeAnnotation.Attribute
  public Set<Expr> VBentry() {
    if (VBentry_computed) {
      return VBentry_value;
    }
    ASTNode$State state = state();
    Set<Expr> new_VBentry_value;
    if (!VBentry_initialized) {
      VBentry_initialized = true;
      VBentry_value = AexpStar();
    }
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      do {
        VBentry_visited = state.CIRCLE_INDEX;
        state.CHANGE = false;
        new_VBentry_value = VBentry_compute();
        if ((new_VBentry_value==null && VBentry_value!=null) || (new_VBentry_value!=null && !new_VBentry_value.equals(VBentry_value))) {
          state.CHANGE = true;
        }
        VBentry_value = new_VBentry_value;
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
      if (isFinal && num == state().boundariesCrossed) {
        VBentry_computed = true;
        state.LAST_CYCLE = true;
        Set<Expr> $tmp = VBentry_compute();
        state.LAST_CYCLE = false;
      } else {
        state.RESET_CYCLE = true;
        Set<Expr> $tmp = VBentry_compute();
        state.RESET_CYCLE = false;
        VBentry_computed = false;
        VBentry_initialized = false;
      }
      state.IN_CIRCLE = false;
      state.INTERMEDIATE_VALUE = false;
      return VBentry_value;
    }
    if (VBentry_visited != state.CIRCLE_INDEX) {
      VBentry_visited = state.CIRCLE_INDEX;
      if (state.LAST_CYCLE) {
        VBentry_computed = true;
        new_VBentry_value = VBentry_compute();
        return new_VBentry_value;
      }
      if (state.RESET_CYCLE) {
        VBentry_computed = false;
        VBentry_initialized = false;
        VBentry_visited = -1;
        return VBentry_value;
      }
      new_VBentry_value = VBentry_compute();
      if ((new_VBentry_value==null && VBentry_value!=null) || (new_VBentry_value!=null && !new_VBentry_value.equals(VBentry_value))) {
        state.CHANGE = true;
      }
      VBentry_value = new_VBentry_value;
      state.INTERMEDIATE_VALUE = true;
      return VBentry_value;
    }
    state.INTERMEDIATE_VALUE = true;
    return VBentry_value;
  }
  /**
   * @apilevel internal
   */
  private Set<Expr> VBentry_compute() {
  	        Set<Expr> ret = SetRepUtility.emptySet(); // a fresh set!
  		ret.addAll(this.VBexit());
  		ret.removeAll(this.killVB(ret));
  		ret.addAll(this.genVB());
  		return ret;
  	}
  /**
   * @attribute inh
   * @aspect AExp
   * @declaredat /home/anonymous/WHILE/trunk/AExp.jrag:83
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
   * @aspect ProgramGlobalAttributes
   * @declaredat /home/anonymous/WHILE/trunk/ProgramGlobalAttributes.jrag:13
   */
  @ASTNodeAnnotation.Attribute
  public Set<Label> progLabels() {
    if (progLabels_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: progLabels in class: org.jastadd.ast.AST.InhDecl");
    }
    progLabels_visited = state().boundariesCrossed;
    Set<Label> progLabels_value = getParent().Define_progLabels(this, null);

    progLabels_visited = -1;
    return progLabels_value;
  }
  /**
   * @apilevel internal
   */
  protected int progLabels_visited = -1;
  /**
   * @attribute inh
   * @aspect ProgramGlobalAttributes
   * @declaredat /home/anonymous/WHILE/trunk/ProgramGlobalAttributes.jrag:17
   */
  @ASTNodeAnnotation.Attribute
  public Label progInitLabel() {
    if (progInitLabel_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: progInitLabel in class: org.jastadd.ast.AST.InhDecl");
    }
    progInitLabel_visited = state().boundariesCrossed;
    Label progInitLabel_value = getParent().Define_progInitLabel(this, null);

    progInitLabel_visited = -1;
    return progInitLabel_value;
  }
  /**
   * @apilevel internal
   */
  protected int progInitLabel_visited = -1;
  /**
   * @attribute inh
   * @aspect ProgramGlobalAttributes
   * @declaredat /home/anonymous/WHILE/trunk/ProgramGlobalAttributes.jrag:21
   */
  @ASTNodeAnnotation.Attribute
  public Set<Label> progFinals() {
    if (progFinals_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: progFinals in class: org.jastadd.ast.AST.InhDecl");
    }
    progFinals_visited = state().boundariesCrossed;
    Set<Label> progFinals_value = getParent().Define_progFinals(this, null);

    progFinals_visited = -1;
    return progFinals_value;
  }
  /**
   * @apilevel internal
   */
  protected int progFinals_visited = -1;
  /**
   * @attribute inh
   * @aspect ProgramGlobalAttributes
   * @declaredat /home/anonymous/WHILE/trunk/ProgramGlobalAttributes.jrag:25
   */
  @ASTNodeAnnotation.Attribute
  public Set<String> progFV() {
    if (progFV_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: progFV in class: org.jastadd.ast.AST.InhDecl");
    }
    progFV_visited = state().boundariesCrossed;
    Set<String> progFV_value = getParent().Define_progFV(this, null);

    progFV_visited = -1;
    return progFV_value;
  }
  /**
   * @apilevel internal
   */
  protected int progFV_visited = -1;
  /**
   * @attribute inh
   * @aspect ProgramGlobalAttributes
   * @declaredat /home/anonymous/WHILE/trunk/ProgramGlobalAttributes.jrag:34
   */
  @ASTNodeAnnotation.Attribute
  public FlowGraph<Label,Label> progCFG() {
    if (progCFG_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: progCFG in class: org.jastadd.ast.AST.InhDecl");
    }
    progCFG_visited = state().boundariesCrossed;
    FlowGraph<Label,Label> progCFG_value = getParent().Define_progCFG(this, null);

    progCFG_visited = -1;
    return progCFG_value;
  }
  /**
   * @apilevel internal
   */
  protected int progCFG_visited = -1;
  /**
   * @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:114
   * @apilevel internal
   */
  public Block Define_itsBlock(ASTNode caller, ASTNode child) {
    if (caller == getLabelASTNoTransform()) {
      // @declaredat /home/anonymous/WHILE/trunk/CFGTaint.jrag:36
      return this;
    }
    else {
      return getParent().Define_itsBlock(this, caller);
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
