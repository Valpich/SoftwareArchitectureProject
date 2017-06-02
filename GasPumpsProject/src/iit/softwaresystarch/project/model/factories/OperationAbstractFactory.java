
/**
 * iit.softwaresystarch.project.model.factories is a package 
 * containing the classes mostly related to AbstractFactory design pattern.
 */
package iit.softwaresystarch.project.model.factories;

import iit.softwaresystarch.project.model.actions.CancelMsg;
import iit.softwaresystarch.project.model.actions.DisplayMenu;
import iit.softwaresystarch.project.model.actions.GasPumpedMsg;
import iit.softwaresystarch.project.model.actions.PayMsg;
import iit.softwaresystarch.project.model.actions.PrintReceipt;
import iit.softwaresystarch.project.model.actions.PumpGasUnit;
import iit.softwaresystarch.project.model.actions.ReadyMsg;
import iit.softwaresystarch.project.model.actions.RejectMsg;
import iit.softwaresystarch.project.model.actions.ReturnCash;
import iit.softwaresystarch.project.model.actions.SetInitialValues;
import iit.softwaresystarch.project.model.actions.SetPrice;
import iit.softwaresystarch.project.model.actions.StopMsg;
import iit.softwaresystarch.project.model.actions.StoreCash;
import iit.softwaresystarch.project.model.actions.StoreData;
import iit.softwaresystarch.project.model.datastores.DataStore;

/**
 * A factory for creating Operation objects.
 * This Class is designed as an Interface for the concrete factories that will builds
 * all the differents instances used by the operation class to make actions on the system.
 */
public class OperationAbstractFactory {

  /** The data store. */
  protected DataStore dataStore;

  /** The store data. */
  protected StoreData storeData;

  /** The display menu. */
  protected DisplayMenu displayMenu;

  /** The pay msg. */
  protected PayMsg payMsg;

  /** The store cash. */
  protected StoreCash storeCash;

  /** The cancel msg. */
  protected CancelMsg cancelMsg;

  /** The reject msg. */
  protected RejectMsg rejectMsg;

  /** The set price. */
  protected SetPrice setPrice;

  /** The ready msg. */
  protected ReadyMsg readyMsg;

  /** The set initial values. */
  protected SetInitialValues setInitialValues;

  /** The pump gas unit. */
  protected PumpGasUnit pumpGasUnit;

  /** The gas pumped msg. */
  protected GasPumpedMsg gasPumpedMsg;

  /** The stop msg. */
  protected StopMsg stopMsg;

  /** The print receipt. */
  protected PrintReceipt printReceipt;

  /** The return cash. */
  protected ReturnCash returnCash;

  /**
   * Instantiates a new OperationAbstractFactory.
   */
  public OperationAbstractFactory() {}

  /**
   * Gets the data store.
   *
   * @return the data store
   */
  public DataStore getDataStore() {
    return this.dataStore;
  }

  /**
   * Gets the store data.
   *
   * @return the store data
   */
  public StoreData getStoreData() {
    return this.storeData;
  }

  /**
   * Gets the pay msg.
   *
   * @return the pay msg
   */
  public PayMsg getPayMsg() {
    return this.payMsg;
  }

  /**
   * Gets the store cash.
   *
   * @return the store cash
   */
  public StoreCash getStoreCash() {
    return this.storeCash;
  }

  /**
   * Gets the cancel msg.
   *
   * @return the cancel msg
   */
  public CancelMsg getCancelMsg() {
    return this.cancelMsg;
  }

  /**
   * Gets the display menu.
   *
   * @return the display menu
   */
  public DisplayMenu getDisplayMenu() {
    return this.displayMenu;
  }

  /**
   * Gets the reject msg.
   *
   * @return the reject msg
   */
  public RejectMsg getRejectMsg() {
    return this.rejectMsg;
  }

  /**
   * Gets the sets the price.
   *
   * @param g the g
   * @return the sets the price
   */
  public SetPrice getSetPrice(int g) {
    return this.setPrice;
  }

  /**
   * Gets the ready msg.
   *
   * @return the ready msg
   */
  public ReadyMsg getReadyMsg() {
    return this.readyMsg;
  }

  /**
   * Gets the sets the initial values.
   *
   * @return the sets the initial values
   */
  public SetInitialValues getSetInitialValues() {
    return this.setInitialValues;
  }

  /**
   * Gets the pump gas unit.
   *
   * @return the pump gas unit
   */
  public PumpGasUnit getPumpGasUnit() {
    return this.pumpGasUnit;
  }

  /**
   * Gets the gas pumped msg.
   *
   * @return the gas pumped msg
   */
  public GasPumpedMsg getGasPumpedMsg() {
    return this.gasPumpedMsg;
  }

  /**
   * Gets the stop msg.
   *
   * @return the stop msg
   */
  public StopMsg getStopMsg() {
    return this.stopMsg;
  }

  /**
   * Gets the prints the receipt.
   *
   * @return the prints the receipt
   */
  public PrintReceipt getPrintReceipt() {
    return this.printReceipt;
  }

  /**
   * Gets the return cash.
   *
   * @return the return cash
   */
  public ReturnCash getReturnCash() {
    return this.returnCash;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "OperationAbstractFactory [dataStore=" + this.dataStore + ", storeData=" + this.storeData
        + ", displayMenu=" + this.displayMenu + ", payMsg=" + this.payMsg + ", storeCash="
        + this.storeCash + ", cancelMsg=" + this.cancelMsg + ", rejectMsg=" + this.rejectMsg
        + ", setPrice=" + this.setPrice + ", readyMsg=" + this.readyMsg + ", setInitialValues="
        + this.setInitialValues + ", pumpGasUnit=" + this.pumpGasUnit + ", gasPumpedMsg="
        + this.gasPumpedMsg + ", stopMsg=" + this.stopMsg + ", printReceipt=" + this.printReceipt
        + ", returnCash=" + this.returnCash + "]";
  }

}
