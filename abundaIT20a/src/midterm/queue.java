package midterm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Collections;

public class queue {

    public static void main(String[] args) {

        //        Queue<String> queue = new LinkedList<String>();
        //        //        Insertion
        //        queue.offer("March");
        //        queue.offer("April");
        //        queue.offer("June");
        //        queue.offer("July");
        //        queue.offer("December");
        //
        //        System.out.println(queue.poll());
        //        
        //        System.out.println(queue);
        //        System.out.println(queue.peek());
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(5); 
        pq.add(10);
        pq.add(7);
        pq.add(8);
        pq.add(9);

        System.out.println(pq);
    }

}
