package OOP_HomeWork2;

import java.util.List;

public class Base {
    private Engine engine;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Wheel wheel4;
    private Transmission transmission;
    private List<Checkable> checkables;

    public Base() {
        this.engine = new DieselEngine();
        this.wheel1 = new Wheel();
        this.wheel2 = new Wheel();
        this.wheel3 = new Wheel();
        this.wheel4 = new Wheel();
        this.transmission = new AutomaticTransmission();
        this.checkables = List.of(engine, wheel1, wheel2, wheel3, wheel4, transmission);
    }

    public void start() {
        engine.start();
    }

    public void drive() {
        if (engine.getWork()) {
            transmission.switchGear(1);
            wheel1.rotate();
            wheel2.rotate();
            wheel3.rotate();
            wheel4.rotate();
        }
    }

    public void stop() {
        engine.stop();
    }

    public void checkAll() {
        for (Checkable checkable : checkables) {
            checkable.check();
        }
    }
}
