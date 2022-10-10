package OOP_HomeWork1;
// 1. Основываясь на примере с урока продолжить развивать систему классов, описывающих структуру
// и функционирование легкового автомобиля. Добавить сам класс автомобиля, который будет включать
// созданную нами базу. Помимо базы добавить такие компоненты, как двери, кондиционер, рулевое управление и др.
// Наладить их взаимодействие.

public class Car {

    public Base base;
    public Conditioner conditioner;
    public Door doorLeftFront;
    public Door doorRightFront;
    public Door doorLeftRear;
    public Door doorRightRear;
    public Light light;
    public Steering steering;
    public Window window;
    public Wipers wipers;
    public TransmissionMechanical transmissionMechanical;

    public Car() {
        this.base = new Base();
        this.conditioner = new Conditioner();
        this.doorLeftFront = new Door();
        this.doorRightFront = new Door();
        this.doorLeftRear = new Door();
        this.doorRightRear = new Door();
        this.light = new Light();
        this.steering = new Steering();
        this.window = new Window();
        this.wipers = new Wipers();
        this.transmissionMechanical = new TransmissionMechanical();
    }

    public void start() {
        this.base.start();
        this.light.on();
        this.conditioner.on();
    }

    public void drive() {
        this.doorLeftFront.closed(1);
        this.doorRightFront.closed(2);
        this.doorLeftRear.closed(3);
        this.doorRightRear.closed(4);

        this.doorLeftFront.blocked(1);
        this.doorRightFront.blocked(2);
        this.doorLeftRear.blocked(3);
        this.doorRightRear.blocked(4);

        this.steering.goingStraight();
        this.base.drive();
    }

    public void stop() {
        this.base.stop();
        this.conditioner.off();
        this.light.off();
        this.doorLeftFront.unblocked(1);
        this.doorRightFront.unblocked(2);
        this.doorLeftRear.unblocked(3);
        this.doorRightRear.unblocked(4);
    }

    public void turnLeft(int grade) {
        this.steering.turnLeft(grade);
    }

    public void turnRight(int grade) {
        this.steering.turnRight(grade);
    }

    public void goingStraight() {
        this.steering.goingStraight();
    }
    public void switchGear(int number){
        this.transmissionMechanical.switchGear(number);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.drive();
        car.switchGear(2);
        car.turnLeft(30);
        car.goingStraight();
        car.turnRight(20);
        car.goingStraight();
        car.switchGear(0);
        car.stop();
    }
}
