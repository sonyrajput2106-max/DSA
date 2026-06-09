package BinarySearch;

public class OnAnswerPattern {

    static int squareRoot(int n){
         int start =0;
         int end = n;
         int ans =-1;

         while(start <= end){
             int mid = start+ (end - start)/2;

             if (mid * mid==n){
                 return mid;
             }
             else if(mid * mid >n){
                 end = mid -1;
             }
             else{
                 //mid * mid < n
                 //store ans and move left
                 ans = mid;
                 start = mid +1;
             }
         }

         //to  find the exact correct ans in decimals
//         double factor =1;
//         int totalPrecision = 3;
//
//         for (int round = 1; round <= totalPrecision; round++){
//             factor = factor/10;
//
//             for (int i =1;i<=10;i++){
//                 double newAns = ans +factor;
//
//                 if (newAns * newAns ==x){
//                     return newAns;
//                 }
//                 else if (newAns * newAns <x){
//                     ans = newAns;
//                 }
//                 else{
//                     break;
//                 }
//             }
//             System.out.println("iss round ka ans:" +Math.round(ans * 1000.0)/1000.0);
//         }
//        System.out.println("final ans is:"+Math.round(ans*1000.0)/1000.0);
         return ans;
    }
    static void main() {
int n = 56;
        System.out.println(squareRoot(n));
    }
}
