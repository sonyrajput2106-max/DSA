package Lecture28;

public class ArrayManipulationProblem {

    static void reverseArray(int[] arr){
        int temp;
        int n = arr.length;
         int i =0;
        int j=n-1;

        while(i<=j){
            temp =arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        for (int k :arr){
            System.out.println(k);
        }
    }


    //shifing elements by 1 position
    static void shiftPosByOne(int[] arr ){
        //step 1: store last wale ki value in temp
        //step2: shift all values of array
        //step 3:temp ki value ko 0th index p copy
        int n = arr.length;
        for (int i=0;i<=arr.length;i++){
            arr[i+1] = arr[i%n];
        }
        for (int k:arr){
            System.out.println(k);
        }
    }

    static void main() {
        int arr[] ={1,2,3,4,5};
        reverseArray(arr);
        shiftPosByOne(arr);

    }
}
