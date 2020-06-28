package qiniu;

import java.util.HashSet;
import java.util.Scanner;

public class num1 {
    public static int find(int x, int fa[]){
        if (fa[x] != x) return fa[x] = find(fa[x], fa);
        else return fa[x];
    }
    public static void init(int n, int fa[]){
        for(int i = 1; i < n+1; i++){
            fa[i] = i;
        }
    }
    public static void union(int a, int b, int[] fa){
        int x = find(a, fa);
        int y = find(b, fa);
        fa[x] = y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        int u,v;
        while (sc.hasNext()){
            n = sc.nextInt();
            m = sc.nextInt();
            int[] fa = new int[n+1];
            init(n, fa);
            for(int i = 0; i < m; i++){
                u = sc.nextInt();
                v = sc.nextInt();
                union(u,v,fa);
            }
            HashSet<Integer> hashSet = new HashSet<>();
            for (int i = 1; i <= n; i++){
                hashSet.add(fa[i]);
            }
            if(hashSet.size() > 1) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
