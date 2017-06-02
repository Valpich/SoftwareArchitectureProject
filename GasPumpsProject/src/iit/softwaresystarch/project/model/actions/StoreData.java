package iit.softwaresystarch.project.model.actions;

import iit.softwaresystarch.project.model.datastores.DataStore;

/**
 * The abstract Class StoreData.
 * This Class is used as an Interface for the Strategy pattern.
 * The goal is to have multiple implemtation of the method storeData.
 */
public abstract class StoreData {

  /** The data store. */
  protected DataStore dataStore;

  /**
   * Instantiates a new StoreData.
   *
   * @param dataStore the data store
   */
  public StoreData(DataStore dataStore) {
    this.dataStore = dataStore;
  }

  /**
   * Stores the data.
   */
  public void storeData() {}

}
