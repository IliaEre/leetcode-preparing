package main

func spiralOrder(matrix [][]int) []int {
	var result []int

	n := len(matrix)
	m := len(matrix[0])
	up := 0
	down := n - 1
	left := 0
	right := m - 1

	for len(result) < n*m {
		// move from left to right corner
		for i := left; i <= right && len(result) < n*m; i++ { // left + right, to up
			result = append(result, matrix[up][i])
		}

		// move from up right corner to left corner
		for i := up + 1; i <= down-1 && len(result) < m*n; i++ {
			result = append(result, matrix[i][right])
		}

		// move from right down corner to left down corner
		for i := right; i >= left && len(result) < m*n; i-- {
			result = append(result, matrix[down][i])
		}

		// move from left down corner to left up corner
		for i := down - 1; i >= up+1 && len(result) < m*n; i-- {
			result = append(result, matrix[i][left])
		}

		up++
		down--
		left++
		right--
	}

	return result
}

func main() {
	arr := [][]int{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
	result := spiralOrder(arr)
	for i := 0; i < len(result); i++ {
		println(result[i])
	}
}
