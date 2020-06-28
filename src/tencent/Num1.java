package tencent;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Num1 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Integer[] a = new Integer[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        Arrays.sort(a, Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            if (i %2 == 0)sum1 += a[i];
            else sum2+=a[i];
        }
        System.out.println(sum1-sum2);
    }
}
