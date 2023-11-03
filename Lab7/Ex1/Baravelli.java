package Lab7.Ex1;

public class Baravelli extends CandyBox{
    private float radius;
    private float height;
    private final float baseRadius = 5;
    private final float baseHeight = 10;

    public Baravelli(){
        super();
        this.radius = baseRadius;
        this.height = baseHeight;
    }

    public Baravelli(String flavour, String origin, float radius, float height){
        super(flavour,origin);
        this.radius = radius;
        this.height = height;
    }

    public float getVolume(){
        double volume = Math.PI * Math.pow(radius,2)*height;
        return (float)volume;
    }

    public String toString(){
        return super.toString() + " with the volume " + getVolume();
    }

}
