package Seminars.Seminar_5;

import java.util.HashMap;

public class SecondProblem {

    public boolean isIsomorphic(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        } else {
            HashMap<Character, Character> firstMap = new HashMap<>();
            HashMap<Character, Character> secondMap = new HashMap<>();
            char[] firstChars = first.toCharArray();
            char[] secondChars = second.toCharArray();
            for (int i=0; i<firstChars.length; i++) {
                if (firstMap.containsKey(firstChars[i])) {
                    if (secondChars[i] != firstMap.get(firstChars[i])) {
                        return false;
                    }
                } else {
                    if (secondMap.containsKey(secondChars[i])) {
                        return false;
                    } else {
                        firstMap.put(firstChars[i], secondChars[i]);
                        secondMap.put(secondChars[i], firstChars[i]);
                    }
                }
            }
        }
        return true;
    }
}

/*
Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false,
если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во
втором слове, при этом
повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования.
(Например, add - egg изоморфны)
буква может не меняться, а остаться такой же. (Например, note - code)

note -> code
n -> c
o = o
t -> d
e = e

Пример 1:
Input: s = "foo", t = "bar"
Output: false
Пример 2:
Input: s = "paper", t = "title"
Output: true

 */
