package Seminars.Seminar_6;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TaskOne {
    HashSet<Integer> hashSet = new HashSet<>();
    LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
    TreeSet<Integer> treeSet = new TreeSet<>();

    public void fillSet(Set<Integer> set){
        set.add(5);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(6);
        set.add(3);
    }

    public void sout(Set<Integer> set){
        System.out.println(set.getClass() + " " + set);
    }
}

/*
1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.
2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.
3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.
 */