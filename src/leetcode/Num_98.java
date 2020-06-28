package leetcode;

public class Num_98 {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        boolean flag1,flag2;
        if (root.left.val < root.val) flag1 = isValidBST(root.left);
        else return false;
        if (root.right.val > root.val) flag2 = isValidBST(root.right);
        else return false;
        return flag1&&flag2;
    }
}
