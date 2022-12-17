package Seminars.Seminar_4;
import java.util.Scanner;
import java.util.Stack;

public class ThirdProblem {
    String a;

    public void task(){
        Scanner in = new Scanner(System.in);
        Stack<String> stack = new Stack<>(); // LIFO - last in first out
        do {
            a = in.next();
            if (!a.equals("print") && !a.equals("revert") && !a.equals("Q")) {
                stack.push(a);
            } else if (a.equals("print")) {
               for (int i=stack.size()-1; i>=0; i--) {
                   System.out.println(stack.elementAt(i));
               }
            } else if (a.equals("revert")) {
                stack.pop();
            }
        } while (!a.equals("Q"));
    }
}

/*
Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а
первая - последней. Если введено revert, удаляет предыдущую введенную строку из памяти.

 */