package alibab;

import java.util.Scanner;

public class Num_2 {
    public static int dir[][] = new int[4][2];
    public static int sum;
    public static int maxSum;
    public static boolean check(int x,int y, int n){
        if (x < 0 || y < 0 || x >=n || y >= n) return false;
        return true;
    }
    public static void dfs(int x,int y, int[][] mat, int k, int n){
        for(int j = 1; j <= k; j++) {
            for (int i = 0; i < 4; i++) {
                int ax = x + dir[i][0]*j;
                int ay = y + dir[i][1]*j;
                if (check(ax, ay, n) && mat[ax][ay] > mat[x][y]) {
                    sum += mat[ax][ay];
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                    dfs(ax, ay, mat, k, n);
                    sum -= mat[ax][ay];
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dir[0] = new int[]{-1,0};
        dir[1] = new int[]{1, 0};
        dir[2] = new int[]{0, 1};
        dir[3] = new int[]{0, -1};
        int t, n,k;
        t = sc.nextInt();
        while (t-- > 0){
            sum = 0;
            n = sc.nextInt();
            k = sc.nextInt();
            int[][] mat = new int[n][n];
            for(int i = 0; i < n;i++){
                for(int j = 0; j < n; j++){
                    mat[i][j] = sc.nextInt();
                }
            }
            sum = mat[0][0];
            maxSum = mat[0][0];
            dfs(0,0,mat, k, n);
            System.out.println(maxSum);
        }

    }
}
