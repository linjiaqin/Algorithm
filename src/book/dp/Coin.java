package book.dp;

import java.util.Scanner;

class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[] = new int[n+1];
        dp[0] = 0;
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < coins.length; j++){
                dp[i] = Math.min(dp[i], 1+dp[i - coins[j]]);
            }
        }
        return dp[amount];
    }
}

public class Coin {

    public static void main(String[] args) {
        int n;
        int amount;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            n = sc.nextInt();
            amount = sc.nextInt();
            int coin[] = new int[n];
            for(int i = 0; i < n; i++){
                coin[i] = sc.nextInt();
            }
        }
    }
}
