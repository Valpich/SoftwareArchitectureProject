package iit.softwaresystarch.project.view;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * The Class InputPanel.
 */
public class InputPanel extends JPanel {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The label A. */
  private final JLabel labelA;

  /** The label B. */
  private final JLabel labelB;

  /** The label C. */
  private final JLabel labelC;

  /** The label cash. */
  private final JLabel labelCash;

  /** The a input. */
  private final JFormattedTextField aInput;

  /** The b input. */
  private final JFormattedTextField bInput;

  /** The c input. */
  private final JFormattedTextField cInput;

  /** The cash input. */
  private final JFormattedTextField cashInput;

  /** The button print pump 2. */
  private final JButton buttonPrintPump2;

  /** The button print pump 1. */
  private final JButton buttonPrintPump1;

  /** The label print. */
  private final JLabel labelPrint;

  /** The button reset. */
  private final JButton buttonReset;

  /**
   * Instantiates a new InputPanel with the input fields, labels and controllers.
   */
  public InputPanel() {
    this.labelA = new JLabel("a: ");
    this.labelA.setHorizontalAlignment(SwingConstants.CENTER);

    this.labelB = new JLabel("b:");
    this.labelB.setHorizontalAlignment(SwingConstants.CENTER);

    this.labelC = new JLabel("c");
    this.labelC.setHorizontalAlignment(SwingConstants.CENTER);

    this.labelCash = new JLabel("cash:");
    this.labelCash.setHorizontalAlignment(SwingConstants.CENTER);

    this.aInput = new JFormattedTextField();
    this.aInput.setToolTipText("input for a");
    this.aInput.setText("1.0");
    this.aInput.setHorizontalAlignment(SwingConstants.CENTER);
    this.add(this.labelA);
    this.add(this.aInput);


    this.bInput = new JFormattedTextField();
    this.bInput.setToolTipText("input for b");
    this.bInput.setText("1.4");
    this.bInput.setHorizontalAlignment(SwingConstants.CENTER);
    this.add(this.labelB);
    this.add(this.bInput);

    this.cInput = new JFormattedTextField();
    this.cInput.setToolTipText("input for c");
    this.cInput.setText("2.3");
    this.cInput.setHorizontalAlignment(SwingConstants.CENTER);
    this.add(this.labelC);
    this.add(this.cInput);

    this.cashInput = new JFormattedTextField();
    this.cashInput.setToolTipText("input for cash");
    this.cashInput.setText("45.2");
    this.cashInput.setHorizontalAlignment(SwingConstants.CENTER);
    this.add(this.labelCash);
    this.add(this.cashInput);

    this.labelPrint = new JLabel("Print:");
    this.labelPrint.setHorizontalAlignment(SwingConstants.CENTER);
    this.add(this.labelPrint);

    this.buttonPrintPump1 = new JButton("Pump1");
    this.add(this.buttonPrintPump1);

    this.buttonPrintPump2 = new JButton("Pump2");
    this.add(this.buttonPrintPump2);

    this.buttonReset = new JButton("Reset");
    this.add(this.buttonReset);
  }

  /**
   * Gets the label A.
   *
   * @return the label A
   */
  public JLabel getLabelA() {
    return this.labelA;
  }

  /**
   * Gets the label B.
   *
   * @return the label B
   */
  public JLabel getLabelB() {
    return this.labelB;
  }

  /**
   * Gets the label C.
   *
   * @return the label C
   */
  public JLabel getLabelC() {
    return this.labelC;
  }

  /**
   * Gets the label cash.
   *
   * @return the label cash
   */
  public JLabel getLabelCash() {
    return this.labelCash;
  }

  /**
   * Gets the a input.
   *
   * @return the a input
   */
  public JFormattedTextField getaInput() {
    return this.aInput;
  }

  /**
   * Gets the b input.
   *
   * @return the b input
   */
  public JFormattedTextField getbInput() {
    return this.bInput;
  }

  /**
   * Gets the c input.
   *
   * @return the c input
   */
  public JFormattedTextField getcInput() {
    return this.cInput;
  }

  /**
   * Gets the cash input.
   *
   * @return the cash input
   */
  public JFormattedTextField getCashInput() {
    return this.cashInput;
  }

  /**
   * Gets the button print pump 2.
   *
   * @return the button print pump 2
   */
  public JButton getButtonPrintPump2() {
    return this.buttonPrintPump2;
  }

  /**
   * Gets the button print pump 1.
   *
   * @return the button print pump 1
   */
  public JButton getButtonPrintPump1() {
    return this.buttonPrintPump1;
  }

  /**
   * Gets the label print.
   *
   * @return the label print
   */
  public JLabel getLabelPrint() {
    return this.labelPrint;
  }

  /**
   * Gets the button reset.
   *
   * @return the button reset
   */
  public JButton getButtonReset() {
    return this.buttonReset;
  }

}
