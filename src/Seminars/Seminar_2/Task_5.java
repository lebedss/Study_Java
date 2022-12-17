package Seminars.Seminar_2;
 /*
   Напишите метод, который вернет содержимое текущей папки в виде массива строк.
   Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
   Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения,
   оно должно записаться в лог-файл.
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

public class Task_5 {
    private static final Logger logger = Logger.getLogger(Task_5.class.getName());

    public static void main(String[] args) throws IOException {
        writer();
    }

    public static ArrayList<String> getFiles() {
        File file = new File("D:\\STUDY\\StudyGeekBrains\\My_projects\\StudyJava\\Java_GeekBrains" +
                "\\src\\Seminars\\Seminar_2");
        File[] files = file.listFiles();
        ArrayList<String> names;
        try {
            names = new ArrayList<String>(Arrays.asList(file.list()));
            return names;
        } catch (NullPointerException nullPointerException) {
            logger.severe("Файлы не найдены в этой папке");
        }
        return null;
    }

    public static void writer() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\STUDY\\StudyGeekBrains\\My_projects\\" +
                "StudyJava\\Java_GeekBrains\\src\\Seminars\\Seminar_2\\TaskFiveLog.txt");
        try {
            ArrayList<String> files = getFiles();

            for (String file : files) {
                fileOutputStream.write(file.getBytes());
            }
        } catch (NullPointerException nullPointerException) {
            logger.severe("В предыдущем методе файл вернул null");
        }
    }
}