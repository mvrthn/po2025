public class Clutch extends Component {
    public enum ClutchState {
        released,
        depressed
    }

    private ClutchState state = ClutchState.released;

    Clutch(String producer, String model) {
        super(producer, model);
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
