package yuewen;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class num1 {
    public char findFirstNonRepeatChar (String str) {
        // write code here
        char[] s = str.toCharArray();
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < s.length; i++){
            if (map.containsKey(s[i])){
                map.put(s[i], -1);
            }
            else {
                map.put(s[i], i);
            }
        }
        char key = 'a';
        int index = Integer.MAX_VALUE;
        int value = index;
        char res = 'a';
        for (Map.Entry entry : map.entrySet()){
            if ((int)entry.getValue() != -1){
                key = (char)entry.getKey();
                value = (int)entry.getValue();
                if (value < index){
                    index = value;
                    res = key;
                }
            }
        }
        return res;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(new num1().findFirstNonRepeatChar(s));
        }
    }
}
