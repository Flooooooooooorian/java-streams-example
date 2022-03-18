package stream.enums;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        List<AnimalEnum> animals = new ArrayList<>();
        animals.add(AnimalEnum.CRAB);
        animals.add(AnimalEnum.FISH);
        animals.add(AnimalEnum.CRAB);
        animals.add(AnimalEnum.CRAB);
        animals.add(AnimalEnum.JELLYFISH);
        animals.add(AnimalEnum.JELLYFISH);
        animals.add(AnimalEnum.FISH);
        animals.add(AnimalEnum.JELLYFISH);
        animals.add(AnimalEnum.FISH);
        animals.add(AnimalEnum.CRAB);
        animals.add(AnimalEnum.CRAB);
        animals.add(AnimalEnum.FISH);
        animals.add(AnimalEnum.CRAB);
        animals.add(AnimalEnum.JELLYFISH);
        animals.add(AnimalEnum.JELLYFISH);
        animals.add(AnimalEnum.FISH);
        animals.add(AnimalEnum.JELLYFISH);
        animals.add(AnimalEnum.FISH);


        animals.stream().forEach(animalEnum -> System.out.println(animalEnum));

        System.out.println();

        animals.stream()
                .filter(animalEnum -> animalEnum == AnimalEnum.FISH)
                .forEach(animalEnum -> System.out.println(animalEnum));

        System.out.println();

        animals.stream()
                .filter(animalEnum -> animalEnum == AnimalEnum.FISH)
                .map(animalEnum -> new AnimalPackage(animalEnum))
                .forEach(animalPack -> System.out.println(animalPack));

        System.out.println();

        List<AnimalPackage> animalPackages = animals.stream()
                .filter(animalEnum -> animalEnum == AnimalEnum.FISH)
                .map(animalEnum -> new AnimalPackage(animalEnum))
                .collect(Collectors.toList());


        animalPackages.forEach(animalPackage -> System.out.println(animalPackage));

    }
}
