package huawei;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//弄清楚字符串比较
public class Num_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        while(sc.hasNext()){
            n = sc.nextInt();
            sc.nextLine();
            String s[] = new String[n];
            for(int i = 0; i < n; i++){
                s[i] = sc.nextLine();
            }
            Arrays.sort(s, new Comparator<String>(){
                @Override
                public int compare(String o1,String o2){
                    if (o2.compareTo(o1) < 0) return 1;
                    else if (o2.compareTo(o1) > 0)return -1;
                    else return 0;
                }
            });
            for(String e: s){
                System.out.println(e);
            }
        }
    }
}