package yuewen;

import java.util.Scanner;
import java.util.Stack;

public class num2 {
    /**
     * 过滤内容中出现的QQ号
     * @param content string字符串 待过滤内容
     * @return string字符串
     */
    public String filterContent (String content) {
        // write code here
        StringBuilder res = new StringBuilder("");
        char[] str = content.toCharArray();
        Stack<Character>stack = new Stack<>();
        int count = 0;
        int first = -1;
        StringBuilder tmp = new StringBuilder("");
        for(int i = 0; i < str.length; i++){
            if (str[i] >='0' && str[i]<='9'){
                count++;
                tmp.append(str[i]);
                if (first == -1){
                    first = i;
                }
            }
            else{
                if (count >=6 && count <=10 && str[first] != '0'){

                }
                else {
                    res.append(tmp);
                }
                tmp = new StringBuilder("");
                count = 0;
                res.append(str[i]);
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(new num2().filterContent(s));
        }
    }
}
