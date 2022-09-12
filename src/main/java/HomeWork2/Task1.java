package HomeWork2;

//1. Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет
// в консоль результат вида
//        1 Расширение файла: txt
//        2 Расширение файла: pdf
//        3 Расширение файла:
//        4 Расширение файла: jpg

import java.io.File;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Админ\\Desktop\\IT\\Java\\Java\\src\\main\\java\\HomeWork2");
        FileExtension(dir);
    }
    public static void FileExtension(File directory){
        File[] files = directory.listFiles();
        for (int i = 0; i < files.length; i++) {
            String fileName = files[i].getName();
            if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
                String exp = fileName.substring(fileName.lastIndexOf(".") + 1);
                System.out.println((i + 1) + " " + "Расширение файла: " + exp);
            } else
                System.out.println((i + 1) + " " + "Расширение файла: ");
        }
    }
}
