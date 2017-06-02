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
 * The listener interface for receiving buttonCashClicked events. The class that is interested in
 * processing a buttonCashClicked event implements this interface, and the object created with that
 * class is registered with a component using the component's
 * addButtonCashClickedListener method. When the buttonCashClicked event occurs, that
 * object's appropriate method is invoked.
 *
 */
public class ButtonCashClickedListener implements ActionListener {

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
   * Instantiates a new button cash clicked listener.
   *
   * @param gasPump2 the gas pump 2
   * @param textPaneOutput the text pane output
   * @param inputPanel the input panel
   */
  public ButtonCashClickedListener(GasPump2 gasPump2, JTextPane textPaneOutput,
      InputPanel inputPanel) {
    this.gasPump2 = gasPump2;
    this.textPaneOutput = textPaneOutput;
    this.inputPanel = inputPanel;
  }

  /*
   * When the button is pressed, the cash field is parsed to float and if everything is fine the gas
   * pump 2 payCash operation is called with that value else the stack trace is printed and the text
   * field is reset to a default value (1.0).
   * 
   * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    float cash = -1;
    this.startPrint();
    try {
      cash = Float.parseFloat(this.inputPanel.getCashInput().getText());
      this.gasPump2.payCash(cash);
    } catch (final NumberFormatException nfe) {
      if (cash == -1) {
        this.inputPanel.getCashInput().setText("1.0");
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
