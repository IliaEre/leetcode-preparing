package main

import "strings"

func lengthOfLongestSubstring(s string) int {
	result := ""
	c, mc, start, end := 0, 0, 0, len(s)-1

	for start <= end {
		startChar := s[start]
		position := strings.Index(result, string(startChar))

		if position == -1 {
			result += string(startChar)
			c++
		} else {
			result = result[position+1:]
			result += string(startChar)
			c = len(result)
			start = start - position // Correct the starting index
		}

		mc = max(mc, c)
		start++
	}

	return mc
}
