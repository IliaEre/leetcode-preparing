package main

func plusOne(digits []int) []int {
	for i := len(digits) - 1; i >= 0; i-- {
		if digits[i] == 9 {
			digits[i] = 0
		} else {
			digits[i] = digits[i] + 1
			return digits
		}
	}

	digits = make([]int, len(digits)+1)
	digits[0] = 1
	return digits
}

func main() {
	arr := make([]int, 3)
	arr = append(arr, 1, 2, 3)
	result := plusOne(arr)
	for _, v := range result {
		println(v)
	}
}
