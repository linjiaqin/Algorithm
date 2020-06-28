package pingduoduo;

import java.util.Scanner;

public class num4 {
    public static int getGcd(int p, int q){
        if (q == 0) return p;
        int r = p % q;
        return getGcd(q, r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (sc.hasNextInt()) {
            n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            int max = 0;
            for(int i = 0; i < n; i++){
                for(int j = i+1; j< n; j++){
                    int gcd = a[i];
                    for(int k = i; k < j; k++){
                        gcd = getGcd(a[k], gcd);
                        max = Math.max(max, gcd*(k-i+1));
                    }
                }
            }
            System.out.println(max);
        }
    }
}
