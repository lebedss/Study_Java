package Homework.Lesson_1;
//Реализовать простой калькулятор

import java.util.Scanner;

public class Task_3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int firstNumber = getNumbers();
        int secondNumber = getNumbers();
        char operation = getOperationType();
        int  result = calculator(firstNumber, secondNumber, operation);
        System.out.println("Реультат: " + result);
    }

    public static int getNumbers() {
        System.out.println("Введите целое число: ");
        int number;
        if (scanner.hasNext()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Ошибка ввода данных - попробуйте ещё раз!");
            scanner.next();
            number = getNumbers();
        }
        return number;
    }

    public static char getOperationType() {
        System.out.println("Введите тип математической опреации:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка ввода данных - попробуйте ещё раз!");
            scanner.next();
            operation = getOperationType();
        }
        return operation;
    }

    public static int calculator(int firstNumber, int secondNumber, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Ошибка ввода данных - попробуйте ещё раз!");
                result = calculator(firstNumber, secondNumber, getOperationType());
        }
        return result;
    }
}

