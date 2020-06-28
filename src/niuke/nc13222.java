package niuke;

import java.util.Scanner;

public class nc13222 {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            m = sc.nextInt();
            int[] b = new int[m];
            for(int i = 0; i < m; i++){
                b[i] = sc.nextInt();
            }
            int min_sum = Integer.MAX_VALUE;
            int sum = 0;
            for(int i = 0; i < m-n; i++){
                sum = 0;
                for(int j = 0; j < n; j++){
                    sum += Math.pow(a[j]-b[i+j], 2);
                }
                min_sum = Math.min(min_sum, sum);
            }
            System.out.println(min_sum);
        }

    }
}
