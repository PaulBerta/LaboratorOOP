package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Models.User;
import Service.TrainingManager;

public class UserManagementWindow {

    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField ageField;
    private JTextField weightField;
    private JButton submitButton;
    private TrainingManager trainingManager;

    public UserManagementWindow() {
        trainingManager = TrainingManager.getInstance();  
        
        frame = new JFrame("User Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(6, 2));

        frame.add(new JLabel("Username:"));
        usernameField = new JTextField();
        frame.add(usernameField);

        frame.add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        frame.add(passwordField);

        frame.add(new JLabel("Age:"));
        ageField = new JTextField();
        frame.add(ageField);

        frame.add(new JLabel("Weight:"));
        weightField = new JTextField();
        frame.add(weightField);

        submitButton = new JButton("Submit");
        frame.add(submitButton);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveUser();
            }
        });
    }

    private void saveUser() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        double age = Double.parseDouble(ageField.getText());
        double weight = Double.parseDouble(weightField.getText());

        if(username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Username and password must be filled out!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if(age <= 8 || weight <= 30) {
            JOptionPane.showMessageDialog(frame, "Age and weight must be greater than 0!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        User user = new User(0, username, password, age, weight);
        trainingManager.addUser(user);

        JOptionPane.showMessageDialog(frame, "User saved successfully!");
    }

    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }

    public static void main(String[] args) {
        new UserManagementWindow().setVisible(true);
    }


}