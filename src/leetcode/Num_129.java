package leetcode;

public class Num_129 {
    int allSum;
    public void dfs(TreeNode root, int sum) {
        if(root == null) return;
        if(root.left == null && root.right == null) {
            allSum += (sum*10 + root.val);
            return;
        }
        dfs(root.left, sum*10+root.val);
        dfs(root.right, sum*10 + root.val);
    }
    public int sumNumbers(TreeNode root) {
        allSum = 0;
        dfs(root, 0);
        return  allSum;
    }
}
