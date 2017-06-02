package iit.softwaresystarch.project.model.datastores;

/**
 * The Class DataStore2.
 * This Class is responsible for stocking the specifics attributes of GasPump2.
 */
public class DataStore2 extends DataStore {

  /**
   * Instantiates a new data store 2.
   */
  public DataStore2() {}

  /** The temp a. */
  private int temp_a;

  /** The temp b. */
  private int temp_b;

  /** The temp c. */
  private int temp_c;

  /** The temp cash. */
  private float temp_cash;
  
  /** The regular price. */
  private int rPrice;

  /** The super price. */
  private int sPrice;
  
  /** The premium price. */
  private int pPrice;
  
  /** The liter pumped amount. */
  private float liter;

  /** The cash available. */
  private float cash;

  /**
   * Gets the temp a.
   *
   * @return the temp a
   */
  public int getTemp_a() {
    return temp_a;
  }

  /**
   * Sets the temp a.
   *
   * @param temp_a the new temp a
   */
  public void setTemp_a(int temp_a) {
    this.temp_a = temp_a;
  }

  /**
   * Gets the temp b.
   *
   * @return the temp b
   */
  public int getTemp_b() {
    return temp_b;
  }

  /**
   * Sets the temp b.
   *
   * @param temp_b the new temp b
   */
  public void setTemp_b(int temp_b) {
    this.temp_b = temp_b;
  }

  /**
   * Gets the temp c.
   *
   * @return the temp c
   */
  public int getTemp_c() {
    return temp_c;
  }

  /**
   * Sets the temp c.
   *
   * @param temp_c the new temp c
   */
  public void setTemp_c(int temp_c) {
    this.temp_c = temp_c;
  }

  /**
   * Gets the temp cash.
   *
   * @return the temp cash
   */
  public float getTemp_cash() {
    return temp_cash;
  }

  /**
   * Sets the temp cash.
   *
   * @param temp_cash the new temp cash
   */
  public void setTemp_cash(float temp_cash) {
    this.temp_cash = temp_cash;
  }

  /**
   * Gets the regular price.
   *
   * @return the regular price
   */
  public int getRPrice() {
    return rPrice;
  }

  /**
   * Sets the regular price.
   *
   * @param rPrice the new regular price
   */
  public void setRPrice(int rPrice) {
    this.rPrice = rPrice;
  }

  /**
   * Gets the super price.
   *
   * @return the super price
   */
  public int getSPrice() {
    return sPrice;
  }

  /**
   * Sets the super price.
   *
   * @param sPrice the new super price
   */
  public void setSPrice(int sPrice) {
    this.sPrice = sPrice;
  }

  /**
   * Gets the premium price.
   *
   * @return the premium price
   */
  public int getPPrice() {
    return pPrice;
  }

  /**
   * Sets the premium price.
   *
   * @param pPrice the new premium price
   */
  public void setPPrice(int pPrice) {
    this.pPrice = pPrice;
  }

  /**
   * Gets the liter pumped amount.
   *
   * @return the liter pumped amount
   */
  public float getLiter() {
    return liter;
  }

  /**
   * Sets the liter pumped amount.
   *
   * @param liter the new liter pumped amount
   */
  public void setLiter(float liter) {
    this.liter = liter;
  }

  /**
   * Gets the cash available.
   *
   * @return the cash available
   */
  public float getCash() {
    return cash;
  }

  /**
   * Sets the cash available.
   *
   * @param cash the new cash available
   */
  public void setCash(float cash) {
    this.cash = cash;
  }

  /* (non-Javadoc)
   * @see iit.softwaresystarch.project.model.datastores.DataStore#toString()
   */
  @Override
  public String toString() {
    return "DataStore2 [temp_a=" + temp_a + ", temp_b=" + temp_b + ", temp_c=" + temp_c
        + ", temp_cash=" + temp_cash + ", rPrice=" + rPrice + ", sPrice=" + sPrice + ", pPrice="
        + pPrice + ", liter=" + liter + ", cash=" + cash + ", price=" + price + ", total=" + total + "]";
  }

}
