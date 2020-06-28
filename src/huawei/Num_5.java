package huawei;

import java.util.*;

public class Num_5 {
    public static void main(String[] args){
        int n;
        int a[];
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            n = sc.nextInt();
            a = new int[n];
            LinkedList<Integer> list = new LinkedList();
            for(int i  =0; i < n; i++){
                a[i] = sc.nextInt();
            }
            list.add(a[0]);
            for(int i = 1; i < n; i++){
                if (a[i] > a[i-1]) list.add(a[i]);
            }
        }
    }
}
