package animals;

public class SnakeFactory implements AnimalFactory {
    public Animal createAnimal() {
        return new Snake();
    }
}