package OOP_HomeWork1;

public class TransmissionMechanical {

    private int grNumber;

    public void switchGear(int number) {
        this.grNumber = number;
        System.out.println("Переключение скорости на " + number + " передачу");
    }

    public Integer getGrNumber() {
        return grNumber;
    }
}
