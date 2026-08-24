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

    static void printArr(int[] arr, int i){
        //base case
        if (i>=arr.length){
            return;
        }

        System.out.println(arr[i]);

        printArr(arr,i+1);
    }

    static void printMaxElement(int arr[] , int i,int maxi){
        //base case
        if (i>=arr.length){
            System.out.println("max value:" + maxi);
            return ;
        }


        if (arr[i]>maxi){
            maxi = arr[i];
        }

        printMaxElement(arr,i+1 , maxi);
    }


    static int findTarget(int arr[] , int i , int target){
        //base case
        if (i>=arr.length){
            return -1;
        }

        if (arr[i]==target){
            return i;
        }

        int ans = findTarget(arr,i+1, target);
        return ans;
    }


    static int findCount(int arr[], int i , int target , int count){
        //base case
        if (i>=arr.length){
            System.out.println(count);
            return -1;
        }

        if (arr[i]==target){
            count ++;
        }

        int ans = findCount(arr, i , target , count);
        return ans;
    }

    static void printDigits(int n){
        //base case
        if (n==0){
            return;
        }
        int digit = n%10;
//        System.out.println(digit);
        n =n/10;

        printDigits(n);

        System.out.println(digit);
    }

    static void main() {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        printMyName(n);

//        printNum(5,1);

        int i =0;
        int arr[]={1,5,6,8,6,2,6};
//        int maxi = Integer.MIN_VALUE;
//        printMaxElement(arr, i , maxi);


        int target =6;
//        findTarget(arr,i,target);
//        printArr(arr, i);

        int count =0;
//        findCount(arr, i,target, count);
    printDigits(137);
    }
}
