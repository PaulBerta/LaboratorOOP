package Lab7.Ex1;

public class CandyBox {

    protected String flavour;
    protected String origin;
    private final String defaultFlavour = "Vanilla";
    private final String defaultOrigin = "Germany";

    public CandyBox(){
        this.flavour= defaultFlavour;
        this.origin = defaultOrigin;
    }

    public CandyBox(String flavour, String origin){
        this.flavour = flavour;
        this.origin = origin;
    }

    public float getVolume(){
        return 0;
    }

    public String toString(){
        return this.flavour + " from " + this.origin;
    }

    public boolean equals(CandyBox candyBox){
        boolean sameFlavour = this.flavour == candyBox.flavour;
        boolean sameOrigin = this.origin == candyBox.origin;
        return sameFlavour && sameOrigin;
    }
}
