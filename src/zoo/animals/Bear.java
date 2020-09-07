package zoo.animals;

public class Bear implements Animal {
    @Override
    public String sleep() {
        return "The Bear sleeps for 22 hours.";
    }

    @Override
    public String eat(Animal animal) {
        return "The Bear does not want to eat this animal.";
    }

    @Override
    public String eat(String food) {
        if (!food.equalsIgnoreCase("honey") || !food.equalsIgnoreCase("berries")) {
            return "The Bear does not want " + food + ". Better offer the Bear honey or berries!";
        } else {
            return "The Bear loves " + food + "!";
        }
    }

    @Override
    public String play() {
        return "The Bear just wants to sleep!";
    }
}
