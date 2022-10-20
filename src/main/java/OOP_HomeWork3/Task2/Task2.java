package OOP_HomeWork3.Task2;

// 2. Для класса Person, рассмотренного на уроке написать минимум три реализации интерфейса Comparable,
// которые будут сортровать набор экземпляров класса Person по разным наборам полей

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Пушкин", 60, 170, 80));
        persons.add(new Person("Лермонтов", 35, 175, 83));
        persons.add(new Person("Достоевский", 55, 160, 100));
        persons.add(new Person("Зюганов", 60, 170, 60));
        persons.add(new Person("Жириновский", 40, 170, 75));
        persons.add(new Person("Филатов", 60, 50, 20));
        persons.add(new Person("Петров", 20, 200, 100));
        persons.add(new Person("Сидоров", 60, 170, 150));
        persons.add(new Person("Свиридов", 20, 170, 150));

        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println();
        System.out.println(">>>>> Sort:");
        Collections.sort(persons);
        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println();
        System.out.println(">>>>> Sort by Height-Weight:");
        persons.sort(new ComparatorPersonByHeightWeight());
        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println();
        System.out.println(">>>>> Sort by Age-Name:");
        persons.sort(new ComparatorPersonByAgeName());
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
