package hihocoder;

import java.io.*;
import java.util.Scanner;

/**
 * 贪心的思想：一定是几个连在一起比几个拆开更好。
 * 所以直接枚举
 */
public class Number_1051 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "hihocoder/1051.txt";
        File file = new File(path);
        InputStream in = new BufferedInputStream(new FileInputStream(path));
        System.setIn(in);
        Scanner sc = new Scanner(System.in);
        int t,n,m;
        int[] a;
        t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            n = sc.nextInt();
            m = sc.nextInt();
            a = new int[n + 2];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            if (m > n) {
                System.out.println(100);
                continue;
            }
            a[0] = 0;
            a[n + 1] = 101;
            int res = 0;
            int max_res = 0;
            for (int i = 1; i + m <= n; i++) {
                res = a[i + m] - a[i - 1] - 1;
                if (res > max_res) {
                    max_res = res;
                }
            }
            System.out.println(max_res);
        }
    }
}
