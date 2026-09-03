package Recursion;

public class SubsequenceWithSumK {


    public static boolean solve(int arr[], int k , int sum, int index){
        //base case
        if (index>= arr.length){
            if (sum==k)
                return true;
            else
                return false;
        }

        int currValue = arr[index];
        //exclude case
        boolean excludeAns = solve(arr,k,sum,index+1);
        //include case
        boolean includeAns = solve(arr,k,sum+currValue,index+1);

        boolean finalAns= includeAns || excludeAns;
        return finalAns;


    }

public static boolean checkSubsequence(int arr[], int k ){
    int index=0;
    int sum =0;
    boolean ans = solve(arr, k,sum,index);
    return ans ;
}

    static void main() {
        int arr[]={10,1,2,7,6,1,5};
        int k =8;
        System.out.println(checkSubsequence(arr, k));
    }
}
