package Lecture33;
import java.util.ArrayList;
import java.util.List;

public class Arrays2D {

    static  List<Integer> rowSum(int [][]  arr){

        List<Integer> result = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;

        //traversal
//        for (int row=0; row<m ; row++ ){
//             int sum =0;
//
//             for (int col=0; col< n;col++){
//                 int value = arr[row][col];
//                 sum = sum + value;
//
//             }
//
//             result.add(sum);
//        }
//        return result;
//


        //for column wise sum
//        for (int col=0; col<n;col++){
//            int sum = 0;
//            for ( int row=0; row<m;row++){
//                int value = arr[col][row];
//                sum = sum + value;
//            }
//            result.add(sum);
//        }
//return result;


        //wave print a matrix
        // let's move column wise
        for (int col =0; col<n; col++){
//har ek column index ko check kro even/ odd k liye
            if ((col & 1)==1){
                //odd
                //bottom to top
                for (int row = m-1; row>=0;row--){
                    result.add(arr[row][col]);

                }
            }
            else{
                //even
                //top to bottom
                for (int row =0; row<m; row++){
                    result.add(arr[row][col]);
                }
            }
        }
        return result;
    }
    static void main() {
        int  arr[][] = {{1,2,3}, {4,5,6},{7,8,9}};
        System.out.println(rowSum(arr));



    }
}
