package iit.softwaresystarch.project.model.states;

import iit.softwaresystarch.project.model.factories.OperationAbstractFactory;

/**
 * The Class State4.
 */
public class State4 extends State {

  /** The Constant ID. */
  private static final int ID = 4;

  /**
   * Instantiates a new State4.
   *
   * @param operationAbstractFactory the operation abstract factory
   */
  public State4(OperationAbstractFactory operationAbstractFactory) {
    super(operationAbstractFactory);
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.states.State#getID()
   */
  @Override
  public int getID() {
    return State4.ID;
  }

  /*
   * Implementation of the start pump method.
   * 
   * @see iit.softwaresystarch.project.model.states.State#startPump()
   */
  @Override
  public void startPump() {
    this.operation.setInitialValues();
    this.operation.readyMsg();
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.states.State#toString()
   */
  @Override
  public String toString() {
    return "State4 [getID()=" + this.getID() + "]";
  }

}
