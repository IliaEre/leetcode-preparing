package contests.top150.n202_happy_number;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    private int check(int n) {
        int total = 0;
        while (n > 0) {
            int d = n % 10;
            n /= 10;
            total += d * d;
        }
        return total;
    }

    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = check(n);
        }
        return 1 == n;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.isHappy(19));
    }
}
