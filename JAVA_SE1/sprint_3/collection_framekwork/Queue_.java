package java111.sprint_3.collection_framekwork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Queue_ {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(4);
        q.add(5);
       // q.remove();
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(4);

        q.removeAll(list);
        q.remove();

    }
}
