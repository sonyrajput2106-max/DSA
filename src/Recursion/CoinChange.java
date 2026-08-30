package Recursion;

public class CoinChange {

    public static int solve(int[] coins, int amount) {

        // Base case
        if (amount == 0) {
            return 0;
        }

        if (amount < 0) {
            return Integer.MAX_VALUE;
        }

        int minCoins = Integer.MAX_VALUE;

        // Try every coin
        for (int coin : coins) {

            int ans = solve(coins, amount - coin);

            // Avoid Integer.MAX_VALUE + 1
            if (ans != Integer.MAX_VALUE) {
                minCoins = Math.min(minCoins, ans + 1);
            }
        }

        return minCoins;
    }

    public static int coinChange(int[] coins, int amount) {

        int ans = solve(coins, amount);

        if (ans == Integer.MAX_VALUE) {
            return -1;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] coins = {1, 2, 5};
        int amount = 11;

        System.out.println(coinChange(coins, amount));
    }
}
