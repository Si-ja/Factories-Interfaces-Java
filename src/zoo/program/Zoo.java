package zoo.program;

import zoo.animalFactory.*;
import zoo.animals.Animal;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<Animal> animal_list = new ArrayList<Animal>();
        String[] animal_names = {"Fox", "Bunny"};
        for (short i = 0; i < animal_names.length; i++) {
            AnimalFactory animalFactory = createAnimalBySpecies(animal_names[i]);
            animal_list.add(animalFactory.createAnimal());
        }

        System.out.println(animal_list.get(0).sleep());
        System.out.println(animal_list.get(1).sleep());
        System.out.println("-----------------------------------------");

        System.out.println(animal_list.get(0).play());
        System.out.println(animal_list.get(1).play());
        System.out.println("-----------------------------------------");

        System.out.println(animal_list.get(0).eat(animal_list.get(1)));
        System.out.println(animal_list.get(1).eat("Berries"));
        System.out.println("-----------------------------------------");
    }

    static AnimalFactory createAnimalBySpecies(String animal) {
        if (animal.equalsIgnoreCase("fox")) {
            return new FoxAnimalFactory();
        } else if (animal.equalsIgnoreCase("bear")) {
            return new BearAnimalFactory();
        } else if (animal.equalsIgnoreCase("bunny")) {
            return new BunnyAnimalFactory();
        } else if (animal.equalsIgnoreCase("shark")) {
            return new SharkAnimalFactory();
        } else {
            throw new RuntimeException(animal + " is unknown to this program.");
        }
    }
}
