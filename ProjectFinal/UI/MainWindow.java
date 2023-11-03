package UI;

import javax.swing.*;
import java.awt.*;
import Database.WorkoutSessionDAO;
import Models.WorkoutSession;

public class MainWindow {

    private JFrame frame;
    private JTable workoutSessionsTable;
    private WorkoutSessionDAO workoutSessionDAO;

    public MainWindow() {
        workoutSessionDAO = new WorkoutSessionDAO();

        frame = new JFrame("Training Manager App");
        frame.setSize(700, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JButton userButton = new JButton("User Management");
        userButton.addActionListener(e -> new UserManagementWindow().setVisible(true));

        JButton workoutButton = new JButton("Workout Management");
        workoutButton.addActionListener(e -> new WorkoutManagementWindow().setVisible(true));
        
        JButton sessionButton = new JButton("Workout Session Management");
        sessionButton.addActionListener(e -> new WorkoutSessionManagementWindow().setVisible(true));


        JPanel buttonPanel = new JPanel();
        buttonPanel.add(userButton);
        buttonPanel.add(workoutButton);
        buttonPanel.add(sessionButton);
        frame.add(buttonPanel, BorderLayout.NORTH);

        Object[] columnNames = {"Session ID", "User ID", "Workout ID", "Duration", "Calories Burned", "Date"};
        Object[][] data = fetchDataForTable();
        workoutSessionsTable = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(workoutSessionsTable);
        frame.add(scrollPane, BorderLayout.CENTER);
    }

    private Object[][] fetchDataForTable() {
        java.util.List<WorkoutSession> sessions = workoutSessionDAO.getAllWorkoutSessions();
        Object[][] data = new Object[sessions.size()][6];

        for (int i = 0; i < sessions.size(); i++) {
            WorkoutSession session = sessions.get(i);
            data[i][0] = session.getSessionID();
            data[i][1] = session.getUserID();
            data[i][2] = session.getWorkoutID();
            data[i][3] = session.getDuration();
            data[i][4] = session.getCaloriesBurned();
            data[i][5] = session.getDate();
        }

        return data;
    }

    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
        mainWindow.setVisible(true);
    }
}

