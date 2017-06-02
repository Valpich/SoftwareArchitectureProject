package iit.softwaresystarch.project.model.actions;

/**
 * The abstract Class CancelMsg.
 * This Class is used as an Interface for the Strategy pattern.
 * The goal is to have multiple implemtation of the method cancelMsg.
 */
public abstract class CancelMsg {

  /**
   * Instantiates a new CancelMsg.
   */
  public CancelMsg() {}

  /**
   * Displays a cancel message.
   */
  public void cancelMsg() {}

}
