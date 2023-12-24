package main

func isSubsequence(s string, t string) bool {
	index := 0
	for i := 0; i < len(t); i++ {
		if s[index] == t[i] {
			index++
			if index == len(s) {
				return true
			}
		}
	}

	return index == len(s)
}

func main() {
	println(isSubsequence("abc", "ahbgdc"))
}
