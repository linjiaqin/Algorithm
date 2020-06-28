package yuanjing;

import java.util.Scanner;

public class num2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a;
        while(sc.hasNext()){
            a = sc.nextLong();
            long tmp = a;
            int count = 0;
            while(a > 10){
                long t = a;
                tmp = 1;
                while(t > 0){
                    tmp *= t%10;
                    t = t/10;
                }
                a = tmp;
                count++;
            }
            System.out.println(count);
        }
    }
}