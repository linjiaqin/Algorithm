package leetcode;

import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;

public class Num_38 {

    public String countAndSay(int n) {
        String str = "1";
        for(int i = 2; i <= n; i++){
            StringBuilder res = new StringBuilder();
            char pre = str.charAt(0);
            int len = 1;
            for(int j = 1; j < str.length(); j++){
                char c = str.charAt(j);
                if (c == pre) len++;
                else {
                    res.append(len).append(pre);
                    pre = c;
                    len = 1;
                }
            }
            res.append(len).append(pre);
            str = res.toString();
        }
        return str;

    }
    public static void main(String[] args) {
        new Num_38().countAndSay(5);
    }
}
