package Lab7.Ex1;

public class ChocAmor extends CandyBox{
    private float lenght;
    private final float baseLenght = 5;

    public ChocAmor(){
        super();
        this.lenght=baseLenght;
    }

    public ChocAmor(String flavour, String origin){
        super();
        this.flavour=flavour;
        this.origin = origin;
    }

    public float getVolume(){
        return (float)Math.pow(lenght, 2);
    }

    public String toString(){
        return super.toString() + " with the volume " + getVolume();
    }
}
