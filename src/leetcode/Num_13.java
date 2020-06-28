package leetcode;

import java.util.HashMap;

public class Num_13 {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res = 0;
        for (int i = 0; i < s.length()-1; i++) {
            int cur = map.get(s.charAt(i));
            int next = map.get(s.charAt(i+1));
            if (next <= cur) res += cur;   //如果当前数字比后一位大的话，可以确定当前数字加上。
            else res -= cur;

        }
        return res+ map.get(s.charAt(s.length()-1));
    }
    public static void main(String[] args) {

    }
}
