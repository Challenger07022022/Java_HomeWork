package OOP_HomeWork1;

public class Steering {

    private int grade;

    public void turnLeft(int grade){
        this.grade = grade;
        System.out.println("Повернули налево на " + grade + " градусов");
    }
    public void turnRight(int grade){
        this.grade = grade;
        System.out.println("Повернули направо на " + grade + " градусов");
    }
    public void goingStraight(){
        this.grade = 0;
        System.out.println("Едем прямо!");
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
