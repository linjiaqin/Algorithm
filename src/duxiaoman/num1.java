package duxiaoman;

import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {
        int n,m,a,b;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            n = sc.nextInt();
            m = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            int[][] mat = new int[n+1][m+1];
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= m; j++){
                    mat[i][j] = i*j%10;
                }
            }
            int sum = 0;
            int tmp = 0;
            for(int i = 1; i <= n-a+1; i++){
                for(int j = 1; j <= m-b+1; j++){

                }
            }
            System.out.println(sum);
        }
    }
}
