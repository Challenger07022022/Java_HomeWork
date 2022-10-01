package HomeWork4;

// 1. Взять за основу реализацию стека, написанную в конце семинара. (Реализовать стэк с помощью массива.
// Нужно реализовать методы: size(), empty(), push(), peek(), pop().)
// Добавить проверку граничных условий и выводить сообщения об ошибках,
// если мы пытаемся извлечь элемент из пустого стека, добавить элемент в полностью заполненный стек и тд

import java.util.Arrays;


public class Stack<T> {
    private T[] array;
    private int index;
    private int length;

    public Stack(int length) {
        this.length = length;
        this.index = 0;
        this.array = (T[]) new Object[length];
    }

    public int size() {
        return this.index;
    }

    public boolean empty() {
        return this.size() == 0;
    }

    public void push(T value) {
        if (this.length == index) {
            System.out.println("Ошибка, стек полностью заполнен!");
        } else this.array[index++] = value;
    }

    public T peek() {
        if (index == 0) return null;
        else return this.array[index - 1];
    }

    public T pop() {
        if (index == 0) return null;
        else return this.array[--index];
    }

    public String toString() {
        T[] newArray = (T[]) new Object[this.array.length];
        for (int i = 0; i < this.array.length; i++) {
            newArray[this.array.length - 1 - i] = this.array[i];
        }
        return Arrays.toString(newArray);
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(3);
        stack.push("String 1");
        stack.push("String 2");
        stack.push("String 3");
        stack.push("String 4");
        System.out.println(stack.toString());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }
}
