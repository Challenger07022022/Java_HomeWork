package OOP_HomeWork2;

public class Steering implements Checkable {

    private int grade;

    public void turnLeft(int grade) {
        this.grade = grade;
        System.out.println("Повернули налево на " + grade + " градусов");
    }

    public void turnRight(int grade) {
        this.grade = grade;
        System.out.println("Повернули направо на " + grade + " градусов");
    }

    public void goingStraight() {
        this.grade = 0;
        System.out.println("Едем прямо!");
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public void check() {
        System.out.println("Все хорошо рулевым управлением");
    }
}
