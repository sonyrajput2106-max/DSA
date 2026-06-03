package Lecture32;

public class MaxSumArray {

    static int maxSumArray(int [] arr){
        int sum =0;
        int maxSum = Integer.MIN_VALUE;


        for (int i =0; i< arr.length ; i++){
//            step1
            sum = sum+ arr[i];
//             step 2 : maxsum update kro
            maxSum =  Math.max(maxSum, sum);

            //step 3 : check sum for negative numbers
            if (sum<0){
                sum = 0;
            }
        }
        return maxSum;
    }

    static void main() {

        int[] arr = {-2, 1, -3, 4 , -1 , 2 ,1 , -5, 4};
        System.out.println(maxSumArray(arr));
    }
}
