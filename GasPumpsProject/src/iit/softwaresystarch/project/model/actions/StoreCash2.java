package iit.softwaresystarch.project.model.actions;

import iit.softwaresystarch.project.model.datastores.DataStore2;

/**
 * The Class StoreCash2.
 * This Class is the implementation of the Interface StoreCash for the GasPump2.
 */
public class StoreCash2 extends StoreCash {

  /**
   * Instantiates a new StoreCash2.
   *
   * @param dataStore the data store
   */
  public StoreCash2(DataStore2 dataStore) {
    super(dataStore);
  }

  /*
   * Sets the cash value to temp_cash.
   * 
   * @see iit.softwaresystarch.project.model.actions.StoreCash#storeCash()
   */
  @Override
  public void storeCash() {
    System.out.println("Store Cash 2");
    ((DataStore2) this.dataStore).setCash(((DataStore2) this.dataStore).getTemp_cash());
  }

}
