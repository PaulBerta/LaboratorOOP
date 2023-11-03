package Models;
public class CardioWorkout extends Workout {
    
    private double speed;
    private double distance;

    public CardioWorkout(int workoutID, String workoutName, double speed, double distance) {
        super(workoutID, workoutName, "cardio");
        this.speed = speed;
        this.distance = distance;
    }

    public CardioWorkout(int Id, String workoutName){
        super(0, workoutName, "cardio");
    }
    
    public Double getDistance() {
        return distance;
    }
    
    public Double getSpeed() {
        return speed;
    }
    
    public void setDistance(Double distance) {
        this.distance = distance;
    }
    
    public void setSpeed(Double speed) {
        this.speed = speed;
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + distance + " " + speed;
    }
}
