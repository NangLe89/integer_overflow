package AST;

/**
 * @ast class
 * @declaredat ASTNode$State:2
 */
public class ASTNode$State extends java.lang.Object {
  
  /** @apilevel internal */
  protected static class CircularValue {
    Object value;
    Cycle cycle;
  }

  

  /**
   * Instances of this class are used to uniquely identify circular evaluation cycles.
   * @apilevel internal
   */
  protected static class Cycle {
  }

  

  /**
   * Tracks the state of the current circular evaluation. This class defines a
   * stack structure where the next element on the stack is pointed to by the
   * {@code next} field.
   * @apilevel internal
   */
  protected static class CircleState {
    final CircleState next;
    boolean inCircle = false;
    boolean resetCycle = false;
    boolean change = false;

    /** Evaluation depth of lazy attributes. */
    int lazyAttribute = 0;

    /** Cycle ID of the latest cycle in this circular evaluation. */
    Cycle cycle = null;

    protected CircleState(CircleState next) {
      this.next = next;
    }
  }

  

  /**
   * Current circular state.
   * @apilevel internal
   */
  private CircleState circle = new CircleState(null);

  

  /** @apilevel internal */
  protected boolean inCircle() {
    return circle.inCircle;
  }

  

  /** @apilevel internal */
  protected boolean calledByLazyAttribute() {
    return circle.lazyAttribute > 0;
  }

  

  /** @apilevel internal */
  protected void enterLazyAttribute() {
    circle.lazyAttribute += 1;
  }

  

  /** @apilevel internal */
  protected void leaveLazyAttribute() {
    circle.lazyAttribute -= 1;
  }

  

  /** @apilevel internal */
  protected void enterCircle() {
    CircleState next = new CircleState(circle);
    next.inCircle = true;
    circle = next;
  }

  

  /** @apilevel internal */
  protected void leaveCircle() {
    circle = circle.next;
  }

  

  /** @apilevel internal */
  protected Cycle nextCycle() {
    Cycle cycle = new Cycle();
    circle.cycle = cycle;
    return cycle;
  }

  

  /** @apilevel internal */
  protected Cycle cycle() {
    return circle.cycle;
  }

  

  /** @apilevel internal */
  protected CircleState currentCircle() {
    return circle;
  }

  


  /** @apilevel internal */
  protected void setChangeInCycle() {
    circle.change = true;
  }

  

  /** @apilevel internal */
  protected boolean testAndClearChangeInCycle() {
    boolean change = circle.change;
    circle.change = false;
    return change;
  }

  

  /** @apilevel internal */
  protected boolean changeInCycle() {
    return circle.change;
  }

  


  /** @apilevel internal */
  protected void startResetCycle() {
    circle.resetCycle = true;
  }

  

  /** @apilevel internal */
  protected boolean resetCycle() {
    return circle.resetCycle;
  }

  

  protected ASTNode$State() {
    stack = new int[64];
    pos = 0;
  }

  
  /** @apilevel internal */
  public static final int REWRITE_CHANGE = 1;

  

  /** @apilevel internal */
  public static final int REWRITE_NOCHANGE = 2;

  

  /** @apilevel internal */
  public static final int REWRITE_INTERRUPT = 3;

  

  public int boundariesCrossed = 0;

  

  // state code
  private int[] stack;

  

  private int pos;

  

  private void ensureSize(int size) {
    if (size < stack.length)
      return;
    int[] newStack = new int[stack.length * 2];
    System.arraycopy(stack, 0, newStack, 0, stack.length);
    stack = newStack;
  }

  

  public void push(int i) {
    ensureSize(pos+1);
    stack[pos++] = i;
  }

  

  public int pop() {
    return stack[--pos];
  }

  

  public int peek() {
    return stack[pos-1];
  }

  public void reset() {
    boundariesCrossed = 0;

  }


}
