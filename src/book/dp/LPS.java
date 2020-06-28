//package book.dp;
//
///**
// * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
// *
// * 示例 1：
// *
// * 输入: "babad"
// * 输出: "bab"
// * 注意: "aba" 也是一个有效答案。
// * 示例 2：
// *
// * 输入: "cbbd"
// * 输出: "bb"
// *
// */
//
///**
// * 暴力解法，遍历每一种可能，最长回文子串
// */
//class Enumeratte{
//    public boolean isPara(String s){
//        int len = s.length();
//        for(int i = 0; i < len/2; i++){
//            if (s.charAt(i) != s.charAt(len-i-1)) return false;
//        }
//        return true;
//    }
//
//    //substring是左闭右开
//    public String longestPalindrome(String s) {
//        int n = s.length();
//        int len = 0;
//        String res = "";
//        for(int i = 0; i < n; i++){
//            for(int j = i+1; j < n; j++){
//                String tmp = s.substring(i, j);
//                if (isPara(tmp) && tmp.length() > len) {
//                    len = j-i;
//                    res = tmp;
//                }
//            }
//        }
//        return res;
//    }
//}
//
///**
//*
// *
// */
//public class LPS {
//    public String longestPalindrome(String s) {
////        if (s == null || s.length() < 2) {
////            return s;
////        }
////        int strLen = s.length();
////        int maxStart = 0;  //最长回文串的起点
////        int maxEnd = 0;    //最长回文串的终点
////        int maxLen = 1;  //最长回文串的长度
////
////        boolean[][] dp = new boolean[strLen][strLen];
////
////        for (int r = 1; r < strLen; r++) {
////            for (int l = 0; l < r; l++) {
////                if (s.charAt(l) == s.charAt(r) && (r - l <= 2 || dp[l + 1][r - 1])) {
////                    dp[l][r] = true;
////                    if (r - l + 1 > maxLen) {
////                        maxLen = r - l + 1;
////                        maxStart = l;
////                        maxEnd = r;
////
////                    }
////                }
////
////            }
////
////        }
////        return s.substring(maxStart, maxEnd + 1);
//    }
//}
