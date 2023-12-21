package main

var result []string

func generateParenthesis(n int) []string {
	backtracking(0, 0, n, "")
	return result
}

func backtracking(open, close, n int, t string) {
	if open+close == 2*n {
		result = append(result, t)
	}

	if open < n {
		backtracking(open+1, close, n, t+"(")
	}
	if close < open {
		backtracking(open, close+1, n, t+")")
	}
}

func main() {
	result := generateParenthesis(1)
	for _, s := range result {
		println(s)
	}
}
