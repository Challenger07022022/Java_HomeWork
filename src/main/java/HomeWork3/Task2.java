package HomeWork3;

//2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 5; i++) {
            list.add(rd.nextInt(10));
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        double average = 1.0 * sum / list.size();
        System.out.println("Список: " + list);
        System.out.println("Минимальное: " + Collections.min(list));
        System.out.println("Максимальное: " + Collections.max(list));
        System.out.printf("Среднее: %.2f", average);
    }
}
