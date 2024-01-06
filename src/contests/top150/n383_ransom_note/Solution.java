package contests.top150.n383_ransom_note;

public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] result = new int[26];
        for (char c: magazine.toCharArray()) {
            result[c - 97]++;
        }

        for (char c: ransomNote.toCharArray()) {
            result[c - 97]--;
            if (result[c - 97] == -1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.canConstruct("a", "b"));
    }
}
