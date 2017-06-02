package iit.softwaresystarch.project.model.factories;

import iit.softwaresystarch.project.model.actions.CancelMsg;
import iit.softwaresystarch.project.model.actions.CancelMsg1;
import iit.softwaresystarch.project.model.actions.DisplayMenu;
import iit.softwaresystarch.project.model.actions.DisplayMenu1;
import iit.softwaresystarch.project.model.actions.GasPumpedMsg;
import iit.softwaresystarch.project.model.actions.GasPumpedMsg1;
import iit.softwaresystarch.project.model.actions.PayMsg;
import iit.softwaresystarch.project.model.actions.PayMsg1;
import iit.softwaresystarch.project.model.actions.PrintReceipt;
import iit.softwaresystarch.project.model.actions.PrintReceipt1;
import iit.softwaresystarch.project.model.actions.PumpGasUnit;
import iit.softwaresystarch.project.model.actions.PumpGasUnit1;
import iit.softwaresystarch.project.model.actions.ReadyMsg;
import iit.softwaresystarch.project.model.actions.RejectMsg;
import iit.softwaresystarch.project.model.actions.RejectMsg1;
import iit.softwaresystarch.project.model.actions.ReturnCash;
import iit.softwaresystarch.project.model.actions.SetInitialValues;
import iit.softwaresystarch.project.model.actions.SetInitialValues1;
import iit.softwaresystarch.project.model.actions.SetPrice;
import iit.softwaresystarch.project.model.actions.SetPrice1;
import iit.softwaresystarch.project.model.actions.StopMsg;
import iit.softwaresystarch.project.model.actions.StoreCash;
import iit.softwaresystarch.project.model.actions.StoreData;
import iit.softwaresystarch.project.model.actions.StoreData1;
import iit.softwaresystarch.project.model.datastores.DataStore1;

/**
 * The Class OperationAbstractFactory1.
 */
public class OperationAbstractFactory1 extends OperationAbstractFactory {

  /**
   * Instantiates a new OperationAbstractFactory1 and Instantiates the requiered attributes.
   */
  public OperationAbstractFactory1() {
    this.dataStore = new DataStore1();
    this.payMsg = new PayMsg1();
    this.displayMenu = new DisplayMenu1();
    this.rejectMsg = new RejectMsg1();
    this.cancelMsg = new CancelMsg1();
    this.storeData = new StoreData1((DataStore1) this.dataStore);
    this.setPrice = new SetPrice1((DataStore1) this.dataStore);
    this.setInitialValues = new SetInitialValues1((DataStore1) this.dataStore);
    this.pumpGasUnit = new PumpGasUnit1((DataStore1) this.dataStore);
    this.gasPumpedMsg = new GasPumpedMsg1((DataStore1) this.dataStore);
    this.printReceipt = new PrintReceipt1((DataStore1) this.dataStore);
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.factories.OperationAbstractFactory#getStoreData()
   */
  @Override
  public StoreData getStoreData() {
    return this.storeData;
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.factories.OperationAbstractFactory#getPayMsg()
   */
  @Override
  public PayMsg getPayMsg() {
    return this.payMsg;
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.factories.OperationAbstractFactory#getStoreCash()
   */
  @Override
  public StoreCash getStoreCash() {
    return this.storeCash;
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.factories.OperationAbstractFactory#getDisplayMenu()
   */
  @Override
  public DisplayMenu getDisplayMenu() {
    return this.displayMenu;
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.factories.OperationAbstractFactory#getRejectMsg()
   */
  @Override
  public RejectMsg getRejectMsg() {
    return this.rejectMsg;
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.factories.OperationAbstractFactory#getCancelMsg()
   */
  @Override
  public CancelMsg getCancelMsg() {
    return this.cancelMsg;
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.factories.OperationAbstractFactory#getSetPrice(int)
   */
  @Override
  public SetPrice getSetPrice(int g) {
    return this.setPrice;
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.factories.OperationAbstractFactory#getReadyMsg()
   */
  @Override
  public ReadyMsg getReadyMsg() {
    return this.readyMsg;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * iit.softwaresystarch.project.model.factories.OperationAbstractFactory#getSetInitialValues()
   */
  @Override
  public SetInitialValues getSetInitialValues() {
    return this.setInitialValues;
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.factories.OperationAbstractFactory#getPumpGasUnit()
   */
  @Override
  public PumpGasUnit getPumpGasUnit() {
    return this.pumpGasUnit;
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.factories.OperationAbstractFactory#getGasPumpedMsg()
   */
  @Override
  public GasPumpedMsg getGasPumpedMsg() {
    return this.gasPumpedMsg;
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.factories.OperationAbstractFactory#getStopMsg()
   */
  @Override
  public StopMsg getStopMsg() {
    return this.stopMsg;
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.factories.OperationAbstractFactory#getPrintReceipt()
   */
  @Override
  public PrintReceipt getPrintReceipt() {
    return this.printReceipt;
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.factories.OperationAbstractFactory#getReturnCash()
   */
  @Override
  public ReturnCash getReturnCash() {
    return this.returnCash;
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.factories.OperationAbstractFactory#toString()
   */
  @Override
  public String toString() {
    return "OperationAbstractFactory1 [dataStore=" + this.dataStore + ", storeData="
        + this.storeData + ", displayMenu=" + this.displayMenu + ", payMsg=" + this.payMsg
        + ", storeCash=" + this.storeCash + ", cancelMsg=" + this.cancelMsg + ", rejectMsg="
        + this.rejectMsg + ", setPrice=" + this.setPrice + ", readyMsg=" + this.readyMsg
        + ", setInitialValues=" + this.setInitialValues + ", pumpGasUnit=" + this.pumpGasUnit
        + ", gasPumpedMsg=" + this.gasPumpedMsg + ", stopMsg=" + this.stopMsg + ", printReceipt="
        + this.printReceipt + ", returnCash=" + this.returnCash + "]";
  }

}
