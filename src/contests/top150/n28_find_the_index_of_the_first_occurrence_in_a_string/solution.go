package main

import "fmt"

func strStr(haystack, needle string) int {
	if len(needle) > len(haystack) {
		return -1
	}

	for i := 0; i <= len(haystack)-len(needle); i++ {
		if haystack[i:i+len(needle)] == needle {
			return i
		}
	}

	return -1
}

func main() {
	haystack := "hello"
	needle := "ll"
	result := strStr(haystack, needle)
	fmt.Println(result)
}
