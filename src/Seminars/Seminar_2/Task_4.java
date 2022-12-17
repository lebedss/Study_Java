package Seminars.Seminar_2;

import java.io.FileOutputStream;
import java.io.IOException;

/*Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
который запишет эту строку в простой текстовый файл, обработайте исключения.*/
public class Task_4 {
    public static void main(String[] args) {
        FourthTask fourthTask = new FourthTask();
        fourthTask.writer();
    }
}

class FourthTask {

    public StringBuilder generateString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringBuilder.append("TEST ");
        }
        return stringBuilder;
    }

    public void writer() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\STUDY\\StudyGeekBrains\\My_projects\\" +
                    "StudyJava\\Java_GeekBrains\\src\\Seminars\\Seminar_2\\myTest.txt");

            fileOutputStream.write(generateString().toString().getBytes());

            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println("Проблема вывода!");
            e.printStackTrace();
        }
    }
}
