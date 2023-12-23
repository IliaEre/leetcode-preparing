package main

func rob(nums []int) int {
	firstHouse, secondHouse := 0, 0
	for _, sum := range nums {
		localmax := max(firstHouse, secondHouse+sum)
		secondHouse = firstHouse
		firstHouse = localmax
	}
	return firstHouse
}
func main() {
	println(rob([]int{2, 7, 9, 3, 1}))
}
