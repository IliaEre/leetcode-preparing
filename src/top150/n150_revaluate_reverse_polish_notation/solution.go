package main

import "strconv"

func evalRPN(tokens []string) int {
	var stack []int

	for i := 0; i < len(tokens); i++ {
		d, err := strconv.Atoi(tokens[i])
		if err == nil {
			stack = append(stack, d)
		} else {
			first := stack[len(stack)-2]
			second := stack[len(stack)-1]
			stack = stack[:len(stack)-2]
			current := 0

			switch tokens[i] {
			case "+":
				current = first + second
			case "-":
				current = first - second
			case "*":
				current = first * second
			case "/":
				current = first / second
			}
			stack = append(stack, current)
		}
	}

	return stack[0]
}
