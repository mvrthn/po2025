package car;

public abstract class Component {
    private final String model;
    private final int weight;
    private final int price;

    Component(String model, int weight, int price) {
        this.model = model;
        this.weight = weight;
        this.price = price;
    }

    public String getModel() {
        return model;
    }
    public int getWeight() {
        return weight;
    }
    public int getPrice() {
        return price;
    }
}
