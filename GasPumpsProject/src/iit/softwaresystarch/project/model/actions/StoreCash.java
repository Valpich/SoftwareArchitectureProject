package iit.softwaresystarch.project.model.actions;

import iit.softwaresystarch.project.model.datastores.DataStore;

/**
 * The abstract Class StoreCash.
 * This Class is used as an Interface for the Strategy pattern.
 * The goal is to have multiple implemtation of the method storeCash.
 */
public abstract class StoreCash {

  /** The data store. */
  protected final DataStore dataStore;

  /**
   * Instantiates a new StoreCash.
   *
   * @param dataStore the data store
   */
  public StoreCash(DataStore dataStore) {
    this.dataStore = dataStore;
  }

  /**
   * Stores the cash.
   */
  public void storeCash() {}

}
