package Homework.Lesson_2;

import java.io.*;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Scanner;

/* Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл. */
public class Task_2 {
    public static void main(String[] args) throws IOException {

        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = bubbleSort.createArray(6);
        int[] cortArr = bubbleSort.getSort(arr);
        bubbleSort.writeArray(cortArr);
    }

}

class BubbleSort {
    public int[] createArray(int num) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[num];
        System.out.println("Введите ряд из " + num + " чисел через пробел: ");
        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        return arr;
    }

    public void writeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] getSort(int[] arr) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\STUDY\\StudyGeekBrains\\My_projects" + "\\StudyJava\\Java_GeekBrains\\src\\Homework\\Lesson_2\\logFileForTaskTwo.txt");
        try {
            for (int i = 0; i < arr.length; i++) {
                writeArray(arr);
                fileOutputStream.write(Arrays.toString(arr).getBytes());
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            fileOutputStream.close();
            return arr;
        } catch (Exception e) {
            return null;
        }
    }
}

//public class SecondTask {
//    public static void main(String[] args) throws java.io.IOException {
//
//        Logger logger = Logger.getLogger(SecondTask.class.getName());
//        FileHandler fh = new FileHandler("log_HW_02_2.txt", true);
//        logger.addHandler(fh);
//
//        SimpleFormatter sFormat = new SimpleFormatter();
//        fh.setFormatter(sFormat);
//
//        int n, arr[];
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Введите размер массива: ");
//        n = scan.nextInt();
//        arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (10 + (Math.random() * (100 - 10)));
//        }
//        logger.severe("Задали массив случайных чисел");
//
//        System.out.print("Исходный массив ---> ");
//        for (int i : arr)
//            System.out.print(i + " ");
//        System.out.println();
//
//        boolean sorted = false;
//        int temp, iter_num = 0;
//        String str;
//        while (!sorted) {
//            sorted = true;
//
//            iter_num++;
//            str = "Итерация номер " + Integer.toString(iter_num) + "  Массив ---> ";
//            for (int i : arr)
//                str += Integer.toString(i) + " ";
//            logger.severe(str);
//
//            for (int i = 0; i < arr.length - 1; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                    sorted = false;
//                }
//            }
//        }
//        System.out.print("Массив по возрастанию ---> ");
//        for (int i : arr)
//            System.out.print(i + " ");
//
//    }
//
//}
