package animals;

public class Parrot extends Animal {
    public Parrot() {
        super("Parrot", 2);
    }

    public String getDescription() {
        return "This is Parrot";
    }

    public void makeSound() {
        System.out.println("Hello");
    }
}