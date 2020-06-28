package Byte;

import java.util.HashMap;
import java.util.Scanner;

class Node{
    HashMap<Character, Node> son;
    boolean end;
    Node(){
        son = new HashMap<>();
        end = false;
    }
}

class Trie {
    Node root;

    Trie() {
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
        t.end = true;
    }

    public boolean find(String s){
        Node t = root;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (t.son.containsKey(c)){
                t = t.son.get(c);
            }
            else return false;
        }
        return t.end;
    }
}
public class num2 {
    public static int sum = 0;
    public static void dfs(String str, int dep, Trie trie){
        if (dep == str.length()){
            sum++;
            //System.out.println();
            return;
        }
        for(int i = dep; i < str.length(); i++){
            String cur = str.substring(dep, i+1);
            if (trie.find(cur)){
                //System.out.println(cur);
                dfs(str, i+1, trie);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String essay;
        int n;
        while (sc.hasNext()){
            essay = sc.nextLine();
            n = Integer.valueOf(sc.nextLine());
            String[] word = new String[n];
            Trie trie = new Trie();
            for(int i = 0; i < n; i++){
                word[i] = sc.nextLine();
                trie.insert(word[i]);
            }
            sum = 0;
            dfs(essay, 0, trie);
            System.out.println(sum);

        }
    }
}
