package hihocoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Number_1986 {
    public static void main(String[] args) {
        Scanner sc = StdIn.getScanner(1986);
        //Scanner sc = new Scanner(System.in);
        int n;
        int a[];
        while(sc.hasNext()) {
            n = sc.nextInt();
            a = new int[n];
            HashMap<Integer, Integer> count = new HashMap<>();
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                if (!count.containsKey(a[i])) {
                    count.put(a[i], 1);
                }
                else {
                    count.put(a[i], count.get(a[i])+1);
                }
            }
            HashMap<Integer, Integer> counts = new HashMap<>();
            for (Integer e: count.values()) {
                if (!counts.containsKey(e)) {
                    counts.put(e, 1);
                }
                else {
                    counts.put(e, counts.get(e) + 1);
                }
            }
            int sum = 0;
            for (Map.Entry e: counts.entrySet()) {
                Integer key = (Integer)e.getKey();
                Integer value = (Integer)e.getValue();
                while (value > 1) {
                    sum++;
                    value--;
                }
            }

            /**
             * 下面这中考虑少了一种情况
             */
//            int max = 0;
//            int min = Integer.MAX_VALUE;
//            int sum = 0;
//            for (Map.Entry e: counts.entrySet()) {
//                Integer key = (Integer)e.getKey();
//                Integer value = (Integer)e.getValue();
//                sum += key*value;
//                if (value > max) {
//                    max = value;
//                }
//                if (value < min) {
//                    min = value;
//                }
//            }
//            int max_sum = 0;
//            for(int i = min; i <= max; i++) {
//                max_sum += i;
//            }
//            if (max == 1) System.out.println(0);
//            else System.out.println(sum - max_sum);
        }
    }
}
