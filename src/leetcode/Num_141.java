package leetcode;

import java.util.HashSet;

//我们遍历所有结点并在哈希表中存储每个结点的引用（或内存地址）
public class Num_141 {
    public boolean hasCycle(ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        ListNode cur = head;
        while (cur != null) {
            if (set.contains(cur.val)) {
                return true;
            }
            else {
                set.add(cur.val);
            }
            cur = cur.next;
        }
        return false;
    }
}
