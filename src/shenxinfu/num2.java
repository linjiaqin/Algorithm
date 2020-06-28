package shenxinfu;

import java.util.Scanner;

public class num2 {
    public static void dfs(int a[][]){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        while (sc.hasNext()){
            n = sc.nextInt();
            m = sc.nextInt();
            int a[][] = new int[n][m];
            int sum = 0;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    a[i][j] = sc.nextInt();
                    if (a[i][j] == 1)sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
