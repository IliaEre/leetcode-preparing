package contests.top150.n22_generate_parentheses;

import java.util.ArrayList;
import java.util.List;

class Solution {

    private List<String> result = new ArrayList();

    public List<String> generateParenthesis(int n) {
        backtracking(0, 0, n, "");
        return result;
    }

    private void backtracking(int open, int close, int n, String t) {
        if (open + close == 2 * n) {
            result.add(t);
        }

        if (open < n) { // (
            backtracking(open + 1, close, n, t + "(");
        }
        if (close < open) { // )
            backtracking(open, close + 1, n, t + ")");
        }
    }

    public static void main(String[] args) {
        var s = new Solution();
        s.generateParenthesis(3).forEach(System.out::println);
    }

}