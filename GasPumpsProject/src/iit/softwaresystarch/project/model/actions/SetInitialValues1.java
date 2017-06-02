package iit.softwaresystarch.project.model.actions;

import iit.softwaresystarch.project.model.datastores.DataStore1;

/**
 * The Class SetInitialValues1.
 * This Class is the implementation of the Interface SetInitialValues for the GasPump1.
 */
public class SetInitialValues1 extends SetInitialValues {

  /**
   * Instantiates a new SetInitialValues1.
   *
   * @param dataStore the data store
   */
  public SetInitialValues1(DataStore1 dataStore) {
    super(dataStore);
  }

  /*
   * Sets the total to pay to 0 and the pumped gallon to 0
   * 
   * @see iit.softwaresystarch.project.model.actions.SetInitialValues#setInitialValues()
   */
  @Override
  public void setInitialValues() {
    System.out.println("Set Initial Values 1");
    ((DataStore1) this.dataStore).setGallon(0);
    ((DataStore1) this.dataStore).setTotal(0);
  }

}
