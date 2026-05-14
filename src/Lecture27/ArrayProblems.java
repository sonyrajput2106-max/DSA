package Lecture27;

public class ArrayProblems {

    //getting average of elements in array
    static double getAverage(int[] arr){
        double sum = 0;
        for (int i :arr){
            sum = sum+i;
        }
        int size = arr.length;
        double avg = sum/size;
        return avg;
    }


    //Multiplying elents in the array by ten
    static int[] mulElements(int[] arr){
    int [] newArray = new int[arr.length];

    for (int i =0; i<arr.length; i++){
    newArray[i]=arr[i]*10;
    }
    return newArray;
    }


    //Searching for an element in the array
    static boolean findElement(int[] arr){
        int target =7;
        for (int i=0; i<arr.length; i++){
            if (arr[i] == target){
                return true;
            }
        }
        //all the array traversed
        return false;
    }


    //Getting max element from the array
    static int getMaximum(int [] arr){
        int max = arr[0];

        for (int i =0; i< arr.length;i++){

            //with Math.max() function
//            max = Math.max(max, arr[i]);
            if (arr[i] > max){
                max = arr[i];
            }
        }
        //jab m yaha pahuchuga matlab sara array traverse ho chuka h nd
        //max has the highest value
        return max;
    }


    //finding sum of =ve and -ve no.s in the array
    static int[] getSum(int [] arr){
        int positiveSum =0;
        int negativeSum = 0;

        for (int i =0; i< arr.length;i++){
            if (arr[i] >0){
                positiveSum = positiveSum+arr[i];
            }
            else{
                negativeSum += arr[i];
            }
        }
        int ans [] = {positiveSum,negativeSum};
        return ans;
    }


    //count no of 0's and 1's
    static int[] getCount (int[] arr){
        int zeroCount = 0;
        int oneCount = 0;

        for (int i =0; i<arr.length;i++){
            if (arr[i] == 0){
                zeroCount +=1;
            }
            else{
                oneCount +=1;
            }
        }
        int ans [] ={zeroCount,oneCount};
        return ans;
    }

    static void main() {
//        int[] arr ={2,4,5,2,5};
//        System.out.println(getAverage(arr));

//        int [] arr ={1,2,3,4,5};
//        int[] result = mulElements(arr);
//        for (int i : result){
//            System.out.println(i+" ");
//        }

//        int arr[] ={2,4,3,6,7};
//        boolean ans = findElement(arr);
//        System.out.println(ans);


//        int arr[] ={4,6,8,43,6,4};
//        System.out.println(getMaximum(arr));

//        int arr[] ={ 2,5,-4,7,-6,-9,6};
//        int ans[] = getSum(arr);
//        System.out.println("positive sum is :" + ans[0]);
//        System.out.println("negative sum is: " + ans[1]);


        int arr[] ={1,1,0,1,0,0,1,0};
        int ans []= getCount(arr);
        System.out.println("number of 0's are:" + ans[0]);
        System.out.println("number of 1's are :" + ans[1]);

    }
}
