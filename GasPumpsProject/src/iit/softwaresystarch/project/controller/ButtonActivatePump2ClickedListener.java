package iit.softwaresystarch.project.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import javax.swing.JTextPane;

import iit.softwaresystarch.project.model.efsms.GasPump2;
import iit.softwaresystarch.project.view.InputPanel;

/**
 * The listener interface for receiving buttonActivatePump2Clicked events. The class that is
 * interested in processing a buttonActivatePump2Clicked event implements this interface, and the
 * object created with that class is registered with a component using the component's
 * addButtonActivatePump2ClickedListener method. When the buttonActivatePump2Clicked
 * event occurs, that object's appropriate method is invoked.
 *
 */
public class ButtonActivatePump2ClickedListener implements ActionListener {

  /** The gas pump 2. */
  private final GasPump2 gasPump2;

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
   * Instantiates a new button activate pump 2 clicked listener.
   *
   * @param gasPump2 the gas pump 2
   * @param textPaneOutput the text pane output
   * @param inputPanel the input panel
   */
  public ButtonActivatePump2ClickedListener(GasPump2 gasPump2, JTextPane textPaneOutput,
      InputPanel inputPanel) {
    this.gasPump2 = gasPump2;
    this.textPaneOutput = textPaneOutput;
    this.inputPanel = inputPanel;
  }

  /*
   * When the button is pressed, the a and b fields are parsed to float and if everything is fine
   * the gas pump 2 is activated with the three floats a, b and c cast in int else the stack trace
   * is printed and the text field is reset to a default value (1.0).
   * 
   * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    int a = -1;
    int b = -1;
    int c = -1;
    this.startPrint();
    try {
      a = (int) Float.parseFloat(this.inputPanel.getaInput().getText());
      b = (int) Float.parseFloat(this.inputPanel.getbInput().getText());
      c = (int) Float.parseFloat(this.inputPanel.getcInput().getText());
      this.gasPump2.activate(a, b, c);
    } catch (final NumberFormatException nfe) {
      if (a == -1) {
        this.inputPanel.getaInput().setText("1.0");
      }
      if (b == -1) {
        this.inputPanel.getbInput().setText("1.0");
      }
      if (c == -1) {
        this.inputPanel.getcInput().setText("1.0");
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
    return "ButtonActivatePump1ClickedListener [gasPump2=" + this.gasPump2 + ", textPaneOutput="
        + this.textPaneOutput + ", origOut=" + this.origOut + ", baos=" + this.baos + ", out="
        + this.out + "]";
  }

}
