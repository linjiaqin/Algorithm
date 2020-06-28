package xiecheng;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class num1 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int climb(int n) {
        int dp[] = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = dp[1] + dp[2];
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n]+n-2;

    }

    /******************************结束写代码******************************/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _n;
        _n = Integer.parseInt(in.nextLine().trim());

        res = climb(_n);
        System.out.println(String.valueOf(res));
    }
}
