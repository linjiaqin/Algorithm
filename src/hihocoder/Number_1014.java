package hihocoder;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Trie{
    public static final int mxn = 10000;
    int son[][];  //存储每个节点, son[t][c] 表示节点t通过c连接到son[t][c]
    int val[];    //每个节点的存储的值
    String s[];
    int cnt;   //节点的编号, 根节点编号为0
    Trie(){
        son = new int[mxn][26];
        cnt = 0;
        val = new int[mxn];
    }
    void insert(String word, int value) {
        int m = word.length();
        int t = 0;
        for (int i = 0; i < m; i++) {
            int c = word.charAt(i) - 'a';
            if (son[t][c] == 0) {
                son[t][c] = ++cnt;
                val[cnt] = 0;
            }
            t = son[t][c];
            val[cnt] = 0;
        }
        //val[t] = value;
    }
    int find(String s) {
        int m = s.length();
        int t = 0;
        for(int i = 0; i < m; i++) {
            int c = s.charAt(i) - 'a';
            if (son[t][c] == 0) return 0;
            t = son[t][c];
        }
        return val[t];
    }
}
public class Number_1014 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "hihocoder/1014.txt";
        File file = new File(path);
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
        System.setIn(in);
        Scanner sc = new Scanner(System.in);

        Trie trie = new Trie();
        int n,m;
        String s;
        n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++) {
            s = sc.nextLine();
            trie.insert(s, 1);
        }
        m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            s = sc.nextLine();
            System.out.println(trie.find(s));
        }

    }
}
