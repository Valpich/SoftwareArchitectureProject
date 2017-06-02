package iit.softwaresystarch.project.model.actions;

import iit.softwaresystarch.project.model.datastores.DataStore2;

/**
 * The Class GasPumpedMsg2.
 * This Class is the implementation of the Interface GasPumpedMsg for the GasPump2.
 */
public class GasPumpedMsg2 extends GasPumpedMsg {

  /**
   * Instantiates a new GasPumpedMsg2.
   *
   * @param dataStore the data store
   */
  public GasPumpedMsg2(DataStore2 dataStore) {
    super(dataStore);
  }

  /*
   * Displays the liter pumped.
   * 
   * @see iit.softwaresystarch.project.model.actions.GasPumpedMsg#gasPumpedMsg()
   */
  @Override
  public void gasPumpedMsg() {
    System.out.println("Gas Pumped Message 2");
    System.out.println("Liter is:" + ((DataStore2) this.dataStore).getLiter() + ".");
  }

}
