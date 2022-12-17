package Seminars.Seminar_5;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        FirstProblem firstProblem = new FirstProblem();
//        Map<Integer, String> passports = firstProblem.fillMap(new HashMap<>());
//        Scanner in = new Scanner(System.in);
//        firstProblem.getPassportInfoByName(passports, in.next());

//        SecondProblem secondProblem = new SecondProblem();
//        String a = "paper";
//        String b = "title";
//        System.out.println(secondProblem.isIsomorphic(a,b));

        ThirdProblem thirdProblem = new ThirdProblem();
        thirdProblem.sortedMap("Мороз и солнце день чудесный Еще ты дремлешь " +
                "друг прелестный Пора красавица проснись");
    }
}
