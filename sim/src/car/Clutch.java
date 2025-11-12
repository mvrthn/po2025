package car;

public class Clutch extends Component {
    public enum ClutchState {
        released,
        depressed
    }

    private ClutchState state = ClutchState.released;

    public Clutch(String model, int weight, int price) {
        super(model, weight, price);
    }

    public void depress() {
        state = ClutchState.depressed;
    }

    public void release() {
        state = ClutchState.released;
    }

    public boolean isDepressed() {
        return state == ClutchState.depressed;
    }
}
