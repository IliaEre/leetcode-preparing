package problems.n206_reverse_linked_list;


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

    public ListNode reverseList(ListNode head) {
        ListNode node = null;

        while (head != null) {
            node = new ListNode(head.val, node);
            head = head.next;
        }

        return node;
    }
}
