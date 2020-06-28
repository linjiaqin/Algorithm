package kuaishou;

import java.util.Arrays;
import java.util.Scanner;

//给定一个未排序数组,找出其中最长的等差数列(无需保证数字顺序)。
//
//        输入描述:
//        第一行N表示数组中元素个数（N < 10,000,000）
//
//        第二行是数组的元素，用空格分割
public class Num_3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            int dp[] = new int[n];
            Arrays.fill(dp, 1);
//            for(int i= 0; i < n; i++){
//                for(int j = 0; j < i; j++) {
//                    if()
//                }
//            }
        }

    }
}
