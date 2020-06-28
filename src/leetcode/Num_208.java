package leetcode;

import java.util.HashMap;

public class Num_208 {
}
class TrieNode{
    HashMap<Character, TrieNode> son;
    int end;    //用来标记这是一个word的结束
    int path;   //用来标记有多少个word中的字母,这里没有用到
    TrieNode(){
        son = new HashMap<>();
        end = 0;
        path = 0;
    }
}
class Trie {
    TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        char c;
        TrieNode t = root;
        for(int i = 0; i < word.length(); i++) {
            c = word.charAt(i);
            if (!t.son.containsKey(c)) {
                t.son.put(c, new TrieNode());
            }
            t = t.son.get(c);
            t.path ++;
        }
        t.end ++;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode t = root;
        char c;
        for(int i = 0; i < word.length(); i++) {
            c = word.charAt(i);
            if (t.son.containsKey(c)) {
                t = t.son.get(c);
            }
            else return false;
        }
        if (t.end > 0) return true;
        else return false;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode t = root;
        char c;
        for(int i = 0; i < prefix.length(); i++) {
            c = prefix.charAt(i);
            if (t.son.containsKey(c)) {
                t = t.son.get(c);
            }
            else return false;
        }
        if (t.son.size() >= 0) return true;
        else return false;
    }
}