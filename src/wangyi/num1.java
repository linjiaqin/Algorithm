package wangyi;


import java.util.*;


 class Solution1 {
     public static String floatString(String s){
         boolean flag = true;
         for(int i = 0; i < s.length(); i++){
             if (s.charAt(i) == '.'){
                 flag = false;
                 break;
             }
         }
         StringBuilder res = new StringBuilder(s);
         if (flag){
             res.append(".0");
         }
         return res.toString();
     }
    /**
     * 接收两个表示9进制数的字符串，返回表示它们相加后的9进制数的字符串
     * @param num11 string字符串 第一个加数
     * @param num22 string字符串 第二个加数
     * @return string字符串
     */
    public static String add (String num11, String num22) {
        int point11 = 0;
        int point22 = 0;
        for(int i = 0; i < num11.length(); i++){
            if (num11.charAt(i) == '.') { point11 = i; break;}
        }
        for(int i = 0; i < num22.length(); i++){
            if (num22.charAt(i) == '.') { point22 = i; break;}
        }
        // write code here
        StringBuilder res = new StringBuilder("");
        String num1 = floatString(num11);
        String num2 = floatString(num22);
        char[] s1 = num1.toCharArray();
        char[] s2 = num2.toCharArray();
        int point1 = 0;
        int point2 = 0;
        for(int i = 0; i < s1.length; i++){
            if (s1[i] == '.') { point1 = i; break;}
        }
        for(int i = 0; i < s2.length; i++){
            if (s2[i] == '.') { point2 = i; break;}
        }

        int floatlen1 = s1.length - point1-1;
        int floatlen2 = s2.length - point2-1;

        String intpart1 = num1.substring(0, point1);
        String intpart2 = num2.substring(0, point2);
        String floatpart1 = num1.substring(point1+1, s1.length);
        String floatpart2 = num2.substring(point2+1, s2.length);
        StringBuilder floatres = new StringBuilder("");

        if (floatpart1.length() > floatpart2.length()) {
            for(int i = floatpart1.length()-1; i > floatpart2.length()-1; i--)
                floatres.append(floatpart1.charAt(i));
        }
        else{
            for(int i = floatpart2.length()-1; i > floatpart1.length()-1; i--)
                floatres.append(floatpart2.charAt(i));
        }
        int d = 0;
        for(int i = Math.min(floatpart1.length()-1, floatpart2.length()-1); i >=0; i--){
            int tmp1 = floatpart1.charAt(i)-'0';
            int tmp2 = floatpart2.charAt(i)-'0';
            int cur = (tmp1+tmp2+d)%9;
            d = (tmp1+tmp2+d)/9;
            floatres.append(cur);
        }
        //整数部分
        StringBuilder intres = new StringBuilder("");
        StringBuilder int1 = new StringBuilder(intpart1).reverse();
        StringBuilder int2 = new StringBuilder(intpart2).reverse();
        for(int i = 0; i < Math.min(int1.length(), int2.length()); i++){
            int tmp1 = int1.charAt(i)-'0';
            int tmp2 = int2.charAt(i)-'0';
            int cur = (tmp1+tmp2+d)%9;
            d = (tmp1+tmp2+d)/9;
            intres.append(cur);
        }
        if (int1.length() < int2.length()){
            for(int i = Math.min(int1.length(), int2.length()); i < int2.length(); i++){
                int tmp = int2.charAt(i)-'0';
                int cur = (tmp+d)%9;
                d = (tmp+d)/9;
                intres.append(cur);
            }
        }else{
            for(int i = Math.min(int1.length(), int2.length()); i < int1.length(); i++){
                int tmp = int1.charAt(i)-'0';
                int cur = (tmp+d)%9;
                d = (tmp+d)/9;
                intres.append(cur);
            }
        }
        if (d != 0) intres.append(d);
        res.append(intres.reverse());
        if (point11 == 0 && point22 == 0) return res.toString();
        else {
            res.append(".");
            res.append(floatres.reverse());
            return res.toString();
        }


    }
}
public class num1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        int n;
        while (sc.hasNext()) {
            s1 = sc.nextLine();
            s2 = sc.nextLine();
            System.out.println(Solution1.add(s1, s2));
        }
    }
}
