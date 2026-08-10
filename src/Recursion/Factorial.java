package Recursion;

public class Factorial {

    public static int factorial(int n){
        if(n==0){
            return 1;
        }

        return n * factorial(n-1);
    }
    static void main() {
          int n =5;
        System.out.println(factorial(n));


    }
}
