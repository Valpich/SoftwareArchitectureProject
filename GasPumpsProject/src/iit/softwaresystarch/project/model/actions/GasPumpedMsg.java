package iit.softwaresystarch.project.model.actions;

import iit.softwaresystarch.project.model.datastores.DataStore;

/**
 * The abstract Class GasPumpedMsg.
 * This Class is used as an Interface for the Strategy pattern.
 * The goal is to have multiple implemtation of the method gasPumpedMsg.
 */
public abstract class GasPumpedMsg {

  /** The data store. */
  protected final DataStore dataStore;

  /**
   * Instantiates a new GasPumpedMsg.
   *
   * @param dataStore the data store
   */
  public GasPumpedMsg(DataStore dataStore) {
    this.dataStore = dataStore;
  }

  /**
   * Displays a message when gas is pumped.
   */
  public void gasPumpedMsg() {}

}
