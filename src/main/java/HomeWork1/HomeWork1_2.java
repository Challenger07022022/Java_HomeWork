package HomeWork1;

// 2. Напишите функцию, для поиска наиболее длинного общего префикса, среди массива строк.
// Если общего префикса нет, то возвращать пустую строку. Пример ["aabb", "aabbb", "aaabb"] - ответ "aa"
public class HomeWork1_2 {
    static String commonPrefixTwoStrings(String str1, String str2) {
        String result = "";
        for (int i = 0, j = 0; i < str1.length() && j < str2.length(); i++, j++) {
            if (str1.charAt(i) != str2.charAt(j)) {
                break;
            }
            result += str1.charAt(i);
        }
        return (result);
    }

    static String commonPrefixArray(String array[]) {
        String prefix = array[0];
        for (int i = 1; i < array.length; i++) {
            prefix = commonPrefixTwoStrings(prefix, array[i]);
        }
        return (prefix);
    }

    public static void main(String[] args) {
        String[] array = {"aabb", "aabbb", "aaabb"};
        String prefix = commonPrefixArray(array);
        if (prefix.length() > 0)
            System.out.printf("Общий префикс = " + prefix);
        else
            System.out.printf("");
    }
}