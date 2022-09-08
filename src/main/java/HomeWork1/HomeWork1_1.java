package HomeWork1;

// 1. Задан массив, например, nums = [1,7,3,6,5,6]. Написать программу, которая найдет индекс i
// для этого массива такой, что сумма элементов с индексами < i равна сумме элементов с индексами > i.
public class HomeWork1_1 {
    public static void main(String[] args) {
        int[] array = {1, 7, 3, 6, 5, 6};
        int sum = 0; // сумма всего массива
        int leftSum = 0; // сумма левой части массива
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            sum -= array[i];
            if (leftSum == sum) {
                System.out.println("Равновесный индекс массива = " + i);
                break;
            }
            leftSum += array[i];
        }
    }
}