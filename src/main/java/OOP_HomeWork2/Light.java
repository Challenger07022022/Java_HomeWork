package OOP_HomeWork2;

public class Light implements Checkable {

    private boolean headLight;

    public void on() {
        if (!this.headLight) {
            this.headLight = true;
            System.out.println("Головной свет фар включен!");
        }
    }

    public void off() {
        if (this.headLight) {
            this.headLight = false;
            System.out.println("Головной свет фар выключен!");
        }
    }

    @Override
    public void check() {
        System.out.println("Все хорошо с головным светом");
    }
}
