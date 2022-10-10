package OOP_HomeWork1;

public class Window {

    private boolean openWindow;

    public void open() {
        if (!this.openWindow) {
            this.openWindow = true;
            System.out.println("Дверь открыта!");
        }
    }

    public void closed() {
        if (this.openWindow) {
            this.openWindow = false;
            System.out.println("Дверь закрыта!");
        }
    }
}
