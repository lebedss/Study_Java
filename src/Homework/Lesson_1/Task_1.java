package Homework.Lesson_1;
// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Cумма чисел от 1 до введённого Вами числа: " + findSumOfDigitsRecursion(number));
        System.out.println("Произведение чисел от 1 до введённого Вами числа: " + findFactorialRecursion(number));
        System.out.println("Cумма чисел от 1 до введённого Вами числа: " + findSumOfDigits(number));
        System.out.println("Произведение чисел от 1 до введённого Вами числа: " + findFactorial(number));
    }

    public static int findSumOfDigitsRecursion(int n) {
        if (n == 1) return 1;
        return n + findSumOfDigitsRecursion(n - 1);
    }

    public static int findFactorialRecursion(int n) {
        if (n == 1) return 1;
        return n * findFactorialRecursion(n - 1);
    }

    public static int findSumOfDigits(int n) {
        int sumOfDigits = 0;
        for (int i = 0; i <= n; i++) {
            sumOfDigits += i;
        }
        return sumOfDigits;
    }

    public static int findFactorial(int n) {
        int multiplicationResult = 1;
        for (int i = 1; i <= n; i++) {
            multiplicationResult *= i;
        }
        return multiplicationResult;
    }
}
