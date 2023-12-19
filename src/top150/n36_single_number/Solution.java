package top150.n36_single_number;

/**
 * XOR
 * time O(n), space O(1)
 * */
public class Solution {

    public int singleNumber(int[] nums) {
        int r = nums[0];
        for (int i = 1; i < nums.length; i++) {
            r ^= nums[i];
        }

        return r;
    }
}
