package hihocoder;

import java.util.Scanner;

public class Number_1990 {
    public static boolean  check(int[][] a, int x, int y, int k){
        //System.out.printf("%s,%s,%s\n",x,y,k);
        int res = 0;
        int tmp;
        for (int i = 0; i < k; i++) res += a[x][y+i];
        for (int i = 1; i < k; i++) {
            tmp = 0;
            for (int j = 0; j < k; j++) {
                tmp += a[x+i][y+j];
            }
            if (tmp != res) return false;
        }
        for(int i = 0; i < k; i++){
            tmp = 0;
            for (int j = 0; j < k; j++) {
                tmp += a[x+j][y+i];
            }
            if (tmp != res) return false;
        }
        tmp = 0;
        for (int i = 0; i < k; i++) {
            tmp += a[x+i][y+i];
        }
        if (tmp != res) return false;
        tmp = 0;
        for (int i = 0; i < k; i++) {
            tmp += a[x+k-1-i][y+i];
        }
        if (tmp != res) return false;

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = //new Scanner(System.in);
                StdIn.getScanner(1990);
        int n;
        int a[][];
        while (sc.hasNext()) {
            n = sc.nextInt();
            a = new int[n][n];
            for(int i = 0; i < n ;i++)
                for (int j = 0; j < n; j++)
                    a[i][j] = sc.nextInt();
            int sum = 0;
            for(int i = 0; i < n ;i++)
                for (int j = 0; j < n; j++)
                    for (int k = 2; k <= n; k++)
                    {
                        if (i+k > n || j+k > n) {
                            //System.out.println("hah");
                            continue;
                        }
                        if(check(a, i, j, k)) sum++;
                    }
            System.out.println(sum+n*n);
        }
    }
}
