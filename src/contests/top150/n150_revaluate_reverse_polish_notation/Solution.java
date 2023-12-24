package contests.top150.n150_revaluate_reverse_polish_notation;

import java.util.Stack;

public class Solution {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token: tokens) {
            switch (token) {
                case "+" -> stack.push(stack.pop() + stack.pop());
                case "*" -> stack.push(stack.pop() * stack.pop());
                case "-" -> {
                    int x = stack.pop();
                    int y = stack.pop();
                    stack.push(y - x);
                }
                case "/" -> {
                    int x = stack.pop();
                    int y = stack.pop();
                    stack.push(y / x);
                }
                default -> stack.push(Integer.valueOf(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.evalRPN(new String[]{"1", "2", "+"}));
    }
}