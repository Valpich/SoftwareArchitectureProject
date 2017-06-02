package iit.softwaresystarch.project.model.actions;

import iit.softwaresystarch.project.model.datastores.DataStore2;

/**
 * The Class PrintReceipt2.
 * This Class is the implementation of the Interface PrintReceipt for the GasPump2.
 */
public class PrintReceipt2 extends PrintReceipt {

  /**
   * Instantiates a new PrintReceipt2.
   *
   * @param dataStore the data store
   */
  public PrintReceipt2(DataStore2 dataStore) {
    super(dataStore);
  }

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.actions.PrintReceipt#printReceipt()
   */
  @Override
  public void printReceipt() {
    System.out.println("Print Receipt 2");
    System.out.println("Price is: " + ((DataStore2) this.dataStore).getTotal() + ", liter is: "
        + ((DataStore2) this.dataStore).getLiter() + ".");
  }

}
