package leetcode;

import java.util.*;

class KthLargest {

    PriorityQueue<Integer> q;
    int size;
    public KthLargest(int k, int[] nums) {
        q = new PriorityQueue<>();
        for(int e: nums) q.add(e);
        size = k;
    }

    public int add(int val) {
        q.add(val);
        if (q.size() <= size) return q.peek();
        while (q.size() > size) {
            q.poll();
        }
        return q.peek();
    }
}
public class Num_703 {
    public static void main(String[] args) {
        int k = 3;
        int[] arr = new int[]{4,5,8,2};
        KthLargest kthLargest = new KthLargest(3, arr);
        System.out.println(kthLargest.add(3));
    }
}
