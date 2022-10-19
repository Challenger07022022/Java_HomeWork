package OOP_HomeWork2;

public abstract class Transmission implements Checkable, GearSwitchable {

    private int grNumber;

    public void switchGear(int number) {
        this.grNumber = number;
        System.out.println("Переключение скорости на " + number + " передачу");
    }

    public Integer getGrNumber() {
        return grNumber;
    }

    @Override
    public void check() {
        System.out.println("Все хорошо с трансмиссией");
    }
}

