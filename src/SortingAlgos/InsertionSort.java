package SortingAlgos;

public class InsertionSort {

    static void insertionSort(int arr[]){

        int n = arr.length;
        for (int i =1; i<n;i++){
            int curr =i;
            int prev = i-1;
            int currVal = arr[i];


            while( prev >=0 && currVal< arr[prev]){
                arr[prev+1] =  arr[prev];
                prev--;
            }

            //now we have an empty space
            //place the currVal on prev+1
            arr[prev+1] = currVal;
        }

    }

    static void main() {
        int arr[] ={6,5,1,3,4,2};
        insertionSort(arr);
        System.out.println("Printing the array:");
        for (int value: arr){
            System.out.print(value +" " );
        }
    }
}
