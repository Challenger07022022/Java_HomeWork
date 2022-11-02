package exceptions_java_hw2;

import java.util.InputMismatchException;
import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.
public class Task1 {
    public static void main(String[] args) {
        System.out.println(returnFloatNumber());
    }

    private static float returnFloatNumber() {
        Scanner scn = new Scanner(System.in);
        float num;
        while (true) {
            try {
                System.out.print("Input a float number: ");
                num = scn.nextFloat();
                return num;
            } catch (InputMismatchException ex) {
                System.out.println("Incorrect string format!");
                scn.nextLine();
            }
        }
    }
}
