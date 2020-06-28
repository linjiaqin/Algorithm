package leetcode;

public class Num_3 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode curNode =  null;
        int d = 0;
        int cur = 0;
        while(l1 != null && l2 != null) {
            cur = l1.val + l2.val + d;
            if (cur >= 10) {
                cur = cur - 10;
                d = 1;
            }
            else d = 0;
            ListNode node = new ListNode(cur);
            if (head == null) {
                head = node;
                curNode = node;
            }
            else {
                curNode.next = node;
                curNode = curNode.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null) {
            cur = l1.val +  d;
            if (cur >= 10) {
                cur = cur - 10;
                d = 1;
            }
            else d = 0;
            ListNode node = new ListNode(cur);
            curNode.next = node;
            curNode = curNode.next;
            l1 = l1.next;
        }
        while(l2 != null) {
            cur = l2.val +  d;
            if (cur >= 10) {
                cur = cur - 10;
                d = 1;
            }
            else d = 0;
            ListNode node = new ListNode(cur);
            curNode.next = node;
            curNode = curNode.next;
            l2 = l2.next;
        }
        if (d > 0) {
            ListNode node = new ListNode(d);
            curNode.next = node;
        }
        return head;
    }
}
