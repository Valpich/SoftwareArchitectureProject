package iit.softwaresystarch.project.model.actions;

/**
 * The abstract Class RejectMsg.
 * This Class is used as an Interface for the Strategy pattern.
 * The goal is to have multiple implemtation of the method rejectMsg.
 */
public abstract class RejectMsg {

  /**
   * Instantiates a new RejectMsg.
   */
  public RejectMsg() {}

  /**
   * Displays a reject message.
   */
  public void rejectMsg() {}

}
