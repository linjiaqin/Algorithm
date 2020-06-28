package meituan;

import java.util.Scanner;

public class num5 {
    public static void main(String[] args) {
        int n;
        int k;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            n = sc.nextInt();
            k = sc.nextInt();
            String s[] = new String[k];
            String p[] = new String[n];
            for(int i = 0; i < n; i++){
                s[i] = sc.nextLine();
            }
            for(int i = 0; i < k; i++){
                p[i] = sc.nextLine();
            }
            int sum = 0;
            for(int i = 0; i < k; i++){
                if (p[i].charAt(0) == '?'){
                    String tmp = p[i].substring(1,p[i].length());
                    for(int x = 0; x < n; x++){
                        if (tmp.contains(s[k])) sum++;
                    }
                }
            }
            System.out.println(sum);

        }
    }
}
