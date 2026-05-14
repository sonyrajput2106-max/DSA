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


    //Multiplying elents in the array by ten
    static int[] mulElements(int[] arr){
    int [] newArray = new int[arr.length];

    for (int i =0; i<arr.length; i++){
    newArray[i]=arr[i]*10;
    }
    return newArray;
    }


    //Searching for an element in the array
    static boolean findElement(int[] arr){
        int target =7;
        for (int i=0; i<arr.length; i++){
            if (arr[i] == target){
                return true;
            }
        }
        //all the array traversed
        return false;
    }


    static void main() {
//        int[] arr ={2,4,5,2,5};
//        System.out.println(getAverage(arr));

//        int [] arr ={1,2,3,4,5};
//        int[] result = mulElements(arr);
//        for (int i : result){
//            System.out.println(i+" ");
//        }

        int arr[] ={2,4,3,6,7};
        boolean ans = findElement(arr);
        System.out.println(ans);

    }
}
