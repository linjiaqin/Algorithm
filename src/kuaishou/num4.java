package kuaishou;

import java.util.Arrays;

class Solution {

    /**
     * 获取最大可同事办公员工数
     * @param pos char字符型二维数组 工位分布
     * @return int整型
     */
    int[][] dir = new int[4][2];
    int sum = 0;
    public int GetMaxStaffs (char[][] pos) {
        // write code here

        int l = pos[0].length;
        int r = pos.length;
        boolean[][] vis = new boolean[l][r];
        Arrays.fill(vis, false);
        dir[0] = new int[]{0,1};
        dir[1] = new int[]{0, -1};
        dir[3] = new int[]{1, 0};
        dir[4] = new int[]{-1, 0};
        int all = 0;
        for(int i  =0; i < pos.length; i++){
            for(int j = 0; j < pos[0].length; j++){
                if (pos[i][j] == '.' && !vis[i][j]){
                    vis[i][j] = true;
                    sum = 0;
                    dfs(pos, vis ,i, j);
                    if (sum %2 == 1) all += sum/2+1;
                    else all += sum/2;
                }
            }
        }
        return all;
    }

//    boolean check(char[][] pos, int x, int y, boolean vis[][]){
//        if (vis[x+1][y] || vis[x-1][y] || vis[x][y+1] || vis[x][y-1]) return false;
//        return true;
//    }
    boolean rangecheck(char[][] pos, int x, int y){
        if (x < 0 || y < 0 || x>=pos[0].length || y>= pos.length) return false;
        return true;
    }


    public void dfs(char[][] pos, boolean vis[][], int x, int y){
        for (int i = 0; i < 4; i++){
            int tmpX = x + dir[i][0];
            int tmpY = y + dir[i][1];
            if (!vis[tmpX][tmpY]  && pos[tmpX][tmpY] == '.'  && rangecheck(pos, tmpX, tmpY)){
                vis[tmpX][tmpY] = true;
                sum++;
                dfs(pos, vis, tmpX, tmpY);
            }
        }
    }
}
public class num4 {
    public static void main(String[] args) {

    }
}
