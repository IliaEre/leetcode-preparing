package top150.n28_find_the_index_of_the_first_occurrence_in_a_string;

public class Solution {

    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length())
            return -1;

        for (int i = 0; i < haystack.length() - needle.length(); i++) {
            if (haystack.substring(i).startsWith(needle)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.strStr("sadbutsad", "sad"));
    }
}
