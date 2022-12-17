package Homework.Lesson_3;

import java.util.ArrayList;
import java.util.Scanner;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

public class Task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер исходного списка ---> ");
        Integer n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(i, (int) (10 + (Math.random() * (100 - 10))));
        }
        System.out.println("Исходный список ---> " + list);

        Integer list_min = list.get(0), list_max = list.get(0), list_sum = list.get(0);
        for (int i = 1; i < n; i++) {
            if (list_max < list.get(i))
                list_max = list.get(i);
            if (list_min > list.get(i))
                list_min = list.get(i);
            list_sum += list.get(i);
        }
        System.out.println("Максимальный элемент списка ---> " + list_max);
        System.out.println("Минимальный элемент списка ---> " + list_min);
        System.out.println("Среднее арифмитическое списка ---> " + (list_sum / n));
    }

}
