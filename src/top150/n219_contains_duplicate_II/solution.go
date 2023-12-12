package main

func containsNearbyDuplicate(nums []int, k int) bool {
	if nums == nil || len(nums) < 2 || k < 1 {
		return false
	}

	cache := make(map[int]int)

	for i := 0; i < len(nums); i++ {
		if val, ex := cache[nums[i]]; ex {
			if i-val <= k {
				return true
			}
		}

		cache[nums[i]] = i
	}

	return false
}

func main() {
	arr := make([]int, 3)
	arr = append(arr, 1, 2, 3, 1)
	println(containsNearbyDuplicate(arr, 3))
}
