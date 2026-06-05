package SortingAlgos;

public class SelectionSort {

    static void selectionSort(int arr[]){

        int n = arr.length;
        //outer loop for rounds
        for (int i =0; i<n-1;i++){
            int minIndex =i;

            //inner loop -> comparison  arr[j] and arr[minIndex]
            for (int j = i+1; j<n;j++){
                 if (arr[j]<arr[minIndex]){
                     minIndex=j;
                 }
            }

            //jab comparison complete hogya
            //minIndex ko uski correct position p dall do
            //swap arr[i] , arr[minIndex]
            int temp = arr[i];
            arr[i]= arr[minIndex];
            arr[minIndex] = temp;
        }

    }

    static void main() {
        int arr[] ={6,5,1,3};
        selectionSort(arr);
        System.out.println("Printing the array:");
        for (int value: arr){
            System.out.print(value + " " );
        }
    }
}
