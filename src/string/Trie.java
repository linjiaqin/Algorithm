package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Node{
    HashMap<Character, Node> son;
    Node(){
        son = new HashMap<>();
    }
}
public class Trie {
    Node root;
    Trie(){
        root = new Node();
    }
    public void insert(String s){
        char[] chs = s.toCharArray();
        Node t = root;
        for(int i = 0; i < chs.length; i++) {
            char c = chs[i];
            if (!t.son.containsKey(c)) {
                t.son.put(c, new Node());
            }
            t = t.son.get(c);
        }
    }
    public String longsetCommonPrefix(){
        Node t = root;
        StringBuilder res = new StringBuilder("");
        while(t.son.size() == 1) {
            char c = t.son.keySet().toArray()[0].toString().charAt(0);
            res.append(c);
            t = t.son.get(c);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String[] a = new String[]{"linjq", "linjiaqin"};
        Trie trie = new Trie();
        for (String e:a) {
            trie.insert(e);
        }
        System.out.println(trie.longsetCommonPrefix());
    }

}
