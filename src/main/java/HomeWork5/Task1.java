package HomeWork5;
// 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
// что 1 человек может иметь несколько телефонов.

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        Map<String, List<String>> dir = new HashMap<>();
        List<String> phoneNumberList;
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        String lastName;
        String phoneNumber;
        while (i < 3) {
            System.out.print("Введите фамилию: ");
            lastName = scanner.nextLine();
            System.out.print("Введите номер телефона контакта " + "'" + lastName + "'" + ": ");
            phoneNumber = scanner.nextLine();
            i++;

            if (dir.containsKey(lastName)) {
                phoneNumberList = dir.get(lastName);
                phoneNumberList.add(phoneNumber);
            } else {
                phoneNumberList = new ArrayList<>();
                phoneNumberList.add(phoneNumber);
                dir.put(lastName, phoneNumberList);
            }
        }
        System.out.println(dir);
    }
}