package car;

public class GearBox extends Component {
    private Clutch clutch;
    private final int numOfGears = 6;
    private int gear = 0;
    private final double[] gearRatios = {4.94, 5.44, 2.84, 1.72, 1.22, 1.0, 0.74};

    public GearBox(Clutch clutch, String model, int weight, int price) {
        super(model, weight, price);
        this.clutch = clutch;
    }

    public void gearUp() {
        gear = Math.min(gear + 1, numOfGears);
    }

    public void gearDown() {
        gear = Math.max(gear - 1, -1);
    }

    public void setGear(int gear) {
        this.gear = Math.min(Math.max(gear, -1), numOfGears);
    }

    public int getGear() {
        return gear;
    }

    public double getGearRatio() {
        return gearRatios[gear];
    }

    @Override
    public int getWeight() {
        return super.getWeight() + clutch.getWeight();
    }

    @Override
    public int getPrice() {
        return super.getPrice() + clutch.getPrice();
    }
}
