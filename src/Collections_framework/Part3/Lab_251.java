package Collections_framework.Part3;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab_251 {
    public static void main(String[] args) {
        Queue pq1 = new PriorityQueue();
        //FIFO
        pq1.add("f");
        pq1.add("E");
        pq1.add("D");
        pq1.add("D");
        pq1.offer("D"); //Add
       // pq1.offer(null);  // Null pointer exception(NullPointerException)
        System.out.println(pq1);
        System.out.println(pq1.poll());
        System.out.println(pq1);
        System.out.println(pq1.peek());
        System.out.println(pq1);
    }
}
