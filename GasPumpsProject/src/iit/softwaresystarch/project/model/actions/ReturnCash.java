package iit.softwaresystarch.project.model.actions;

import iit.softwaresystarch.project.model.datastores.DataStore;

/**
 * The Class ReturnCash.
 * This Class is used as an Interface for the Strategy pattern.
 * The goal is to have multiple implemtation of the method returnCash.
 */
public abstract class ReturnCash {

  /** The data store. */
  protected final DataStore dataStore;

  /**
   * Instantiates a new ReturnCash.
   *
   * @param dataStore the data store
   */
  public ReturnCash(DataStore dataStore) {
    this.dataStore = dataStore;
  }

  /**
   * Returns the cash.
   */
  public void returnCash() {}

}
