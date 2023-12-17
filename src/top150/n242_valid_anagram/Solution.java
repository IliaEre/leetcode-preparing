package top150.n242_valid_anagram;

public class Solution {

    public boolean isAnagram(String s, String t) {
        int[] arr1 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr1[s.charAt(i) - 'a']++;
        }

        for (int i=0; i < t.length(); i++) {
            arr1[t.charAt(i) - 'a']--;
        }

        for (int i: arr1) {
            if (i != 0)
                return false;
        }


        return true;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.isAnagram("anagram", "nagaram"));
    }
}
