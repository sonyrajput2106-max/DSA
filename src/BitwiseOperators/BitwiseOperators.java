package BitwiseOperators;

public class BitwiseOperators {
    static void main() {

//        int a = 5;
//        int b = 6;
//        System.out.println(a|b);
//        System.out.println(a & b);
//        System.out.println(a ^ b);
//        System.out.println(~b); // by 2's compliment
//        System.out.println( a<< 1); //  left shift ->  multiplied by 2


        //left shift
//        int n = 5;
//for (int i =1; i<=32; i++){
//    n = n<<1;
//    System.out.println(n);
//    System.out.println();
//}

//right shift (>>) -> divide by 2
//        int n = 100;
//for (int i =1; i<=10; i++){
//    n = n>> 1;
//    System.out.println(n);
//    System.out.println();
//}


        //check even or odd
//        int n = 11;
//        if ((n&1) == 0){
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("Odd");
//        }

        //power of 2  -> 1 set bit present
//        int n = 5;
//        int count = 0;
//        while(n!=0){
//            if ((n&1) !=0){
//                //mujhe ke set bit mil gyi
//                count ++;
//            }
//            //right shift to remove this bit
//            n = n>>1;
//        }
//        System.out.println("set bit count :" +count);

        //another method
//        int n = 16;
//        if ((n & (n-1)) ==0){
//            System.out.println("power of 2");
//        }
//        else {
//            System.out.println("not power of 2");
//        }

        //swapping two numbers using xor operation
//        int a = 5;
//        int b= 6;
//        a = a^b;
//        b = a^b;
//        a = a^b;
//        System.out.println(a);
//        System.out.println(b);


        //finding unique element in the array
//        int [] arr = {10, 24, 17, 24 , 10 , 13 , 17};
//        System.out.println(10^24^17^24^10^13^17);
//   }

        //or
//        int[] arr = {10, 24, 17, 24, 10, 13, 17};
//
//        int result = 0;
//
//        for (int num : arr) {
//            result = result ^ num;
//        }
//
//        System.out.println(result);


        //remove last set bit
        int n = 10;
        System.out.println((n&(n-1)));

        //getiing last set bit
        System.out.println(n& -(n));
    }
}
