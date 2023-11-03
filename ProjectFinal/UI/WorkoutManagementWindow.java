package UI;

import java.awt.GridLayout;

import javax.swing.*;
import Models.*;
import Service.TrainingManager;

public class WorkoutManagementWindow {
    private JFrame frame;
    private JTextField workoutNameField;
    private JComboBox<String> workoutTypeDropdown;
    private JButton submitButton;
    private TrainingManager trainingManager;

    public WorkoutManagementWindow() {
        trainingManager = TrainingManager.getInstance();

        frame = new JFrame("Workout Management");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(3, 2));  

        frame.add(new JLabel("Workout Name:"));
        workoutNameField = new JTextField();
        frame.add(workoutNameField);

        frame.add(new JLabel("Workout Type:"));
        String[] workoutTypes = {"Strength", "Cardio"};
        workoutTypeDropdown = new JComboBox<>(workoutTypes);
        frame.add(workoutTypeDropdown);

        submitButton = new JButton("Submit");
        frame.add(submitButton);
        submitButton.addActionListener(e -> saveWorkout());
    }

    private void saveWorkout() {
        String workoutName = workoutNameField.getText().trim();
        String workoutType = (String) workoutTypeDropdown.getSelectedItem();

        if(!workoutName.isEmpty()) {
            Workout workout;
            switch(workoutType) {
                case "Strength":
                    workout = new StrengthWorkout(0, workoutName);
                    break;
                case "Cardio":
                    workout = new CardioWorkout(0, workoutName);
                    break;
                default:
                    throw new IllegalStateException("Unexpected workout type: " + workoutType);
            }
            
            trainingManager.addWorkout(workout);
            JOptionPane.showMessageDialog(frame, "Workout added successfully!");
        } else {
            JOptionPane.showMessageDialog(frame, "Please provide a workout name!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }

    public static void main(String[] args) {
        WorkoutManagementWindow workoutManagementWindow = new WorkoutManagementWindow();
        workoutManagementWindow.setVisible(true);
    }
}
