package Database;

import Models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    public void addUser(User user) {
        String sql = "INSERT INTO Users(username, password, age, weight) VALUES(?, ?, ?, ?)";
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPassword());
            pstmt.setDouble(3, user.getAge());
            pstmt.setDouble(4, user.getWeight());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public List<User> getAllUsers() {
        String sql = "SELECT * FROM Users";
        List<User> users = new ArrayList<>();
        try (Connection conn = DatabaseManager.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                users.add(new User(rs.getInt("userID"), rs.getString("username"), 
                                   rs.getString("password"), rs.getInt("age"), 
                                   rs.getDouble("weight")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return users;
    }

    public void updateUser(User user) {
        String sql = "UPDATE Users SET username = ?, password = ?, age = ?, weight = ? WHERE userID = ?";
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPassword());
            pstmt.setDouble(3, user.getAge());
            pstmt.setDouble(4, user.getWeight());
            pstmt.setInt(5, user.getUserID());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteUser(int userID) {
        String sql = "DELETE FROM Users WHERE userID = ?";
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, userID);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
