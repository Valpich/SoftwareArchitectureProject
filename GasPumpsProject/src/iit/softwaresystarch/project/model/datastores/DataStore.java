package iit.softwaresystarch.project.model.datastores;

/**
 * The Class DataStore.
 * This Class is responsible for stocking the main common attributes of Gas Pumps.
 */
public class DataStore {


  /** The price. */
  protected float price;
  
  /** The total. */
  protected float total;

  /**
   * Instantiates a new data store.
   */
  public DataStore() {}
  
  /**
   * Gets the price.
   *
   * @return the price
   */
  public float getPrice() {
    return this.price;
  }

  /**
   * Sets the price.
   *
   * @param price the new price
   */
  public void setPrice(float price) {
    this.price = price;
  }

  /**
   * Gets the total.
   *
   * @return the total
   */
  public float getTotal() {
    return total;
  }

  /**
   * Sets the total.
   *
   * @param total the new total
   */
  public void setTotal(float total) {
    this.total = total;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "DataStore [price=" + price + ", total=" + total + "]";
  }


}
