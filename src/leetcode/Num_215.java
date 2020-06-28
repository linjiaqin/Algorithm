package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

//java优先队列
public class Num_215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for(int e:nums) {
            q.add(e);
        }
        int tmp = 0;
        while (k-- > 0) {
            tmp = q.poll();
        }
        return tmp;
    }

    public static void main(String[] args) {
        int[] a= new int[]{3,2,1,5,6,4};
        new Num_215().findKthLargest(a,2);
    }
}
