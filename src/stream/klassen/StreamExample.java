package stream.klassen;

import stream.enums.AnimalEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Crab());
        animals.add(new Fish());
        animals.add(new Crab());
        animals.add(new Crab());
        animals.add(new JellyFish());
        animals.add(new JellyFish());
        animals.add(new Fish());
        animals.add(new JellyFish());
        animals.add(new Fish());
        animals.add(new Crab());
        animals.add(new Crab());
        animals.add(new Fish());
        animals.add(new Crab());
        animals.add(new JellyFish());
        animals.add(new JellyFish());
        animals.add(new Fish());
        animals.add(new JellyFish());
        animals.add(new Fish());


        animals.stream().forEach(animal -> System.out.println(animal));

        System.out.println();

        animals.stream()
                .filter(animal -> animal.getName().equals("Fish"))
                .forEach(animal -> System.out.println(animal));

        System.out.println();

        animals.stream()
                .filter(animal -> animal.getName().equals("Fish"))
                .map(animal -> new AnimalPackage(animal))
                .forEach(animalPack -> System.out.println(animalPack));

        System.out.println();

        List<AnimalPackage> animalPackages = animals.stream()
                .filter(animal -> animal.getName().equals("Fish"))
                .map(animal -> new AnimalPackage(animal))
                .collect(Collectors.toList());


        animalPackages.forEach(animalPackage -> System.out.println(animalPackage));

    }
}
