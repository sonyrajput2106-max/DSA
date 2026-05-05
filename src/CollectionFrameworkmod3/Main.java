package CollectionFrameworkmod3;

import java.util.*;

public class Main {
    static void main() {

        Integer[]  arr = {5,4,3,7,9,12};
        Arrays.sort(arr , new ReverseComparator());
        for (int a : arr){
            System.out.print(a+" ");
        }
//
//List<Student> students = new ArrayList<>();
//
//students.add(new Student(19 ,"Sona" , 50));
//students.add(new Student(23 ,"mona" , 40));
//students.add(new Student(23 ,"tona" , 57));
//students.add(new Student(24 ,"rona" , 55));
//
//        System.out.println(students);
//
//        Collections.sort(students, new WeightComparator());

//      Collections.sort(students, new Comparator<Student>() {
//          @Override
//          public int compare(Student o1, Student o2) {
//              return o1.weight-o2.weight;
//          }
//      });

//        Collections.sort(students, (o1,o2) ->o1.weight-o2.weight);
//
//
//        System.out.println(students);

//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(40);
//        list.add(5);
//        list.add(17);
//        System.out.println(list);
//
//
//        Collections.sort(list);
//        System.out.println(list);
    }
}
