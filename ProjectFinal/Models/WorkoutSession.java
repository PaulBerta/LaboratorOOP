package Models;


public class WorkoutSession {
    
    private int sessionID;
    private int userID;
    private int workoutID;
    private String date;
    private double duration;
    private double caloriesBurned;

    public WorkoutSession(int sessionID, int userID, int workoutID, double duration, double caloriesBurned,String date) {
        this.sessionID = sessionID;
        this.userID = userID;
        this.workoutID = workoutID;
        this.date = date;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
    }

    public WorkoutSession(double duration, double caloriesBurned, String date) {
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
        this.date = date;
    }

    public int getSessionID() {
        return sessionID;
    }

    public int getUserID() {
        return userID;
    }

    public int getWorkoutID() {
        return workoutID;
    }

    public String getDate() {
        return date;
    }

    public double getDuration() {
        return duration;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setSessionID(int sessionID) {
        this.sessionID = sessionID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setWorkoutID(int workoutID) {
        this.workoutID = workoutID;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setCaloriesBurned(double caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    @Override
    public String toString() {
        return sessionID + " " + userID + " " + workoutID + " " + date + " " + duration + " " + caloriesBurned;
    }
}
