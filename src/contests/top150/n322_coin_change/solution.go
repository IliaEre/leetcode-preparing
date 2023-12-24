package main

func coinChange(coins []int, amount int) int {
	base := amount + 1
	dp := make([]int, base)
	for i, _ := range dp {
		dp[i] = base
	}
	dp[0] = 0

	for a := 1; a < base; a++ {
		for _, coin := range coins {
			if a-coin >= 0 {
				dp[a] = min(dp[a], 1+dp[a-coin])
			}
		}
	}

	if dp[amount] != base {
		return dp[amount]
	} else {
		return -1
	}
}

func main() {
	coins := make([]int, 3)
	coins = append(coins, 1, 2, 5)
	r := coinChange(coins, 7)
	println(r)
}
