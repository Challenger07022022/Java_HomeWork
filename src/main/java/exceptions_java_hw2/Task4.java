package exceptions_java_hw2;

import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Task4 {
    public static void main(String[] args) {
        System.out.println(returnString());
    }

    private static String returnString(){
        Scanner scn = new Scanner(System.in);
        while (true) {
            try {
                String str;
                System.out.print("Input a string: ");
                str = scn.nextLine();
                if (str.isEmpty())
                    throw new RuntimeException();
                return str;
            } catch (RuntimeException ex) {
                System.out.println("You cannot enter an empty string!");
            }
        }
    }
}
