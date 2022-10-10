package OOP_HomeWork1;

public class Wipers {
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
}
