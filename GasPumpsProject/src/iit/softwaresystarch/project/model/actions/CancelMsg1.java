package iit.softwaresystarch.project.model.actions;

/**
 * The Class CancelMsg1.
 * This Class is the implementation of the Interface CancelMsg for the GasPump1.
 */
public class CancelMsg1 extends CancelMsg {

  /**
   * Instantiates a new CancelMsg1.
   */
  public CancelMsg1() {}

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.actions.CancelMsg#cancelMsg()
   */
  @Override
  public void cancelMsg() {
    System.out.println("Cancel message for pump 1");
  }

}
