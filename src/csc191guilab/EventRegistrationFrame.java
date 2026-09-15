package csc191guilab;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * CSC 191 - Java GUI Lab Starter
 *
 * Work in NetBeans Source view and complete the TODO items in order.
 * The starter version compiles and runs, but several parts of the interface
 * are intentionally incomplete.
 *
 * IMPORTANT: This is a code-based Swing lab. Do not create a JFrame Form or
 * use the NetBeans drag-and-drop GUI Builder for the required tasks.
 */
public class EventRegistrationFrame extends JFrame {

    // ---------- Form components ----------
    private final JTextField nameField = new JTextField(18);
    private final JTextField emailField = new JTextField(18);

    private final JComboBox<String> classStandingBox = new JComboBox<>(
            new String[]{"Select...", "Freshman", "Sophomore", "Junior", "Senior", "Graduate"}
    );

    private final JRadioButton inPersonButton = new JRadioButton("In person");
    private final JRadioButton onlineButton = new JRadioButton("Online");
    private final ButtonGroup attendanceGroup = new ButtonGroup();

    private final JCheckBox javaWorkshopBox = new JCheckBox("Java GUI Design");
    private final JCheckBox aiWorkshopBox = new JCheckBox("AI for Developers");
    private final JCheckBox networkingWorkshopBox = new JCheckBox("Computer Networking");

    private final JButton registerButton = new JButton("Register");
    private final JButton clearButton = new JButton("Clear");

    private final JTextArea summaryArea = new JTextArea(10, 26);
    private final JLabel statusLabel = new JLabel("Complete the lab tasks to activate the form.");

    private final RegistrationModel model = new RegistrationModel();

    public EventRegistrationFrame() {
        super("CSC 191 GUI Lab - Campus Tech Day Registration");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(760, 520);
        setLocationRelativeTo(null);

        JPanel root = new JPanel(new BorderLayout(12, 12));
        root.setBorder(new EmptyBorder(14, 14, 14, 14));
        setContentPane(root);

        root.add(buildHeaderPanel(), BorderLayout.NORTH);
        root.add(buildMainPanel(), BorderLayout.CENTER);
        root.add(buildStatusPanel(), BorderLayout.SOUTH);

        configureComponents();
        wireEvents();
    }

    private JPanel buildHeaderPanel() {
        JPanel panel = new JPanel(new BorderLayout());

        JLabel title = new JLabel("Campus Tech Day Registration");
        title.setFont(title.getFont().deriveFont(Font.BOLD, 22f));

        JLabel subtitle = new JLabel("Practice Java Swing by completing each TODO task.");

        panel.add(title, BorderLayout.NORTH);
        panel.add(subtitle, BorderLayout.SOUTH);
        return panel;
    }

    private JPanel buildMainPanel() {
        JPanel panel = new JPanel(new GridLayout(1, 2, 16, 0));

        // TODO Task 1: Replace the placeholder on the left with buildFormPanel().
        JPanel placeholder = new JPanel(new BorderLayout());
        placeholder.setBorder(BorderFactory.createTitledBorder("Registration Form"));
        placeholder.add(
                new JLabel("Task 1: build and display the form panel", SwingConstants.CENTER),
                BorderLayout.CENTER
        );

        panel.add(placeholder);
        panel.add(buildSummaryPanel());
        return panel;
    }

    /**
     * TODO Tasks 1-4 are completed primarily inside this method.
     */
    private JPanel buildFormPanel() {
        JPanel form = new JPanel();

        // TODO Task 1 (15 pts):
        // 1. Change the layout to GridBagLayout.
        // 2. Add a titled border named "Registration Form".
        // 3. Use GridBagConstraints to place labels and controls in a clean form.

        // TODO Task 2 (15 pts): Add these labeled controls:
        // Name -> nameField
        // Email -> emailField
        // Class standing -> classStandingBox

        // TODO Task 3 (15 pts):
        // Add inPersonButton and onlineButton to attendanceGroup.
        // Put both radio buttons in a small JPanel.
        // Add that panel to the form with label "Attendance".

        // TODO Task 4 (15 pts):
        // Put the three workshop check boxes in a vertical JPanel.
        // Add that panel with label "Workshops".
        // Add registerButton and clearButton at the bottom.

        form.add(new JLabel("Your controls go here."));
        return form;
    }

    private JPanel buildSummaryPanel() {
        JPanel panel = new JPanel(new BorderLayout(8, 8));
        panel.setBorder(BorderFactory.createTitledBorder("Registration Summary"));

        summaryArea.setEditable(false);
        summaryArea.setLineWrap(true);
        summaryArea.setWrapStyleWord(true);
        summaryArea.setText("No registration submitted yet.");

        panel.add(new JScrollPane(summaryArea), BorderLayout.CENTER);
        return panel;
    }

    private JPanel buildStatusPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(4, 4, 0, 4));
        panel.add(statusLabel, BorderLayout.WEST);
        return panel;
    }

    private void configureComponents() {
        // TODO Task 5 (10 pts): Improve usability.
        // Required examples:
        // - Add at least two tooltips with setToolTipText(...).
        // - Make Register the default button with getRootPane().setDefaultButton(...).
        // - Make one additional usability improvement of your choice.
    }

    private void wireEvents() {
        // TODO Task 6 (15 pts): Connect the buttons to event handlers.
        // HINT:
        // registerButton.addActionListener(this::handleRegister);
        // clearButton.addActionListener(this::handleClear);
    }

    private void handleRegister(ActionEvent event) {
        // TODO Task 7 (10 pts): Validate input.
        // Required rules:
        // - Name cannot be blank.
        // - Email must contain '@' and '.'.
        // - A class standing must be selected.
        // - One attendance mode must be selected.
        // On invalid input, show a JOptionPane error and return.

        // TODO Task 8 (5 pts): If valid, copy GUI values into model and
        // display a formatted summary in summaryArea.
        // Also update statusLabel with a success message.

        summaryArea.setText("Task 7/8: validate the form and build a summary here.");
    }

    private void handleClear(ActionEvent event) {
        // TODO Task 8 (continued): Reset every input component, clear the model,
        // restore the summary text, and update statusLabel.
        summaryArea.setText("Task 8: reset the entire form here.");
    }

    /**
     * Optional helper method. You may use it when building the form.
     */
    private static GridBagConstraints gbc(int x, int y) {
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = x;
        c.gridy = y;
        c.insets = new Insets(5, 5, 5, 5);
        c.anchor = GridBagConstraints.WEST;
        return c;
    }
}
