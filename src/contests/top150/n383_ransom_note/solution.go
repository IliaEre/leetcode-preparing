package main

func canConstruct(ransomNote string, magazine string) bool {
	arr := make([]int, 26)
	for _, c := range magazine {
		arr[c-97]++
	}

	for _, c1 := range ransomNote {
		arr[c1-97]--
		if arr[c1-97] == -1 {
			return false
		}
	}

	return true
}
