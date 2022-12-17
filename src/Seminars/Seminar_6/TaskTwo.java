package Seminars.Seminar_6;
import java.util.HashSet;
import java.util.Random;

public class TaskTwo {
    int[] array = new int[1000];

    private void fillArray(){
        Random random = new Random();
        for (int i=0; i< array.length; i++) {
            array[i] = random.nextInt(25);
        }
    }

    public float percentOfUnique(int[] array) {
        fillArray();
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i< array.length; i++) {
            set.add(array[i]);
        }
        return (float) set.size() * 100 / array.length;
    }
}

/*
1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент
уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

 */
