package iit.softwaresystarch.project.model.actions;

/**
 * The Class PayMsg1.
 * This Class is the implementation of the Interface PayMsg for the GasPump1.
 */
public class PayMsg1 extends PayMsg {

  /**
   * Instantiates a new PayMsg1.
   */
  public PayMsg1() {}

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.actions.PayMsg#payMsg()
   */
  @Override
  public void payMsg() {
    System.out.println("Pay Message 1");
    System.out.println("Please select pay credit");
  }

}
