package CollectionFrameworkmod2;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeques {
    static void main() {
        //Array implementation of queue
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offerFirst(5);
        q.offerLast(30);
        System.out.println(q);

        q.pollFirst();
        System.out.println(q);

        q.pollFirst();
        System.out.println(q);

        System.out.println(q.peekFirst());


    }
}
