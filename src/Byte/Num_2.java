package Byte;

import java.util.Scanner;

public class Num_2 {
    //C(n.2), 因为最右边那个点是固定的，否则会C n,3会有重复的情况
    public static long C(long n){
        return n*(n-1)/2;
    }
    public static void main(String[] args) {
        int n,d;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            n = sc.nextInt();
            d = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int l = 0;
            int r = 0;
            int len = 0;
            long sum = 0;
            for (int i = 1; i < a.length; i++) {
                if (a[i] - a[l] <= d && i-l>=2) {
                    sum +=  + C(i-l);
                    len++;
                } else {
                    l++;
                }
            }
            System.out.println(sum%99997867);
        }
    }
}
