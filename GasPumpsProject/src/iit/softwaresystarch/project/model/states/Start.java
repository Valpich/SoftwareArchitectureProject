package iit.softwaresystarch.project.model.states;

import iit.softwaresystarch.project.model.factories.OperationAbstractFactory;

/**
 * The Class Start.
 */
public class Start extends State {

  /** The Constant ID. */
  private static final int ID = -1;

  /**
   * Instantiates a new Start.
   *
   * @param operationAbstractFactory the operation abstract factory
   */
  public Start(OperationAbstractFactory operationAbstractFactory) {
    super(operationAbstractFactory);
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.states.State#getID()
   */
  @Override
  public int getID() {
    return Start.ID;
  }

  /*
   * Implementation of the activate method.
   * 
   * @see iit.softwaresystarch.project.model.states.State#activate()
   */
  @Override
  public void activate() {
    this.operation.storeData();
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.states.State#toString()
   */
  @Override
  public String toString() {
    return "Start [getID()=" + this.getID() + "]";
  }


}
