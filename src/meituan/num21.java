package meituan;

import java.util.Scanner;

public class num21 {
    public static boolean getParent(int son, int[] fa, int parent){
        if(son == 0) return false;
        if (fa[son] == parent) return true;
        else return getParent(fa[son], fa, parent);
    }
    public static void main(String[] args) {
        int n;
        int x;
        String s;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            int fa[] = new int[100000];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (i == 0) fa[a[i]] = 0;
                else fa[a[i]] = a[i - 1];
            }
            for (int j = 0; j < n; j++)
                b[j] = sc.nextInt();

            int sum = 0;
            int cur,another;
            int curPos = -1;
            int anotherPos = -1;
            for (int i = 0; i < n; i++) {
                cur = b[i];
                //b[i]后面的数
                for (int j = i+1; j < n; j++) {
                    another = b[j];
                    curPos = anotherPos = -1;
                    for(int k = 0; k<n; k++){
                        if (cur == a[k]) curPos = k;
                        if (another == a[k]) anotherPos = k;
                        if (curPos != -1 && anotherPos!=-1) break;
                    }
                    if (anotherPos < curPos) {
                        sum++;
                        break;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
