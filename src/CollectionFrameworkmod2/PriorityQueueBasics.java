package CollectionFrameworkmod2;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasics {
    static void main() {
        Queue<Integer> pq = new PriorityQueue<>();  //in parameters write (a,b)->b-a
        //default behaviour   ->Integer  -> less value will have more priority
        //maxHeap -> Integers -> high value -> more priority
        //pq -> strings -> comparator
        pq.offer(10);
        pq.offer(30);
        pq.offer(56);
        pq.offer(67);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());


    }
}
