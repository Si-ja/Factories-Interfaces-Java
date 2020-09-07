package zoo.animalFactory;

import zoo.animals.Animal;
import zoo.animals.Bear;

public class BearAnimalFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Bear();
    }
}
