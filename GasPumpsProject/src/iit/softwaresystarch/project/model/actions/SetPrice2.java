package iit.softwaresystarch.project.model.actions;

import iit.softwaresystarch.project.model.datastores.DataStore2;

/**
 * The Class SetPrice2.
 * This Class is the implementation of the Interface SetPrice for the GasPump2.
 */
public class SetPrice2 extends SetPrice {

  /**
   * Instantiates a new SetPrice2.
   *
   * @param dataStore the data store
   */
  public SetPrice2(DataStore2 dataStore) {
    super(dataStore);
  }

  /*
   * If g == 1, then price = RPrice, if g == 2, then price = SPrice if g == 3, then price = PPrice
   * else nothing
   * 
   * @see iit.softwaresystarch.project.model.actions.SetPrice#setPrice(int)
   */
  @Override
  public void setPrice(int g) {
    System.out.println("Set Price 2");
    switch (g) {
      case 1:
        this.dataStore.setPrice(((DataStore2) this.dataStore).getRPrice());
        break;
      case 2:
        this.dataStore.setPrice(((DataStore2) this.dataStore).getSPrice());
        break;
      case 3:
        this.dataStore.setPrice(((DataStore2) this.dataStore).getPPrice());
        break;
      default:
        break;
    }
  }

}
