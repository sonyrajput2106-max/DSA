package OnAnswerPattern;

import java.util.Arrays;

public class AggresiveCowsProblem {

    public static boolean isValidAns(int [] stalls , int k , int minDistance){
      int cowCount =1;
      int lastPosition =0;

      for (int i =1; i<stalls.length;i++){
          //curr cow ko curr postiion pr tbhi place kr paunge
          //jab curr and prev cow k bich ka distance
          //  >= minDistance ho
          if (stalls[i]-stalls[lastPosition] >= minDistance){
              cowCount++;
              lastPosition = i;
              if (cowCount ==k){
                  return true;
              }
          }
      }
      return false;
    }


    public static int aggresiveCows(int[] stalls , int k ){
        Arrays.sort(stalls);
        int n = stalls.length;

        int start =0;
        int end = stalls[n-1] - stalls[0];
        int ans =-1;

        while(start <= end){
            int mid = start +(end -start)/2;

            if (isValidAns(stalls, k,mid)){
                ans = mid;
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
    }

    static void main() {

    }
}
