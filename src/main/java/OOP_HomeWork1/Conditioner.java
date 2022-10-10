package OOP_HomeWork1;

public class Conditioner {
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
}
