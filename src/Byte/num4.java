package Byte;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class num4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s ;
        int n;
        while (sc.hasNext()){
            s = sc.nextLine();
            char[] res = s.toCharArray();
            n = sc.nextInt();
            sc.nextLine();
            String op;
            int pos;
            char c;
            int l,r;
            for(int i = 0; i < n; i++){
                op = sc.nextLine();
                String tmp[] = op.split(" ");
                if (tmp[0].equals("1")){
                    pos = Integer.valueOf(tmp[1]);
                    c = tmp[2].charAt(0);
                    res[pos-1] = c;
                }
                else if(tmp[0].equals("2")){
                    l = Integer.valueOf(tmp[1]);
                    r = Integer.valueOf(tmp[2]);
                    HashSet<Character>hashSet = new HashSet<>();
                    for(int j = l-1; j <= r-1; j++){
                        char cur = res[j];
                        hashSet.add(cur);
                    }
                    System.out.println(hashSet.size());
                }
            }
        }
    }
}



