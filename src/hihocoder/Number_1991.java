package hihocoder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 这题目就是每一次找连续三个重复的字符的中间那个的位置，每一次减去上一次找到的那个位置
 * 还有就是不要忘记最后一个字符串的位置减去上一次连续三个的中间位置
 * aaa{a}abbc{c}cabcde{e}eabcdef{g}
 * 很明显，我们要找的就是上面用{}标记的位置
 */
public class Number_1991 {
    public static void main(String[] args) {
        Scanner sc = StdIn.getScanner(1991);
        //Scanner sc = new Scanner(System.in);
        String s;
        while(sc.hasNext()) {
            s = sc.nextLine();
            int max_len = 0;
            int len = 0;
            int lastthree = 0;
            if (s.length() <= 2) {
                System.out.println(s.length());
                continue;
            }
            else {
                for (int i = 2; i < s.length(); i++) {
                    if (s.charAt(i) == s.charAt(i-1) && s.charAt(i-1) == s.charAt(i-2)){
                        len = i-1 - lastthree + 1;
                        if (len > max_len) max_len = len;
                        lastthree = i-1;
                    }
                }
                max_len = Math.max((s.length()-1 - lastthree + 1),max_len);
                System.out.println(max_len);
            }

//            Queue<Integer> q = new LinkedList<Integer>();
//            for(int i = 2; i < s.length(); i++) {
//                if (s.charAt(i) == s.charAt(i-1) && s.charAt(i-1) == s.charAt(i-2)){
//                    q.add(i-1);
//                }
//            }
//            q.add(s.length()-1);
//            int last = q.poll();
//            int cur = last;
//            while(!q.isEmpty()) {
//                cur = q.poll();
//                len = cur -last + 1;
//                last = cur;
//                if (len > max_len) max_len = len;
//            }
//            System.out.println(max_len);
        }
    }
}
