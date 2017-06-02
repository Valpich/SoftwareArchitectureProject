package iit.softwaresystarch.project.model.actions;

import iit.softwaresystarch.project.model.datastores.DataStore1;

/**
 * The Class StoreData1.
 * This Class is the implementation of the Interface StoreData for the GasPump1.
 */
public class StoreData1 extends StoreData {

  /**
   * Instantiates a new StoreData1.
   *
   * @param dataStore the data store
   */
  public StoreData1(DataStore1 dataStore) {
    super(dataStore);
  }

  /*
   * Sets the RPrice to temp_a, SPrice to temp_b.
   * 
   * @see iit.softwaresystarch.project.model.actions.StoreData#storeData()
   */
  @Override
  public void storeData() {
    System.out.println("Store Data 1");
    ((DataStore1) this.dataStore).setRPrice(((DataStore1) this.dataStore).getTemp_a());
    ((DataStore1) this.dataStore).setSPrice(((DataStore1) this.dataStore).getTemp_b());
  }

}
