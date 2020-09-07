package zoo.animals;

public class Bunny implements Animal{
    @Override
    public String sleep() {
        return "The Bunny sleeps tonight for 4 hours.";
    }

    @Override
    public String eat(Animal animal) {
        return "The Bunny does not eat animals!";
    }

    @Override
    public String eat(String food) {
        return "The Bunny loves " + food + "!";
    }

    @Override
    public String play() {
        return "The Bunny plays by running arround.";
    }
}
