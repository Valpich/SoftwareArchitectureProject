package iit.softwaresystarch.project.model.actions;

import iit.softwaresystarch.project.model.datastores.DataStore;

/**
 * The abstract Class SetPrice.
 * This Class is used as an Interface for the Strategy pattern.
 * The goal is to have multiple implemtation of the method setPrice(int g).
 */
public abstract class SetPrice {

  /** The data store. */
  protected final DataStore dataStore;

  /**
   * Instantiates a new SetPrice.
   *
   * @param dataStore the data store
   */
  public SetPrice(DataStore dataStore) {
    this.dataStore = dataStore;
  }

  /**
   * Sets the price.
   *
   * @param g the new price
   */
  public void setPrice(int g) {}

}
