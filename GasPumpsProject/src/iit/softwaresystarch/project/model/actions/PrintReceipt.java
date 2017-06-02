package iit.softwaresystarch.project.model.actions;

import iit.softwaresystarch.project.model.datastores.DataStore;

/**
 * The abstract Class PrintReceipt.
 * This Class is used as an Interface for the Strategy pattern.
 * The goal is to have multiple implemtation of the method printReceipt.
 */
public abstract class PrintReceipt {

  /** The data store. */
  protected final DataStore dataStore;

  /**
   * Instantiates a new PrintReceipt.
   *
   * @param dataStore the data store
   */
  public PrintReceipt(DataStore dataStore) {
    this.dataStore = dataStore;
  }

  /**
   * Prints the receipt.
   */
  public void printReceipt() {}

}
