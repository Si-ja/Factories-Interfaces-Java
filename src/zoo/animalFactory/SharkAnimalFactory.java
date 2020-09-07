package zoo.animalFactory;

import zoo.animals.Animal;
import zoo.animals.Shark;

public class SharkAnimalFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Shark();
    }
}
