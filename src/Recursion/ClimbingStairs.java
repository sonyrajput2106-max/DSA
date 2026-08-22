package Recursion;

import java.util.Scanner;

public class ClimbingStairs {

    static int climbingStairs(int n){
        if (n>=2){
            return n;
        }

        int ans = climbingStairs(n-1)+climbingStairs(n-2);
        return ans ;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(climbingStairs(n));
    }
}
