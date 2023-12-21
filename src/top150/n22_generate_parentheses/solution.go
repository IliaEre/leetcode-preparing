package main

func generateParenthesis(n int) []string {
	var result []string
	backtracking(0, 0, n, "", &result)
	return result
}

func backtracking(open, close, n int, t string, result *[]string) {
	if open+close == 2*n {
		*result = append(*result, t)
	}

	if open < n {
		backtracking(open+1, close, n, t+"(", result)
	}
	if close < open {
		backtracking(open, close+1, n, t+")", result)
	}
}

func main() {
	result := generateParenthesis(1)
	for _, s := range result {
		println(s)
	}
}
