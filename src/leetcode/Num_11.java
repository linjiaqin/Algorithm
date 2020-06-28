package leetcode;

//直接暴力，时间复杂度为O(n^2)
public class Num_11 {
    public int maxArea(int[] height) {
        int minHeight = 0;
        int maxWater = 0;
        for (int i = 0; i < height.length; i++)
            for(int j = i+1; j < height.length; j++){
                minHeight = Math.min(height[i], height[j]);
                maxWater = Math.max((j-i)*minHeight, maxWater);
            }
        return maxWater;
    }
    //方法二，双指针法
    public int maxArea2(int[] height) {
        int minHeight = 0;
        int maxWater = 0;
        for (int i = 0; i < height.length; i++){

        }
        return maxWater;
    }
    public static void main(String[] args) {

    }
}
