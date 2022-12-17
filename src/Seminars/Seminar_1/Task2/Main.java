package Seminars.Seminar_1.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task myObject = new Task();
        myObject.maxOfOnes();
    }
}

class Task {
    int n;
    int[] array;

    Task() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива");
        n = input.nextInt();
        array = new int[n];
        System.out.println("Введите массив");
        for (int i=0; i<array.length; i++) {
            array[i] = input.nextInt();
        }
        input.close();
    }

    void maxOfOnes(){
        int count = 0;
        int anotherCount = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i]==1) {
                anotherCount += 1;
            } else if (count < anotherCount) {
                count = anotherCount;
                anotherCount = 0;
            }
        }
        if (count < anotherCount) {
            System.out.println(anotherCount);
        } else {
            System.out.println(count);
        }
    }
}
