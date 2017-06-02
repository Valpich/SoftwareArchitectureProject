package iit.softwaresystarch.project.model.actions;

import iit.softwaresystarch.project.model.datastores.DataStore1;

/**
 * The Class PrintReceipt1.
 * This Class is the implementation of the Interface PrintReceipt for the GasPump1.
 */
public class PrintReceipt1 extends PrintReceipt {

  /**
   * Instantiates a new PrintReceipt1.
   *
   * @param dataStore the data store
   */
  public PrintReceipt1(DataStore1 dataStore) {
    super(dataStore);
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.actions.PrintReceipt#printReceipt()
   */
  @Override
  public void printReceipt() {
    System.out.println("Print Receipt 1");
    System.out.println("Price is: " + ((DataStore1) this.dataStore).getTotal() + ".");
  }

}
