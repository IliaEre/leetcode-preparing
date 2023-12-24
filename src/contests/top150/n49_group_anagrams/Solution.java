package contests.top150.n49_group_anagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String str: strs) {
            char[] arr = new char[26];
            for (char c: str.toCharArray()) {
                arr[c - 'a']++;
            }

            String ts = new String(arr);
            List<String> results = map.getOrDefault(ts, new ArrayList<>());
            results.add(str);
            map.put(ts, results);
        }

        map.forEach((s, r) -> result.add(r));
        return result;
    }

    public static void main(String[] args) {
        var s = new Solution();
        var r = s.groupAnagrams(
                new String[]{"eat","tea","tan","ate","nat","bat"}
        );
        r.forEach(System.out::println);
    }

}
