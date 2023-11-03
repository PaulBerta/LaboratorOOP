package Proiect2;

public class Animal {
    private String name;

    public Animal() {
        this.name = "Unknown";
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String makeSound() {
        return "Generic animal sound";
    }

    @Override
    public String toString() {
        return "The animal named " + getName() + " makes a " + makeSound() + " sound.";
    }
}
