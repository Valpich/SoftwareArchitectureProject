package iit.softwaresystarch.project.model.efsms;

import java.util.ArrayList;
import java.util.List;

import iit.softwaresystarch.project.model.factories.OperationAbstractFactory;
import iit.softwaresystarch.project.model.states.Start;
import iit.softwaresystarch.project.model.states.State;
import iit.softwaresystarch.project.model.states.State0;
import iit.softwaresystarch.project.model.states.State1;
import iit.softwaresystarch.project.model.states.State2;
import iit.softwaresystarch.project.model.states.State3;
import iit.softwaresystarch.project.model.states.State4;
import iit.softwaresystarch.project.model.states.State5;
import iit.softwaresystarch.project.model.states.State6;

/**
 * The Class MDAEFSM.
 */
public class MDAEFSM {

  /** The states list. */
  private final List<State> statesList;

  /** The current state. */
  private State currentState;

  /** The operation abstract factory. */
  private final OperationAbstractFactory operationAbstractFactory;

  /**
   * Instantiates a new MDAEFSM and instantiates .
   *
   * @param operationAbstractFactory the operation abstract factory
   */
  public MDAEFSM(OperationAbstractFactory operationAbstractFactory) {
    this.operationAbstractFactory = operationAbstractFactory;
    this.statesList = new ArrayList<>();
    this.statesList.add(new Start(operationAbstractFactory));
    this.statesList.add(new State0(operationAbstractFactory));
    this.statesList.add(new State1(operationAbstractFactory));
    this.statesList.add(new State2(operationAbstractFactory));
    this.statesList.add(new State3(operationAbstractFactory));
    this.statesList.add(new State4(operationAbstractFactory));
    this.statesList.add(new State5(operationAbstractFactory));
    this.statesList.add(new State6(operationAbstractFactory));
    this.currentState = this.statesList.get(0);
  }

  /**
   * Activate.
   */
  public void activate() {
    if (this.currentState.getID() == -1) {
      this.currentState.activate();
      this.currentState = this.statesList.get(1);
    }
  }

  /**
   * Start.
   */
  public void start() {
    if (this.currentState.getID() == 0) {
      this.currentState.start();
      this.currentState = this.statesList.get(2);
    }
  }

  /**
   * Pay type.
   *
   * @param t the t
   */
  public void payType(int t) {
    if (this.currentState.getID() == 1) {
      if (t == 1) {
        this.currentState.payType(t);
        this.currentState = this.statesList.get(3);
      } else if (t == 2) {
        this.currentState.payType(t);
        this.currentState = this.statesList.get(4);
      }
    }
  }

  /**
   * Approved.
   */
  public void approved() {
    if (this.currentState.getID() == 2) {
      this.currentState.approved();
      this.currentState = this.statesList.get(4);
    }
  }

  /**
   * Reject.
   */
  public void reject() {
    if (this.currentState.getID() == 2) {
      this.currentState.reject();
      this.currentState = this.statesList.get(1);
    }
  }

  /**
   * Cancel.
   */
  public void cancel() {
    if (this.currentState.getID() == 3) {
      this.currentState.cancel();
      this.currentState = this.statesList.get(1);
    }
  }

  /**
   * Select gas.
   *
   * @param g the g
   */
  public void selectGas(int g) {
    if (this.currentState.getID() == 3) {
      this.currentState.selectGas(g);
      this.currentState = this.statesList.get(5);
    }
  }

  /**
   * Start pump.
   */
  public void startPump() {
    if (this.currentState.getID() == 4) {
      this.currentState.startPump();
      this.currentState = this.statesList.get(6);
    }
  }

  /**
   * Pump.
   */
  public void pump() {
    if (this.currentState.getID() == 5) {
      this.currentState.pump();
    }
  }

  /**
   * Stop pump.
   */
  public void stopPump() {
    if (this.currentState.getID() == 5) {
      this.currentState.stopPump();
      this.currentState = this.statesList.get(7);
    }
  }

  /**
   * Receipt.
   */
  public void receipt() {
    if (this.currentState.getID() == 6) {
      this.currentState.receipt();
      this.currentState = this.statesList.get(1);
    }
  }

  /**
   * No receipt.
   */
  public void noReceipt() {
    if (this.currentState.getID() == 6) {
      this.currentState.noReceipt();
      this.currentState = this.statesList.get(1);
    }
  }

  /**
   * Gets the states list.
   *
   * @return the states list
   */
  public List<State> getStatesList() {
    return this.statesList;
  }

  /**
   * Gets the current state.
   *
   * @return the current state
   */
  public State getCurrentState() {
    return this.currentState;
  }

  /**
   * Sets the current state.
   *
   * @param currentState the new current state
   */
  public void setCurrentState(State currentState) {
    this.currentState = currentState;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "MDAEFSM [statesList=" + this.statesList + ", currentState=" + this.currentState
        + ", operationAbstractFactory=" + this.operationAbstractFactory + "]";
  }

}
