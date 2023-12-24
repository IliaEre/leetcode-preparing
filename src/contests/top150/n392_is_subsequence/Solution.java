package contests.top150.n392_is_subsequence;

public class Solution {

    public boolean isSubsequence(String s, String t) {
        int index = 0;
        for (int i = 0; i < t.length() || index < s.length(); i++) {
            if (s.charAt(index) == t.charAt(i)) {
                index++;
            }
        }

        return index == s.length();
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.isSubsequence("abc", "ahbgdc"));
    }
}
