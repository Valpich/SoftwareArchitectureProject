package iit.softwaresystarch.project.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

import javax.swing.JTextPane;

import iit.softwaresystarch.project.model.efsms.GasPump1;
import iit.softwaresystarch.project.model.efsms.GasPump2;

/**
 * The listener interface for receiving buttonClicked events. The class that is interested in
 * processing a buttonClicked event implements this interface, and the object created with that
 * class is registered with a component using the component's addButtonClickedListener
 * method. When the buttonClicked event occurs, that object's appropriate method is invoked.
 *
 */
public class ButtonClickedListener implements ActionListener {

  /** The gas pump 1. */
  private final GasPump1 gasPump1;

  /** The gas pump 2. */
  private final GasPump2 gasPump2;

  /** The method string. */
  private final String methodString;

  /** The text pane output. */
  private final JTextPane textPaneOutput;

  /** The orig out. */
  private PrintStream origOut;

  /** The baos. */
  private ByteArrayOutputStream baos;

  /** The out. */
  private PrintStream out;

  /**
   * Instantiates a new button clicked listener.
   *
   * @param object the object which can be either a GasPump1 or a GasPump2
   * @param method the method to be called on click
   * @param textPaneOutput the text pane output
   */
  public ButtonClickedListener(Object object, String method, JTextPane textPaneOutput) {
    if (object instanceof GasPump1) {
      this.gasPump1 = (GasPump1) object;
      this.gasPump2 = null;
    } else if (object instanceof GasPump2) {
      this.gasPump1 = null;
      this.gasPump2 = (GasPump2) object;
    } else {
      this.gasPump1 = null;
      this.gasPump2 = null;
    }
    this.methodString = method;
    this.textPaneOutput = textPaneOutput;
  }

  /*
   * When the button is pressed, we find if the button listener was design to handle GasPump1 or
   * GasPump2 input, then we execute the method registred for the listener by using Java Reflection.
   * 
   * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    if (this.methodString != null) {
      Method method;
      this.startPrint();
      if (this.gasPump1 != null) {
        try {
          method = this.gasPump1.getClass().getMethod(this.methodString);
          method.invoke(this.gasPump1);
        } catch (NoSuchMethodException | SecurityException | IllegalAccessException
            | IllegalArgumentException | InvocationTargetException e1) {
          e1.printStackTrace();
        }
      } else if (this.gasPump2 != null) {
        try {
          method = this.gasPump2.getClass().getMethod(this.methodString);
          method.invoke(this.gasPump2);
        } catch (NoSuchMethodException | SecurityException | IllegalAccessException
            | IllegalArgumentException | InvocationTargetException e1) {
          e1.printStackTrace();
        }
      }
      this.endPrint();
    }
  }

  /**
   * Redirect the system output to a prinstream.
   */
  private void startPrint() {
    this.origOut = System.out;
    this.baos = new ByteArrayOutputStream();
    this.out = new PrintStream(this.baos);
    System.setOut(this.out);
  }

  /**
   * Print the printstream into the textPaneOutput.
   */
  private void endPrint() {
    // Update the text field
    this.textPaneOutput.setText(this.textPaneOutput.getText()
        + new String(this.baos.toByteArray(), StandardCharsets.UTF_8));
    // Get back to the original system output
    System.setOut(this.origOut);
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "ButtonClickedListener [gasPump1=" + this.gasPump1 + ", gasPump2=" + this.gasPump2
        + ", methodString=" + this.methodString + ", textPaneOutput=" + this.textPaneOutput
        + ", origOut=" + this.origOut + ", baos=" + this.baos + ", out=" + this.out + "]";
  }

}
