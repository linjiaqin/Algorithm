package wangyi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class num2 {

    public void dfs(int[] w, int t, int dep){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        int n;
        int[] w;
        int[] t;
        while (sc.hasNext()) {
           n = sc.nextInt();
           w = new int[n];
           t = new int[n];
           for(int i = 0; i < n; i++) sc.nextInt(w[i]);
           for(int i = 0; i < n; i++) sc.nextInt(t[i]);

            Arrays.sort(w);
            Arrays.sort(t);
            int sum = 0;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if (t[i] <= w[j]) sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
