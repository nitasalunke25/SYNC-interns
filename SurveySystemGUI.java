import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SurveySystemGUI implements ActionListener {
    JFrame frame;
    JPanel panel;
    JLabel nameLabel, emailLabel, surveyLabel;
    JTextField nameField, emailField;
    JTextArea surveyArea;
    JButton submitButton, cancelButton;

    public SurveySystemGUI() {
        // Create a new JFrame
        frame = new JFrame("Online Survey System");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a new JPanel
        panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);

        // Add the name label and field
        nameLabel = new JLabel("Name:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(nameLabel, constraints);

        nameField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(nameField, constraints);

        // Add the email label and field
        emailLabel = new JLabel("Email:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(emailLabel, constraints);

        emailField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(emailField, constraints);

        // Add the survey label and field
        surveyLabel = new JLabel("How do you feel:");
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(surveyLabel, constraints);

        surveyArea = new JTextArea(10, 20);
        surveyArea.setLineWrap(true);
        surveyArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(surveyArea);
        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(scrollPane, constraints);

        // Add the submit and cancel buttons
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(submitButton, constraints);

        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(this);
        constraints.gridx = 1;
        constraints.gridy = 3;
        panel.add(cancelButton, constraints);

        // Add the panel to the frame
        frame.getContentPane().add(panel, BorderLayout.CENTER);

        // Show the frame
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Submit the survey response to the database
            String name = nameField.getText();
            String email = emailField.getText();
            String survey = surveyArea.getText();

            // TODO: Implement code to submit the survey response to the database

            // Clear the form fields
            nameField.setText("");
            emailField.setText("");
            surveyArea.setText("");

            // Show a confirmation message
            JOptionPane.showMessageDialog(frame, "Thank you for your response!");
        } else if (e.getSource() == cancelButton) {
            // Clear the form fields
            nameField.setText("");
            emailField.setText("");
            surveyArea.setText("");
        }
    }

    public static void main(String[] args) {
        new SurveySystemGUI();
    }
}