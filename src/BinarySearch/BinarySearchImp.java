package BinarySearch;

public class BinarySearchImp {


    static int binarySearch(int [] arr){
        int target = 9;
        int n = arr.length;
        int start =0;
        int end = n-1;
        int mid = (start+end)/2; // mid = start + (end-start)/2

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

    //Lower bound
    static int getLowerBound(int arr[], int target){

        int n = arr.length;
        int s=0;
        int e=n-1;
        int ans = -1;

        while(s<=e){
            int mid = s+(e-s)/2;

            if (arr[mid]>= target){
                //store ans
                ans = mid;
                //move to left
                e= mid-1;
            }
            else{
                //move to right
                s = mid +1;
            }
        }
return ans;
    }


    //Upper Bound
    static int getUpperBound(int arr[], int target){
        int n = arr.length;
        int s=0;
        int e=n-1;
        int ans = -1;

        while(s<=e){
            int mid = s+ (e-s)/2;

            if(arr[mid]<=  target){
                // move right
                s= mid + 1;

            }
            else{
                //arr[mid] > target
                //store ans
                ans = mid;
                //move left
                e = mid -1;
            }
        }
        return ans;
    }

    static void main() {
//         int arr[] ={-1,0,3,5,9,12};
//        System.out.println(binarySearch(arr));

        int target=35;
       int arr[]={10,20,30,30,30,30,30,40,50};
//        int ans = getLowerBound(arr , target);
        int ans = getUpperBound(arr, target);
       System.out.println(ans);
    }
}
