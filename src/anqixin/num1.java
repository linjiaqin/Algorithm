package anqixin;

import java.util.Scanner;

public class num1 {
//    public static int amount[] = {2,3,1,5,4,3};
//    public static int prize[] = {2,2,3,1,5,2};
    public static int amount[] = {5,3,3,2,4,1};
    public static int prize[] = {1,2,2,2,5,3};
    public static int sum_kouzhao;
    public static void dfs(int dep, int kouzhao, int money,  int n){
        if (dep >= 6) return;
        if(money <= n){
            sum_kouzhao = Math.max(sum_kouzhao,kouzhao);
        }
        dfs(dep+1, kouzhao+amount[dep], money + prize[dep],  n);
        dfs(dep+1, kouzhao, money, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (sc.hasNext()){
            n = sc.nextInt();
            sum_kouzhao = 0;
            dfs(0,0,0, n);
            System.out.println(sum_kouzhao);
        }
    }
}
