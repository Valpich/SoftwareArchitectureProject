package iit.softwaresystarch.project.model.actions;

import iit.softwaresystarch.project.model.datastores.DataStore2;

/**
 * The Class PumpGasUnit2.
 * This Class is the implementation of the Interface PumpGasUnit for the GasPump2.
 */
public class PumpGasUnit2 extends PumpGasUnit {

  /**
   * Instantiates a new PumpGasUnit2.
   *
   * @param dataStore the data store
   */
  public PumpGasUnit2(DataStore2 dataStore) {
    super(dataStore);
  }

  /*
   * Updates the liter amount and the corresponding total price.
   * 
   * @see iit.softwaresystarch.project.model.actions.PumpGasUnit#pumpGasUnit()
   */
  @Override
  public void pumpGasUnit() {
    System.out.println("Pump Gas Unit 2");
    ((DataStore2) this.dataStore).setLiter(((DataStore2) this.dataStore).getLiter() + 1);
    ((DataStore2) this.dataStore).setTotal(
        ((DataStore2) this.dataStore).getLiter() * (((DataStore2) this.dataStore).getPrice()));
  }

}
