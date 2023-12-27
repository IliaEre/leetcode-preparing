package contests.top150.n11_contains_with_most_water;

public class Solution {

    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, max = 0;

        while (i < j) {
            int c = Math.min(height[i], height[j]) * (j - i);
            max = Math.max(max, c);

            if (height[i] < height[j]) i++;
            else j--;
        }
        return max;
    }
}
