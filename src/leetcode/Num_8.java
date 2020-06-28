package leetcode;

import org.omg.CORBA.INTERNAL;

//这里有个问题就是肯long也存不下，只能在中间过程判断大于int范围就输出，不能把整个存储下来
public class Num_8 {
    public int myAtoi(String str) {
        String str1 = str.trim();
        if (str1.equals("")) return 0;
        char c = str1.charAt(0);
        int d = 1;
        long res = 0;
        int dight = 0;
        if (c == '-' || c == '+') {
            if (c == '-') d = -1;
            for (int i = 1; i < str1.length(); i++) {
                if (str1.charAt(i) >= '0' && str1.charAt(i) <= '9') {
                    dight = str1.charAt(i) - '0';
                    res = dight + res * 10;
                }
                else break;
                if (res*d > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                else if (res*d < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }
        } else if (c >= '0' && c <= '9') {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) >= '0' && str1.charAt(i) <= '9') {
                    dight = str1.charAt(i) - '0';
                    res = dight + res * 10;
                }
                else break;
                if (res*d > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                else if (res*d < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }
        } else {
            return 0;
        }
        return d*(int)res;
    }

    public static void main(String[] args) {
        String  a = " -42";//"9223372036854775808";
        System.out.println(new Num_8().myAtoi(a));
    }
}