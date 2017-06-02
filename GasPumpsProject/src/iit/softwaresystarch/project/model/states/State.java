package iit.softwaresystarch.project.model.states;

import iit.softwaresystarch.project.model.actions.Operation;
import iit.softwaresystarch.project.model.factories.OperationAbstractFactory;

/**
 * The abstract Class State.
 */
public abstract class State {

  /** The Constant ID. */
  private static final int ID = -2;

  /**
   * Instantiates a new State.
   *
   * @param operationAbstractFactory the operation abstract factory
   */
  public State(OperationAbstractFactory operationAbstractFactory) {
    this.operation = new Operation(operationAbstractFactory);
  }

  /** The operation. */
  protected Operation operation;

  /**
   * Gets the id.
   *
   * @return the id
   */
  public int getID() {
    return State.ID;
  }

  /**
   * Activate.
   */
  public void activate() {}

  /**
   * Start.
   */
  public void start() {}

  /**
   * Pay type.
   *
   * @param t the payment type id
   */
  public void payType(int t) {}

  /**
   * Approved.
   */
  public void approved() {}

  /**
   * Reject.
   */
  public void reject() {}

  /**
   * Cancel.
   */
  public void cancel() {}

  /**
   * Select gas.
   *
   * @param g the gas id
   */
  public void selectGas(int g) {}

  /**
   * Start pump.
   */
  public void startPump() {}

  /**
   * Pump.
   */
  public void pump() {}

  /**
   * Stop pump.
   */
  public void stopPump() {}

  /**
   * Receipt.
   */
  public void receipt() {}

  /**
   * No receipt.
   */
  public void noReceipt() {}

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "State [operation=" + this.operation + ", getID()=" + this.getID() + "]";
  }

}
