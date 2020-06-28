package pingduoduo;

import java.util.Scanner;

public class num3 {
    public static void main(String[] args) {
        int n;
        int a,b;
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for(int i = 0; i < t; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            int f0 = a;
            int f1 = b;
            int f = 0;
            for(int j = 2; j <=n ; j++){
                f = f0 + f1;
                f0 = f1;
                f1 = f;
            }
            if (f%3 == 0) System.out.println("YES");
            else System.out.println("NO");
        }

    }

}
