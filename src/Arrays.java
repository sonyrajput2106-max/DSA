import java.util.Scanner;

public class Arrays {
    static void main() {

        //finding max value from the 2d array
        int crr[][] = {{1, 2, 3}, {21, 20, 19}};
        int maxValue = crr[0][0];

        for (int i = 0; i <= crr.length - 1; i++) {
            for (int j = 0; j <= crr[i].length - 1; j++) {
                if (crr[i][j] > maxValue) {
                    maxValue = crr[i][j];
                }
            }
        }
        System.out.println(maxValue);

//print sum of elements of the array
        int array[][] = {{1, 2, 3}, {1, 2, 3}};
        int sum = 0;

        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j <= array[i].length - 1; j++) {
                int value = array[i][j];
                sum = sum + value;
            }
        }
        System.out.println(sum);


        int arr[][] = new int[3][4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.println("provide value for row =" + i + "nd column =" + j);
                arr[i][j] = sc.nextInt();


            }
        }
//print
        for (int rowIndex = 0; rowIndex <= arr.length - 1; rowIndex++) {
            for (int colIndex = 0; colIndex <= arr[rowIndex].length - 1; colIndex++) {
                System.out.print(arr[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }

        //2D arrays
        //declaration
//        int[][] arr;
////allocation
//        arr = new int[3][4];
//        //init
//        int[][] brr = {
////                {1, 2},
////                {2, 3},
////                {3, 4},
////                {4, 5}
//                {1, 2},
//                {2, 3, 4, 5},
//                {3, 4, 4, 5, 6, 7},
//                {4}
//        };
////        System.out.println(brr[0][0]);
//
//        int rowLength = brr.length;
////        int colLength = brr[0].length;
//
//        for (int rowIndex = 0; rowIndex <= rowLength - 1; rowIndex++) {
//
//            int colLength = brr[rowLength].length;
//            for (int colIndex = 0; colIndex <= colLength - 1; colIndex++) {
//                System.out.print(brr[rowIndex][colIndex] + " ");
//            }
//            System.out.println();
//        }

        //find maximum value from the array
//        int arr[] = {3, 2, -5, 21, 15};
//        int n = arr.length;
//        int maxValue = arr[0];
//
//        //compare maxValue with array elements
//        for (int i = 0; i <= n - 1; i++) {
//            if (arr[i] > maxValue) {
//                //update maxValue
//                maxValue = arr[i];
//            }
//        }
//        System.out.println(maxValue);


        //sum of elements of the array
//        int arr[] = {10, 20, 30, 40, 50};
//        int sum = 0;
//        int n = arr.length;
//        for (int i = 0; i <= n - 1; i++) {
//            int value = arr[i];
//            sum = sum + value;
//        }
//        System.out.println(sum);

//        int arr[] = {12, 14, 1245};
//
//        int n = arr.length;
//        for (int i = 0; i <= n - 1; i++) {
//            System.out.println(arr[i]);
//        }

//        int arr[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
//        for (int i = 0; i <= n - 1; i++) {
//            System.out.println("provide input for index:" + i);
//            arr[i] = sc.nextInt();
//        }
//
//        //print
//        System.out.println("You array contains:");
//        for (int val : arr) {
//            System.out.println(val);
//        }
        //declaration
//        int arr[];
//
//        //allocation
//        arr = new int[5];
//
//        //init
//        int brr[] = {10, 20, 30};
//
//        int n = brr.length;
//        for (int val : brr) {
//            System.out.println(val);
//        }
//        for (int index = 0; index <= n; index++) {
//            System.out.println(brr[index]);
//        }
//        System.out.println("Value at 0 index  " + brr[0]);
//        System.out.println("Value at 1 index  " + brr[1]);
//        System.out.println("Value at 2 index   " + brr[2]);
    }
}