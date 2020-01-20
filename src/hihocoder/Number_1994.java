package hihocoder;

import java.io.*;
import java.util.Scanner;

/**
 * 目标：求出root节点到叶节点的深度即可
 */
public class Number_1994 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("hihocoder/1994.txt");
        InputStream in = new BufferedInputStream(new FileInputStream(file));
        System.setIn(in);
        Scanner sc = new Scanner(System.in);
        int n,q,p[],m;
        int h[];
        int tmp;
        while(sc.hasNext()) {
            n = sc.nextInt();
            q = sc.nextInt();
            p = new int[n+1];
            h = new int[n+1];
            p[0] = 0;
            for(int i = 1; i <= n; i++) {
                tmp = sc.nextInt();
                p[i] = tmp;
                h[i] = 0;
            }

        }
    }
}
