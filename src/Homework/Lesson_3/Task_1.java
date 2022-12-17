package Homework.Lesson_3;

import java.util.Scanner;

// Реализовать алгоритм сортировки слиянием

public class Task_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер исходного массива ---> ");
        Integer n = scan.nextInt();
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = (int) (10 + (Math.random() * (100 - 10)));
        }

        System.out.print("Исходный массив --->  ");
        for (int i : list)
            System.out.print(" " + i);

        System.out.println();

        mergeSort(list, n);

        System.out.print("После сортировки --->  ");
        for (int i : list)
            System.out.print(" " + i);

    }

    public static void mergeSort(int[] l2, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = l2[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = l2[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(l2, l, r, mid, n - mid);
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}