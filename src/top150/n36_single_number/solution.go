package n36_single_number

func singleNumber(nums []int) int {
	number := nums[0]
	for i := 1; i < len(nums); i++ {
		number ^= nums[i]
	}
	return number
}
