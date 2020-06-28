package leetcode;

import java.util.HashMap;

//哈希，利用java的map或set实现log(n)的查找
public class Num_217 {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) return true;
            else {
                map.put(nums[i], 1);
            }
        }
        return false;
    }
}
