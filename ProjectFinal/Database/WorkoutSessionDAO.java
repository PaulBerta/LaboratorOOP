package Database;


import Models.WorkoutSession; 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class WorkoutSessionDAO {

    public void logWorkoutSession(WorkoutSession session) {
        String sql = "INSERT INTO WorkoutSession(userID, workoutID, duration, caloriesBurned, date) VALUES(?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, session.getUserID());
            pstmt.setInt(2, session.getWorkoutID());
            pstmt.setDouble(3, session.getDuration());
            pstmt.setDouble(4, session.getCaloriesBurned());
            pstmt.setString(5, session.getDate());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<WorkoutSession> getSessionsForUser(int userID) {
        String sql = "SELECT * FROM WorkoutSession WHERE userID = ?";
        List<WorkoutSession> sessions = new ArrayList<>();
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, userID);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                sessions.add(new WorkoutSession(rs.getInt("sessionID"), rs.getInt("userID"),
                                                rs.getInt("workoutID"), rs.getDouble("duration"),
                                                rs.getDouble("caloriesBurned"), rs.getString("date")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return sessions;
    }


    public List<WorkoutSession> getAllWorkoutSessions() {
        List<WorkoutSession> sessions = new ArrayList<>();
        String query = "SELECT * FROM workout_sessions";

        try (Connection conn = DatabaseManager.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                WorkoutSession session = new WorkoutSession(
                    rs.getInt("sessionID"),
                    rs.getInt("userID"),
                    rs.getInt("workoutID"),
                    rs.getDouble("duration"),
                    rs.getDouble("caloriesBurned"),
                    rs.getString("date")
                );
                sessions.add(session);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return sessions;
    }

    public void deleteSession(int sessionID) {
        String sql = "DELETE FROM WorkoutSession WHERE sessionID = ?";
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, sessionID);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateSession(WorkoutSession session) {
        String sql = "UPDATE WorkoutSession SET userID = ?, workoutID = ?, duration = ?, caloriesBurned = ?, date = ? WHERE sessionID = ?";
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, session.getUserID());
            pstmt.setInt(2, session.getWorkoutID());
            pstmt.setDouble(3, session.getDuration());
            pstmt.setDouble(4, session.getCaloriesBurned());
            pstmt.setString(5, session.getDate());
            pstmt.setInt(6, session.getSessionID());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

                                               

