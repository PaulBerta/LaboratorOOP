package Models;
public abstract class Workout {

    private int workoutID;
    private String workoutName;
    private String type;

    public Workout(int workoutID, String workoutName, String type) {
        this.workoutID = workoutID;
        this.workoutName = workoutName;
        this.type = type;
    }

    public String getWorkoutName() {
        return workoutName;
    }

    public int getWorkoutID() {
        return workoutID;
    }

    public String getType() {
        return type;
    }

    public void setWorkoutName(String workoutName) {
        this.workoutName = workoutName;
    }

    public void setWorkoutID(int workoutID) {
        this.workoutID = workoutID;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return workoutID + " " + workoutName + " " + type;
    }
}
