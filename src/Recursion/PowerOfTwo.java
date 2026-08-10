package Recursion;

public class PowerOfTwo {
  static int powerOfTwo(int n){
     if(n==0) {
         return 1;
     }

     return 2 * powerOfTwo(n-1);
 }
    static void main() {
        int n =4;
        System.out.println(powerOfTwo(n));
    }
}
