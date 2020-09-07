package zoo.animalFactory;

import zoo.animals.Animal;
import zoo.animals.Bunny;

public class BunnyAnimalFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Bunny();
    }
}
