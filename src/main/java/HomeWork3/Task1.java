package HomeWork3;

//1. Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rd.nextInt(10));
        }
        System.out.println(list);
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) list.remove(i);
            else i++;
        }
        System.out.println(list);
    }
}
