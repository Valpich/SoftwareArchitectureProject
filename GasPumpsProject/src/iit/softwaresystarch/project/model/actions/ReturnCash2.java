package iit.softwaresystarch.project.model.actions;

import iit.softwaresystarch.project.model.datastores.DataStore2;

/**
 * The Class ReturnCash2.
 * This Class is the implementation of the Interface ReturnCash for the GasPump2.
 */
public class ReturnCash2 extends ReturnCash {

  /**
   * Instantiates a new ReturnCash2.
   *
   * @param dataStore the data store
   */
  public ReturnCash2(DataStore2 dataStore) {
    super(dataStore);
  }

  /*
   * Sets the current cash to 0 and displays the return value
   * 
   * @see iit.softwaresystarch.project.model.actions.ReturnCash#returnCash()
   */
  @Override
  public void returnCash() {
    System.out.println("Return Cash 2");
    System.out.println(
        "Returning :" + (((DataStore2) this.dataStore).getCash() - this.dataStore.getTotal()));
    ((DataStore2) this.dataStore).setCash(0);
  }

}
