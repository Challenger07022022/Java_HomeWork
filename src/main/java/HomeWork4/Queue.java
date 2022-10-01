package HomeWork4;

// 2. Написать реализацию очереди на основе массива; Реализовать методы size(), empty(), offer(), poll(), peek()

import java.util.Arrays;

public class Queue<T> {
    private T[] array;
    private int front; // указатель первого элемента очереди
    private int tail; // указатель хвоста очереди, куда должен быть помещен новый элемент при постановке в очередь
    private int maxLength; // количество элементов в очереди
    private int nElem; // текущее количество элементов в очереди

    public Queue(int maxLength) {
        this.maxLength = maxLength; // максимальная длинна очереди
        this.front = 0;
        this.tail = -1;
        this.nElem = 0;
        this.array = (T[]) new Object[maxLength];
    }

    public int size() {
        return this.nElem;
    }

    public boolean empty() {
        return this.nElem == 0;
    }

    public boolean offer(T value) {
        if (this.tail == this.maxLength - 1) {
            this.tail = -1;
        }
        if (this.nElem != this.maxLength) {
            this.array[++this.tail] = value;
            this.nElem++;
            return true;
        } else {
            System.out.println("Ошибка, очередь заполнена!");
            return false;
        }
    }

    public T peek() {
        if (this.nElem == 0) return null;
        else return array[this.front];
    }

    public T poll() {
        if (this.nElem == 0) return null;
        else {
            T temp = array[this.front++];
            if (this.front == this.maxLength) this.front = 0;
            this.nElem--; // уменьшение количества элементов в очереди
            return temp;
        }
    }

    public String toString() {
        return Arrays.toString(this.array);
    }

    public static void main(String[] args) {
        Queue<String> queue = new Queue<>(3);
        System.out.println(queue.peek());
        System.out.println(queue.empty());
        System.out.println(queue.size());
        queue.offer("String 1");
        queue.offer("String 2");
        queue.offer("String 3");
        queue.offer("String 4");
        System.out.println(queue.size());
        System.out.println(queue.empty());
        System.out.println(queue.toString());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.offer("String 5"));
        System.out.println(queue.toString());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.toString());
        System.out.println(queue.peek());
        System.out.println(queue.size());
    }
}
