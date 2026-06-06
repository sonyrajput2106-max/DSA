package BinarySearch;

public class BinarySearchImp {


    static int binarySearch(int [] arr){
        int target = 9;
        int n = arr.length;
        int start =0;
        int end = n-1;
        int mid = (start+end)/2;

        while(start <= end){
            //compare target with midValue
            if (arr[mid]== target){
                return mid;
            }
            else if (target > arr[mid]) {
             start = mid +1;
            }
            else{
                end = mid -1;
            }
            //update mid
            mid= (start+end) /2;
        }
        //target not foung
        return -1;
    }

    static void main() {
         int arr[] ={-1,0,3,5,9,12};
        System.out.println(binarySearch(arr));
    }
}
