package contests.top150.n200_number_of_islands;

class Solution {

    public int numIslands(char[][] grid) {
        int counter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    counter++;
                    dfs(grid, i, j);
                }
            }
        }
        return counter;
    }

    private void dfs(char[][] grid, int i, int j) {
        grid[i][j] = '*';

        if (i > 0 && grid[i - 1][j] == '1') {
            dfs(grid, i - 1, j);
        }

        if (i < grid.length - 1 && grid[i + 1][j] == '1') {
            dfs(grid, i + 1, j);
        }

        if (j > 0 && grid[i][j - 1] == '1') {
            dfs(grid, i, j - 1);
        }

        if (j < grid[0].length - 1 && grid[i][j + 1] == '1') {
            dfs(grid, i, j + 1);
        }
    }
}