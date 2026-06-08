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

    static int searchRotatedArr(int arr[], int target){
      int start =0;
      int end = arr.length-1;

      while(start <= end){
          int mid = start +(end - start)/2;

          if (arr[mid]==target){
              return mid;
          }

          //left half is sorted
          if (arr[start]<= arr[mid]){
              if (target>= arr[start] && target < arr[mid]){
                  end = mid-1;
              }
              else{
                  start = mid +1;
              }
          }

          //right half is sorted
          else{
              if (target > arr[mid] && target <= arr[end]){
                  start = mid +1;

              }
              else{
                  end = mid -1;
              }
          }
      }
        return -1;
    }

    static void main() {
int arr[] = { 4,5,6,0,1,2};
//        System.out.println(findPivotIndex(arr));

int target = 2;
        System.out.println(searchRotatedArr(arr, target));
    }
}
