package Database;

import java.sql.*;

public class DatabaseManager {
    
    private static final String DATABASE_URL = "jdbc:sqlite:trainingApp.db";
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(DATABASE_URL);
            } catch (SQLException e) {
                System.out.println("Error connecting to the database: " + e.getMessage());
            }
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Error closing database connection: " + e.getMessage());
            }
        }
    }

    public static void initialize() {
        try (Connection conn = DatabaseManager.getConnection();
             Statement stmt = conn.createStatement()) {
            
            stmt.execute("CREATE TABLE IF NOT EXISTS workouts (" +
                         "id INTEGER PRIMARY KEY, " +
                         "workoutName TEXT, " +
                         "duration DOUBLE, " +
                         "caloriesBurned DOUBLE, " +
                         "type TEXT" +  
                         ")");

            stmt.execute("CREATE TABLE IF NOT EXISTS workout_sessions (" +
                         "id INTEGER PRIMARY KEY, " +
                         "userID INTEGER, " +
                         "workoutID INTEGER, " +
                         "duration DOUBLE, " +
                         "caloriesBurned DOUBLE, " +
                         "date TEXT" +
                         ")");

                         
            stmt.execute("CREATE TABLE IF NOT EXISTS users (" +
                         "id INTEGER PRIMARY KEY, " +
                         "username TEXT, " +
                         "password TEXT, " +
                         "age DOUBLE, " +
                         "weight DOUBLE" +
                         ")");


        } catch (SQLException e) {
            System.out.println("Error initializing the database: " + e.getMessage());
        }
    }
}
