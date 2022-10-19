package OOP_HomeWork2;

public class Conditioner implements Checkable{
    private boolean turnedConditioner;

    public void on() {
        if (!this.turnedConditioner) {
            System.out.println("Кондиционер включен!");
            this.turnedConditioner = true;
        }
    }

    public void off() {
        if (this.turnedConditioner) {
            System.out.println("Кондиционер выключен!");
            this.turnedConditioner = false;
        }
    }

    @Override
    public void check() {
        System.out.println("Все хорошо с кондиционером");
    }
}
