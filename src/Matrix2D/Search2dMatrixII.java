package Matrix2D;

public class Search2dMatrixII {

    static boolean searchMatrixII(int [][]matrix , int target){
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;

        int rowIndex =0;
        int colIndex = totalCol-1;

        while(rowIndex < totalRow && colIndex >= 0){
            if(matrix[rowIndex][colIndex]== target){
                return true;
            }
            else if(matrix[rowIndex][colIndex] > target){
                colIndex--;
            }
            else{
                rowIndex++;
            }
        }
        return false;
    }


    static void main() {
      int matrix[][] ={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,13,26,30}};
      int target =5;
        System.out.println(searchMatrixII(matrix , target));
    }
}
