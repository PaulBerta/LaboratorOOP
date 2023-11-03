package Models;
public class StrengthWorkout extends Workout {
    
    private double weightLifted;
    private int repetitions;

    public StrengthWorkout(int workoutID, String workoutName, double weightLifted, int repetitions) {
        super(workoutID, workoutName, "strength");
        this.weightLifted = weightLifted;
        this.repetitions = repetitions;
    }

    public StrengthWorkout(int Id, String workoutName){
        super(0, workoutName, "strength");
    }


    @Override
    public String toString() {
        return super.toString() + " " + weightLifted + " " + repetitions;
    }

}
