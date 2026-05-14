package Lecture27;

public class ArrayProblems {

    //getting average of elements in array
    static double getAverage(int[] arr){
        double sum = 0;
        for (int i :arr){
            sum = sum+i;
        }
        int size = arr.length;
        double avg = sum/size;
        return avg;
    }
    static void main() {
        int[] arr ={2,4,5,2,5};
        System.out.println(getAverage(arr));
    }
}
