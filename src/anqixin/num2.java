package anqixin;

import java.util.Scanner;

public class num2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        while (sc.hasNext()){
            s = sc.nextLine();
            String tmp[] = s.split(",");
            int a[] = new int[tmp.length];
            for(int i = 0; i < tmp.length; i++){
                a[i] = Integer.valueOf(tmp[i]);
            }
            int s1 = a[0] + a[1] + a[2] + a[3];
            int s2 = a[3] + a[4] + a[5] + a[6];
            int s3 = a[6] + a[7] + a[8] + a[0];
            if (s1 == s2 && s2 == s3) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
