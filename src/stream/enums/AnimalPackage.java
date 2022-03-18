package stream.enums;

public class AnimalPackage {

    private AnimalEnum animal;

    public AnimalPackage(AnimalEnum animal) {
        this.animal = animal;
    }

    public AnimalEnum getAnimal() {
        return animal;
    }

    public void setAnimal(AnimalEnum animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "stream.enums.AnimalPack{" +
                "animal=" + animal +
                '}';
    }
}
