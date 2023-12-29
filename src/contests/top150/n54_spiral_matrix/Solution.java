
package contests.top150.n54_spiral_matrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int n = matrix.length, m = matrix[0].length;
        int up = 0, down = n - 1;
        int left = 0, right = m - 1;

        while (result.size() < n * m) {
            // from 0 to end (left move)
            for (int i = left; i <= right && result.size() < n * m; i++) {
                result.add(matrix[up][i]);
            }

            // from last up to down
            for (int i = up + 1; i <= down - 1 && result.size() < n * m; i++) {
                result.add(matrix[i][right]);
            }

            // from right corner to left
            for (int i = right; i >= left && result.size() < n * m; i--) {
                result.add(matrix[down][i]);
            }

            // from left corner to up
            for (int i = down - 1; i >= up + 1 && result.size() < n * m; i--) {
                result.add(matrix[i][left]);
            }

            up++; down--; left++; right--;
        }

        return result;
    }

    public static void main(String[] args) {
        var s = new Solution();
        var result = s.spiralOrder(new int[][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} } );
        result.forEach(System.out::println);
    }
}
