package hihocoder;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Number_1114 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("hihocoder/1114.txt");
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
        System.setIn(in);
        Scanner sc = new Scanner(System.in);

        int t,n;
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

        }
    }
}
