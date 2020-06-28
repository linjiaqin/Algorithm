package book.dp;

public class maxSubArraySum {
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int ans = Integer.MIN_VALUE;
        for(int i =0; i < nums.length; i++){
            if(sum < 0){
                sum = nums[i];
            }
            else sum+=nums[i];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
    //用dp数组记录
    public int maxSubArray1(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int[] dp = new int[len];
        dp[0] = nums[0];
        for (int i = 1; i < len; i++) {
            if (dp[i - 1] >= 0) {
                dp[i] = dp[i - 1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
        }
        // 最后不要忘记全部看一遍求最大值
        int res = dp[0];
        for (int i = 1; i < len; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }

}
