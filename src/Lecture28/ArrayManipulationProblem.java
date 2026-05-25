package Lecture28;

import java.util.HashMap;

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
        int n = arr.length;
        int temp = arr[n-1];
        //step2: shift all values of array

    for (int i=n-1;i>0;i--){
        arr[i] =arr[i-1];
    }
//step 3:temp ki value ko 0th index p copy
    arr[0]=temp;
    }


    //printing extreme  alternate elements in the array
    static void printAlternate(int arr[]){
        int n = arr.length;
        int i =0;
        int j =n-1;

        while(i<=j){
            if (i==j){
                System.out.println(arr[i]);
                return;
            }
            else{
                //i<j
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }
    }


    //printing mode of the array
    static int getMode(int arr[]){
        HashMap<Integer,Integer> freq = new HashMap<>();

        int mode = arr[0];
        int maxCount = 0; //stores highest freq

        for (int num :arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);


//        for (int i : freq.keySet()){
//            //i -> will represent key
//            System.out.println(i+ " -> " + freq.get(i));
//        }

            if (freq.get(num) > maxCount) {
            maxCount = freq.get(num);
            mode = num;
            }
        }

        //jab loop se bahar aaoge toh max freq wali key ready hogi
        return mode;
    }


    //printing highest nd lowest frequency element
    static int highAndLowestFreq(int arr[] ) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int minCount =0;
        int maxCount  = 0;

    }

    static void main() {
        int arr[] ={1,2,2,2,4,5,5,5,5,3,4,5,6};
      int ans =getMode(arr);
        System.out.println(ans);



//        printAlternate(arr);


//        reverseArray(arr);
//        shiftPosByOne(arr);
//        for (int a : arr){
//        System.out.print(a+" ");
//       }
//        System.out.println();
   }
}
