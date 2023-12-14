package top150.n322_coin_change;

import java.util.Arrays;

public class Solution {

    public int coinChange(int[] coins, int amount) {
        int base = amount + 1;
        int[] dp = new int[base];
        Arrays.fill(dp, base);
        dp[0] = 0;

        for (int a = 1; a < base; a++) {
            for (int c: coins) {
                if (a - c >= 0) {
                    dp[a] = Math.min(dp[a], 1 + dp[a - c]);
                }
            }
        }

        return dp[amount] != base ? dp[amount] : -1;
    }
}
