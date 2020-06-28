package Byte;

import java.util.HashMap;
import java.util.Scanner;

public class num3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        int c[] = new int[n+1];
        for(int i = 1; i <= n; i++){
            c[i] = sc.nextInt();
        }
        int a,b;
        HashMap<Integer, Integer>map = new HashMap<>();
        int sum = 0;
        for(int i = 0; i < m; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            if (c[a] == c[b]){
                continue;
            }
            else{

            }
        }
    }
}
