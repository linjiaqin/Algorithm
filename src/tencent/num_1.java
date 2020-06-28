package tencent;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class num_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        int q;
        String s;
        while (t-- > 0) {
            q = Integer.valueOf(sc.nextLine());
            Queue<Integer> queue = new LinkedList<>();
            //sc.nextLine();
            for (int i = 0; i < q; i++) {
                s = sc.nextLine();
                if (s.equals("TOP")) {
                    if (queue.isEmpty()) System.out.println(-1);
                    else System.out.println(((LinkedList<Integer>) queue).getFirst());
                } else if (s.equals("POP")) {
                    if (queue.isEmpty()) System.out.println(-1);
                    else ((LinkedList<Integer>) queue).removeFirst();
                } else if (s.equals("SIZE")) {
                    System.out.println(queue.size());
                } else if (s.equals("CLEAR")) {
                    queue.clear();
                } else if (s.startsWith("PUSH")){
                    String tmp[] = s.split(" ");
                    String op = tmp[0];
                    String x = tmp[1];
                    ((LinkedList<Integer>) queue).addLast(Integer.valueOf(x));
                }

            }
        }
    }
}
