package main

func twoSum(numbers []int, target int) []int {
	start := 0
	end := len(numbers) - 1

	for numbers[start]+numbers[end] != target {
		if numbers[start]+numbers[end] > target {
			end--
		} else {
			start++
		}
	}

	return []int{start + 1, end + 1}
}

func main() {
	r := twoSum([]int{1, 2, 3, 4, 5}, 7)
	for position := range r {
		println(position)
	}
}
