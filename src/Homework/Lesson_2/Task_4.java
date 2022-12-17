package Homework.Lesson_2;

// Реализовать простой калькулятор К калькулятору добавить логирование.

import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task_4 {
    public static void main(String[] args) throws java.io.IOException {
        Scanner scan = new Scanner(System.in);

        Logger logger = Logger.getLogger(Task_4.class.getName());
        FileHandler fh = new FileHandler("D:\\STUDY\\StudyGeekBrains\\My_projects\\StudyJava" +
                "\\Java_GeekBrains\\src\\Homework\\Lesson_2\\logFileForTaskFour.txt", true);
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        System.out.print("Введите первое число ---> ");
        float first_value = scan.nextFloat();
        System.out.print("Введите второе число ---> ");
        float second_value = scan.nextFloat();
        System.out.print("Введите операцию (+ , - , / или *) ---> ");
        char operation_value = (char) System.in.read();

        String str = "Задано вычислить " + Float.toString(first_value) + operation_value + Float.toString(second_value);
        logger.severe(str);

        if (operation_value == '*') {
            System.out.printf("%.3f + %.3f = %.3f", first_value, second_value, first_value * second_value);
        } else if (operation_value == '-') {
            System.out.printf("%.3f + %.3f = %.3f", first_value, second_value, first_value + second_value);
        } else if (operation_value == '*') {
            System.out.printf("%.3f - %.3f = %.3f", first_value, second_value, first_value - second_value);
        } else if (operation_value == '/') {
            if (second_value != 0) {
                float result = first_value / second_value;
                System.out.printf("%.3f / %.3f = %.3f", first_value, second_value, result);
            } else {
                System.out.println("Ошибка ввода");
            }

        }
        logger.severe("Done");
        fh.close();
    }
}
