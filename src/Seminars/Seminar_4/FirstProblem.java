package Seminars.Seminar_4;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class FirstProblem {

    public void arrayListTime(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Date start = new Date();
        for (int i=0; i < 300000; i++) {
            arrayList.add(i);
        }
        Date end = new Date();
        long duration = end.getTime() - start.getTime();
        System.out.println("ArrayList: " + duration);
    }

    public void linkedListTime(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        Date start = new Date();
        for (int i=0; i < 300000; i++) {
            linkedList.add(i);
        }
        Date end = new Date();
        long duration = end.getTime() - start.getTime();
        System.out.println("LinkedList: " + duration);
    }
}

/*
1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
 */
