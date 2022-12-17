package Homework.Lesson_2;
/*Дана json строка (можно сохранить в файл и читать из файла) [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder,
создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода: Студент Иванов получил 5 по предмету Математика. Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.*/

import org.json.simple.*;
import org.json.simple.parser.*;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

public class Task_3 {
    public static void main(String[] args) throws IOException, ParseException, org.json.simple.parser.ParseException {
        FileReader read = new FileReader("D:\\STUDY\\StudyGeekBrains\\My_projects\\StudyJava\\Java_GeekBrains" +
                "\\src\\Homework\\Lesson_2\\TaskThreeData.json");
        JSONParser jsonP = new JSONParser();
        JSONArray stud = (JSONArray) jsonP.parse(read);

        for (Object obj : stud) {
            JSONObject per = (JSONObject) obj;

            StringBuilder res = new StringBuilder();

            res.append("Студент ").append(per.get("фамилия")).append(" получил ").append((String) per.get("оценка"))
                    .append(" по предмету ").append((String) per.get("предмет")).append(".");
            System.out.println(res.toString());
        }
    }
}