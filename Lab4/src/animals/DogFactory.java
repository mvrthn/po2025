package animals;

public class DogFactory implements AnimalFactory {
    public Animal createAnimal() {
        return new Dog();
    }
}