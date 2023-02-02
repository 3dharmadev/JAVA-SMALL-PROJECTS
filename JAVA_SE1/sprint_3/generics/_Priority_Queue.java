package java111.sprint_3.generics;

import java.util.PriorityQueue;
import java.util.Queue;

public class _Priority_Queue {
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>();
        pq.add("abc");
        pq.add("first");
        pq.add("xyz");
        pq.add("gfs");
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);

    }
}
