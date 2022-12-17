package Seminars.Seminar_4;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class SecondProblem {
    String string;

    public void addToLinkedList() {
        LinkedList<String> linkedList = new LinkedList<>();

        do {
            Scanner in = new Scanner(System.in);
            string = in.next();
            String[] split = string.split("~");
            if (!split[0].equals("print")) {

                Random random = new Random();
                int myRandomNumber = random.nextInt(1000);
                while (myRandomNumber < Integer.parseInt(split[1])) {
                    myRandomNumber = random.nextInt();
                }

                for (int i = 0; i < myRandomNumber; i++) {
                    linkedList.add(null);
                }

                linkedList.set(Integer.parseInt(split[1]), split[0]);
            } else if (Integer.parseInt(split[1]) <= linkedList.size()){
                System.out.println(linkedList.get(Integer.parseInt(split[1])));
                linkedList.remove(Integer.parseInt(split[1]));
                System.out.println(linkedList);
            }
        } while (!string.equals("Q"));

    }
}

/*
Реализовать консольное приложение, которое:
Принимает от пользователя строку вида
text~num
Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

 */
