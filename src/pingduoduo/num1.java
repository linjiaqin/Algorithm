package pingduoduo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 模拟题  3 4 1 1
 * 一次只能加1， 加最少次，使序列每个数都不一样
 * 思路： 排序，从小到大贪心
 */


public class num1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (sc.hasNextInt()) {
            n = sc.nextInt();
            long a[] = new long[n];
            long sum = 0;
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            for(int i = 1; i < n; i++){
                if(a[i] <= a[i-1]){
                    sum += a[i-1]+1 - a[i];
                    a[i] = a[i-1]+1;
                }
            }
            System.out.println(sum);
        }
    }
}
