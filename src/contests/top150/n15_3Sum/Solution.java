package contests.top150.n15_3Sum;

import java.util.*;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        int target = 0;
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++; k--;
                } else if(sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        var s = new Solution().threeSum(new int[] {-1,0,1,2,-1,-4});
        System.out.println(s);
    }

}