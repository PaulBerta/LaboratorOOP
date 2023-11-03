package Service;
import java.util.List;
import Models.*;
import Database.*;

public class TrainingManager {

    private static TrainingManager instance;
    private UserDAO userDAO;
    private WorkoutDAO workoutDAO;
    private WorkoutSessionDAO workoutSessionDAO;

    private TrainingManager() {
        userDAO = new UserDAO();
        workoutDAO = new WorkoutDAO();
        workoutSessionDAO = new WorkoutSessionDAO();
    }

    public static TrainingManager getInstance() {
        if (instance == null) {
            instance = new TrainingManager();
        }
        return instance;
    }

    public void addUser(User user) {
        userDAO.addUser(user);
    }

    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    public void addWorkout(Workout workout) {
        workoutDAO.addWorkout(workout);
    }

    public List<Workout> getAllWorkouts() {
        return workoutDAO.getAllWorkouts();
    }

    public void logWorkoutSession(WorkoutSession session) {
        workoutSessionDAO.logWorkoutSession(session);
    }

    public List<WorkoutSession> getSessionsForUser(int userID) {
        return workoutSessionDAO.getSessionsForUser(userID);
    }
}