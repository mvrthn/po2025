package car;

public class Position {
    private double x;
    private double y;

    Position() {
        x = 0;
        y = 0;
    }
    Position(double x, double y) {
        this.x = x;
        this.y = y;
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

    public void moveToward(Position target, double velocity, double dt) {
       if(distance(target) <= velocity * dt) {
            x = target.x;
            y = target.y;
            return;
        }
        double angle = Math.atan2(target.y - y, target.x - x);
        x = Math.cos(angle) * velocity * dt;
        y = Math.sin(angle) * velocity * dt;
    }

    private double distance(Position target) {
        return Math.sqrt(Math.pow(target.x - x, 2) + Math.pow(target.y - y, 2));
    }
}
