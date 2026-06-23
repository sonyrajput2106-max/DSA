package Matrix2D;

public class SearchInMatrix {


    static boolean searchMatrix(int[][]matrix, int target){
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;

        int n = totalRow * totalCol;

        //1D array
        int s=0;
        int e = n-1;

        //Binary search
        while(s<=e){
            int mid = s+(e-s)/2;
            int rowIndex = mid / totalCol;
            int colIndex = mid % totalCol;

            if(matrix[rowIndex][colIndex]== target){
                return true;
            }
            else if(matrix[rowIndex][colIndex] < target){
                s = mid +1;
            }
            else{
                e = mid -1;
            }
        }
        return false;
    }

    static void main() {
        int [][]matrix ={{1,3,5,7} , {10,11,16,20}, {23,30,34,60}};
        int target =5;
        System.out.println(searchMatrix(matrix, target));
    }
}
