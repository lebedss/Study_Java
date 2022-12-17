package Seminars.Seminar_2;
//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        FirstTask firstTask = new FirstTask();
        System.out.println(firstTask.getResult());
    }
}

class FirstTask {
    int n;
    char a;
    char b;
    int counter = 0;

    FirstTask() {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = in.next().charAt(0);
        b = in.next().charAt(0);
        in.close();
    }

    public StringBuilder getResult() {
        StringBuilder result = new StringBuilder();
        while (n != counter) {
            result.append(a).append(b);
            counter = counter + 2;
        }
        return result;
    }
}