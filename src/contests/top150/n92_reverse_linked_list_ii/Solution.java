package contests.top150.n92_reverse_linked_list_ii;


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

public class Solution {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;

        // from 1-2-3-4-5 -> save 1
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }

        ListNode start = pre.next; // next value is 2
        ListNode next = start.next; // next value after 2 is 3

        // from 0 to 4-2 = 2
        for (int i = 0; i < right - left; i++) {
            // start is 2, but next 3. next is 3, next.next is 4; change 3 and 4
            // 1 - 2 - 3 - 4 - 5 -> 1 - 2 - 4 - 3 - 5
            start.next = next.next;
            next.next = pre.next;
            pre.next = next;
            next = start.next;
        }

        return dummy.next; // skip 0
    }
}
