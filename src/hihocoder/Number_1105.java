package hihocoder;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Number_1105 {
    public static void main(String[] args) {
        //Scanner sc = StdIn.getScanner(1105);
        Scanner sc = new Scanner(System.in);
        int n;
        String s;
        String a;
        int w;
        while(sc.hasNext()) {
            n = sc.nextInt();
            s = sc.nextLine();
            PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });
            for(int i = 0; i < n; i++) {
                s = sc.nextLine();
                String tmp[] = s.split(" ");
                a = tmp[0];
                if (a.equals("A")){
                    w = Integer.parseInt(tmp[1]);
                    q.add(w);
                }
                else {
                    System.out.println(q.poll());
                }
            }
        }
    }
}
