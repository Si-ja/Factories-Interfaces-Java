package zoo.animals;

public class Shark implements Animal {
    @Override
    public String sleep() {
        return "The Shark does not need no sleep!";
    }

    @Override
    public String eat(Animal animal) {
        return "The Shark eats the " + animal.getClass().getSimpleName() + ". Yummy!";
    }

    @Override
    public String eat(String food) {
        return "The Shark doesn't want none of " + food + ".";
    }

    @Override
    public String play() {
        return "The Shark doesn't play with its own food!";
    }
}
