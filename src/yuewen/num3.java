package yuewen;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class num3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            String a[] = s.split(",");
            int b[] = new int[a.length];
            int i = 0;
            int odd = 0;
            for(String e: a){
                b[i++] =  Integer.parseInt(e);
                if(b[i-1] < 0){
                    odd++;
                }
                //System.out.println(b[i-1]);
            }
            int index = -1;
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < a.length; j++){
                if (b[j] < min){
                    min = b[j];
                    index = j;
                }
            }
            System.out.println(index);

        }
    }
}
