package tencent;

import java.util.HashMap;
import java.util.Scanner;
/*
4
10 1
10 2
10 3
10 4
 */
public class num_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q,k;
        long x;
        q = sc.nextInt();
        while (q-- > 0){
            x = sc.nextLong();
            k = sc.nextInt();
            long tmp = x;
            int dep = 0;
            HashMap<Integer,Long>map = new HashMap<>();
            while (tmp >= 1){
                tmp = tmp/2;
                dep++;
                map.put(dep, tmp);
            }
            if (map.containsKey(dep-k)) System.out.println(map.get(dep-k));
            else System.out.println(-1);
        }
    }
}
