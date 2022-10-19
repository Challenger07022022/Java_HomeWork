package OOP_HomeWork2;

public class Window implements Checkable {

    private boolean openWindow;

    public void open() {
        if (!this.openWindow) {
            this.openWindow = true;
            System.out.println("Окно открыто!");
        }
    }

    public void closed() {
        if (this.openWindow) {
            this.openWindow = false;
            System.out.println("Окно закрыто!");
        }
    }

    @Override
    public void check() {
        System.out.println("Все хорошо с окном");
    }
}
