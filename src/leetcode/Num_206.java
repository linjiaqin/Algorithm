package leetcode;

public class Num_206 {
    public ListNode reverseList(ListNode head) {
        ListNode last = null;
        ListNode forward = null;
        while(head != null) {
            last = head;
            forward = head.next.next;
            head = head.next;
            
        }
        return head;
    }
}
