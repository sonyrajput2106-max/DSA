package ArrayProblem3;
import java.util.Arrays;

public class ArrayProblemsPart3 {

    //sorting 0's and 1's in the array
    static int[] sortZeroOnes(int[] arr ){
        int n = arr.length;
        int i =0;
        int j =n-1;

        while(i<j){
            if (arr[i] == 1 && arr[j] ==0){
                //swap
                arr[i]=0;
                arr[j]=1;
            }
            if (arr[i] ==0){
                i++;
            }
            if (arr[j]==1){
                j--;
            }
        }
        return arr;
    }

    //finding the missing number
    static int findMissingNumber(int[] arr){
int xorSum = 0;
//xor with all array elements
        for (int n: arr){
            xorSum = xorSum^n;
        }
        //xor with all elements in the range
        int n = arr.length;
        for (int i =0; i <=n ; i++){
            xorSum = xorSum^i;
        }
        return xorSum;
    }


    // finding the unique element from the array
    static int uniqueElement(int [] arr1 ){
        int xorSum2 =0;
        for (int n :arr1){
            xorSum2 = xorSum2^n;
        }
        return xorSum2;
    }

    //sorting 0's ' 1's and 2's
    static int[] sort(int[] nums){
        int n = nums.length;
        int low=0;
        int mid =0;
        int high = n-1;

        while(mid <= high){
            if (nums[mid] ==0){
//                swap  mid with low nd increment low nd mid
                int temp = nums[low];
                nums[low]=nums[mid];
                nums[mid]= temp;

                //increment low
                low++;
                mid++;

            }

            else if (nums[mid]==1){
                //mid ko age bdhao
                mid++;
            }
            else if(nums[mid]==2){
                //swap with high
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                //nd decrement high
                high --;
            }
        }
    return nums;
    }
    static void main() {
//        int[] arr = {1,0,1,0,0,1,1};
//        System.out.println(sortZeroOnes(arr));
//        for (int i :arr){
//            System.out.print(i + " ");
//        }

//        int [] arr ={0,4,3,1,2};
//        System.out.println(findMissingNumber(arr));
//
//
//        int[] arr1 ={ 2,3,4,3,2,1};
//        System.out.println(uniqueElement(arr1));

        int[] arr = {2,0,1,2,1,0};

        int[] ans = sort(arr);

//        System.out.println(ans);
        System.out.println(Arrays.toString(ans));
    }
}
