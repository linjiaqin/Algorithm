package leetcode;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q!=null || p != null && q == null) return false;
        if (p==null && q==null) return true;
        if (p.val == q.val)
            return isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
        else return false;
    }
}
public class Number_100 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "leetcode/100.txt";
        File file = new File(path);
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
        System.setIn(in);
        Scanner sc = new Scanner(System.in);
    }
}
