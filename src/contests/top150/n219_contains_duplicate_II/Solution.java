package contests.top150.n219_contains_duplicate_II;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length < 2 || k < 1) {
            return false;
        }

        Map<Integer, Integer> cache = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (cache.containsKey(nums[i]) && i - cache.get(nums[i]) <= k) {
                return true;
            }
            cache.put(i, nums[i]);
        }


        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().containsNearbyDuplicate(new int[] {1,2,3,1}, 3));
    }
}
