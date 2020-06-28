package book.dp;

import java.util.Arrays;
/**
 * 输入: [10,9,2,5,3,7,101,18]
 * 输出: 4
 * 解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。
 */

/**
 * dp[i]表示以i为结尾的最长上升子序列的长度
 * dp[i] = max{dp[j] + 1  if(j <i && dp[i] > dp[j])}
 */
public class LIS {
    public static int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        for(int i = 1; i < len; i++){
            int cur = nums[i];
            for(int j = 0; j < i; j++){
                if (cur > nums[j]) dp[i] = Math.max(dp[j]+1, dp[i]);
            }
        }
        int res = dp[0];
        for(int i = 0; i < len; i++){
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
