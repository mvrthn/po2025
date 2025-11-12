package car;

public class Engine extends Component {
    private final int maxRpm = 5000;
    private final int idleRmp = 1000;
    private int rpm = 0;

    public Engine(String model, int weight, int price) {
        super(model, weight, price);
    }

    public void start() {
        rpm = idleRmp;
    }

    public void stop() {
        rpm = 0;
    }

    public void rpmUp(int d) {
        rpm = Math.min(rpm + d, maxRpm);
    }

    public void rpmDown(int d) {
        rpm = Math.max(rpm - d, idleRmp);
    }
}
