package iit.softwaresystarch.project.model.states;

import iit.softwaresystarch.project.model.factories.OperationAbstractFactory;

/**
 * The Class State2.
 */
public class State2 extends State {

  /** The Constant ID. */
  private static final int ID = 2;

  /**
   * Instantiates a new State2.
   *
   * @param operationAbstractFactory the operation abstract factory
   */
  public State2(OperationAbstractFactory operationAbstractFactory) {
    super(operationAbstractFactory);
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.states.State#getID()
   */
  @Override
  public int getID() {
    return State2.ID;
  }

  /*
   * Implementation of the approved method.
   * 
   * @see iit.softwaresystarch.project.model.states.State#approved()
   */
  @Override
  public void approved() {
    this.operation.displayMenu();
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.states.State#reject()
   */
  @Override
  public void reject() {
    this.operation.rejectMsg();
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.states.State#toString()
   */
  @Override
  public String toString() {
    return "State2 [getID()=" + this.getID() + "]";
  }

}
