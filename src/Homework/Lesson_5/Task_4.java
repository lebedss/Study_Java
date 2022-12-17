package Homework.Lesson_5;
//Реализовать алгоритм пирамидальной сортировки (HeapSort).
//Алгоритм сегментирует массив на отсортированный и неотсортированный.
//Неотсортированный сегмент преобразовывается в кучу (heap),
//что позволяет эффективно эффективно определить самый большой элемент.

public class Task_4 {
    //вернуть левого потомка `A[i]`
    private static int LEFT(int i) {
        return (2 * i + 1);
    }

    //вернуть правого потомка `A[i]`
    private static int RIGHT(int i) {
        return (2 * i + 2);
    }

    //вспомогательная функция для замены двух индексов в массиве
    private static void swap(int[] sortArr, int i, int j) {
        int swap = sortArr[i];
        sortArr[i] = sortArr[j];
        sortArr[j] = swap;
    }

    //рекурсивный алгоритм heapify-down. Узел с индексом `i` и 2 его прямых потомка нарушают свойство кучи
    private static void heapify(int[] sortArr, int i, int size) {
        // получить левый и правый потомки узла с индексом `i`
        int left = LEFT(i);
        int right = RIGHT(i);
        int largest = i;

        //сравниваем `A[i]` с его левым и правым дочерними элементами и находим наибольшее значение
        if (left < size && sortArr[left] > sortArr[i]) largest = left;
        if (right < size && sortArr[right] > sortArr[largest]) largest = right;

        //поменяться местами с потомком, имеющим большее значение и вызовите heapify-down для дочернего элемента
        if (largest != i) {
            swap(sortArr, i, largest);
            heapify(sortArr, largest, size);
        }
    }

    //функция для удаления элемента с наивысшим приоритетом (присутствует в корне)
    public static int pop(int[] sortArr, int size) {
        //если в куче нет элементов
        if (size <= 0) {
            return -1;
        }
        int top = sortArr[0];

        //заменяем корень кучи последним элементом массива
        sortArr[0] = sortArr[size-1];
        //вызовите heapify-down на корневом узле
        heapify(sortArr, 0, size - 1);
        return top;
    }

    //функция для выполнения пирамидальной сортировки массива `A` размера `n`
    public static void heapSort(int[] sortArr) {
        //строим приоритетную очередь и инициализируем ее заданным массивом
        int n = sortArr.length;

        //build-heap: вызывать heapify, начиная с последнего внутреннего
        //узел до корневого узла
        int i = (n - 2) / 2;
        while (i >= 0) {
            heapify(sortArr, i--, n);
        }

        //несколько раз извлекаем из кучи, пока она не станет пустой
        while (n > 0) {
            sortArr[n - 1] = pop(sortArr, n);
            n--;
        }
    }

    public static void main(String args[]) {
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        heapSort(sortArr);
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + "\n");
        }
    }
}

//Альтернативное решение
//public class J10 {
//    public void sort(int arr[]) {
//        int N = arr.length;
//
//        for (int i = N / 2 - 1; i >= 0; i--)
//            heapify(arr, N, i);
//
//        for (int i = N - 1; i > 0; i--) {
//
//            int temp = arr[0];
//            arr[0] = arr[i];
//            arr[i] = temp;
//
//            heapify(arr, i, 0);
//        }
//    }
//
//    void heapify(int arr[], int N, int i) {
//        int largest = i;
//        int l = 2 * i + 1;
//        int r = 2 * i + 2;
//
//        if (l < N && arr[l] > arr[largest])
//            largest = l;
//
//        if (r < N && arr[r] > arr[largest])
//            largest = r;
//
//        if (largest != i) {
//            int swap = arr[i];
//            arr[i] = arr[largest];
//            arr[largest] = swap;
//
//            heapify(arr, N, largest);
//        }
//    }
//
//    static void printArray(int arr[]) {
//        int N = arr.length;
//
//        for (int i = 0; i < N; ++i)
//            System.out.print(arr[i] + " ");
//        System.out.println();
//    }
//
//    public static void main(String args[]) {
//        int arr[] = { 5, 7, 15, 11, 9, 25 };
//        int N = arr.length;
//
//        J10 ob = new J10();
//        ob.sort(arr);
//
//        printArray(arr);
//    }
//}

