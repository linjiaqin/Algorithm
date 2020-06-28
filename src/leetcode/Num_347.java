package leetcode;

import java.util.*;

//内部类可以使用外部类？
//优先队列如何对hashmap排序
public class Num_347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int e: nums) map.put(e,map.getOrDefault(e, 0)+1);
        PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2) - map.get(o1);
            }
        });
        for (Map.Entry e: map.entrySet()) q.add((int)e.getKey());
        List<Integer> list = new ArrayList<>();
        while (k-- > 0) {
            list.add(q.poll());
        }
        return list;
    }
}
