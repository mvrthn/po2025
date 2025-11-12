import car.Car;
import car.Clutch;
import car.Engine;
import car.GearBox;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("R4", 300, 20000);
        GearBox gearBox = new GearBox("6speed", 200, 12000);
        Clutch clutch = new Clutch("c01", 50, 3000);
        Car car = new Car(engine, gearBox, clutch, "Defender", "KR1234", 140);
        car.powerOn();
        car.powerOff();
    }
}
