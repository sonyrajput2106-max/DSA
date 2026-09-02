package Recursion;

public class JumpGame {


    public static boolean solve(int [] nums , int index ){
        //base case
        if (index == nums.length-1){
            return true;
        }
        if (index >= nums.length){
            return false;
        }
        if (nums[index]==0){
            return false;
        }

        //solve one case
        int jumpValue = nums[index];
        //jumpValue -> m,ax jump possible
        boolean overallAns= false;
        for (int jump=1; jump<=jumpValue;jump++){
            boolean recAns = solve(nums, index+jump);
            overallAns = overallAns||recAns;
        }
        return overallAns;
    }

    public static boolean jumpGame(int[]nums){
        int index =0;
        boolean ans = solve(nums,index);
        return ans;
    }

    static void main() {
int [] nums = {2,3,1,1,4};
        System.out.println(jumpGame(nums));
    }
}
