package Lab3;

public class Floare extends Planta {

    private String parfum;

    public Floare(String nume, String culoare, String parfum) {
        super(nume, culoare);
        this.parfum = parfum;
    }

    public String toString() {
        return super.toString() + " " + this.parfum;
    }
    
}
