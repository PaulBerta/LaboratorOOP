package UI;

import javax.swing.*;
import java.awt.*;
import Models.*;
import Service.TrainingManager;
import java.util.List;

public class WorkoutSessionManagementWindow {
    private JFrame frame;
    private JComboBox<Workout> workoutDropdown;
    private JTextField userIDField;
    private JTextField durationField;
    private JTextField caloriesBurnedField;
    private JTextField dateField;
    private JButton submitButton;

    public WorkoutSessionManagementWindow() {
        frame = new JFrame("Workout Session Management");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 2));

        frame.add(new JLabel("User ID:"));
        userIDField = new JTextField();
        frame.add(userIDField);

        frame.add(new JLabel("Workout:"));
        workoutDropdown = new JComboBox<>();
        List<Workout> workouts = TrainingManager.getInstance().getAllWorkouts();
        for (Workout workout : workouts) {
            workoutDropdown.addItem(workout);
        }
        frame.add(workoutDropdown);

        frame.add(new JLabel("Duration (in minutes):"));
        durationField = new JTextField();
        frame.add(durationField);

        frame.add(new JLabel("Calories Burned:"));
        caloriesBurnedField = new JTextField();
        frame.add(caloriesBurnedField);

        frame.add(new JLabel("Date (YYYY-MM-DD):"));
        dateField = new JTextField();
        frame.add(dateField);

        submitButton = new JButton("Submit");
        frame.add(submitButton);
        submitButton.addActionListener(e -> saveWorkoutSession());

        frame.pack();
    }

    private void saveWorkoutSession() {
        if (userIDField.getText().trim().isEmpty() || durationField.getText().trim().isEmpty() ||
            caloriesBurnedField.getText().trim().isEmpty() || dateField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "All fields must be filled out!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int userId = Integer.parseInt(userIDField.getText());
        Workout selectedWorkout = (Workout) workoutDropdown.getSelectedItem();
        double duration = Double.parseDouble(durationField.getText());
        double caloriesBurned = Double.parseDouble(caloriesBurnedField.getText());
        String date = dateField.getText();

        WorkoutSession workoutSession = new WorkoutSession(0, userId, selectedWorkout.getWorkoutID(), duration, caloriesBurned, date);
        TrainingManager.getInstance().logWorkoutSession(workoutSession);

        JOptionPane.showMessageDialog(frame, "Workout session saved successfully!");
    }

    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }

    public static void main(String[] args) {
        new WorkoutSessionManagementWindow().setVisible(true);
    }
}
