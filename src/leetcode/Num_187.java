package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//滑动窗口长为10移动
public class Num_187 {
    public List<String> findRepeatedDnaSequences(String s) {
        Set set = new HashSet();
        Set res = new HashSet();
        for(int i = 0; i+9 <s.length(); i++) {
            String tmp = s.substring(i, i+10);
            if (set.contains(tmp)) res.add(tmp);
            else set.add(tmp);
        }
        return new ArrayList(res);
    }

    public static void main(String[] args) {
        String a = "aaaaaaaaaaaa";
        new Num_187().findRepeatedDnaSequences(a);
    }
}
