package iit.softwaresystarch.project.model.states;

import iit.softwaresystarch.project.model.factories.OperationAbstractFactory;

/**
 * The Class State6.
 */
public class State6 extends State {

  /** The id. */
  private static int ID = 6;

  /**
   * Instantiates a new State6.
   *
   * @param operationAbstractFactory the operation abstract factory
   */
  public State6(OperationAbstractFactory operationAbstractFactory) {
    super(operationAbstractFactory);
  }


  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.states.State#getID()
   */
  @Override
  public int getID() {
    return State6.ID;
  }

  /*
   * Implementation of the receipt method.
   * 
   * @see iit.softwaresystarch.project.model.states.State#receipt()
   */
  @Override
  public void receipt() {
    this.operation.printReceipt();
    this.operation.returnCash();
  }

  /*
   * Implementation of the no receipt method.
   *
   * @see iit.softwaresystarch.project.model.states.State#noReceipt()
   */
  @Override
  public void noReceipt() {
    this.operation.returnCash();
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.states.State#toString()
   */
  @Override
  public String toString() {
    return "State6 [getID()=" + this.getID() + "]";
  }

}
