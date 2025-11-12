public class Car {
    private Engine engine;
    private GearBox gearBox;
    private Clutch clutch;

    Car(String engineProducer, String engineModel, String gearboxProducer, String gearboxModel,
        String clutchProducer, String clutchModel) {
        engine = new Engine(engineProducer, engineModel);
        gearBox = new GearBox(gearboxProducer, gearboxModel);
        clutch = new Clutch(clutchProducer, clutchModel);
    }


    public void powerOn() {
        setNeutralGear();
        engine.start();
    }

    public void powerOff() {
        engine.stop();
        setNeutralGear();
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
