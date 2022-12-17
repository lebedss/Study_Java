package Seminars.Seminar_1;

import java.util.Calendar;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Введите имя!");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 5 &&
                Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12) {
            System.out.println("Доброе утро," + name);
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 12 &&
                Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 18) {
            System.out.println("Добрый день," + name);
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 18 &&
                Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 23) {
            System.out.println("Добрый вечер," + name);
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 23 &&
                Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 5) {
            System.out.println("Доброй ночи," + name);
        }
    }
}