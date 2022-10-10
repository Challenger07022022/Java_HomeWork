package OOP_HomeWork1;

public class Base {
    private Engine engine;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Wheel wheel4;
    private TransmissionMechanical transmission;

    public Base() {
        this.engine = new Engine();
        this.wheel1 = new Wheel();
        this.wheel2 = new Wheel();
        this.wheel3 = new Wheel();
        this.wheel4 = new Wheel();
        this.transmission = new TransmissionMechanical();
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
    public void stop(){
        engine.stop();
    }

}
