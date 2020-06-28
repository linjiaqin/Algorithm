package leetcode;

//方法一：直接合并两个有序链表（和归并排序的归并过程一致）
//方法二：采用递归的方法
//更简洁的写法
public class Num_21 {
    public ListNode dfs(ListNode l1, ListNode l2){
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if(l1.val <= l2.val) {
            l1.next = dfs(l1.next, l2);
            return l1;
        }
        else {
            l2.next = dfs(l1, l2.next);
            return l2;
        }
    }
    public ListNode mergeSample(ListNode l1, ListNode l2) {
        ListNode cur = new ListNode(0);
        ListNode head = cur;
        while(l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            }
            else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if (l1 != null) cur.next = l1;
        if (l2 != null) cur.next = l2;
        return head.next;
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head= null;
        ListNode cur = null;
        ListNode res = null;
        while(l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                res = new ListNode(l2.val);
                l2 = l2.next;
            }
            else {
                res = new ListNode(l1.val);
                l1 = l1.next;
            }
            if(head == null) {
                head = res;
                cur = res;
            }
            else {
                cur.next = res;
                cur = cur.next;
            }
        }
        while (l1 != null) {
            res = new ListNode(l1.val);
            l1 = l1.next;
            if(head == null) {
                head = res;
                cur = res;
            }
            else {
                cur.next = res;
                cur = cur.next;
            }
        }
        while (l2 != null) {
            res = new ListNode(l2.val);
            l2 = l2.next;
            if(head == null) {
                head = res;
                cur = res;
            }
            else {
                cur.next = res;
                cur = cur.next;
            }
        }
        return head;

    }
}
