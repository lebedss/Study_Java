package Homework.Lesson_1;

// Вывести все простые числа от 1 до 1000
// Определение простых чисел: кроме 1 и самого себя, оно не может быть разделено на другие натуральные числа
public class Task_2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            if (numberIsPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean numberIsPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int j = 2; j * j < number; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}
