package Proiect2;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals;
    private final String name = "Paul's Zoo";
    private final int capacity = 3;
    public static int animalCount = 0;

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }
}

