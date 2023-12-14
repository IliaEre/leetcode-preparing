package top150.n2_add_two_numbers;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int curry = 0, sum = 0;
        ListNode l3 = new ListNode(0);
        ListNode result = l3;

        while (l1 != null || l2 != null) {
            int v1 = l1 != null ? l1.val : 0;
            int v2 = l2 != null ? l2.val : 0;
            sum = v1 + v2 + curry;
            curry = sum / 10;
            sum %= 10;
            l3.val = sum;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            if (l1 != null || l2 != null || curry > 0) {
                l3.next = new ListNode(curry);
                l3 = l3.next;
            }

        }

        return result;
    }
}