package OnAnswerPattern;

public class PaintersPartitionProblem {


    public static boolean isValidAns(int[] boards, int k , int maxLength){
        //mid -> max length od he boards a painter can paint
        // greater than that is not allowed
        //mid -> maxLength
        int painterCount = 1;
        int paintedLength = 0;

        for (int i =0; i< boards.length; i++) {
            if (paintedLength + boards[i] <= maxLength) {
                //assigm that board to painter
                paintedLength = paintedLength + boards[i];
            } else {
                //paintedlength + board[i] > maxlength}
                //limit breach
                painterCount++;
                paintedLength = 0;
                if (painterCount > k || boards[i] > maxLength) {
                    return false;
                } else {
                    paintedLength = paintedLength + boards[i];
                }
            }
        }
            return true;
    }


    public static int minTime(int[] boards, int k){
        int sum =0;
        for (int i =0;i<boards.length; i++){
            sum += boards[i];
        }
        int start =0;
        int end = sum;
        int ans =-1;

        while(start <=end){
            int mid = start +(end - start)/2;

            if(isValidAns(boards, k, mid)){
                ans = mid;
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return ans;
    }

    static void main() {
        int [] boards ={10, 20 , 30, 40};
        int k =2;

        int ans = minTime(boards , k);
            System.out.println(ans);
    }
}
