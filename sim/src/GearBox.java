public class GearBox extends Component {
    private final int numOfGears = 6;
    private int gear = 0;

    GearBox(String producer, String model) {
        super(producer, model);
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
}
