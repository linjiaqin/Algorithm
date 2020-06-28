package qushikeji;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class num2 {
    public static void answer(String str){
        char[] s = str.toCharArray();
        int n = s.length;
        int maxLen = 1;
        List<String> resList = new ArrayList<>();
        String res = null;
        for (int i = 1; i < n; i++){
            int k1 = i-1;
            int k2 = i+1;
            int len = 1;
            while (k1>=0 && k2 < n){
                if(s[k1] == s[k2]){
                    len += 2;
                    if(len> maxLen){
                        maxLen = len;
                        res = str.substring(k1, k2+1);
                        resList.clear();
                        resList.add(res);
                    }
                    else if (len == maxLen){
                        res = str.substring(k1, k2+1);
                        resList.add(res);
                    }
                    k1--;
                    k2++;
                }
                else break;
            }
            int j2 =i+1;
            int j1 = i;
            len = 0;
            while (j1 >= 0 && j2 <n){
                if(s[j1] == s[j2]){
                    len+=2;
                    if(len> maxLen){
                        maxLen = len;
                        res = str.substring(j1, j2+1);
                        resList.clear();
                        resList.add(res);
                    }
                    else if (len == maxLen){
                        res = str.substring(j1, j2+1);
                        resList.add(res);
                    }
                    j1--;
                    j2++;
                }else break;
            }
        }
        if (maxLen == 1) System.out.println("null");
        else {
            for (String e: resList){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        while (in.hasNext()){
            s = in.nextLine();
            answer(s);
        }
    }
}
