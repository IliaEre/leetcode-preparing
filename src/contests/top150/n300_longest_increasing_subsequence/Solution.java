package contests.top150.n300_longest_increasing_subsequence;

public class Solution {

    // Can you come up with an algorithm that runs in O(n log(n)) time complexity?
    // yes, we can
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int index = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > dp[index]) {
                dp[++index] = nums[i];
            } else {
                int internal = search(dp, index, nums[i]);
                dp[internal] = nums[i];
            }
        }

        return index + 1;
    }

    private int search(int[] dp, int high, int val) {
        int start = 0;
        while (start <= high) {
            int mid = start +(high-start)/2;
            if (dp[mid] == val) return mid;
            else if (dp[mid] > val) high = mid -1;
            else start = mid +1;
        }
        return start;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}
