package iit.softwaresystarch.project.model.actions;

import iit.softwaresystarch.project.model.datastores.DataStore;

/**
 * The abstract Class SetInitialValues.
 * This Class is used as an Interface for the Strategy pattern.
 * The goal is to have multiple implemtation of the method setInitialValues.
 */
public abstract class SetInitialValues {

  /** The data store. */
  protected final DataStore dataStore;

  /**
   * Instantiates a new SetInitialValues.
   *
   * @param dataStore the data store
   */
  public SetInitialValues(DataStore dataStore) {
    this.dataStore = dataStore;
  }

  /**
   * Sets the initial values.
   */
  public void setInitialValues() {}

}
