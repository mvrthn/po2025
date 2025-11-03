package animals;

public class Snake extends Animal {
    Snake() {
        super("Snake", 0);
    }

    public String getDescription() {
        return "This is Snake";
    }

    public void makeSound() {
        System.out.println("Ssss");
    }
}