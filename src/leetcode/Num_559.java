//package leetcode;
//
//import java.util.List;
//
//class Node2 {
//    public int val;
//    public List<Node2> children;
//
//    public Node2() {}
//
//    public Node2(int _val) {
//        val = _val;
//    }
//
//    public Node2(int _val, List<Node2> _children) {
//        val = _val;
//        children = _children;
//    }
//};
//
//public class Num_559 {
//    public int maxDepth(Node root) {
//        if (root == null) return 0;
//        int maxdepth = 0;
//        //if (root.children.size() == 0) return 1;
//        for (Node e: root.children){
//            maxdepth = Math.max(maxDepth(e), maxdepth);
//        }
//        maxdepth = maxdepth + 1;
//        return maxdepth;
//    }
//}
