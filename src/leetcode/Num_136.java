package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Num_136 {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i] ,1);
            }
        }
        for(Map.Entry e:map.entrySet()){
            if((int)e.getValue() == 1) return (int)e.getKey();
        }
        return -1;
    }
}
