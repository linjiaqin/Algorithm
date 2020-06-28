package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Num_104 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
    public int maxDepthBfs(TreeNode root){
        Queue<TreeNode>q = new LinkedList<>();
        int depth = 0;
        if(root == null) return 0;
        q.add(root);
        TreeNode tmp = null;
        int level = 0;
        int size = 0;
        while ( !q.isEmpty()) {
            level++;
            size = q.size();
            for(int i = 0; i < size; i++){
                tmp = q.remove();
                if (tmp.left != null) q.add(tmp.left);
                if (tmp.right != null) q.add(tmp.right);
            }
        }
        return level;
    }
}
