public class Position {
    private double x;
    private double y;

    Position() {
        x = 0;
        y = 0;
    }
    Position(double x, double y) {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getPosition() {
        return String.format("[%.2f, %.2f]", x, y);
    }
}
