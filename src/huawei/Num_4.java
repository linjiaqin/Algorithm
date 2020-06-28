package huawei;

import java.util.*;
public class Num_4{
    public static void main(String[] args){
        String s;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            s = sc.nextLine();
            int a[] = new int[128];
            Arrays.fill(a, 0);
            for(int i = 0; i < s.length(); i++){
                a[s.charAt(i)]++;
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            int mins = Integer.MAX_VALUE;
            for(int i = 0; i < 128; i++){
                if(a[i] !=0 && a[i] < mins) mins = a[i];
            }
            for(int i = 0; i < 128; i++){
                if (a[i] == mins) map.put(i, 1);
            }
            StringBuilder res = new StringBuilder("");
            for(int i = 0; i < s.length(); i++){
                if(map.containsKey((int)s.charAt(i))){
                    //System.out.println(s.charAt(i));
                    continue;
                }
                else res.append(s.charAt(i));
            }
            System.out.println(res);
        }
    }
}