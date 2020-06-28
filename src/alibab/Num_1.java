package alibab;

import java.util.Scanner;

public class Num_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long n,m,b,a;
        while(t-- > 0){
            n = sc.nextLong();
            m = sc.nextLong();
            a = sc.nextLong();
            b = sc.nextLong();
            long res = 0;
            if (b*n >=a*m) res = m;
            else {
                res = b*n/a;
            }
            System.out.println(res);
        }
    }
}