public class Engine extends Component {
    private final int maxRpm = 5000;
    private final int idleRmp = 1000;
    private int rpm = 0;

    Engine(String producer, String model) {
        super(producer, model);
    }

    public void start() {
        rpm = idleRmp;
    }

    public void stop() {
        rpm = 0;
    }
}
