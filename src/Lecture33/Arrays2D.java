package Lecture33;
import java.util.ArrayList;
import java.util.Arrays;
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

    //transpose of a matrix
//static int [][] transpose(int[][] matrix){
//        if (matrix ==null || matrix.length ==0){
//            return new int[0][0];
//        }
//
//        //for original array
//    int totalRows = matrix.length;
//        int totalCols = matrix[0].length;
//
//        //for new array
//    int newTotalRows = totalCols;
//    int newTotalCols = totalRows;
//    int ans[][] = new int [newTotalCols][newTotalRows];
//
//    //actual logic
//    for (int row=0; row<totalRows;row++){
//        for (int col =0; col<totalCols;col++) {
//            ans[col][row] = matrix[row][col];
//        }
//    }
//    return ans;
//}

// rotate a matrix
    static void rotate90Clockwise(int [][] matrix,int N){
        //step -1 transpose of matrix
        // swap matrix[i[j], matrix[j][i]
        for (int i=0;i<N ; i++){
            for (int j = i+1; j<N; j++){
                //swap
             int temp = matrix[i][j];
             matrix[i][j] = matrix[j][i];
             matrix[j][i] = temp;
            }
        }

        //step -2 reverse all rows
        for(int row =0; row<N; row++) {
            int startCol = 0;
            int endCol = N - 1;
            while (startCol <= endCol) {
                //swap matrix[row] [startCol] , matrix[row][endCol]}
                int temp = matrix[row][startCol];
                matrix[row][startCol] = matrix[row][endCol];
                matrix[row][endCol] = temp;

                startCol++;
                endCol--;

            }
        }

    }

    //spiral print a matrix
    static List<Integer> spiralOrder(int[][] matrix2){
        int m = matrix2.length;
        int  n = matrix2[0].length;

        List<Integer> result = new ArrayList<>();
        int startingRow =0;
        int endingRow = m-1;
        int startingCol = 0;
        int endingCol = n-1;

        while(startingRow<= endingRow && startingCol <= endingCol){
            //row wise left to right -> startingRow print krni h , from startingcol to endingcol
            for (int col = startingCol ; col <=endingCol;col++){
                result.add(matrix2[startingRow][col]);
            }
            startingRow++;

            //col wise top to bottom -> ending col pring krna h , startingrow to ending row
            for ( int row = startingRow; row<=endingRow;row++){
                result.add(matrix2[row][endingCol]);
            }
            endingCol--;

            //row wise right to left -> ending row print krni h -> endingcol to starting col
            if (startingRow<= endingRow) {
                for (int col = endingCol; col <= startingCol; col--) {
                    result.add(matrix2[endingRow][col]);
                }
                endingRow--;
            }

            //col wise bottom to top -> startCol print krna h,endingrow to starting row
            if (startingCol <= endingCol ){
            for (int row=endingRow; row<= startingRow;row--){
                result.add(matrix2[row][startingCol]);
            }
            startingCol++;
            }
        }
        return result;
    }




   static void main() {
//        int  arr[][] = {{1,2,3}, {4,5,6},{7,8,9}};
//        System.out.println(rowSum(arr));

        //transpose
//        int matrix[][] ={{1,2,3}, {4,5,6}};
//        System.out.println(Arrays.deepToString(transpose(matrix)));

            int matrix[][] = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            rotate90Clockwise(matrix, 3);

            for (int[] row : matrix) {
                System.out.println(java.util.Arrays.toString(row));
            }


            //spiral print
       int[][] matrix2 = {{1,2,3},{4,5,6},{7,8,9}};
       System.out.println(spiralOrder(matrix2));


    }
}
