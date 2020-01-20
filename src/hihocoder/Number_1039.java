package hihocoder;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Number_1039 {
    public int getFinal(String s) {
        int cnt = 1;
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                cnt++;
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        String path = "hihocoder/1039.txt";
        File file = new File(path);
        InputStream in = new BufferedInputStream(new FileInputStream(file));
        System.setIn(in);
        Scanner sc = new Scanner(System.in);
        int t;
        String s;
        t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            s = sc.nextLine();

        }
    }
}
