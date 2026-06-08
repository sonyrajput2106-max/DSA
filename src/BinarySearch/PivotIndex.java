package BinarySearch;

public class PivotIndex {

    static int findPivotIndex(int arr[]){
      int n = arr.length;
      int start =0;
      int end =n-1;
      int ans =-1;

      if (arr[start] < arr[end]){
          return -1;
      }

      while(start <= end){
          int mid = start +(end - start)/2;

          if(arr[mid]<= arr[n-1]){
              //move left
              end = mid -1;
          }
          else{
              ans = mid;
              start = mid +1;
          }
      }
return ans;

    }

    static void main() {
int arr[ ] = { 4,5,6,0,1,2};
        System.out.println(findPivotIndex(arr));

    }
}
