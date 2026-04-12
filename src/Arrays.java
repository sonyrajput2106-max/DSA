public class Arrays {
    static void main() {

        //find maximum value from the array
        int arr[] = {3, 2, -5, 21, 15};
        int n = arr.length;
        int maxValue = arr[0];

        //compare maxValue with array elements
        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] > maxValue) {
                //update maxValue
                maxValue = arr[i];
            }
        }
        System.out.println(maxValue);


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
