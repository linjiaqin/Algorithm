package vivo;

import leetcode.Num_118;

/**
 * 现给定任意正整数 n，请寻找并输出最小的正整数 m（m>9），使得 m 的各位（个位、十位、百位 ... ...）之乘积等于n，若不存在则输出 -1。
 */
public class Num_2 {
    public int solution (int n) {
        // write code here
        StringBuilder res = new StringBuilder("");
        boolean flag = true;
        while (n > 1){
            flag = true;
            for(int i = 9; i >=2; i--){
                if(n % i == 0){
                    res.append(i);
                    n = n/i;
                    flag = false;
                    break;
                }
            }
            if (flag) return -1;
        }
        return Integer.valueOf(res.reverse().toString());
    }
    public static void main(String[] args) {
        System.out.println(new Num_2().solution(10));
    }
}
