package leetcode;

import com.sun.javafx.binding.ListExpressionHelper;

//这里要警惕空指针错误，因为移动下个节点，下个节点可能为空，
// 可能用到相关变量，比如null.val造成异常
public class Num_203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode cur = head;
        //开头前面全是相等val的情况
        while (cur != null && cur.val == val) {
            head = cur.next;
            cur = cur.next;
        }
        while(cur != null && cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            }
            else cur = cur.next;
        }
        return head;
    }
}
