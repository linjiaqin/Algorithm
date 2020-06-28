package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Num_500 {
    public String[] findWords(String[] words) {
        String a = "QWERTYUIOP";
        a = a+a.toLowerCase();
        String b = "ASDFGHJKL";
        b += b.toLowerCase();
        String c = "ZXCVBNM";
        c += c.toLowerCase();
        int flag = 0;
        List<String> list = new ArrayList<>();
        for(String e: words) {
            flag = 0;
            for(char t:a.toCharArray()){
                if (e.contains(String.valueOf(t))) {
                    flag++;
                    break;
                }
            }
            for(char t:b.toCharArray()){
                if (e.contains(String.valueOf(t))) {
                    flag++;
                    break;
                }
            }
            for(char t:c.toCharArray()){
                if (e.contains(String.valueOf(t))) {
                    flag++;
                    break;
                }
            }
            if(flag == 1) list.add(e);
        }
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] words=new String[]{"Hello", "Alaska", "Dad", "Peace"};
        new Num_500().findWords(words);
    }
}
