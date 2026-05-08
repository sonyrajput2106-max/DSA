package CollectionFrameworkmod3;

import java.util.Comparator;

public class WeightComparator implements Comparator<Student> {


    //this is a comment
    @Override
    public int compare(Student o1, Student o2) {
        return o1.weight - o2.weight;
    }
}
