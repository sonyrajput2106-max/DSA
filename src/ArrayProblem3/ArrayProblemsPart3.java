package ArrayProblem3;

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

    }
    static void main() {
        int[] arr = {1,0,1,0,0,1,1};
        System.out.println(sortZeroOnes(arr));
        for (int i :arr){
            System.out.print(i + " ");
        }

    }
}
