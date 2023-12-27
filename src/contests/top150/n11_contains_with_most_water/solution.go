package main

func maxArea(height []int) int {
	i := 0
	j := len(height) - 1
	maximum := 0

	for i < j {
		current := min(height[i], height[j]) * (j - i)
		maximum = max(maximum, current)

		if height[i] < height[j] {
			i++
		} else {
			j--
		}
	}

	return maximum
}
