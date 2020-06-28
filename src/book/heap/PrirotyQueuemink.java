package book.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//用一个最大堆维护着最小的K个数，
// 1. 堆未满，直接插入
// 2. 堆满了，当前数比堆的最大元素小，删掉最大元素，插入。
//    当前数大于最大元素，直接丢弃。
public class PrirotyQueuemink {
        public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
            ArrayList<Integer> list = new ArrayList<>();
            if (k == 0 || k > input.length) return list;
            PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });
            for(int i = 0; i < input.length; i++){
                if(q.size() < k) q.add(input[i]);
                else {
                    int tmp = q.peek();
                    if (input[i] < tmp) {
                        q.poll();
                        q.add(input[i]);
                    }
                }
            }
            while (!q.isEmpty()){
                list.add(q.peek());
                q.poll();
            }
            return list;
        }
    public static void main(String[] args) {
        int a[] = new int[]{4,5,1,6,2,7,3,8};
        PrirotyQueuemink solve = new PrirotyQueuemink();
        ArrayList<Integer> list = solve.GetLeastNumbers_Solution(a, 4);
        list.forEach(x-> System.out.println(x));
    }
}
