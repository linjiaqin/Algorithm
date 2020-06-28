package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Num_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (numRows == 0) return list;
        list.add(new ArrayList<>());
        list.get(0).add(1);
        for (int i = 1; i < numRows; i++) {
            List<Integer> cur = new ArrayList<>();
            List<Integer> tmp = list.get(i - 1);
            cur.add(1);
            for (int j = 0; j + 1 < tmp.size(); j++) {
                cur.add(tmp.get(j) + tmp.get(j + 1));
            }
            cur.add(1);
            list.add(cur);
        }
        return list;
    }

    public static void main(String[] args) {
        new Num_118().generate(4);
    }
}
