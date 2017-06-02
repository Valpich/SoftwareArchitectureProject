package iit.softwaresystarch.project.model.actions;

/**
 * The abstract Class ReadyMsg.
 * This Class is used as an Interface for the Strategy pattern.
 * The goal is to have multiple implemtation of the method readyMsg.
 */
public abstract class ReadyMsg {

  /**
   * Instantiates a new ReadyMsg.
   */
  public ReadyMsg() {}

  /**
   * Displays a ready message.
   */
  public void readyMsg() {}

}
