package iit.softwaresystarch.project.model.actions;

import iit.softwaresystarch.project.model.datastores.DataStore1;

/**
 * The Class PumpGasUnit1.
 * This Class is the implementation of the Interface PumpGasUnit for the GasPump1.
 */
public class PumpGasUnit1 extends PumpGasUnit {

  /**
   * Instantiates a new PumpGasUnit1.
   *
   * @param dataStore the data store
   */
  public PumpGasUnit1(DataStore1 dataStore) {
    super(dataStore);
  }

  /*
   * Updates the gallon amount and the corresponding total price.
   * 
   * @see iit.softwaresystarch.project.model.actions.PumpGasUnit#pumpGasUnit()
   */
  @Override
  public void pumpGasUnit() {
    System.out.println("Pump Gas Unit 1");
    ((DataStore1) this.dataStore).setGallon(((DataStore1) this.dataStore).getGallon() + 1);
    ((DataStore1) this.dataStore).setTotal(
        ((DataStore1) this.dataStore).getGallon() * (((DataStore1) this.dataStore).getPrice()));
  }
}
