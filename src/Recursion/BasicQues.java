package Recursion;

import java.util.Scanner;

public class BasicQues {

    static void printMyName(int n){
        if(n==0){
            return;
        }

        System.out.println("My Name is Sona");

        printMyName(n-1);
    }

    static void printNum(int n, int count){
        if(count >n){
            return;
        }

        System.out.println(count );

        printNum(n,count+1);
    }

    static void main() {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        printMyName(n);

        printNum(5,1);

    }
}
