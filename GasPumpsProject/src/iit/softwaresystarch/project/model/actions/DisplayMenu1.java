package iit.softwaresystarch.project.model.actions;

/**
 * The Class DisplayMenu1.
 * This Class is the implementation of the Interface DisplayMenu for the GasPump1.
 */
public class DisplayMenu1 extends DisplayMenu {

  /**
   * Instantiates a new DisplayMenu1.
   */
  public DisplayMenu1() {}

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.actions.DisplayMenu#displayMenu()
   */
  @Override
  public void displayMenu() {
    System.out.println("Display menu 1");
    System.out.println("Please select Regular or Super");
  }

}
