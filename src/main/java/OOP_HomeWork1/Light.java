package OOP_HomeWork1;

public class Light {

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
}
