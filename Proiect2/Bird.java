package Proiect2;

public class Bird extends Animal {
    private boolean canFly;

    public Bird() {
        super();
        this.canFly = false;
    }

    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    public boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public String makeSound() {
        return "Chirp";
    }

    @Override
    public String toString() {
        
        StringBuffer sb = new StringBuffer();
        sb.append("The bird named ").append(getName()).append(" can ");
        if(getCanFly()) {
            sb.append("fly and it chirps.");
        } else {
            sb.append("not fly but it chirps.");
        }
        return sb.toString();
    }
}

