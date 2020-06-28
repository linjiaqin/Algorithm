package meituan;

/**
 * 作为一个程序员，修bug（补漏洞）是一项基本的工作。当你刚刚完成一个工作的时候，甲方说你的程序里面有n个bug。
 *
 * 但是你已经很累了，你希望第一天修x个bug,第二天修[x/k]个bug，第三天修[x/k2]个bug，以此类推，第n天修⌊x/k^(n-1) ⌋个bug，直到修不了bug为止。
 *
 * [x]的意思是x向下取整。在k大于1的时候，总有一天会修不了一个bug的。所以，你希望在这一天来临之前，修完所有的bug。你要计算，你第一次至少要修多少个bug，即x的最小值为多少。
 */

import java.util.Scanner;

public class num3 {
    public static int getSum(int x, int k){
        int sum = 0;
        int day = x;
        int tmpk = 1;
        while (day > 0){
            sum += day;
            tmpk = tmpk*k;
            day = x/tmpk;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n;
        int k;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            n = sc.nextInt();
            k = sc.nextInt();
            int l = 0;
            int r = n;
            int mid;
            int sum;
            while (l < r) {
                mid = (l + r) / 2;
                sum = getSum(mid, k);
                if (sum < n) l = mid+1;
                else r = mid;
            }
            System.out.println(r);
        }
    }
}
