package iit.softwaresystarch.project.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import iit.softwaresystarch.project.controller.ButtonActivatePump2ClickedListener;
import iit.softwaresystarch.project.controller.ButtonCashClickedListener;
import iit.softwaresystarch.project.controller.ButtonClickedListener;
import iit.softwaresystarch.project.model.efsms.GasPump2;

/**
 * The Class GasPump2Panel.
 */
public class GasPump2Panel extends JPanel {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The gas pump 2. */
  private final GasPump2 gasPump2;

  /** The label gas pump 2. */
  private final JLabel labelGasPump2;

  /** The button activate. */
  private final JButton buttonActivate;

  /** The button start. */
  private final JButton buttonStart;

  /** The button pay cash. */
  private final JButton buttonPayCash;

  /** The button cancel. */
  private final JButton buttonCancel;

  /** The button premium. */
  private final JButton buttonPremium;

  /** The button regular. */
  private final JButton buttonRegular;

  /** The button super. */
  private final JButton buttonSuper;

  /** The button start pump. */
  private final JButton buttonStartPump;

  /** The button pump liter. */
  private final JButton buttonPumpLiter;

  /** The button stop pump. */
  private final JButton buttonStopPump;

  /** The button no receipt. */
  private final JButton buttonNoReceipt;

  /** The button receipt. */
  private final JButton buttonReceipt;

  /** The text pane output. */
  private final JTextPane textPaneOutput;

  /** The input panel. */
  private final InputPanel inputPanel;

  /**
   * Instantiates a new GasPump2Panel, add the buttons and controllers.
   *
   * @param gasPump2 the gas pump 2
   * @param textPaneOutput the text pane output
   * @param inputPanel the input panel
   */
  public GasPump2Panel(GasPump2 gasPump2, JTextPane textPaneOutput, InputPanel inputPanel) {
    this.setLayout(new GridLayout(0, 1, 0, 0));

    this.labelGasPump2 = new JLabel("GasPump-2");
    this.labelGasPump2.setHorizontalAlignment(SwingConstants.CENTER);
    this.add(this.labelGasPump2);

    this.buttonActivate = new JButton("Activate");
    this.add(this.buttonActivate);

    this.buttonStart = new JButton("Start");
    this.add(this.buttonStart);

    this.buttonPayCash = new JButton("Pay Cash");
    this.add(this.buttonPayCash);

    this.buttonCancel = new JButton("Cancel");
    this.add(this.buttonCancel);

    this.buttonSuper = new JButton("Super");
    this.add(this.buttonSuper);

    this.buttonRegular = new JButton("Regular");
    this.add(this.buttonRegular);

    this.buttonPremium = new JButton("Premium");
    this.add(this.buttonPremium);

    this.buttonStartPump = new JButton("StartPump");
    this.add(this.buttonStartPump);

    this.buttonPumpLiter = new JButton("PumpLiter");
    this.add(this.buttonPumpLiter);

    this.buttonStopPump = new JButton("Stop");
    this.add(this.buttonStopPump);

    this.buttonNoReceipt = new JButton("NoReceipt");
    this.add(this.buttonNoReceipt);

    this.buttonReceipt = new JButton("Receipt");
    this.add(this.buttonReceipt);

    this.gasPump2 = gasPump2;

    this.textPaneOutput = textPaneOutput;
    this.inputPanel = inputPanel;

    this.addControllers();
  }

  /**
   * Adds the controllers.
   */
  private void addControllers() {
    this.buttonActivate.addActionListener(new ButtonActivatePump2ClickedListener(this.gasPump2,
        this.textPaneOutput, this.inputPanel));

    this.buttonStart
        .addActionListener(new ButtonClickedListener(this.gasPump2, "start", this.textPaneOutput));

    this.buttonPayCash.addActionListener(
        new ButtonCashClickedListener(this.gasPump2, this.textPaneOutput, this.inputPanel));

    this.buttonCancel
        .addActionListener(new ButtonClickedListener(this.gasPump2, "cancel", this.textPaneOutput));

    this.buttonSuper.addActionListener(
        new ButtonClickedListener(this.gasPump2, "superGas", this.textPaneOutput));

    this.buttonRegular.addActionListener(
        new ButtonClickedListener(this.gasPump2, "regular", this.textPaneOutput));

    this.buttonPremium.addActionListener(
        new ButtonClickedListener(this.gasPump2, "premium", this.textPaneOutput));

    this.buttonStartPump.addActionListener(
        new ButtonClickedListener(this.gasPump2, "startPump", this.textPaneOutput));

    this.buttonPumpLiter.addActionListener(
        new ButtonClickedListener(this.gasPump2, "pumpLiter", this.textPaneOutput));

    this.buttonStopPump
        .addActionListener(new ButtonClickedListener(this.gasPump2, "stop", this.textPaneOutput));

    this.buttonNoReceipt.addActionListener(
        new ButtonClickedListener(this.gasPump2, "noReceipt", this.textPaneOutput));

    this.buttonReceipt.addActionListener(
        new ButtonClickedListener(this.gasPump2, "receipt", this.textPaneOutput));
  }

  /**
   * Gets the gas pump 2.
   *
   * @return the gas pump 2
   */
  public GasPump2 getGasPump2() {
    return this.gasPump2;
  }

  /**
   * Gets the label gas pump 2.
   *
   * @return the label gas pump 2
   */
  public JLabel getLabelGasPump2() {
    return this.labelGasPump2;
  }

  /**
   * Gets the button activate.
   *
   * @return the button activate
   */
  public JButton getButtonActivate() {
    return this.buttonActivate;
  }

  /**
   * Gets the button start.
   *
   * @return the button start
   */
  public JButton getButtonStart() {
    return this.buttonStart;
  }

  /**
   * Gets the button pay cash.
   *
   * @return the button pay cash
   */
  public JButton getButtonPayCash() {
    return this.buttonPayCash;
  }

  /**
   * Gets the button cancel.
   *
   * @return the button cancel
   */
  public JButton getButtonCancel() {
    return this.buttonCancel;
  }

  /**
   * Gets the button premium.
   *
   * @return the button premium
   */
  public JButton getButtonPremium() {
    return this.buttonPremium;
  }

  /**
   * Gets the button regular.
   *
   * @return the button regular
   */
  public JButton getButtonRegular() {
    return this.buttonRegular;
  }

  /**
   * Gets the button super.
   *
   * @return the button super
   */
  public JButton getButtonSuper() {
    return this.buttonSuper;
  }

  /**
   * Gets the button start pump.
   *
   * @return the button start pump
   */
  public JButton getButtonStartPump() {
    return this.buttonStartPump;
  }

  /**
   * Gets the button pump liter.
   *
   * @return the button pump liter
   */
  public JButton getButtonPumpLiter() {
    return this.buttonPumpLiter;
  }

  /**
   * Gets the button stop pump.
   *
   * @return the button stop pump
   */
  public JButton getButtonStopPump() {
    return this.buttonStopPump;
  }

  /**
   * Gets the button no receipt.
   *
   * @return the button no receipt
   */
  public JButton getButtonNoReceipt() {
    return this.buttonNoReceipt;
  }

  /**
   * Gets the button receipt.
   *
   * @return the button receipt
   */
  public JButton getButtonReceipt() {
    return this.buttonReceipt;
  }

}
