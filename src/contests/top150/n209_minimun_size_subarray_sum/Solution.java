package contests.top150.n209_minimun_size_subarray_sum;

public class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, total = 0;
        int result = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            total += nums[right]; // 2
            while (total >= target) { // 2 >= 7
                result = Math.min(result, right - left + 1);
                total -= nums[left++]; // move left boarder
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.minSubArrayLen(7, new int[] {2,3,1,2,4,3}));
    }
}
