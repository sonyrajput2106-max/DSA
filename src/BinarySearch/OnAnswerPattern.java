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
         return ans;
    }
    static void main() {
int n = 56;
        System.out.println(squareRoot(n));
    }
}
