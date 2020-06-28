package leetcode;

import java.util.HashSet;

public class Num_547 {
    public void init(int parent[], int rank[]) {
        for(int i = 0; i < parent.length; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }
    //路径压缩
    public int find(int x, int parent[]) {
        if (parent[x] == x) return x;
        else return parent[x] = find(parent[x], parent);
    }
    //合并
    public void union(int x, int y, int parent[]) {
        int a = find(x, parent);
        int b = find(y, parent);
        if (a != b) parent[a] = b;
    }
    //按秩合并
    public void union(int x, int y, int parent[], int[] rank) {
        int a = find(x, parent);
        int b = find(y, parent);
        if (a != b) {
            if (rank[a] > rank[b]) parent[b] = a;
            else if (rank[a] < rank[b]) parent[a] = b;
            else {
                parent[a] = b;
                rank[b]++;
            }
        }
    }
    public int findCircleNum(int[][] M) {
        int n = M.length;
        int parent[] = new int[n];
        int rank[] = new int[n];
        init(parent, rank);
        for(int i = 0; i < n; i++)
            for(int j = i+1; j < n; j++) {
                if(M[i][j]==1) {
                    union(i, j, parent, rank);
                }
            }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            int x = find(i, parent);
            set.add(x);
        }
        return set.size();
    }
}
