package leetcode;

import java.util.HashMap;

public class Num_242 {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(!hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i), 1);
            }
            else {
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i))+1);
            }
        }
        for(int i = 0; i < t.length(); i++) {
            if(!hashMap.containsKey(t.charAt(i))) {
                return false;
            }
            else {
                hashMap.put(t.charAt(i), hashMap.get(t.charAt(i))-1);
                if(hashMap.get(t.charAt(i))==0){
                    hashMap.remove(t.charAt(i));
                }
            }
        }
        if(hashMap.isEmpty()) return true;
        else return false;
    }
}
