package iit.softwaresystarch.project.model.actions;

/**
 * The Class PayMsg2.
 * This Class is the implementation of the Interface PayMsg for the GasPump2.
 */
public class PayMsg2 extends PayMsg {

  /**
   * Instantiates a new PayMsg2.
   */
  public PayMsg2() {}

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.actions.PayMsg#payMsg()
   */
  @Override
  public void payMsg() {
    System.out.println("Pay Message 2");
    System.out.println("Please select pay cash");
  }

}
