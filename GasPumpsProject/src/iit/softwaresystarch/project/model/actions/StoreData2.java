package iit.softwaresystarch.project.model.actions;

import iit.softwaresystarch.project.model.datastores.DataStore2;

/**
 * The Class StoreData2.
 * This Class is the implementation of the Interface StoreData for the GasPump2.
 */
public class StoreData2 extends StoreData {

  /**
   * Instantiates a new StoreData2.
   *
   * @param dataStore the data store
   */
  public StoreData2(DataStore2 dataStore) {
    super(dataStore);
  }

  /*
   * Sets the RPrice to temp_a, PPrice to temp_b, SPrice to temp_c.
   * 
   * @see iit.softwaresystarch.project.model.actions.StoreData#storeData()
   */
  @Override
  public void storeData() {
    System.out.println("Store Data 2");
    ((DataStore2) this.dataStore).setRPrice(((DataStore2) this.dataStore).getTemp_a());
    ((DataStore2) this.dataStore).setPPrice(((DataStore2) this.dataStore).getTemp_b());
    ((DataStore2) this.dataStore).setSPrice(((DataStore2) this.dataStore).getTemp_c());
  }

}
