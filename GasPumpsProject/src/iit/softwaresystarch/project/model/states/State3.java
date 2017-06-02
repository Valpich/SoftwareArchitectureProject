package iit.softwaresystarch.project.model.states;

import iit.softwaresystarch.project.model.factories.OperationAbstractFactory;

/**
 * The Class State3.
 */
public class State3 extends State {

  /** The Constant ID. */
  private static final int ID = 3;

  /**
   * Instantiates a new State3.
   *
   * @param operationAbstractFactory the operation abstract factory
   */
  public State3(OperationAbstractFactory operationAbstractFactory) {
    super(operationAbstractFactory);
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.states.State#getID()
   */
  @Override
  public int getID() {
    return State3.ID;
  }

  /*
   * Implementation of the cancel method.
   * 
   * @see iit.softwaresystarch.project.model.states.State#cancel()
   */
  @Override
  public void cancel() {
    this.operation.cancelMsg();
  }

  /*
   * Implementation of the select gas method.
   * 
   * @see iit.softwaresystarch.project.model.states.State#selectGas(int)
   */
  @Override
  public void selectGas(int g) {
    this.operation.setPrice(g);
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.states.State#toString()
   */
  @Override
  public String toString() {
    return "State3 [getID()=" + this.getID() + "]";
  }

}
