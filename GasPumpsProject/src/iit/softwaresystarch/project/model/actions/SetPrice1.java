package iit.softwaresystarch.project.model.actions;

import iit.softwaresystarch.project.model.datastores.DataStore1;

/**
 * The Class SetPrice1.
 * This Class is the implementation of the Interface SetPrice for the GasPump1.
 */
public class SetPrice1 extends SetPrice {

  /**
   * Instantiates a new SetPrice1.
   *
   * @param dataStore the data store
   */
  public SetPrice1(DataStore1 dataStore) {
    super(dataStore);
  }

  /*
   * If g == 1, then price = RPrice, if g == 2, then price = SPrice else nothing
   * 
   * @see iit.softwaresystarch.project.model.actions.SetPrice#setPrice(int)
   */
  @Override
  public void setPrice(int g) {
    System.out.println("Set Price 1");
    switch (g) {
      case 1:
        this.dataStore.setPrice(((DataStore1) this.dataStore).getRPrice());
        break;
      case 2:
        this.dataStore.setPrice(((DataStore1) this.dataStore).getSPrice());
        break;
      default:
        break;
    }
  }

}
