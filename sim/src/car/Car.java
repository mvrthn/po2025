package car;

public class Car {
    private Engine engine;
    private GearBox gearBox;
    private final String model;
    private String regNumber;
    private int vMax;
    private Position position;
    private int velocity;

    public Car(Engine engine, GearBox gearBox, String model, String regNumber, int vMax) {
        this.engine = engine;
        this.gearBox = gearBox;
        this.model = model;
        this.regNumber = regNumber;
        this.vMax = vMax;
        position = new Position();
    }

    public void powerOn() {
        gearBox.setGear(0);
        engine.start();
    }

    public void powerOff() {
        engine.stop();
        gearBox.setGear(0);
    }

    public void goTo(Position target) {

    }

    public int getWeight() {
        return engine.getWeight() + gearBox.getWeight();
    }

    public int getPrice() {
        return engine.getPrice() + gearBox.getPrice();
    }

    public final Position getPosition() {
        return position;
    }

    public final int getVelocity() {
        return velocity;
    }
}
