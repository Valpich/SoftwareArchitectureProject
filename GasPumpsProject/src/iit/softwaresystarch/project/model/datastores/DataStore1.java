package iit.softwaresystarch.project.model.datastores;

/**
 * The Class DataStore1.
 * This Class is responsible for stocking the specifics attributes of GasPump1.
 */
public class DataStore1 extends DataStore {

  /**
   * Instantiates a new DataStore1.
   */
  public DataStore1() {}

  /** The temp a. */
  private float temp_a;

  /** The temp b. */
  private float temp_b;

  /** The regular price. */
  private float rPrice;

  /** The suoer price. */
  private float sPrice;
  
  /** The gallon pumped amount. */
  private float gallon;

  /**
   * Gets the temp a.
   *
   * @return the temp a
   */
  public float getTemp_a() {
    return temp_a;
  }

  /**
   * Sets the temp a.
   *
   * @param temp_a the new temp a
   */
  public void setTemp_a(float temp_a) {
    this.temp_a = temp_a;
  }

  /**
   * Gets the temp b.
   *
   * @return the temp b
   */
  public float getTemp_b() {
    return temp_b;
  }

  /**
   * Sets the temp b.
   *
   * @param temp_b the new temp b
   */
  public void setTemp_b(float temp_b) {
    this.temp_b = temp_b;
  }

  /**
   * Gets the regular price.
   *
   * @return the regular price
   */
  public float getRPrice() {
    return rPrice;
  }

  /**
   * Sets the reguler price.
   *
   * @param rPrice the new regular price
   */
  public void setRPrice(float rPrice) {
    this.rPrice = rPrice;
  }

  /**
   * Gets the super price.
   *
   * @return the super price
   */
  public float getSPrice() {
    return sPrice;
  }

  /**
   * Sets the super price.
   *
   * @param sPrice the new super price
   */
  public void setSPrice(float sPrice) {
    this.sPrice = sPrice;
  }

  /**
   * Gets the gallon pumped amount.
   *
   * @return the gallon pumped amount
   */
  public float getGallon() {
    return gallon;
  }

  /**
   * Sets the gallon pumped amount.
   *
   * @param gallon the new gallon pumped amount
   */
  public void setGallon(float gallon) {
    this.gallon = gallon;
  }

  /* (non-Javadoc)
   * @see iit.softwaresystarch.project.model.datastores.DataStore#toString()
   */
  @Override
  public String toString() {
    return "DataStore1 [temp_a=" + temp_a + ", temp_b=" + temp_b + ", rPrice=" + rPrice
        + ", sPrice=" + sPrice + ", gallon=" + gallon + ", price=" + price + ", total=" + total + "]";
  }

}
