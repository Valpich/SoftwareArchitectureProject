package iit.softwaresystarch.project.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.management.ManagementFactory;
import java.nio.charset.StandardCharsets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import iit.softwaresystarch.project.model.efsms.GasPump1;
import iit.softwaresystarch.project.model.efsms.GasPump2;

/**
 * The Class Driver.
 */
public class Driver {

  /** The frame. */
  private JFrame frame;

  /** The gas pump 1 panel. */
  private GasPump1Panel gasPump1Panel;

  /** The gas pump 2 panel. */
  private GasPump2Panel gasPump2Panel;

  /** The gas pump 1. */
  private GasPump1 gasPump1;

  /** The gas pump 2. */
  private GasPump2 gasPump2;

  /** The text pane output. */
  private JTextPane textPaneOutput;

  /** The input panel. */
  private InputPanel inputPanel;

  /** The orig out. */
  private PrintStream origOut;

  /** The baos. */
  private ByteArrayOutputStream baos;

  /** The out. */
  private PrintStream out;

  /**
   * The main method to create the view.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(() -> {
      try {
        final Driver window = new Driver();
        window.frame.setVisible(true);
      } catch (final Exception e) {
        e.printStackTrace();
      }
    });
  }

  /**
   * Instantiates a new Driver.
   */
  public Driver() {
    this.initialize();
  }

  /**
   * Initialize the driver.
   */
  private void initialize() {
    this.frame = new JFrame();
    this.frame.setBounds(100, 100, 550, 500);
    this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.frame.getContentPane().setLayout(new BorderLayout(0, 0));
    this.frame.setResizable(false);
    this.frame.isAlwaysOnTop();

    final JLabel labelCsPumpDriver = new JLabel("CS586 Pump Driver");
    labelCsPumpDriver.setHorizontalAlignment(SwingConstants.CENTER);
    this.frame.getContentPane().add(labelCsPumpDriver, BorderLayout.NORTH);

    this.textPaneOutput = new JTextPane();
    this.textPaneOutput.setToolTipText("The output of the GasPump");
    this.textPaneOutput.setEditable(false);
    this.textPaneOutput.setPreferredSize(new Dimension(550, 100));

    final JScrollPane scrollPane = new JScrollPane(this.textPaneOutput);
    this.frame.getContentPane().add(scrollPane, BorderLayout.SOUTH);

    this.inputPanel = new InputPanel();
    this.inputPanel.getButtonReset().setText("Restart driver");

    this.inputPanel.getButtonPrintPump1().addActionListener(e -> {
      Driver.this.startPrint();
      System.out.println("########### PRINTING GAS PUMP 1 ###########");
      System.out.println(Driver.this.gasPump1);
      System.out.println("########### GAS PUMP 1 PRINTED ###########");
      Driver.this.endPrint();
    });

    this.inputPanel.getButtonPrintPump2().addActionListener(e -> {
      Driver.this.startPrint();
      System.out.println("########### PRINTING GAS PUMP 2 ###########");
      System.out.println(Driver.this.gasPump2);
      System.out.println("########### GAS PUMP 2 PRINTED ###########");
      Driver.this.endPrint();
    });

    this.inputPanel.getButtonReset().addActionListener(e -> Driver.this.rebootDriver());

    this.frame.getContentPane().add(this.inputPanel, BorderLayout.CENTER);
    this.inputPanel.setLayout(new GridLayout(0, 2, 0, 0));

    this.gasPump1 = new GasPump1();
    this.gasPump1Panel = new GasPump1Panel(this.gasPump1, this.textPaneOutput, this.inputPanel);
    this.frame.getContentPane().add(this.gasPump1Panel, BorderLayout.WEST);

    this.gasPump2 = new GasPump2();
    this.gasPump2Panel = new GasPump2Panel(this.gasPump2, this.textPaneOutput, this.inputPanel);

    this.frame.getContentPane().add(this.gasPump2Panel, BorderLayout.EAST);

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

  /**
   * Reboot the driver.
   */
  private void rebootDriver() {
    final StringBuilder cmd = new StringBuilder();
    cmd.append(System.getProperty("java.home") + File.separator + "bin" + File.separator + "java ");
    for (final String jvmArg : ManagementFactory.getRuntimeMXBean().getInputArguments()) {
      cmd.append(jvmArg + " ");
    }
    cmd.append("-cp ").append(ManagementFactory.getRuntimeMXBean().getClassPath()).append(" ");
    cmd.append(Driver.class.getName()).append(" ");

    try {
      Runtime.getRuntime().exec(cmd.toString());
    } catch (final IOException ioe) {
      ioe.printStackTrace();
    }
    System.exit(0);
  }

}
