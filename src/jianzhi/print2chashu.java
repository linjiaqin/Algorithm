package jianzhi;


import java.util.ArrayList;
        import java.util.Queue;
        import java.util.LinkedList;
class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
        this.val = val;
     }
}

public class print2chashu {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        if (root != null) q.offer(root);
        ArrayList<Integer> list = new ArrayList<>();
        TreeNode tmp = null;
        while(!q.isEmpty()){
            tmp = q.poll();
            list.add(tmp.val);
            if(tmp.left != null) q.offer(tmp.left);
            if(tmp.right != null) q.offer(tmp.right);
        }
        return list;
    }
}