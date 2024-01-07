package main

func numIslands(grid [][]byte) int {
	counter := 0

	for i := 0; i < len(grid); i++ {
		for j := 0; j < len(grid[0]); j++ {
			if grid[i][j] == '1' {
				counter++
				dfs(grid, i, j)
			}
		}
	}
	return counter
}

func dfs(grid [][]byte, i, j int) {
	grid[i][j] = '*'

	if i > 0 && grid[i-1][j] == '1' {
		dfs(grid, i-1, j)
	}

	if i < len(grid)-1 && grid[i+1][j] == '1' {
		dfs(grid, i+1, j)
	}

	if j > 0 && grid[i][j-1] == '1' {
		dfs(grid, i, j-1)
	}

	if j < len(grid[0])-1 && grid[i][j+1] == '1' {
		dfs(grid, i, j+1)
	}

}
