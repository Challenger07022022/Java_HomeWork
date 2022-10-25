package OOP_HomeWork5.calculator;

public class Model {

    private int first;
    private int second;

    public String setOperator(String operator) {
        return operator;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getSum() {
        return this.first + this.second;
    }

    public int getDifference() {
        return this.first - this.second;
    }

    public int getMultiplication() {
        return this.first * this.second;
    }

    public int getDivision() {
        return this.first / this.second;
    }

    public static void main(String[] args) {
        Model model = new Model();

        model.setFirst(1);
        model.setSecond(1);
        if (model.getSum() != 2) {
            throw new AssertionError("Incorrect test result");
        }

        model.setFirst(1);
        model.setSecond(2);
        if (model.getSum() != 3) {
            throw new AssertionError("Incorrect test result");
        }

        model.setFirst(2);
        model.setSecond(3);
        if (model.getSum() != 5) {
            throw new AssertionError("Incorrect test result");
        }

        model.setFirst(5);
        model.setSecond(3);
        if (model.getDifference() != 2) {
            throw new AssertionError("Incorrect test result");
        }

        model.setFirst(5);
        model.setSecond(3);
        if (model.getMultiplication() != 15) {
            throw new AssertionError("Incorrect test result");
        }

        model.setFirst(6);
        model.setSecond(3);
        if (model.getDivision() != 2) {
            throw new AssertionError("Incorrect test result");
        }
    }
}
