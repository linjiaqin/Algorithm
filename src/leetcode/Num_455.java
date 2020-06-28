package leetcode;

import java.util.Arrays;

public class Num_455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j = 0;
        int sum = 0;
        for(int i = 0; i < s.length; i++){
            if (s[i] >= g[j]){
                j++;
                sum++;
            }
            if(j == g.length) break;
        }
        return sum;
    }
}
