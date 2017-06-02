package iit.softwaresystarch.project.model.efsms;

import iit.softwaresystarch.project.model.datastores.DataStore;
import iit.softwaresystarch.project.model.datastores.DataStore1;
import iit.softwaresystarch.project.model.factories.OperationAbstractFactory1;

/**
 * The Class GasPump1.
 * This Class is the concrete representation of a GasPump1.
 */
public class GasPump1 {

  /** The data store. */
  private final DataStore dataStore;

  /** The mda efsm. */
  private final MDAEFSM mdaEfsm;

  /**
   * Instantiates a new GasPump1.
   */
  public GasPump1() {
    final OperationAbstractFactory1 operationAbstractFactory1 = new OperationAbstractFactory1();
    this.mdaEfsm = new MDAEFSM(operationAbstractFactory1);
    this.dataStore = operationAbstractFactory1.getDataStore();
  }

  /**
   * Activate.
   *
   * @param a the a
   * @param b the b
   */
  public void activate(float a, float b) {
    System.out.println("activate");
    if (a > 0 && b > 0) {
      ((DataStore1) this.dataStore).setTemp_a(a);
      ((DataStore1) this.dataStore).setTemp_b(b);
      this.mdaEfsm.activate();
    }
  }

  /**
   * Start.
   */
  public void start() {
    System.out.println("start");
    this.mdaEfsm.start();
  }

  /**
   * Pay credit.
   */
  public void payCredit() {
    System.out.println("payCredit");
    this.mdaEfsm.payType(1);
  }

  /**
   * Approved.
   */
  public void approved() {
    System.out.println("approved");
    this.mdaEfsm.approved();
  }

  /**
   * Reject.
   */
  public void reject() {
    System.out.println("reject");
    this.mdaEfsm.reject();
  }

  /**
   * Cancel.
   */
  public void cancel() {
    System.out.println("cancel");
    this.mdaEfsm.cancel();
  }

  /**
   * Regular.
   */
  public void regular() {
    System.out.println("regular");
    this.mdaEfsm.selectGas(1);
  }

  /**
   * Super gas.
   */
  public void superGas() {
    System.out.println("superGas");
    this.mdaEfsm.selectGas(2);
  }

  /**
   * Start pump.
   */
  public void startPump() {
    System.out.println("startPump");
    this.mdaEfsm.startPump();
  }

  /**
   * Pump gallon.
   */
  public void pumpGallon() {
    System.out.println("pumpGallon");
    this.mdaEfsm.pump();
  }

  /**
   * Stop pump.
   */
  public void stopPump() {
    System.out.println("stopPump");
    this.mdaEfsm.stopPump();
    this.mdaEfsm.receipt();
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "GasPump1 [dataStore=" + this.dataStore + ", mdaEfsm=" + this.mdaEfsm + "]";
  }

}
