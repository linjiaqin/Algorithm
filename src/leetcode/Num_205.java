package leetcode;

import java.util.HashMap;

//不能出现重复的配对，s-》t还有t->s两种情况都要考虑
//比如add，egg，建立s到t的映射后，只要有不对应的映射就是不行
//比如 aa->ad
public class Num_205 {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(!map1.containsKey(s.charAt(i))) {
                map1.put(s.charAt(i), t.charAt(i));
            }
            else {
                if(t.charAt(i) == map1.get(s.charAt(i))) {
                    continue;
                }
                else return false;
            }
            if(!map2.containsKey(t.charAt(i))) {
                map2.put(t.charAt(i), s.charAt(i));
            }
            else {
                if(s.charAt(i) == map2.get(t.charAt(i))) {
                    continue;
                }
                else return false;
            }
        }
        return true;
    }
}
