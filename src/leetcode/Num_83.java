package leetcode;

public class Num_83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur,nextNode;
        cur = head;
        while (cur != null) {
            nextNode = cur.next;
            if (nextNode == null) break;
            while (nextNode != null && nextNode.val == cur.val) {
                nextNode = nextNode.next;
            }
            cur.next = nextNode;
            cur = cur.next;
        }
        return head;
    }
}
