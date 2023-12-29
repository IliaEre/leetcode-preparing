package contests.top150.n155_min_stack;

class MinStack {

    private Node head;

    class Node {
        int val, min;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.min = next != null ? Math.min(next.min, val) : val;
            this.next = next;
        }
    }

    public MinStack() {}

    public void push(int val) {
        if (head == null) {
            head = new Node(val, null);
        } else {
            head = new Node(val, head);
        }
    }

    public void pop() {
        head = this.head.next;
    }

    public int top() {
        return this.head.val;
    }

    public int getMin() {
        return this.head.min;
    }
}

public class Solution {

    public static void main(String[] args) {
        var s = new MinStack();
        s.push(-2);
        s.push(3);
        s.push(1);
        s.pop();
        System.out.println(s.top());
        System.out.println(s.getMin());
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
