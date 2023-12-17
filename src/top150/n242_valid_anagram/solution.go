package main

func isAnagram(s string, t string) bool {
	chars := make([]int32, 26)
	for _, c := range s {
		chars[c-'a']++
	}

	for _, c := range t {
		chars[c-'a']--
	}

	for _, v := range chars {
		if v != 0 {
			return false
		}
	}

	return true
}

func main() {
	println(isAnagram("anagram", "nagaram"))
}
