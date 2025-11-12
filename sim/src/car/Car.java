package car;

public class Car {
    private Engine engine;
    private GearBox gearBox;
    private Clutch clutch;
    private final String model;
    private String regNumber;
    private int vMax;
    private Position position;
    private int velocity;

    public Car(Engine engine, GearBox gearBox, Clutch clutch, String model, String regNumber, int vMax) {
        this.engine = engine;
        this.gearBox = gearBox;
        this.clutch = clutch;
        this.model = model;
        this.regNumber = regNumber;
        this.vMax = vMax;
        position = new Position();
    }

    public void powerOn() {
        setNeutralGear();
        engine.start();
    }

    public void powerOff() {
        engine.stop();
        setNeutralGear();
    }

    public void goTo(Position target) {

    }

    public int getWeight() {
        return engine.getWeight() + gearBox.getWeight() + clutch.getWeight();
    }

    public int getPrice() {
        return engine.getPrice() + gearBox.getPrice() + clutch.getPrice();
    }

    public final Position getPosition() {
        return position;
    }

    public final int getVelocity() {
        return velocity;
    }

    private void setNeutralGear() {
        if(gearBox.getGear() == 0) {
            return;
        }
        clutch.depress();
        gearBox.setGear(0);
        clutch.release();
    }
}
