package Proiect2;

public class Reptilian extends Animal {
    private boolean isVenomous;

    public Reptilian() {
        super();
        this.isVenomous = false;
    }

    public Reptilian(String name, boolean isVenomous) {
        super(name);
        this.isVenomous = isVenomous;
    }

    public boolean getIsVenomous() {
        return isVenomous;
    }

    public void setIsVenomous(boolean isVenomous) {
        this.isVenomous = isVenomous;
    }

    @Override
    public String makeSound() {
        return "Hiss";
    }

    @Override
    public String toString() {
        
        StringBuffer sb = new StringBuffer();
        sb.append("The reptilian named ").append(getName()).append(" is ");
        if(getIsVenomous()) {
            sb.append("venomous.");
        } else {
            sb.append("not venomous.");
        }
        return sb.toString();
    }   
}

