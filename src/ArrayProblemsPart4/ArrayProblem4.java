package ArrayProblemsPart4;

import java.util.Arrays;

public class ArrayProblem4 {

    //two sum
    static int[] twoSum(int[] arr) {

        int n = arr.length;
        int target =9;

        for (int i =0; i<n-1;i++){
            for (int j =i+1; j<n;j++){
                if (arr[i]+arr[j] == target){
                    int[] ans = {i,j};
                    return ans;
                }
            }
        }
        int [] ans = {};
        return ans;
    }

    //three sum
    static int[] threeSum(int arr[]){
        int n = arr.length;
        int target = 10;

        for (int i =0; i <n-2;i++){
            for (int j =i+1;i<n-1;j++){
                for (int k = j+1; k<n;k++){
                    if (arr[i]+arr[j]+arr[k]==target){
                        int[] ans = {i,j,k};
                        return ans;
                    }
                }
            }
        }
        int [] ans = {};
        return ans;
    }


    static void main() {
//        int[] arr ={2,5,7,3,1};
//        System.out.println(Arrays.toString(twoSum(arr)));

        //three seum
        int arr[]={1,5,6,4,7};
        System.out.println(Arrays.toString(threeSum(arr)));
    }
}
