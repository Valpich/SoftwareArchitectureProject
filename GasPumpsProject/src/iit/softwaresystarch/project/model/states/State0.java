package iit.softwaresystarch.project.model.states;

import iit.softwaresystarch.project.model.factories.OperationAbstractFactory;

/**
 * The Class State0.
 */
public class State0 extends State {

  /** The Constant ID. */
  private static final int ID = 0;

  /**
   * Instantiates a new State0.
   *
   * @param operationAbstractFactory the operation abstract factory
   */
  public State0(OperationAbstractFactory operationAbstractFactory) {
    super(operationAbstractFactory);
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.states.State#getID()
   */
  @Override
  public int getID() {
    return State0.ID;
  }

  /*
   * Implementation of the start method.
   * 
   * @see iit.softwaresystarch.project.model.states.State#start()
   */
  @Override
  public void start() {
    this.operation.payMsg();
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.states.State#toString()
   */
  @Override
  public String toString() {
    return "State0 [getID()=" + this.getID() + "]";
  }

}
