package ArrayProblemsPart4;

import java.util.Arrays;
import java.util.HashMap;


public  class ArrayProblem4 {

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
//    static int[] threeSum(int arr[]){
//        int n = arr.length;
//        int target = 10;
//
//        for (int i =0; i <n-2;i++){
//            for (int j =i+1;i<n-1;j++){
//                for (int k = j+1; k<n;k++){
//                    if (arr[i]+arr[j]+arr[k]==target){
//                        int[] ans = {i,j,k};
//                        return ans;
//                    }
//                }
//            }
//        }
//        int [] ans = {};
//        return ans;
//    }

//        static List<List<Integer>> threeSum(int[] nums) {
//            List<List<Integer>> ans = new ArrayList<>();
//            Arrays.sort(nums);
//            int n = nums.length;
//
//            for(int i =0;i<n-2;i++ ){
//                //skip duplicates
//                if(i>0 && nums[i]==nums[i-1]){
//                    continue;
//                }
//
//                int j= i+1;
//                int k = n-1;
//
//                while(j<k){
//                    int total = nums[i]+nums[j]+nums[k];
//
//                    if(total == 0){
//                        ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
//
//                        //skip duplicates
//                        while(j<k && nums[j] == nums[j+1]){
//                            j++;
//                        }
//
//                        while(j<k && nums[k]== nums[k-1]){
//                            k--;
//                        }
//
//                        j++;
//                        k--;
//                    }
//                    else if(total <0){
//                        j++;
//                    }
//
//                    else{
//                        k--;
//                    }
//                }
//            }
//            return ans;
//        }
//
//
//    }

    //Remove duplicates from the array
    static int removeDuplicates(int nums[]){
        int i =0;
        int j =i+1;
        int n = nums.length;

        while(j<n){
            if (nums[i]== nums[j]){
                j++;
            }
            else{
                  i++;
                  nums[i]= nums[j];
                  j++;
            }
        }
        return i+1;
    }


    //find first repeating element
    static int firstRepeatingElement(int arr[]){
        HashMap<Integer, Integer> freq = new HashMap<>();

        //counting frequencies
        for(int num : arr){
            freq.put(num, freq.getOrDefault(num , 0)+1);

        }

        //finf first repeating element
        for(int num :arr){
            if(freq.get(num)>1){
                return num;
            }
        }
        return -1;
    }

    static void main() {
//        int[] arr ={2,5,7,3,1};
//        System.out.println(Arrays.toString(twoSum(arr)));

        //three seum
//        int[] nums = {-1, 0, 1, 2, -1, -4};
//
//        System.out.println(ArrayProblem4.threeSum(nums));
//    }


        //duplicates removed
//        int [] nums ={1,1,1,2,2,3,3,3,4,4,4};
//        int k = removeDuplicates(nums);
//        System.out.println(removeDuplicates(nums));
//        for (int i=0; i<k ; i++){
//            System.out.print(nums[i]+" ");
//        }

        //repeated element
        int  arr[] ={4,5,7,6,5,9};
        System.out.println(firstRepeatingElement(arr));
    }
}