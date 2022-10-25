package OOP_HomeWork5.calculator;

import java.util.Objects;

public class Presenter {

    private final Model model;
    private final View view;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void execute() {
        this.model.setFirst(this.view.getValue("Введите первое число: "));
        String operator = this.model.setOperator(this.view.getOperator("Введите оператор (+, -, *, /): "));
        this.model.setSecond(this.view.getValue("Введите второе число: "));

        if (Objects.equals(operator, "+"))
            this.view.print("Сумма чисел равна: " + this.model.getSum());
        else if (Objects.equals(operator, "-"))
            this.view.print("Разность чисел равна: " + this.model.getDifference());
        else if (Objects.equals(operator, "*"))
            this.view.print("Произведение чисел равно: " + this.model.getMultiplication());
        else if (Objects.equals(operator, "/"))
            this.view.print("Деления первого числа на второе равно: " + this.model.getDivision());
        else this.view.print("Введенный оператор некорректный!");

    }


    private static class MockView implements View {
        private int count1;
        private int count2;

        @Override
        public int getValue(String message) {
            count1++;
            return 1;
        }

        @Override
        public String getOperator(String message) {
            count2++;
            return null;
        }

        @Override
        public void print(String message) {
            if (message.equals("")) {
                throw new AssertionError("Incorrect message");
            }
        }

        public int getCount1() {
            return count1;
        }

        public int getCount2() {
            return count2;
        }

    }

    public static void main(String[] args) {
        Model model = new Model();
        MockView mockView = new MockView();
        Presenter presenter = new Presenter(model, mockView);

        presenter.execute();
        if (mockView.getCount1() != 2) {
            throw new AssertionError("Incorrect call of getValue()");
        }
        if (mockView.getCount2() != 1) {
            throw new AssertionError("Incorrect call of getOperator()");
        }
    }

}
