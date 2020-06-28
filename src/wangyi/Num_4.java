//package wangyi;
//
//
//import java.util.*;
//
//public class Num_4 {
//    public void dfs1(){
//
//    }
//    public int cmp(int g1, int g2, int[][] records, int n) {
//        // write code here
//        Vector<Vector<Integer>> g = new Vector<>();
//        HashMap<Integer,Integer> indegree = new HashMap<>();
//        for(int i = 0; i < n; i++){
//            if (g[records[i][0]] == null) {
//                g[records[i][0]] = new Vector<>();
//            }
//            g[records[i][0]].add(records[i][1]);
//            if (indegree.get(records[i][1]) == null) indegree.put(records[i][1], 1);
//            else indegree.put(records[i][1], indegree.get(records[i][1])+1);
//        }
//
//    }
//}