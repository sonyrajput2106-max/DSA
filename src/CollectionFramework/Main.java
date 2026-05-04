package CollectionFramework;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    static void main() {


        //List or collection -> interface

        //ArrayList  -> concrete class
        ArrayList<Integer> list = new ArrayList<>();

//        LinkedList<Integer > list = new LinkedList<>();
        // vector
//        Vector<Integer> vec = new Vector<>();

        Stack<Integer> st = new Stack<>();
        st.push(10);
        System.out.println(st);

        st.push(23);
        System.out.println(st);

        st.push(56);
        System.out.println(st);

        st.pop();
        System.out.println(st);

        System.out.println(st.peek());

        System.out.println(st.search(12));

        System.out.println(st.empty());


        //add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);


        //remove
        list.remove(2);
        System.out.println(list);

        //addAll
        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        System.out.println(list2);


        list.addAll(list2);
        System.out.println(list);
        //removeAll
        list.removeAll(list2);
        System.out.println(list);

        System.out.println(list.size());

        System.out.println("printing list2:" + list2);
        list2.clear();
        System.out.println(list2.size());


        //traverse list using iterator
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("element :"+ iterator.next());
        }

        List<Integer> list3 = new ArrayList<>();
        list3.add(34);
        list3.add(45);
        list3.add(56);
        System.out.println(list3.get(2));
        list3.set(0,23);
        System.out.println(list3);

//toArray
         Object[] arr = list3.toArray();
         for (Object obj :arr){
             System.out.println(obj);
         }

         //contains
        System.out.println( list3.contains(23));



         list.add(7);
         list.add(50);
        System.out.println("printing entire list:"+ list);

        //sort an array
        Collections.sort(list);
        System.out.println(list);


        //clone
        ArrayList<Integer> newList = (ArrayList<Integer>) list.clone();
        System.out.println("printing entire new list:" + newList);

        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(75);

        System.out.println(newList.isEmpty());

        list.add(30);
        list.add(34);
        list.add(30);
        System.out.println("printing origial list:"+ list);
        System.out.println(list.lastIndexOf(30));
        System.out.println(newList.indexOf(40));


        //addFirst and addLast

        list.remove(3);
        list.remove(4);
        list.remove(5);
        System.out.println("printing origial list:"+ list);
//         list.addFirst(45);


        //Linked list
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        System.out.println(ll);
        ll.addFirst(1);
        System.out.println(ll);
        ll.addLast(101);
        System.out.println(ll);

        //removeFirst
//        ll.removeFirst();
//        System.out.println(ll);
//
//        //removeLast
//        ll.removeLast();
//        System.out.println(ll);


        System.out.println(ll.getFirst());

        System.out.println(ll.getLast());

        //peek
        System.out.println(ll.peek());

        //poll -> returns and remove the first element
        System.out.println(ll.poll());
        System.out.println(ll);





//    //or
//    List<Integer> list = new ArrayList<>();
//    //or
//    Collection<Integer> collection = new ArrayList();
    }
}
