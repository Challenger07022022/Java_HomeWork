package OOP_HomeWork2;

public class Wipers implements Checkable {
    private boolean wipersIncluded;

    public void on() {
        if (!this.wipersIncluded) {
            this.wipersIncluded = true;
            System.out.println("Дворники включены!");
        }
    }

    public void off() {
        if (this.wipersIncluded) {
            this.wipersIncluded = false;
            System.out.println("Дворники выключены!");
        }
    }

    @Override
    public void check() {
        System.out.println("Все хорошо с дворниками");
    }
}
