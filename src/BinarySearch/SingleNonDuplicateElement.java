package BinarySearch;

public class SingleNonDuplicateElement {


    static int singleNonDuplicate(int[] nums){
    int n = nums.length;

    int s =0;
    int e = n-1;

    while(s<= e){
        int mid = s+(e-s)/2;

        //songle element
        if (s==e){
            return nums[s];
        }

        //non-single element
        int currValue = nums[mid];
        int prevValue = -1;
        if (mid -1 >= 0){
            prevValue = nums[mid -1];
        }

        int nextValue =-1;
        if (mid+1 < n){
            nextValue = nums[mid+1];
        }
       if (currValue != prevValue && currValue != nextValue){
           return currValue;
       }

       if (currValue != prevValue && currValue==nextValue){
           int startingIndexOfPair = mid ;
           if ((startingIndexOfPair & 1) ==1){
               //startingIndex -> odd wala case
               //ans left m hoga
               e = mid -1;
           }
           else{
               //startingIndex -> even wala case
               s = mid +1;
           }
       }
       else if(currValue == prevValue && currValue != nextValue){
           int endingIndexOfPair = mid;
           if ((endingIndexOfPair & 1)==1){
               //ending index is odd
               //ans right m hoga
               s = mid+1;

           }
           else{
               //ending index is even
               //move to left
               e = mid -1;
           }
        }
    }
return -1;
    }

    static void main() {
        int nums[] ={1,1,2,2,3,3,4,5,5};
        System.out.println(singleNonDuplicate(nums));
    }
}
