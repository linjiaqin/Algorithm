package leetcode;

import java.util.Arrays;
import java.util.HashSet;

//图的邻接矩阵，dfs求联通分量
public class Num_547_2 {
    public void dfs(int[][] M, boolean[] vis, int i) {
        for(int j = 0; j < M.length; j++) {
            if (M[i][j] == 1 && !vis[j]) {
                vis[j] = true;
                dfs(M, vis, j);
            }
        }
    }
    public int findCircleNum(int[][] M) {
        boolean[] vis = new boolean[M.length];
        Arrays.fill(vis, false);
        int count = 0;
        for(int i = 0; i < M.length; i++){
            if (!vis[i]){
                dfs(M, vis, i);
                count++;
            }
        }
        return count;
    }
}
