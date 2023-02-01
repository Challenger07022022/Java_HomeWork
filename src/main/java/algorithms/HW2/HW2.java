package algorithms.HW2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class HW2 {
    /*
    Класс Notebook содержит поля:

Стоимость - price, double [100, 200, 300, 400, 500, 600, 700, 800]
Оперативная память - ram, integer [4, 8, 16, 20, 24, 28, 32]
Производитель - brand, enum Перечисление Brand может принимать следующие значения: Lenuvo, Asos, MacNote, Eser, Xamiou.
Сортировать нужно в этом же порядке (т.е. Lenuvo имеет наивысший приоритет).
Отсортировать по стоимости, по памяти, по перечислению (в таком порядке)
     */

    public static final int[] PRICES = new int[]{100, 200, 300, 400, 500, 600, 700, 800};
    public static final int[] RAMS = new int[]{4, 8, 16, 20, 24, 28, 32};

    public static void main(String[] args) {
        List<Notebook> notebooks = new ArrayList<>();
        for (int i = 0; i < 10_000; i++) {
            notebooks.add(new Notebook(
                    PRICES[ThreadLocalRandom.current().nextInt(PRICES.length)],
                    RAMS[ThreadLocalRandom.current().nextInt(RAMS.length)],
                    Brand.values()[ThreadLocalRandom.current().nextInt(Brand.values().length)]));
        }


        //printList(notebooks);
        notebooks.sort(Comparator.comparing(Notebook::getPRICE).thenComparing(Notebook::getRAM).thenComparing(Notebook::getBRAND));
        printList(notebooks);
    }

    static public void printList(List<Notebook> list) {
        for (Notebook notebook : list) {
            System.out.println(notebook);
        }
    }
}
