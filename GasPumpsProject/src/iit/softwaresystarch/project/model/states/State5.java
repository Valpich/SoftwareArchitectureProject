package iit.softwaresystarch.project.model.states;

import iit.softwaresystarch.project.model.factories.OperationAbstractFactory;

/**
 * The Class State5.
 */
public class State5 extends State {

  /** The Constant ID. */
  private static final int ID = 5;

  /**
   * Instantiates a new State5.
   *
   * @param operationAbstractFactory the operation abstract factory
   */
  public State5(OperationAbstractFactory operationAbstractFactory) {
    super(operationAbstractFactory);
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.states.State#getID()
   */
  @Override
  public int getID() {
    return State5.ID;
  }

  /*
   * Implementation of the pump method.
   * 
   * @see iit.softwaresystarch.project.model.states.State#pump()
   */
  @Override
  public void pump() {
    this.operation.pumpGasUnit();
  }

  /*
   * Implementation of the stop pump method.
   * 
   * @see iit.softwaresystarch.project.model.states.State#stopPump()
   */
  @Override
  public void stopPump() {
    this.operation.stopMsg();
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.states.State#toString()
   */
  @Override
  public String toString() {
    return "State5 [getID()=" + this.getID() + "]";
  }

}
