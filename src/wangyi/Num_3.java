package wangyi;

import java.util.Scanner;
public class Num_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        int n;
        String s;
        while(t-- > 0) {
            n = sc.nextInt();
            sc.nextLine();
            s = sc.nextLine();
            char ss[] = s.toCharArray();
            int sum = 0;
            for(int i = 0; i < n; i++){
                if(ss[i] == '.') {
                    sum++;
                    i = i+2;  //因为上面加1了，所以这里加2就可以
                }
                else continue;
            }
            System.out.println(sum);
        }
    }
}