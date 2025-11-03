package zadania;

import java.util.Random;
import animals.*;

public class Zoo {
    private static int N = 100;
    private static int M = 3; // number of animal types

    private Animal[] animals = new Animal[N];

    public Zoo() {
        Random random = new Random();
        AnimalFactory[] factories = new AnimalFactory[M];
        factories[0] = new ParrotFactory();
        factories[1] = new DogFactory();
        factories[2] = new SnakeFactory();

        for(int i = 0; i < N; i++) {
            animals[i] = factories[random.nextInt(M)].createAnimal();
        } 
    }

    public int countLegs() {
        int sum = 0;
        for(Animal animal : animals) {
            sum += animal.getLegs();
            animal.makeSound();
        }
        return sum;
    }
}