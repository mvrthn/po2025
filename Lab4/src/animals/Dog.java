package animals;

public class Dog extends Animal {
    public Dog() {
        super("Dog", 4);
    }

    public String getDescription() {
        return "This is Dog";
    }

    public void makeSound() {
        System.out.println("Woof");
    }
}