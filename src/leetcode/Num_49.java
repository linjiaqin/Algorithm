package leetcode;

import java.util.*;

public class Num_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List list = null;
        for(String e: strs) {
            char[] tmp = e.toCharArray();
            Arrays.sort(tmp);
            String s = String.valueOf(tmp);
            if (!map.containsKey(s)) map.put(s, new ArrayList<>());
            list = map.get(s);
            list.add(e);
        }
        List l = new ArrayList<>();
        for(Map.Entry e:map.entrySet()){
            l.add(e.getValue());
        }
        return l;
    }
}
