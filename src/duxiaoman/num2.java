package duxiaoman;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class num2 {
    public static void main(String[] args) {
        int n, A, B, C;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            n = sc.nextInt();
            A = sc.nextInt();
            B = sc.nextInt();
            C = sc.nextInt();
            int a[] = new int[n+1];
            a[0] = 0;
            for(int i = 1; i <= n; i++){
                a[i] = sc.nextInt();
            }
            HashMap<Integer, Integer> cost = new HashMap<>();
            Queue<Integer>q = new LinkedList<>();
            ((LinkedList<Integer>) q).push(1);
            int cur = 1;
            cost.put(1, 0);
            int sum = 0;
            while (!q.isEmpty()){
                cur = ((LinkedList<Integer>) q).getFirst();
                ((LinkedList<Integer>) q).removeFirst();
                if (cur == n){
                    sum = cost.get(n);
                    break;
                }
                int lastcost = cost.get(cur);
                cost.put(a[cur], lastcost+A);
                ((LinkedList<Integer>) q).push(a[cur]);

                if (a[cur] > 1){
                    cost.put(a[cur]-1, lastcost+A+B);
                    ((LinkedList<Integer>) q).push(a[cur]-1);
                }
                if (a[cur] < n){
                    cost.put(a[cur]+1, lastcost+A+C);
                    ((LinkedList<Integer>) q).push(a[cur]+1);
                }
            }
            System.out.println(sum);
        }
    }
}
