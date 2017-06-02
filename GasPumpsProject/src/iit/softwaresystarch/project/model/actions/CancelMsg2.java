package iit.softwaresystarch.project.model.actions;

/**
 * The Class CancelMsg2.
 * This Class is the implementation of the Interface CancelMsg for the GasPump2.
 */
public class CancelMsg2 extends CancelMsg {

  /**
   * Instantiates a new CancelMsg2.
   */
  public CancelMsg2() {}

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.actions.CancelMsg#cancelMsg()
   */
  @Override
  public void cancelMsg() {
    System.out.println("Cancel message for pump 2");
  }

}
