package Homework.Lesson_5;


import java.util.HashMap;

//Написать метод, который переведет число из римского формата записи в арабский. Например, MMXXII = 2022
public class Task_3 {
    public static void main(String[] args) {
        Task_3 roman = new Task_3();
        //I - 1
        //V - 5
        //X - 10
//        System.out.println(roman.romanToInt("V")); //5
        System.out.println(roman.romanToInt2("VI")); //6
        System.out.println(roman.romanToInt2("VII")); //7 2+5 = 7
        System.out.println(roman.romanToInt2("IX")); //9
        System.out.println(roman.romanToInt2("XIV")); //14 9+5 = 14
        System.out.println(roman.romanToInt2("XXXIV")); //34 4+10+10+10 = 34
        System.out.println(roman.romanToInt2("MMXXII"));
    }

    public int getArabian(char roman) {
        if ('I' == roman) return 1;
        else if ('V' == roman) return 5;
        else if ('X' == roman) return 10;
        else if ('L' == roman) return 50;
        else if ('C' == roman) return 100;
        else if ('D' == roman) return 500;
        else if ('M' == roman) return 1000;
        return 0;

    }

    public int romanToInt(String s) {


        int end = s.length() - 1;
        char[] arr = s.toCharArray();
        int arabian;
        int result = getArabian(arr[end]);
        for (int i = end - 1; i >= 0; i--) {
            arabian = getArabian(arr[i]);

            if (arabian < getArabian(arr[i + 1])) {
                result -= arabian;
            } else {
                result += arabian;
            }


        }
        return result;

    }

    public int romanToInt2(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);


        int end = s.length() - 1;
        char[] arr = s.toCharArray();
        int arabian;
        int result = map.get(arr[end]);
        for (int i = end - 1; i >= 0; i--) {
            arabian = map.get(arr[i]);

            if (arabian < map.get(arr[i + 1])) {
                result -= arabian;
            } else {
                result += arabian;
            }


        }
        return result;

    }
}
