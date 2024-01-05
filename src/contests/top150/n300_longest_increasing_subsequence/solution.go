package main

func lengthOfLIS(nums []int) int {
	if len(nums) == 0 {
		return 0
	}

	dp := make([]int, len(nums))
	dp[0] = nums[0]
	index := 0

	for i := 1; i < len(nums); i++ {
		if dp[index] < nums[i] {
			index++
			dp[index] = nums[i]
		} else {
			internal := sort(dp, index, nums[i])
			dp[internal] = nums[i]
		}
	}

	return index + 1
}

func sort(dp []int, high, val int) int {
	start := 0

	for start <= high {
		mid := start + (high-start)/2

		if mid == val {
			return mid
		} else if dp[mid] > val {
			high = mid - 1
		} else {
			start = mid + 1
		}
	}

	return start
}

func main() {
	r := lengthOfLIS([]int{10, 9, 2, 5, 3, 7, 101, 18})
	println(r)
}
