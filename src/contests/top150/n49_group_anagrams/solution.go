package main

import (
	"sort"
	"strings"
)

func groupAnagrams(strs []string) [][]string {
	result := make([][]string, 0)
	anagrams := make(map[string][]string)

	for _, str := range strs {
		// Convert string to sorted string
		sortedStr := sortString(str)

		// Check if the sorted string is already in the map
		if _, ok := anagrams[sortedStr]; ok {
			anagrams[sortedStr] = append(anagrams[sortedStr], str)
		} else {
			anagrams[sortedStr] = []string{str}
		}
	}

	// Append groups of anagrams to the result
	for _, group := range anagrams {
		result = append(result, group)
	}

	return result
}

func sortString(s string) string {
	sChars := strings.Split(s, "")
	sort.Strings(sChars)
	return strings.Join(sChars, "")
}

func main() {
	arr := make([]string, 0)
	arr = append(arr, "eat", "tea", "tan", "ate", "nat", "bat")

	r := groupAnagrams(arr)
	for _, v := range r {
		for _, sv := range v {
			println(sv)
		}
	}
}
