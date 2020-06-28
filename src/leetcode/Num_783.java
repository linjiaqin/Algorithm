package leetcode;

public class Num_783 {
    //理解错题意，这是相邻两点之间，题目要求是两点距离不做要求
    public int minDiffInBST1(TreeNode root) {
        int diff = Integer.MAX_VALUE;
        if(root == null) return diff;
        if (root.left != null && root.right!=null)
            diff= Math.min(root.val-root.left.val, root.right.val-root.val);
        else if (root.left == null && root.right != null) diff = root.val - root.right.val;
        else if (root.right == null && root.left != null) diff = root.val - root.left.val;
        else return Integer.MAX_VALUE;
        int mindiff = Math.min(diff, minDiffInBST(root.left));
        mindiff = Math.min(mindiff, minDiffInBST(root.right));
        return mindiff;
    }

    //中序遍历
    Integer ans;
    TreeNode pre;
    public void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        if (pre != null) ans = Math.min(root.val -pre.val, ans);
        pre = root;
        dfs(root.right);

    }
    public int minDiffInBST(TreeNode root) {
        ans = Integer.MAX_VALUE;
        dfs(root);
        return ans;
    }
}
