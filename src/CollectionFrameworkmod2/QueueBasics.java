package CollectionFrameworkmod2;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics {
    static void main() {
        Queue<Integer>  g = new LinkedList<>();

        //Methods  use offer instead of add
        g.offer(10);
        g.offer(20);
        g.offer(30);
        System.out.println(g);

        //Peek methods insetad of element becoz it throws an exeption
        System.out.println(g.peek());

        //poll -> remove first element and return it
        System.out.println("Removing:" +g.poll());


        //
    }
}
