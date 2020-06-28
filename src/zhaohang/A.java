package zhaohang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A {
    public static int max_sum = 0;
    public static void dfs(int last, int dep, List[] list, int sum){
        if (dep == list.length){
            max_sum = Math.max(max_sum, sum);
            return;
        }
        for(int i  = 0; i < list[dep].size(); i++){
            if (i == last || i == last+1){
                //sum += ;
                dfs(i, dep +1, list, sum+(int)list[dep].get(i));
                //sum -= (int)list[dep].get(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int tmp;
        while (sc.hasNext()){
            n = sc.nextInt();
            List<Integer>[] list = new List[n];
            for(int i = 0; i < n; i++){
                list[i] = new ArrayList<>();
                for(int j = 0; j < i+1; j++){
                    tmp = sc.nextInt();
                    list[i].add(tmp);
                }
            }
//            max_sum = 0;
//            dfs(0, 1, list, list[0].get(0));
//            System.out.println(max_sum);
            int dp[][] = new int[n][n];
            for(int j = 0; j < n; j++){
                dp[n-1][j] = list[n-1].get(j);
            }
            for(int i = n-2; i >= 0; i--){
                for(int j = 0; j < list[i].size(); j++){
                    dp[i][j] = Math.max(dp[i+1][j], dp[i+1][j+1])+list[i].get(j);
                }
            }
            System.out.println(dp[0][0]);
        }
    }
}
