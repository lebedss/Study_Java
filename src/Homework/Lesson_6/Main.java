package Homework.Lesson_6;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> criteries = new HashMap<>();
        Map<Integer, String> values = new HashMap<>();
        List<Computer> computerList = new ArrayList<>();
        int criteria = 1;
        computerList.add(new Computer("Lenovo ideapad Gaming", 32, "Intel i-core 7", 1000,
                "Windows 11", "Black"));
        computerList.add(new Computer("Lenovo deadspace", 8, "Intel i-core 5", 512,
                "Windows 10", "White"));
        computerList.add(new Computer("Lenovo death", 4, "Intel i-core 3", 128,
                "Windows 7", "Pink"));
        Market market = new Market(computerList);
        Scanner scanner = new Scanner(System.in);
        criteries.put(1, "ОЗУ");
        criteries.put(2, "Объем ЖД");
        criteries.put(3, "Операционная система");
        criteries.put(4, "Цвет");
        criteries.put(5, "Процессор");
        while (true) {

            System.out.println("Введите цифру, соответствующую необходимому критерию или 0, если достаточно:");
            for (int k : criteries.keySet()) {
                if (!values.containsKey(k)) System.out.println(k + " - " + criteries.get(k));
            }
            criteria = scanner.nextInt();
            if (criteria == 0) break;
            System.out.println("Введите минимальное значение для критерия: ");
            String value = scanner.next();
            values.put(criteria, value);
        }
        market.showNotebook(values);

    }
}
