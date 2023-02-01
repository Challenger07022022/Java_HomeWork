package algorithms;

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
    private static void randomPriceDemo(){
        for (int i = 0; i < 10; i++) {
            int randomIndex = ThreadLocalRandom.current().nextInt(PRICES.length); // [0 PRICES.length);
            System.out.println(PRICES[randomIndex]);
        }
    }

    public static void main(String[] args) {
        randomPriceDemo();
    }
}
