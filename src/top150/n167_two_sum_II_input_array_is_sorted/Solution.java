package top150.n167_two_sum_II_input_array_is_sorted;

import java.util.Arrays;

public class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        while (numbers[start] + numbers[end] != target) {
            if (numbers[start] + numbers[end] > target) {
                end--;
            } else {
                start++;
            }
        }

        return new int[] { start + 1, end + 1 };
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(Arrays.toString(s.twoSum(new int[]{1, 2, 3, 4, 8}, 5)));
    }
}
