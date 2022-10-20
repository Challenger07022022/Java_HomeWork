package OOP_HomeWork3.Task1;

// 1. Написать итератор, который будет выдавать N случайных целых чисел

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        Randomiser randomiser = new Randomiser(10, 10);
        List<Randomiser> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(randomiser);
        }
        for (Integer integer : randomiser) {
            System.out.print(integer + " ");
        }
    }
}
