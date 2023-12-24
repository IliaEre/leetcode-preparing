package problems.n695_max_aria_of_island;

// O(n * m) time, O(1) space
class Solution {

    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    int currentMax = find(grid, i, j);
                    max = Math.max(max, currentMax);
                }
            }
        }
        return max;
    }

    private int find(int[][] grid, int i, int j) {
        grid[i][j] = -1;
        int current = 1;

        if (i > 0 && grid[i - 1][j] == 1) {
            current += find(grid, i - 1, j);
        }

        if (i < grid.length - 1 && grid[i + 1][j] == 1) {
            current += find(grid, i + 1, j);
        }

        if (j < grid[0].length - 1 && grid[i][j + 1] == 1) {
            current += find(grid, i, j + 1);
        }

        if (j > 0 && grid[i][j - 1] == 1) {
            current += find(grid, i, j - 1);
        }

        return current;
    }
}