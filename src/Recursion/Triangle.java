package Recursion;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Triangle {

    public static int solve(List<List<Integer>> triangle,
                            int row, int col, int[][] dp) {

        // Base case
        if (row == triangle.size() - 1) {
            return triangle.get(row).get(col);
        }

        // Already calculated
        if (dp[row][col] != -1) {
            return dp[row][col];
        }

        // Go down
        int down = solve(triangle, row + 1, col, dp);

        // Go diagonally
        int diagonal = solve(triangle, row + 1, col + 1, dp);

        // Minimum path
        dp[row][col] = triangle.get(row).get(col)
                + Math.min(down, diagonal);

        return dp[row][col];
    }

    public static int minimumTotal(List<List<Integer>> triangle) {

        int n = triangle.size();
        int[][] dp = new int[n][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(triangle, 0, 0, dp);
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