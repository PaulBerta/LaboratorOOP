package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Models.CardioWorkout;
import Models.StrengthWorkout;
import Models.Workout;

public class WorkoutDAO {

    public void addWorkout(Workout workout) {
        String sql = "INSERT INTO Workouts(workoutName, type) VALUES(?, ?)";
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, workout.getWorkoutName());
            pstmt.setString(2, workout.getType());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Workout> getAllWorkouts() {
        String sql = "SELECT * FROM Workouts";
        List<Workout> workouts = new ArrayList<>();
        try (Connection conn = DatabaseManager.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            if (!rs.isBeforeFirst() ) {    
                System.out.println("No data found in the result set!"); 
            } 
    
            while (rs.next()) {
                String type = rs.getString("type");
                System.out.println("Found a workout of type: " + type); // Debugging line
                if ("cardio".equals(type)) {
                    workouts.add(new CardioWorkout(rs.getInt("id"), rs.getString("workoutName")));
                } else if ("strength".equals(type)) {
                    workouts.add(new StrengthWorkout(rs.getInt("id"), rs.getString("workoutName")));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(); // This will give you a more detailed error trace.
        }
        return workouts;
    }
    

    public void updateWorkout(Workout workout) {
        String sql = "UPDATE Workouts SET workoutName = ?, type = ? WHERE id = ?";
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, workout.getWorkoutName());
            pstmt.setString(2, workout.getType());
            pstmt.setInt(3, workout.getWorkoutID());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteWorkout(int workoutID) {
        String sql = "DELETE FROM Workouts WHERE workoutID = ?";
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, workoutID);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
