package leetcode;

import java.util.*;

public class Num_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        int level = 0;
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()) {
            list.add(new ArrayList<Integer>());
            int length = q.size();
            for(int i = 0; i < length; i++) {
                TreeNode tmp = q.remove();
                list.get(level).add(tmp.val);
                if (tmp.left != null) q.add(tmp.left);
                if (tmp.right != null) q.add(tmp.right);
            }
            level++;
        }
        return list;
    }
}
