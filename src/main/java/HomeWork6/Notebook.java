package HomeWork6;

import java.util.*;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
// отвечающие фильтру. Критерии фильтрации можно хранить в Map.
// Например:
// “Введите цифру, соответствующую необходимому критерию:
//1 - ОЗУ
//2 - Объем ЖД
//3 - Операционная система
//4 - Цвет …
//Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
public class Notebook {
    private int id;
    private int RAM;
    private int SSD;
    private double diagonalScreen;
    private String os;
    private String color;

    public Notebook(int id, int RAM, int SSD, double diagonalScreen, String os, String color) {
        this.id = id;
        this.RAM = RAM;
        this.SSD = SSD;
        this.diagonalScreen = diagonalScreen;
        this.os = os;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getSSD() {
        return SSD;
    }

    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    public double getDiagonalScreen() {
        return diagonalScreen;
    }

    public void setDiagonalScreen(double diagonalScreen) {
        this.diagonalScreen = diagonalScreen;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return id == notebook.id && RAM == notebook.RAM && SSD == notebook.SSD && Objects.equals(diagonalScreen, notebook.diagonalScreen) && Objects.equals(os, notebook.os) && Objects.equals(color, notebook.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, RAM, SSD, diagonalScreen, os, color);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "id=" + id +
                ", RAM=" + RAM +
                ", SSD=" + SSD +
                ", diagonalScreen='" + diagonalScreen + '\'' +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static void menu() {
        System.out.println("1. ID");
        System.out.println("2. Размер оперативной памяти");
        System.out.println("3. Размер твердотельного жесткого диска");
        System.out.println("4. Диагональ экрана");
        System.out.println("5. Операционная система");
        System.out.println("6. Цвет корпуса");
        System.out.println("7. Применить фильтр");
        System.out.println("8. Выход");
        System.out.print("Введите цифру, соответствующую необходимому критерию: ");
    }

    public static void filter(Set<Notebook> inputData) {
        Set<Notebook> filter = new HashSet<>();
        Scanner scn = new Scanner(System.in);
        int enteredDigit;
        Map<String, Object> map = new HashMap<>(Map.of("id", "", "RAM", "", "SSD", "", "diagonalScreen", "", "os", "", "color", ""));
        while (true) {
            menu();
            enteredDigit = scn.nextInt();
            switch (enteredDigit) {
                case 1:
                    System.out.print("Введите ID: ");
                    map.put("id", scn.nextInt());
                    break;
                case 2:
                    System.out.print("Введите размер оперативной памяти: ");
                    map.put("RAM", scn.nextInt());
                    break;
                case 3:
                    System.out.print("Введите размер твердотельного жесткого диска: ");
                    map.put("SSD", scn.nextInt());
                    break;
                case 4:
                    System.out.print("Введите диагональ экрана: ");
                    map.put("diagonalScreen", scn.nextDouble());
                    break;
                case 5:
                    System.out.print("Введите название операционной системы: ");
                    map.put("os", scn.next());
                    break;
                case 6:
                    System.out.print("Введите цвет корпуса: ");
                    map.put("color", scn.next());
                    break;
                case 7:
                    for (Notebook notebook : inputData) {
                        boolean flag = false;
                        if (map.get("id") != "") {
                            if (map.get("id").equals(notebook.getId())) {
                                flag = true;
                            }
                        }
                        if (map.get("RAM") != "") {
                            if (map.get("RAM").equals(notebook.getRAM())) {
                                flag = true;
                            } else {
                                flag = false;
                            }
                        }
                        if (map.get("SSD") != "") {
                            if (map.get("SSD").equals(notebook.getSSD())) {
                                flag = true;
                            } else {
                                flag = false;
                            }
                        }
                        if (map.get("diagonalScreen") != "") {
                            if (map.get("diagonalScreen").equals(notebook.getDiagonalScreen())) {
                                flag = true;
                            } else {
                                flag = false;
                            }
                        }
                        if (map.get("os") != "") {
                            if (map.get("os").equals(notebook.getOs())) {
                                flag = true;
                            } else {
                                flag = false;
                            }
                        }
                        if (map.get("color") != "") {
                            if (map.get("color").equals(notebook.getColor())) {
                                flag = true;
                            } else {
                                flag = false;
                            }
                        }
                        if (flag == true) {
                            filter.add(notebook);
                        }
                    }
                    System.out.println("Отфильтрованные позиции: ");
                    for (Notebook filters : filter) {
                        System.out.println(filters);
                    }
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Некорректный ввод");
                    break;
            }
        }

    }

    public static void main(String[] args) {
        Set<Notebook> notebookSet = new HashSet<>();
        notebookSet.add(new Notebook(1, 8, 256, 11.6, "Windows", "black"));
        notebookSet.add(new Notebook(2, 16, 512, 15.6, "Windows", "white"));
        notebookSet.add(new Notebook(3, 32, 1000, 14.0, "DOS", "silver"));
        notebookSet.add(new Notebook(4, 4, 128, 11.6, "Windows", "red"));
        notebookSet.add(new Notebook(5, 16, 512, 16.0, "Linux", "grey"));
        notebookSet.add(new Notebook(6, 8, 512, 17.3, "DOS", "grey"));
        notebookSet.add(new Notebook(7, 16, 512, 17.3, "Linux", "black"));

        for (Notebook notebook : notebookSet) {
            System.out.println(notebook);
        }
        filter(notebookSet);
    }
}
