package problems.n59_spiral_matrix_ii;

class Solution {

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int k = 1;

        int up = 0, down = n - 1;
        int left = 0, right = n - 1;
        int M = n * n + 1;

        while (k <= n * n) {

            for (int i = left; i <= right && M > k; i++) { // 1 2 3, 9
                matrix[up][i] = k++;
            }

            for (int i = up + 1; i <= down - 1 && M > k; i++) { // 4 
                matrix[i][right] = k++;
            }

            for (int i = right; i >= left && M> k; i--) { // 5 6 7
                matrix[down][i] = k++;
            }

            for (int i = down - 1; i >= up + 1 && M > k; i--) { // 8
                matrix[i][left] = k++;
            }

            up++; down--; left++; right--;
        }

        return matrix;
    }

    public static void main(String[] args) {
        var s = new Solution();
        int[][] result = s.generateMatrix(3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}