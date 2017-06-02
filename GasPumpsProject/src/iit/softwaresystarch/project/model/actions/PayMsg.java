package iit.softwaresystarch.project.model.actions;

/**
 * The abstract Class PayMsg. 
 * This Class is used as an Interface for the Strategy pattern.
 * The goal is to have multiple implemtation of the method payMsg.
 */
public abstract class PayMsg {

  /**
   * Instantiates a new PayMsg.
   */
  public PayMsg() {}

  /**
   * Displays a pay message.
   */
  public void payMsg() {}

}
