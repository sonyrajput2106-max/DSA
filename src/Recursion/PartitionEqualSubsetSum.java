package Recursion;

public class PartitionEqualSubsetSum {


    public static boolean solve(int target , int[]nums , int index){
        //base case
        if(target==0){
            return true;
        }
        if (target <0){
            return false;
        }
        if (index >= nums.length){
            return false;
        }

        //include-exclude pattern
        boolean includeAns =  solve(target-nums[index] , nums , index+1);
        boolean excludeAns = solve(target , nums , index+1);

        return includeAns||excludeAns;
    }


    public static boolean canPartition(int[] nums){
        int sum =0;
        for(int num:nums){
            sum += num;
        }

        int index =0;

    int target = sum/2;

    boolean ans = solve(target, nums, index);
    return ans;
    }
    static void main() {
    int [] nums = {1,5,11,5};

        System.out.println(canPartition(nums));
    }
}
