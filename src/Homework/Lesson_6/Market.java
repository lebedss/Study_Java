package Homework.Lesson_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Market {
    List<Computer> array;

    public Market(List<Computer> array) {
        this.array = array;
    }
    public Market() {
        this(new ArrayList<>());
    }

    public void showNotebook(Map<Integer, String> criteries) {
        for (Computer c : array) {
            boolean isMatch = true;
            for (int k : criteries.keySet()) {
                isMatch = c.isMatch(k, criteries.get(k));
            }
            if(isMatch) System.out.println(c.toString());
        }
    }

    public void showNotebook(int criteria, String value) {
        for (Computer c : array) {
            if(c.isMatch(criteria,value)) System.out.println(c.toString());
        }
    }

    public List<Computer> getArray() {
        return array;
    }

    public void setArray(List<Computer> array) {
        this.array = array;
    }
}
