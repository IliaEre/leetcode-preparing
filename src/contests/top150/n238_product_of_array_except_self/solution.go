package main

func productExceptSelf(nums []int) []int {
	res := make([]int, len(nums))
	l := 1
	r := 1

	for i := 0; i < len(nums); i++ {
		res[i] = l
		l *= nums[i]
	}

	for i := len(nums) - 1; i >= 0; i-- {
		res[i] *= r
		r *= nums[i]
	}
	return res
}

func main() {
	println(productExceptSelf([]int{1, 2, 3, 4}))
}
