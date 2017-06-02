package iit.softwaresystarch.project.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import iit.softwaresystarch.project.controller.ButtonActivatePump1ClickedListener;
import iit.softwaresystarch.project.controller.ButtonClickedListener;
import iit.softwaresystarch.project.model.efsms.GasPump1;

/**
 * The Class GasPump1Panel.
 */
public class GasPump1Panel extends JPanel {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The gas pump 1. */
  private final GasPump1 gasPump1;

  /** The label gas pump 1. */
  private final JLabel labelGasPump1;

  /** The button activate. */
  private final JButton buttonActivate;

  /** The button start. */
  private final JButton buttonStart;

  /** The button pay credit. */
  private final JButton buttonPayCredit;

  /** The button approved. */
  private final JButton buttonApproved;

  /** The button reject. */
  private final JButton buttonReject;

  /** The button regular. */
  private final JButton buttonRegular;

  /** The button super. */
  private final JButton buttonSuper;

  /** The button start pump. */
  private final JButton buttonStartPump;

  /** The button pump gallon. */
  private final JButton buttonPumpGallon;

  /** The button stop pump. */
  private final JButton buttonStopPump;

  /** The button cancel. */
  private final JButton buttonCancel;

  /** The text pane output. */
  private final JTextPane textPaneOutput;

  /** The input panel. */
  private final InputPanel inputPanel;

  /**
   * Instantiates a new GasPump1Panel, add the buttons and controllers.
   *
   * @param gasPump1 the gas pump 1
   * @param textPaneOutput the text pane output
   * @param inputPanel the input panel
   */
  public GasPump1Panel(GasPump1 gasPump1, JTextPane textPaneOutput, InputPanel inputPanel) {
    this.setLayout(new GridLayout(0, 1, 0, 0));

    this.labelGasPump1 = new JLabel("GasPump-1");
    this.labelGasPump1.setHorizontalAlignment(SwingConstants.CENTER);
    this.add(this.labelGasPump1);

    this.buttonActivate = new JButton("Activate");
    this.add(this.buttonActivate);

    this.buttonStart = new JButton("Start");
    this.add(this.buttonStart);

    this.buttonPayCredit = new JButton("Pay Credit");
    this.add(this.buttonPayCredit);

    this.buttonApproved = new JButton("Approved");
    this.add(this.buttonApproved);

    this.buttonReject = new JButton("Reject");
    this.add(this.buttonReject);

    this.buttonCancel = new JButton("Cancel");
    this.add(this.buttonCancel);

    this.buttonRegular = new JButton("Regular");
    this.add(this.buttonRegular);

    this.buttonSuper = new JButton("Super");
    this.add(this.buttonSuper);

    this.buttonStartPump = new JButton("StartPump");
    this.add(this.buttonStartPump);

    this.buttonPumpGallon = new JButton("PumpGallon");
    this.add(this.buttonPumpGallon);

    this.buttonStopPump = new JButton("StopPump");
    this.add(this.buttonStopPump);

    this.gasPump1 = gasPump1;

    this.textPaneOutput = textPaneOutput;
    this.inputPanel = inputPanel;

    this.addControllers();
  }

  /**
   * Adds the controllers.
   */
  private void addControllers() {
    this.buttonActivate.addActionListener(new ButtonActivatePump1ClickedListener(this.gasPump1,
        this.textPaneOutput, this.inputPanel));

    this.buttonStart
        .addActionListener(new ButtonClickedListener(this.gasPump1, "start", this.textPaneOutput));

    this.buttonPayCredit.addActionListener(
        new ButtonClickedListener(this.gasPump1, "payCredit", this.textPaneOutput));

    this.buttonApproved.addActionListener(
        new ButtonClickedListener(this.gasPump1, "approved", this.textPaneOutput));

    this.buttonReject
        .addActionListener(new ButtonClickedListener(this.gasPump1, "reject", this.textPaneOutput));

    this.buttonCancel
        .addActionListener(new ButtonClickedListener(this.gasPump1, "cancel", this.textPaneOutput));

    this.buttonRegular.addActionListener(
        new ButtonClickedListener(this.gasPump1, "regular", this.textPaneOutput));

    this.buttonSuper.addActionListener(
        new ButtonClickedListener(this.gasPump1, "superGas", this.textPaneOutput));

    this.buttonStartPump.addActionListener(
        new ButtonClickedListener(this.gasPump1, "startPump", this.textPaneOutput));

    this.buttonPumpGallon.addActionListener(
        new ButtonClickedListener(this.gasPump1, "pumpGallon", this.textPaneOutput));

    this.buttonStopPump.addActionListener(
        new ButtonClickedListener(this.gasPump1, "stopPump", this.textPaneOutput));
  }

  /**
   * Gets the gas pump 1.
   *
   * @return the gas pump 1
   */
  public GasPump1 getGasPump1() {
    return this.gasPump1;
  }

  /**
   * Gets the label gas pump 1.
   *
   * @return the label gas pump 1
   */
  public JLabel getLabelGasPump1() {
    return this.labelGasPump1;
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
   * Gets the button pay credit.
   *
   * @return the button pay credit
   */
  public JButton getButtonPayCredit() {
    return this.buttonPayCredit;
  }

  /**
   * Gets the button approved.
   *
   * @return the button approved
   */
  public JButton getButtonApproved() {
    return this.buttonApproved;
  }

  /**
   * Gets the button reject.
   *
   * @return the button reject
   */
  public JButton getButtonReject() {
    return this.buttonReject;
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
   * Gets the button pump gallon.
   *
   * @return the button pump gallon
   */
  public JButton getButtonPumpGallon() {
    return this.buttonPumpGallon;
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
   * Gets the button cancel.
   *
   * @return the button cancel
   */
  public JButton getButtonCancel() {
    return this.buttonCancel;
  }

}
