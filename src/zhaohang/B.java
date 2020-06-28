package zhaohang;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class B {
    public static int find(int x, int fa[]){
        if(x != fa[x]) return fa[x] = find(fa[x], fa);
        return x;
    }
    public static int circle = 0;
    public static void union(int a, int b, int[] fa){
        int x = find(a, fa);
        int y = find(b, fa);
        if (x != y) fa[x] = y;
        else circle++;
    }
    public static void init(int n, int[] fa){
        for(int i = 0; i < 2*n; i++){
            fa[i] = i;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int tmp;
        while (sc.hasNext()){
            n = sc.nextInt();
            int[] row = new int[2*n];
            for(int i = 0; i < 2*n; i++){
                row[i] = sc.nextInt();
            }
            int fa[] = new int[2*n];
            init(n, fa);
            for(int i = 0; i < 2*n; i=i+2){
                fa[i] =i+1;
            }
            circle = 0;
            for(int i = 0; i < 2*n; i=i+2){
                union(row[i], row[i+1], fa);
            }
            System.out.println(n - circle);


        }
    }
}
