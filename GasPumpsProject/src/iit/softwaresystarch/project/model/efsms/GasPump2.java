package iit.softwaresystarch.project.model.efsms;

import iit.softwaresystarch.project.model.datastores.DataStore;
import iit.softwaresystarch.project.model.datastores.DataStore2;
import iit.softwaresystarch.project.model.factories.OperationAbstractFactory2;

/**
 * The Class GasPump2.
 * This Class is the concrete representation of a GasPump2.
 */
public class GasPump2 {

  /** The data store. */
  private final DataStore dataStore;

  /** The mda efsm. */
  private final MDAEFSM mdaEfsm;

  /**
   * Instantiates a new GasPump2.
   */
  public GasPump2() {
    final OperationAbstractFactory2 operationAbstractFactory2 = new OperationAbstractFactory2();
    this.mdaEfsm = new MDAEFSM(operationAbstractFactory2);
    this.dataStore = operationAbstractFactory2.getDataStore();
  }

  /**
   * Activate.
   *
   * @param a the a
   * @param b the b
   * @param c the c
   */
  public void activate(int a, int b, int c) {
    System.out.println("activate");
    if (a > 0 && b > 0 && c > 0) {
      ((DataStore2) this.dataStore).setTemp_a(a);
      ((DataStore2) this.dataStore).setTemp_b(b);
      ((DataStore2) this.dataStore).setTemp_c(c);
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
   * Pay cash.
   *
   * @param c the c
   */
  public void payCash(float c) {
    System.out.println("payCash");
    System.out.println("cash is " + c + ".");
    if (c > 0) {
      ((DataStore2) this.dataStore).setTemp_cash(c);
      this.mdaEfsm.payType(2);
    }
  }

  /**
   * Cancel.
   */
  public void cancel() {
    System.out.println("cancel");
    this.mdaEfsm.cancel();
  }

  /**
   * Super gas.
   */
  public void superGas() {
    System.out.println("superGas");
    this.mdaEfsm.selectGas(2);
  }

  /**
   * Regular.
   */
  public void regular() {
    System.out.println("regular");
    this.mdaEfsm.selectGas(1);
  }

  /**
   * Premium.
   */
  public void premium() {
    System.out.println("premium");
    this.mdaEfsm.selectGas(3);
  }

  /**
   * Start pump.
   */
  public void startPump() {
    System.out.println("startPump");
    this.mdaEfsm.startPump();
  }

  /**
   * Pump liter.
   */
  public void pumpLiter() {
    System.out.println("pumpLiter");
    if (((DataStore2) this.dataStore).getCash() >= (((DataStore2) this.dataStore).getLiter() + 1)
        * (((DataStore2) this.dataStore).getPrice())) {
      this.mdaEfsm.pump();
    } else {
      this.mdaEfsm.setCurrentState(this.mdaEfsm.getStatesList().get(7));
    }
  }

  /**
   * Stop.
   */
  public void stop() {
    System.out.println("stop");
    this.mdaEfsm.stopPump();
  }

  /**
   * Receipt.
   */
  public void receipt() {
    System.out.println("receipt");
    this.mdaEfsm.receipt();
  }

  /**
   * No receipt.
   */
  public void noReceipt() {
    System.out.println("noReceipt");
    this.mdaEfsm.noReceipt();
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "GasPump2 [dataStore=" + this.dataStore + ", mdaEfsm=" + this.mdaEfsm + "]";
  }

}
