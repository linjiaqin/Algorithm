package leetcode;

import java.util.LinkedList;
import java.util.List;

public class Num_94 {
    public void mid_dfs(List<Integer>list, TreeNode root){
        if (root == null) return;
        mid_dfs(list, root.left);
        list.add(root.val);
        mid_dfs(list, root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>list = new LinkedList<>();
        mid_dfs(list, root);
        return list;
    }
}
