package animals;

public abstract class Animal {
    private final String name;
    private final int legs;

    public Animal(final String name, final int legs) {
        this.name = name;
        this.legs = legs;
    }

    public abstract String getDescription();

    public String getName() {
        return name;
    }
    public int getLegs() {
        return legs;
    }

    public void makeSound() {
        System.out.println("Making sound...");
    }
}