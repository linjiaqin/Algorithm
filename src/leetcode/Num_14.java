package leetcode;

import java.util.HashMap;

//方法二：字典树,利用hashmap来表示字典树，这样可以存储各种各样的字符
//如果用数组表示的话，只能存储一定数量的字符，而且map还省去了数组的表示
class Node{
    HashMap<Character, Node> son;
    int pathCount;
    int endCount;
    Node(){
        son = new HashMap<>();
        pathCount = 0;
        endCount = 0;
    }
}
class Trieste {
    Node root;

    Trieste() {
        root = new Node();
    }

    public void insert(String s) {
        char[] chs = s.toCharArray();
        Node t = root;
        for (int i = 0; i < chs.length; i++) {
            char c = chs[i];
            if (!t.son.containsKey(c)) {
                t.son.put(c, new Node());
            }
            t = t.son.get(c);
        }
    }

    public String longsetCommonPrefix(String[] strs) {
        int minLength = Integer.MAX_VALUE;
        for(int i = 0; i < strs.length; i++) {
            minLength = Math.min(minLength, strs[i].length());
        }
        Node t = root;
        StringBuilder res = new StringBuilder("");
        while (t.son.size() == 1 && res.length()<minLength) {
            char c = t.son.keySet().toArray()[0].toString().charAt(0);
            res.append(c);
            t = t.son.get(c);
        }
        return res.toString();
    }
}
public class Num_14 {
    //方法一：简单暴力,先取最短的长度，然后遍历每一个位置每个字符串的字符
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder("");
        if (strs.length == 0) return res.toString();
        else if (strs.length == 1) return strs[0];
        int minLength = Integer.MAX_VALUE;
        for(int i = 0; i < strs.length; i++) {
            minLength = Math.min(minLength, strs[i].length());
        }
        boolean flag = true;
        for(int i = 0; i < minLength; i++){
            flag = true;
            for(int j = 1; j < strs.length; j++){
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) res.append(strs[0].charAt(i));
            else break;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String[] s = new String[]{"","b"};
        new Num_14().longestCommonPrefix(s);
    }
}
