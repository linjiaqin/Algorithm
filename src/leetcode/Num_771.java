package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class Num_771 {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> set = new HashSet<>();
        for(char e: J.toCharArray()) {
            set.add(e);
        }
        int sum = 0;
        for (char e: S.toCharArray()) {
            if (set.contains(e)) sum++;
        }
        return sum;
    }
}
