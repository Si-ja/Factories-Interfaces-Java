package zoo.animals;

import java.util.Random;

public class Fox implements Animal {
    @Override
    public String sleep() {
        Random random = new Random();
        int hours = random.nextInt(6 + 4);
        return "The Fox sleeps for " + hours + " hours tonight.";
    }

    @Override
    public String eat(Animal animal) {
        if (!animal.getClass().getSimpleName().equalsIgnoreCase("bunny"))
        {
            return "The Fox cannot eat this animal.";
        } else {
            return "The Fox eats the Bunny.";
        }
    }

    @Override
    public String eat(String food) {
        return "The Fox tries to eat " + food;
    }

    @Override
    public String play() {
        String[] toys = {"Ball", "Plushy", "Stick"};
        Random random = new Random();
        String toy = toys[random.nextInt(2)];
        return "The Fox plays with a " + toy;
    }
}
