package iit.softwaresystarch.project.model.states;

import iit.softwaresystarch.project.model.factories.OperationAbstractFactory;

/**
 * The Class State1.
 */
public class State1 extends State {

  /** The Constant ID. */
  private static final int ID = 1;

  /**
   * Instantiates a new State1.
   *
   * @param operationAbstractFactory the operation abstract factory
   */
  public State1(OperationAbstractFactory operationAbstractFactory) {
    super(operationAbstractFactory);
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.states.State#getID()
   */
  @Override
  public int getID() {
    return State1.ID;
  }

  /*
   * Implementation of the payType method.
   * 
   * @see iit.softwaresystarch.project.model.states.State#payType(int)
   */
  @Override
  public void payType(int t) {
    if (t == 2) {
      this.operation.storeCash();
      this.operation.displayMenu();
    }
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.states.State#toString()
   */
  @Override
  public String toString() {
    return "State1 [getID()=" + this.getID() + "]";
  }

}
