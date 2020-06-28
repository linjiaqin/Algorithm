package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Num_637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return list;
        q.add(root);
        TreeNode tmp = null;
        int level = 0;
        int size = 0;
        double avg = 0.0;
        while ( !q.isEmpty()) {
            level++;
            size = q.size();
            avg = 0.0;
            for(int i = 0; i < size; i++){
                tmp = q.remove();
                avg += tmp.val;
                if (tmp.left != null) q.add(tmp.left);
                if (tmp.right != null) q.add(tmp.right);
            }
            avg = avg/size;
            list.add(avg);
        }
        return list;
    }
}
