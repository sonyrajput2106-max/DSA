package Recursion;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Triangle {

    public static int solve(List<List<Integer>> triangle, int rowIndex , int colIndex) {
        //base case
        if (rowIndex==triangle.size()-1){
            return triangle.get(rowIndex).get(colIndex);
        }

        int downAns = solve(triangle, rowIndex+1,colIndex);
        int diagonalAns = solve(triangle,rowIndex+1,colIndex+1);
        int finalAns = triangle.get(rowIndex).get(colIndex)+Math.min(downAns,diagonalAns);
        return finalAns;


    }

    public static int minimumTotal(List<List<Integer>> triangle) {

      int rowIndex =0;
      int colIndex =0;
      int ans = solve(triangle,rowIndex,colIndex);
      return ans;
    }

    public static void main(String[] args) {

        List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));

        System.out.println(minimumTotal(triangle));
    }
}