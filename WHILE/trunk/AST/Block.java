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
 * @ast interface
 * @aspect CFG
 * @declaredat /home/anonymous/WHILE/trunk/CFG.jrag:33
 */
public interface Block {

		 
		Set<Label> inFlows();

		 
		Set<Label> outFlows();

		 
		Label getLabelAST();
public boolean equals(Object oth);

public int hashCode();

  /** The kill function for available expressions. 
   * @attribute syn
   * @aspect AE
   * @declaredat /home/anonymous/WHILE/trunk/AE.jrag:11
   */
  @ASTNodeAnnotation.Attribute
  public Set<Expr> killAE(Set<Expr> current);
  /** The gen function for available expressions. 
   * @attribute syn
   * @aspect AE
   * @declaredat /home/anonymous/WHILE/trunk/AE.jrag:26
   */
  @ASTNodeAnnotation.Attribute
  public Set<Expr> genAE();
  /** Compute the entry information for the AE analysis. 
   * @attribute syn
   * @aspect AE
   * @declaredat /home/anonymous/WHILE/trunk/AE.jrag:47
   */
  @ASTNodeAnnotation.Attribute
  public Set<Expr> AEentry();
  /** Compute the exit information for the AE analysis. 
   * @attribute syn
   * @aspect AE
   * @declaredat /home/anonymous/WHILE/trunk/AE.jrag:67
   */
  @ASTNodeAnnotation.Attribute
  public Set<Expr> AEexit();
  /** The kill function for live variables. 
   * @attribute syn
   * @aspect LV
   * @declaredat /home/anonymous/WHILE/trunk/LV.jrag:8
   */
  @ASTNodeAnnotation.Attribute
  public Set<String> killLV();
  /** The gen function for live variables. 
   * @attribute syn
   * @aspect LV
   * @declaredat /home/anonymous/WHILE/trunk/LV.jrag:17
   */
  @ASTNodeAnnotation.Attribute
  public Set<String> genLV();
  /** Compute the entry information for the LV analysis. 
   * @attribute syn
   * @aspect LV
   * @declaredat /home/anonymous/WHILE/trunk/LV.jrag:23
   */
  @ASTNodeAnnotation.Attribute
  public Set<String> LVentry();
  /** Compute the exit information for the LV analysis. 
   * @attribute syn
   * @aspect LV
   * @declaredat /home/anonymous/WHILE/trunk/LV.jrag:33
   */
  @ASTNodeAnnotation.Attribute
  public Set<String> LVexit();
  /** The kill function for reaching definitions. 
   * @attribute syn
   * @aspect RD
   * @declaredat /home/anonymous/WHILE/trunk/RD.jrag:8
   */
  @ASTNodeAnnotation.Attribute
  public Set<Map.Entry> killRD();
  /** The gen function for reaching definitions. 
   * @attribute syn
   * @aspect RD
   * @declaredat /home/anonymous/WHILE/trunk/RD.jrag:18
   */
  @ASTNodeAnnotation.Attribute
  public Set<Map.Entry> genRD();
  /** Compute the entry information for the RD analysis. 
   * @attribute syn
   * @aspect RD
   * @declaredat /home/anonymous/WHILE/trunk/RD.jrag:26
   */
  @ASTNodeAnnotation.Attribute
  public Set<Map.Entry> RDentry();
  /** Compute the exit information for the RD analysis. 
   * @attribute syn
   * @aspect RD
   * @declaredat /home/anonymous/WHILE/trunk/RD.jrag:41
   */
  @ASTNodeAnnotation.Attribute
  public Set<Map.Entry> RDexit();
  /** The kill function for very busy expressions. 
   * @attribute syn
   * @aspect VB
   * @declaredat /home/anonymous/WHILE/trunk/VB.jrag:13
   */
  @ASTNodeAnnotation.Attribute
  public Set<Expr> killVB(Set<Expr> current);
  /** The gen function for very busy expressions. 
   * @attribute syn
   * @aspect VB
   * @declaredat /home/anonymous/WHILE/trunk/VB.jrag:28
   */
  @ASTNodeAnnotation.Attribute
  public Set<Expr> genVB();
  /** Compute the exit information for the VB analysis. 
   * @attribute syn
   * @aspect VB
   * @declaredat /home/anonymous/WHILE/trunk/VB.jrag:34
   */
  @ASTNodeAnnotation.Attribute
  public Set<Expr> VBexit();
  /** Compute the entry information for the VB analysis. 
   * @attribute syn
   * @aspect VB
   * @declaredat /home/anonymous/WHILE/trunk/VB.jrag:48
   */
  @ASTNodeAnnotation.Attribute
  public Set<Expr> VBentry();
  /**
   * @attribute inh
   * @aspect AExp
   * @declaredat /home/anonymous/WHILE/trunk/AExp.jrag:83
   */
  @ASTNodeAnnotation.Attribute
  public Set<Expr> AexpStar();
  /**
   * @attribute inh
   * @aspect ProgramGlobalAttributes
   * @declaredat /home/anonymous/WHILE/trunk/ProgramGlobalAttributes.jrag:13
   */
  @ASTNodeAnnotation.Attribute
  public Set<Label> progLabels();
  /**
   * @attribute inh
   * @aspect ProgramGlobalAttributes
   * @declaredat /home/anonymous/WHILE/trunk/ProgramGlobalAttributes.jrag:17
   */
  @ASTNodeAnnotation.Attribute
  public Label progInitLabel();
  /**
   * @attribute inh
   * @aspect ProgramGlobalAttributes
   * @declaredat /home/anonymous/WHILE/trunk/ProgramGlobalAttributes.jrag:21
   */
  @ASTNodeAnnotation.Attribute
  public Set<Label> progFinals();
  /**
   * @attribute inh
   * @aspect ProgramGlobalAttributes
   * @declaredat /home/anonymous/WHILE/trunk/ProgramGlobalAttributes.jrag:25
   */
  @ASTNodeAnnotation.Attribute
  public Set<String> progFV();
  /**
   * @attribute inh
   * @aspect ProgramGlobalAttributes
   * @declaredat /home/anonymous/WHILE/trunk/ProgramGlobalAttributes.jrag:34
   */
  @ASTNodeAnnotation.Attribute
  public FlowGraph<Label,Label> progCFG();
}
