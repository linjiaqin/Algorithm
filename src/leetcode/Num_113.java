package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//中序遍历，回溯
public class Num_113 {
    List<List<Integer>> list;
    public void dfs(TreeNode root, int sum, LinkedList<Integer> l) {
        if(root == null) return;
        if (root.left == null && root.right == null)  {
            sum -= root.val;
            l.add(root.val);
            if(sum == 0) {
                ArrayList<Integer> ll = new ArrayList<>();
                for(Integer e:l) ll.add(e);
                list.add(ll);
            }
            l.removeLast();
            return;
        }
        l.add(root.val);
        dfs(root.left, sum-root.val, l);
        dfs(root.right, sum-root.val ,l);
        l.removeLast();
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        list = new ArrayList<>();
        LinkedList<Integer> tmp = new LinkedList<>();
        dfs(root, sum, tmp);
        return  list;
    }
}
