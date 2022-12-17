package Seminars.Seminar_2;

import java.util.Scanner;

//Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
public class Task_2 {
    public static void main(String[] args) {
        SecondTask secondTask = new SecondTask();
        System.out.println(secondTask.getUniqString());
    }
}

class SecondTask {
    String string;
    boolean repeated;

    SecondTask() {
        Scanner in = new Scanner(System.in);
        string = in.next();
        in.close();
    }

    public StringBuilder getUniqString() {
        StringBuilder result = new StringBuilder();
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            repeated = false;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                result.append(chars[i]);
            }
        }
        return result;
    }
}