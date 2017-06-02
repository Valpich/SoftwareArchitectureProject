package iit.softwaresystarch.project.model.actions;

/**
 * The Class RejectMsg1.
 * This Class is the implementation of the Interface RejectMsg for the GasPump1.
 */
public class RejectMsg1 extends RejectMsg {

  /**
   * Instantiates a new RejectMsg1.
   */
  public RejectMsg1() {}

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.actions.RejectMsg#rejectMsg()
   */
  @Override
  public void rejectMsg() {
    System.out.println("Reject Message 1");
    System.out.println("Sorry, you can't pay by credit!");
  }

}
