package iit.softwaresystarch.project.model.actions;

import iit.softwaresystarch.project.model.datastores.DataStore;

/**
 * The abstract Class PumpGasUnit.
 * This Class is used as an Interface for the Strategy pattern.
 * The goal is to have multiple implemtation of the method pumpGasUnit.
 */
public abstract class PumpGasUnit {

  /** The data store. */
  protected final DataStore dataStore;

  /**
   * Instantiates a new PumpGasUnit.
   *
   * @param dataStore the data store
   */
  public PumpGasUnit(DataStore dataStore) {
    this.dataStore = dataStore;
  }

  /**
   * Pumps a gas unit.
   */
  public void pumpGasUnit() {}

}
