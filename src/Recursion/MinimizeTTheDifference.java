package Recursion;

public class MinimizeTTheDifference {

    static int solve(int sum , int target , int[][] mat , int row){
        //base case
        if(row >= mat.length){
            //invalid row
            //calculate diff between target and sum
            return Math.abs(target-sum);
        }
//1 case m solve krugi baki recursion krega
        int mini = Integer.MAX_VALUE;

        //m row index pr khadi hu , isme multiplle columns h
        //pr valye pdi h , and m har ek column ko one by  one consider kruga and bar bar answers
        //ka minimum leta rhuga

        for(int num :mat[row]){
           int ans =  solve(sum+num, target , mat , row+1);
           mini = Math.min(mini,ans);

        }
return mini;
    }



    public static  int minimizeDiff(int[][] mat , int target){
        int row =0;
        int sum =0;
        int ans = solve(sum , target , mat , row);
        return ans;
    }
    static void main() {
int [][] mat  = {{1,2,3},{4,5,6},{7,8,9}};
int target = 13;
        System.out.println(minimizeDiff(mat, target));
    }
}
