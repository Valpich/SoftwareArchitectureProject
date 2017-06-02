package iit.softwaresystarch.project.model.actions;

import iit.softwaresystarch.project.model.datastores.DataStore1;

/**
 * The Class GasPumpedMsg1.
 * This Class is the implementation of the Interface GasPumpedMsg for the GasPump1.
 */
public class GasPumpedMsg1 extends GasPumpedMsg {

  /**
   * Instantiates a new GasPumpedMsg1.
   *
   * @param dataStore the data store
   */
  public GasPumpedMsg1(DataStore1 dataStore) {
    super(dataStore);
  }

  /*
   * Displays the gallon pumped.
   * 
   * @see iit.softwaresystarch.project.model.actions.GasPumpedMsg#gasPumpedMsg()
   */
  @Override
  public void gasPumpedMsg() {
    System.out.println("Gas Pumped Message 1");
    System.out.println("Gallon is:" + ((DataStore1) this.dataStore).getGallon() + ".");
  }

}
