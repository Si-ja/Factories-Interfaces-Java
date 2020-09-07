package zoo.animalFactory;

import zoo.animals.Animal;
import zoo.animals.Fox;

public class FoxAnimalFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Fox();
    }
}
