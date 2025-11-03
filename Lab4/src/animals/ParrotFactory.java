package animals;

public class ParrotFactory implements AnimalFactory {
    public Animal createAnimal() {
        return new Parrot();
    }
}