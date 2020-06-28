package leetcode;

import java.util.HashMap;

//用两个指针来维护一个滑动窗口
//right向右移动，如果有重复的，如果窗口中出现重复的，left移到重复位置+1
//用hashmap来记录字符字符出现的位置
public class Num_2 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int left = 0;
        int right = 0;
        int res = 0;
        while(right < s.length()) {
            if (hashMap.containsKey(s.charAt(right))) {
                int cur = hashMap.get(s.charAt(right));
                //如果该位置出现在left指针的右边，即在窗口内，left需要移动
                if (cur >= left) left = cur + 1;
            }
            hashMap.put(s.charAt(right), right);
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
