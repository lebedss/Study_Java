//package Homework.Lesson_4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

public class Task_2 {

    public static void main(String[] args) {

        int[] list = {3, 5, 7, 2, 4, 6};

        LinkedList<Integer> linkList = new LinkedList<>();
        for (Integer temp : list) {
            linkList.add(temp);
        }

        System.out.println(linkList);

        enqueue(linkList, 9);
        System.out.println(linkList);

        System.out.println(dequeue(linkList));
        System.out.println(linkList);

        System.out.println(first(linkList));
    }

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
}

//public class Task2 {
//    public static void main (String[] args) {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.println("Введите строку: ");
//        String str = iScanner.nextLine();
//        Deque<String> deque = new ArrayDeque<>();
//
//        while (!str.equals("print") || !str.equals("revert")) {
//            if (str.equals("print")) {
//                System.out.println(deque);
//            } else if (str.equals("revert")) {
//                deque.removeFirst();
//            } else if (str.equals("breake")) {
//                break;
//            } else {
//                deque.addFirst(str);
//            }
//            str = iScanner.nextLine();
//        }
//        System.out.println(deque);
//    }
//}