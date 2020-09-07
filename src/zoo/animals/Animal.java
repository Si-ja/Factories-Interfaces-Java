package zoo.animals;

public interface Animal {
    public String sleep();
    public String eat(Animal animal);
    public String eat(String food);
    public String play();
}
