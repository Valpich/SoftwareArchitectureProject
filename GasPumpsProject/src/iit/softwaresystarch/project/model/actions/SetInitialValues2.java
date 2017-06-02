package iit.softwaresystarch.project.model.actions;

import iit.softwaresystarch.project.model.datastores.DataStore2;

/**
 * The Class SetInitialValues2.
 * This Class is the implementation of the Interface SetInitialValues for the GasPump2.
 */
public class SetInitialValues2 extends SetInitialValues {

  /**
   * Instantiates a new SetInitialValues2.
   *
   * @param dataStore the data store
   */
  public SetInitialValues2(DataStore2 dataStore) {
    super(dataStore);
  }

  /*
   * Sets the total to pay to 0 and the pumped liter to 0
   * 
   * @see iit.softwaresystarch.project.model.actions.SetInitialValues#setInitialValues()
   */
  @Override
  public void setInitialValues() {
    System.out.println("Set Initial Values 2");
    ((DataStore2) this.dataStore).setLiter(0);
    ((DataStore2) this.dataStore).setTotal(0);
  }

}
