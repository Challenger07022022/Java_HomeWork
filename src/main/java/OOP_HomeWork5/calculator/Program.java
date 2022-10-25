package OOP_HomeWork5.calculator;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Model model = new Model();
        View view = new ViewImpl(scn, System.out);

        Presenter presenter = new Presenter(model, view);
        presenter.execute();

    }
}
