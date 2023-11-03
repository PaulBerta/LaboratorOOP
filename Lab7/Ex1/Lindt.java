package Lab7.Ex1;

public class Lindt extends CandyBox{
    private float lenght;
    private float width;
    private float height;

    private final float baseLenght =10;
    private final float baseWidth = 3;
    private final float baseHeight =3;


    public Lindt(){
        super();
        this.height = baseHeight;
        this.width = baseWidth;
        this.height = baseHeight;
    }

    public Lindt(String flavour, String origin, float lenght, float width, float height){
        super(flavour,origin);
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }

    public float getVolume(){
        return lenght*width*height;
    }

    public String toString(){
        return super.toString() + " with the volume " + getVolume();
    }
}
