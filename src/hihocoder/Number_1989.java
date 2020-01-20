package hihocoder;

import java.math.BigInteger;
import java.util.Scanner;

public class Number_1989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
               // StdIn.getScanner(1989);
        String s;
        while (sc.hasNext()) {
            s = sc.nextLine();
            BigInteger sum = new BigInteger("0");
            BigInteger one = new BigInteger("1");
            boolean flag = true;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '1') sum = sum.add(one);
                if(s.charAt(i) > '2') {
                    System.out.println(0);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                if (sum.equals(new BigInteger("0"))) System.out.println(1);
                else System.out.println(sum);
            }
        }
    }
}
