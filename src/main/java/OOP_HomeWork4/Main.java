package OOP_HomeWork4;

// a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
// b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта,
//      поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
// c. Для хранения фруктов внутри коробки можете использовать ArrayList;
// d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов
//      и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
// e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той,
//      которую подадут в compare в качестве параметра, true - если их веса равны, false в противном
//      случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
// f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую
//      коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами),
//      соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты,
//      которые были в этой коробке;
// g. Не забываем про метод добавления фрукта в коробку.

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Вес коробки №1 с яблоками: " + appleBox1.getWeight());
        System.out.println("Вес коробки апельсинов: " + orangeBox.getWeight());

        if (appleBox1.compare(orangeBox))
            System.out.println("Вес коробок одинаковый!");
        else System.out.println("Вес коробок разный!");

        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());
        System.out.println("Вес коробки №2 с яблоками: " + appleBox2.getWeight());
        System.out.println("Перекладываем яблоки из коробки №1 в коробку №2");
        appleBox1.pourOver(appleBox2);
        System.out.println("Вес коробки №1 с яблоками: " + appleBox1.getWeight());
        System.out.println("Вес коробки №2 с яблоками: " + appleBox2.getWeight());
    }
}
