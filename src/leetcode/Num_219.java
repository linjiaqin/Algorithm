package leetcode;

import java.util.HashMap;

//每次都要更新哈希表的下标为最新，因为最小的距离肯定是存在于最接近的两个之间
public class Num_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i  = 0;
        int cur;
        for(int e: nums) {
            if (!map.containsKey(e)) {
                map.put(e, i);
            }
            else {
                cur = map.get(e);
                map.put(e, i);
                if (i - cur <= k) return true;
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
