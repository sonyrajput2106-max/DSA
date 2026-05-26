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
    static void main() {
//        int[] arr = {1,0,1,0,0,1,1};
//        System.out.println(sortZeroOnes(arr));
//        for (int i :arr){
//            System.out.print(i + " ");
//        }

        int [] arr ={0,4,3,1,2};
        System.out.println(findMissingNumber(arr));


        int[] arr1 ={ 2,3,4,3,2,1};
        System.out.println(uniqueElement(arr1));
    }
}
