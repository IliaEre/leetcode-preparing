package contests.top150.n128_longest_consecutive_sequence;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int ans = 1;

        Set<Integer> set = new HashSet<>();
        // init
        for (int n: nums) {
            set.add(n);
        }

        for (int n: nums) {
            if (!set.contains(n - 1)) {
                int c = 1;
                while (set.contains(n + 1)) {
                    n++;
                    c++;
                }
                ans = Math.max(c, ans);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.longestConsecutive(new int[] {100,4,200,1,3,2}));
    }
}
