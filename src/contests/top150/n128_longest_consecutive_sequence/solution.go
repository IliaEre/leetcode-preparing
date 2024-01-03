package main

func longestConsecutive(nums []int) int {
	if len(nums) == 0 {
		return 0
	}

	ans := 1
	set := make(map[int]bool)
	for _, v := range nums {
		set[v] = true
	}

	for _, n := range nums {
		if set[n-1] == false {
			c := 1
			for set[n+1] == true {
				n++
				c++
			}
			ans = max(ans, c)
		}
	}

	return ans
}

func main() {
	r := longestConsecutive([]int{100, 4, 200, 1, 3, 2})
	println(r)
}
