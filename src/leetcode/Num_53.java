package leetcode;

public class Num_53 {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int maxSum = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(dp[i-1] <= 0) dp[i] = nums[i];
            else dp[i] = dp[i-1] + nums[i];
            maxSum = Math.max(maxSum, dp[i]);
        }
        return maxSum;
    }
}
