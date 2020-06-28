package wangyi;

import java.util.Arrays;
import java.util.Comparator;

public class num4 {

    public static void main(String[] args) {
        int box[][] = new int[3][3];
        box[0] = new int[]{5,4,3};
        box[1] = new int[]{5,4,3};
        box[2] = new int[]{6,6,6};
        System.out.println(new Solution().maxBoxes(box));
    }
}
class Solution {
    /**
     *
     * @param boxes int整型二维数组
     * @return int整型
     */
    public static boolean vis[] = new boolean[101];
    public static int big;
    public boolean check(int[][] boxes, int dep){
        for(int i = 0; i < dep; i++){
            if(vis[i]){
                if (boxes[dep][0] > boxes[i][0]&& boxes[dep][1] > boxes[i][1] && boxes[dep][2] > boxes[i][2]){
                    continue;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
    public static int maxs = 0;
    public void dfs(int[][] boxes, int dep, int n){
       if (dep == n){
           int tmp = 0;
           for(int i  = 0; i < vis.length; i++){
               if (vis[i]){
                   //System.out.println("choose:" + i);
                   tmp++;
               }
           }
           maxs = Math.max(maxs, tmp);
           return;
       }
        if (check(boxes, dep)) {
            vis[dep] = true;
            dfs(boxes, dep + 1, n);
            vis[dep] = false;
            dfs(boxes, dep + 1, n);
        }
    }
    public int maxBoxes (int[][] boxes) {
        // write code here
        int n = boxes.length;
        for(int i = 0; i < n; i++){
            Arrays.sort(boxes[i]);
        }

        maxs = 0;
        Arrays.fill(vis, false);
        dfs(boxes, 0, boxes.length);
        return maxs;
    }

}