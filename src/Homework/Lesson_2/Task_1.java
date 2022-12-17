package Homework.Lesson_2;
//Распарсить файл с логами из заданий, выполненных на семинаре, найти записи уровня INFO/DEBUG.


import java.io.*;
import java.util.Scanner;
import java.util.logging.*;


public class Task_1 {
    private static final Logger logger = Logger.getLogger(Task_1.class.getName());

    public static void main(String[] args) {

        try {
            FileHandler fh = new FileHandler("D:\\STUDY\\StudyGeekBrains\\My_projects\\StudyJava\\" +
                    "Java_GeekBrains\\src\\Homework\\Lesson_2\\logFileForTaskOne.txt", true);
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

        } catch (SecurityException e) {
            logger.log(Level.SEVERE,
                    "Не удалось создать файл лога из-за политики безопасности.",
                    e);
        } catch (IOException e) {
            logger.log(Level.SEVERE,
                    "Не удалось создать файл лога из-за ошибки ввода-вывода.",
                    e);
        }
        logger.log(Level.INFO, "Запись лога с уровнем INFO (информационная)");
        logger.log(Level.WARNING, "Запись лога с уровнем WARNING (Предупреждение)");
        logger.log(Level.SEVERE, "Запись лога с уровнем SEVERE (серъёзная ошибка)");
        Task_1 firstTask = new Task_1();

        try {
            File file = new File("logFileForTaskOne.txt");
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String oddLine = fileReader.nextLine();
                String evenLine = fileReader.nextLine();
                if (evenLine.startsWith("INFO") || evenLine.startsWith("DEBUG")) {
                    System.out.println(oddLine);
                    System.out.println(evenLine);
                }
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            // e.printStackTrace();
        }


    }

}










