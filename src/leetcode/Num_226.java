package leetcode;

//方法一：DFS递归
// 直接递归的方法,左右子树对调
//主义不能root.left = invertTree(root.right)
// root.right = invertTree(root.left)这样写，
// 因为这样会导致root.left被重复修改

//方法二：bfs宽度优先
public class Num_226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        if (root.left == null && root.right == null) return root;
        TreeNode l = invertTree(root.right);
        TreeNode r = invertTree(root.left);
        root.left = l;
        root.right = r;
        return root;
    }
}
