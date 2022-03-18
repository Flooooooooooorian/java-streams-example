package stream.klassen;

import stream.enums.AnimalEnum;

public class AnimalPackage {

    private Animal animal;

    public AnimalPackage(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "AnimalPackage{" +
                "animal=" + animal +
                '}';
    }
}
