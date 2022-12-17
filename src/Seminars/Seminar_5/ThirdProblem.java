
package Seminars.Seminar_5;

import java.util.ArrayList;
import java.util.TreeMap;

public class ThirdProblem {

    public void sortedMap(String input) {
        TreeMap<Integer, ArrayList<String>> treeMap = new TreeMap<>();
        String[] s = input.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (treeMap.containsKey(s[i].length())) {
                treeMap.get(s[i].length()).add(s[i]);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(s[i]);
                treeMap.put(s[i].length(), list);
            }
        }
        System.out.println(treeMap.entrySet());
    }
}

        /*
Взять набор строк, например,Мороз и солнце день чудесный Еще ты дремлешь друг прелестный
Пора красавица проснись.
Написать метод, который отсортирует эти строки по длине с помощью TreeMap.
Строки с одинаковой длиной не должны “потеряться”.
         */
