package iit.softwaresystarch.project.model.actions;

import iit.softwaresystarch.project.model.factories.OperationAbstractFactory;

/**
 * The Class Operation responsible for executing the operations build by the factory.
 */
public class Operation {

  /** The operation abstract factory. */
  private final OperationAbstractFactory operationAbstractFactory;

  /**
   * Instantiates a new Operation.
   *
   * @param operationAbstractFactory the operation abstract factory
   */
  public Operation(OperationAbstractFactory operationAbstractFactory) {
    this.operationAbstractFactory = operationAbstractFactory;
  }


  /**
   * Stores data if the factory has an implementation.
   */
  public void storeData() {
    final StoreData storeData = this.operationAbstractFactory.getStoreData();
    if (storeData != null) {
      storeData.storeData();
    }
  }

  /**
   * Displays the pay message if the factory has an implementation.
   */
  public void payMsg() {
    final PayMsg payMsg = this.operationAbstractFactory.getPayMsg();
    if (payMsg != null) {
      payMsg.payMsg();
    }
  }

  /**
   * Stores cash if the factory has an implementation.
   */
  public void storeCash() {
    final StoreCash storeCash = this.operationAbstractFactory.getStoreCash();
    if (storeCash != null) {
      storeCash.storeCash();
    }
  }

  /**
   * Displays a menu if the factory has an implementation.
   */
  public void displayMenu() {
    final DisplayMenu displayMenu = this.operationAbstractFactory.getDisplayMenu();
    if (displayMenu != null) {
      displayMenu.displayMenu();
    }
  }

  /**
   * Displays a reject message if the factory has an implementation.
   */
  public void rejectMsg() {
    final RejectMsg rejectMsg = this.operationAbstractFactory.getRejectMsg();
    if (rejectMsg != null) {
      rejectMsg.rejectMsg();
    }
  }

  /**
   * Displays a cancel message if the factory has an implementation.
   */
  public void cancelMsg() {
    final CancelMsg cancelMsg = this.operationAbstractFactory.getCancelMsg();
    if (cancelMsg != null) {
      cancelMsg.cancelMsg();
    }
  }

  /**
   * Sets the price if the factory has an implementation.
   *
   * @param g the new price
   */
  public void setPrice(int g) {
    final SetPrice setPrice = this.operationAbstractFactory.getSetPrice(g);
    if (setPrice != null) {
      setPrice.setPrice(g);
    }
  }

  /**
   * Displays a ready message if the factory has an implementation.
   */
  public void readyMsg() {
    final ReadyMsg readyMsg = this.operationAbstractFactory.getReadyMsg();
    if (readyMsg != null) {
      readyMsg.readyMsg();
    }
  }

  /**
   * Sets the initial values if the factory has an implementation.
   */
  public void setInitialValues() {
    final SetInitialValues setInitialValues = this.operationAbstractFactory.getSetInitialValues();
    if (setInitialValues != null) {
      setInitialValues.setInitialValues();
    }
  }

  /**
   * Pumps a gas unit if the factory has an implementation.
   */
  public void pumpGasUnit() {
    final PumpGasUnit pumpGasUnit = this.operationAbstractFactory.getPumpGasUnit();
    if (pumpGasUnit != null) {
      pumpGasUnit.pumpGasUnit();
    }
  }

  /**
   * Displays a gas pumped message if the factory has an implementation.
   */
  public void gasPumpedMsg() {
    final GasPumpedMsg gasPumpedMsg = this.operationAbstractFactory.getGasPumpedMsg();
    if (gasPumpedMsg != null) {
      gasPumpedMsg.gasPumpedMsg();
    }
  }

  /**
   * Displays a stop message if the factory has an implementation.
   */
  public void stopMsg() {
    final StopMsg stopMsg = this.operationAbstractFactory.getStopMsg();
    if (stopMsg != null) {
      stopMsg.stopMsg();
    }
  }

  /**
   * Prints the receipt if the factory has an implementation.
   */
  public void printReceipt() {
    final PrintReceipt printReceipt = this.operationAbstractFactory.getPrintReceipt();
    if (printReceipt != null) {
      printReceipt.printReceipt();
    }
  }

  /**
   * Returns the cash if the factory has an implementation.
   */
  public void returnCash() {
    final ReturnCash returnCash = this.operationAbstractFactory.getReturnCash();
    if (returnCash != null) {
      returnCash.returnCash();
    }
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Operation [operationAbstractFactory=" + this.operationAbstractFactory + "]";
  }

}
