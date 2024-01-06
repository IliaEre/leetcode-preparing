package contests.top150.n3_longest_substring_without_repeating_characters;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        String result = "";
        int c = 0, mc = 0, start = 0, end = s.length() - 1;

        while (start <= end) {
            char startChar = s.charAt(start);
            int position = result.indexOf(startChar);
            if (position == -1) {
                result += startChar;
                c++;
            } else {
                result = result.substring(position + 1);
                result += startChar;
                c = result.length();
            }

            mc = Math.max(mc, c);
            start++;
        }

        return mc;
    }

    public static void main(String[] args) {

    }
}
