package BinarySearch;

public class SearchInNearlySortedArr {

    static int searchInNearlydSortedArray(int arr[] , int k ){
        int n = arr.length;

        int s=0;
        int e =n-1;

        while(s<= e){
            int mid = s+(e-s)/2;

            if (arr[mid-1] ==k){
                return mid-1;
            }
            if (arr[mid]==k) return mid;
            if(arr[mid+1]==k) return mid+1;

            if(k > arr[mid]){
                s = mid +1;
            }
            else{
                e = mid -1;
            }
        }
        return -1;
    }

    static void main() {
        int arr[]={3,5,10,9,11};
        int k =10;
        System.out.println(searchInNearlydSortedArray(arr, k));
    }
}
