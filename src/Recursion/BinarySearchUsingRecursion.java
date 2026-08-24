package Recursion;

public class BinarySearchUsingRecursion {

    static int solve(int arr[], int target, int s,int e){
        //base case
        if (s>e){
            return -1;
        }

        //processing or binary search logic
        int mid = s+ (e-s)/2;
        if (arr[mid]==target){
            return mid;
        }
        if (arr[mid]>target){
            e = mid -1;
        }
        if (arr[mid] < target){
            s=mid +1;
        }
        return solve(arr,target, s,e);
    }


    static void main() {
        int arr[]={10,20,30,40,50,60};
        int s = 0;
        int e = arr.length-1;
        int target= 50;
        solve(arr,target,s,e);

    }
}
