package iit.softwaresystarch.project.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import javax.swing.JTextPane;

import iit.softwaresystarch.project.model.efsms.GasPump1;
import iit.softwaresystarch.project.view.InputPanel;

/**
 * The listener interface for receiving buttonActivatePump1Clicked events. The class that is
 * interested in processing a buttonActivatePump1Clicked event implements this interface, and the
 * object created with that class is registered with a component using the component's
 * addButtonActivatePump1ClickedListener method. When the buttonActivatePump1Clicked
 * event occurs, that object's appropriate method is invoked.
 *
 */
public class ButtonActivatePump1ClickedListener implements ActionListener {

  /** The gas pump 1. */
  private final GasPump1 gasPump1;

  /** The text pane output. */
  private final JTextPane textPaneOutput;

  /** The input panel. */
  private final InputPanel inputPanel;

  /** The orig out. */
  private PrintStream origOut;

  /** The baos. */
  private ByteArrayOutputStream baos;

  /** The out. */
  private PrintStream out;

  /**
   * Instantiates a new button activate pump 1 clicked listener.
   *
   * @param gasPump1 the gas pump 1
   * @param textPaneOutput the text pane output
   * @param inputPanel the input panel
   */
  public ButtonActivatePump1ClickedListener(GasPump1 gasPump1, JTextPane textPaneOutput,
      InputPanel inputPanel) {
    this.gasPump1 = gasPump1;
    this.textPaneOutput = textPaneOutput;
    this.inputPanel = inputPanel;
  }

  /*
   * When the button is pressed, the a and b fields are parsed to float and if everything is fine
   * the gas pump 1 is activated with the two floats a and b, else the stack trace is printed and
   * the text field is reset to a default value (1.0).
   * 
   * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    float a = -1;
    float b = -1;
    this.startPrint();
    try {
      a = Float.parseFloat(this.inputPanel.getaInput().getText());
      b = Float.parseFloat(this.inputPanel.getbInput().getText());
      this.gasPump1.activate(a, b);
    } catch (final NumberFormatException nfe) {
      if (a == -1) {
        this.inputPanel.getaInput().setText("1.0");
      }
      if (b == -1) {
        this.inputPanel.getbInput().setText("1.0");
      }
      nfe.printStackTrace();
    }
    this.endPrint();
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
    return "ButtonActivatePump1ClickedListener [gasPump1=" + this.gasPump1 + ", textPaneOutput="
        + this.textPaneOutput + ", origOut=" + this.origOut + ", baos=" + this.baos + ", out="
        + this.out + "]";
  }

}
