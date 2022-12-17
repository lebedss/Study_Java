package Seminars.Seminar_6;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
//        TaskOne taskOne = new TaskOne();
//
//        taskOne.fillSet(taskOne.hashSet);
//        taskOne.fillSet(taskOne.linkedHashSet);
//        taskOne.fillSet(taskOne.treeSet);
//
//        taskOne.sout(taskOne.hashSet);
//        taskOne.sout(taskOne.linkedHashSet);
//        taskOne.sout(taskOne.treeSet);

//        TaskTwo taskTwo = new TaskTwo();
//        System.out.println(taskTwo.percentOfUnique(taskTwo.array));

        Cat cat = new Cat(1, 4, "Дворняжка");
        cat.setName("Васька");
        Cat anotherCat = new Cat(1, 4, "Дворняжка");
        anotherCat.setName("Васька");

        HashSet<Cat> catsSet = new HashSet<>();
        catsSet.add(cat);
        catsSet.add(anotherCat);
        System.out.println(catsSet);

        //hashCode - не совпал, то объекты 100% разные
        //hashCode - совпал - либо это коллизия, либо объекты одинаковые
        //Хэш совпал: отрабатывает метод equals()

        /*
        Если equals() вернул true -> hashCode 100% одинаковые
         */
    }
}
