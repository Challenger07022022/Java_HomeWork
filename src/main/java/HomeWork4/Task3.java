package HomeWork4;

// 3. ***** Реализовать алгоритм перевода из инфиксной записи в постфиксную для арифметического выражения.
// http://primat.org/news/obratnaja_polskaja_zapis/2016-04-09-1181 Вычислить запись если это возможно.


import org.apache.commons.lang3.math.NumberUtils;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

public class Task3 {

    public static int priority(char x) {
        if (x == '^') return 1;
        if (x == '*' || x == '/') return 2;
        if (x == '+' || x == '-') return 3;
        return Integer.MAX_VALUE;
    }

    public static boolean isOperand(char x) {
        return (x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z') || (x >= '0' && x <= '9');
    }

    public static String infixToPostfix(String infix0) {
        if (infix0 == null || infix0.length() == 0) return infix0;
        String infix = infix0.replaceAll("\\s", "");
        Deque<Character> deque = new LinkedList<>(); // лист для хранения операторов
        String postfix = ""; // строка для хранения постфиксного выражения
        for (char x : infix.toCharArray()) {
            if (x == '(') deque.addLast(x); // если текущий токен является открывающей скобкой
            else if (x == ')') { // если текущий токен является закрывающей скобкой
                // извлекаем токены из deque в string до открывающей скобки, открывающую скобку удаляем
                while (deque.peekLast() != '(') {
                    postfix += " ";
                    postfix += deque.pollLast();
                }
                deque.pollLast();
            } else if (isOperand(x)) {
                postfix += x; //Если текущий токен является операндом, добавляем его в конец постфиксного выражения
            } else {
                // удаляем из deque операторы с более высоким или равным приоритетом
                // и добавляем их в конец постфиксного выражения
                while (!deque.isEmpty() && priority(x) >= priority(deque.peekLast())) {
                    postfix += " ";
                    postfix += deque.pollLast();
                }
                postfix += " ";
                deque.addLast(x);
            }
        }
        // добавляем все оставшиеся операторы в deque в конце постфиксного выражения
        while (!deque.isEmpty()) {
            postfix += " ";
            postfix += deque.pollLast();
        }

        // возвращаем постфиксное выражение
        return postfix;
    }

    private static String PLUS = "+";
    private static String MINUS = "-";
    private static String DIVIDE = "/";
    private static String MULTIPLY = "*";
    private static String DEGREE = "^";

    public static double eval(String expression) {
        // сплитим строку по пробелам в массив строк
        String[] values = Objects.requireNonNull(expression).split(" ");

        Deque<Double> deque = new LinkedList<>();
        for (String value : values) {
            if (value.isBlank()) {
                //если встретился пробел - пропускаем и идем дальше
                continue;
            }

            if (NumberUtils.isDigits(value)) {
                //встретилось число - переносим в конец очереди
                deque.offerLast(Double.parseDouble(value));
            } else if (PLUS.equals(value)) {
                //Встретился знак сложения.
                //Читаем последнее число
                double val2 = deque.pollLast();
                //Читаем предпоследнее число
                double val1 = deque.pollLast();

                //Складываем числа
                double result = val1 + val2;
                //Результат сложения переносим в конец очереди
                deque.offerLast(result);
            } else if (MINUS.equals(value)) {
                //Встретился знак вычитания.
                //Читаем последнее число
                double val2 = deque.pollLast();
                //Читаем предпоследнее число
                double val1 = deque.pollLast();

                //Из предпоследнего числа вычитаем последнее
                double result = val1 - val2;
                //Результат вычитания переносим в конец очереди
                deque.offerLast(result);
            } else if (DIVIDE.equals(value)) {
                //Встретился знак деления.
                //Читаем последнее число
                double val2 = deque.pollLast();
                //Читаем предпоследнее число
                double val1 = deque.pollLast();

                //Делим предпоследнее число на последнее
                double result = val1 / val2;
                //Результат деления переносим в конец очереди
                deque.offerLast(result);
            } else if (MULTIPLY.equals(value)) {
                //Встретился знак умножения.
                //Читаем последнее число
                double val2 = deque.pollLast();
                //Читаем предпоследнее число
                double val1 = deque.pollLast();

                //Перемножаем числа
                double result = val1 * val2;
                //Результат перемножения переносим в конец очереди
                deque.offerLast(result);
            } else if (DEGREE.equals(value)) {
                //Встретился знак степени.
                //Читаем последнее число
                double val2 = deque.pollLast();
                //Читаем предпоследнее число
                double val1 = deque.pollLast();

                //Возвожим первое число в степень второго
                double result = Math.pow(val1, val2);
                //Результат перемножения переносим в конец очереди
                deque.offerLast(result);
            } else {
                throw new IllegalArgumentException("unsupported value: " + value);
            }
        }

        //Читаем результат вычисления из конца очереди
        double result = deque.pollLast();

        //Если в очереди еще что-то осталось после вычислений - значит исходное выражение было некорректно. Ошибка
        if (!deque.isEmpty()) {
            throw new IllegalArgumentException("expression[" + expression + "] is incorrect");
        }

        return result;
    }

    public static void main(String[] args) {
        String postfix = "162 / (2 + 1 ) ^4";
        String postfix1 = "1-(2+(1+1))+15/(7-(1+1))*3-(2+(1+1))";
        System.out.println(infixToPostfix(postfix));
        System.out.println(eval(infixToPostfix(postfix)));
        System.out.println(infixToPostfix(postfix1));
        System.out.println(eval(infixToPostfix(postfix1)));
    }
}