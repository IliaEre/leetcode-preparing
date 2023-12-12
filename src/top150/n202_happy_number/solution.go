package main

func check(n int) int {
	total := 0
	for n > 0 {
		d := n % 10
		n /= 10
		total += d * d
	}
	return total
}

func isHappy(n int) bool {
	seen := make(map[int]interface{})
	for n != 1 && seen[n] == nil {
		seen[n] = struct {}{}
		n = check(n)
	}
	return 1 == n
}

func main() {
	println(isHappy(19))
}