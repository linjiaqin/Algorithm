//package leetcode;
//
//import java.util.ArrayDeque;
//import java.util.Queue;
//
//public class Num_211 {
//}
//class TrieNode1{
//    TrieNode1[] son;
//    int end;
//    int path;
//    TrieNode1(){
//        son = new TrieNode1[26];
//        end = 0;
//    }
//}
//class WordDictionary {
//    TrieNode1 root;
//    /** Initialize your data structure here. */
//    public WordDictionary() {
//        root = new TrieNode1();
//    }
//
//    /** Adds a word into the data structure. */
//    public void addWord(String word) {
//        char[] words = word.toCharArray();
//        TrieNode1 t = root;
//        for(int i = 0; i < words.length; i++){
//            if (t.son[words[i]] == null){
//                t.son[words[i]] = new TrieNode1();
//            }
//            t = t.son[words[i]];
//        }
//        t.end++;
//    }
//
//    public boolean dfs(String word, int depth) {
//
//    }
//    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
//    public boolean search(String word) {
//        for (int i = 0; i < word.length(); i++) {
//
//        }
//    }
//}