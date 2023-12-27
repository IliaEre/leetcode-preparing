package contests.top150.n238_product_of_array_except_self;

import java.util.Arrays;

public class Solution {

    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int left = 1, right = 1;

        for (int i = 0; i < nums.length; i++) {
            arr[i] = left;
            left *= arr[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= right;
            right *= arr[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(Arrays.toString(s.productExceptSelf(new int[]{1, 2, 3, 4})));
    }

}
