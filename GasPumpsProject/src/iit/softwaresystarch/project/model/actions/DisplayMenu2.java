package iit.softwaresystarch.project.model.actions;

/**
 * The Class DisplayMenu2.
 * This Class is the implementation of the Interface DisplayMenu for the GasPump2.
 */
public class DisplayMenu2 extends DisplayMenu {

  /**
   * Instantiates a new DisplayMenu2.
   */
  public DisplayMenu2() {}

  /*
   * (non-Javadoc)
   * 
   * @see iit.softwaresystarch.project.model.actions.DisplayMenu#displayMenu()
   */
  @Override
  public void displayMenu() {
    System.out.println("Display menu 2");
    System.out.println("Please select Regular, Super or Premium");
  }

}
