package leetcode;

public class Num_26 {
    public void swap(int[] nums, int a, int b) {
        int x = nums[b];
        nums[b] = nums[a];
        nums[a] = x;
    }
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        while(j < nums.length){
            if (nums[j] > nums[i]){
                swap(nums, i+1, j);
                i++;
            }
            j++;
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] a = new int[]{0,1,2,3,4,5};
        System.out.println(new Num_26().removeDuplicates(a));
    }
}
