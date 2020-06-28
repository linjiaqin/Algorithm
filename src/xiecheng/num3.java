package xiecheng;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * 输入一个正整数数组nums和整数m。
 *
 * 做如下操作：将nums分割成m个非空子数组，分别对子数组求和，得到新的数组sums。
 *
 * 计算所有可能的求和数组，并输出不包含重复数的求和数组个数。
 *
 * 比如：输入nums=[4,2,6,7,3]，m=3；
 *
 * 可能的分割方式一共6种：
 *
 * [[4], [2], [6, 7, 3]]，子集求和后得到sums=[4, 2, 16]，不包含重复值。
 *
 * [[4], [2, 6], [7, 3]]，子集求和后得到sums=[4, 8, 10]，不包含重复值。
 *
 * [[4], [2, 6, 7], [3]]，子集求和后得到sums=[4, 15, 3]，不包含重复值。
 *
 * [[4, 2], [6], [7, 3]]，子集求和后得到sums=[6, 6, 10]，包含重复值6。
 *
 * [[4, 2], [6, 7], [3]]，子集求和后得到sums=[6, 13, 3]，不包含重复值。
 *
 * [[4, 2, 6], [7], [3]]，子集求和后得到sums=[12, 7, 3]，不包含重复值。
 *
 * 其中5中分割方式对应的求和数组不包含重复值，故最终结果输出5。
 */
public class num3 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int calc(int[] nums, int m) {
        allSum = 0;
        set.clear();
        dfs(nums, m, 0, 0);
        return allSum;
    }

    public static HashSet<Integer> set = new HashSet();
    public static int allSum = 0;
    public static void dfs(int[] nums, int m, int cur, int count){
        if (count == m-1){
            int sum = 0;
            for(int i = cur; i < nums.length; i++) sum += nums[i];
            if (!set.contains(sum)) {
                allSum++;
//                System.out.println("sum is:");
//                for(int e : set ){
//                    System.out.print(e+",");
//                }
//                System.out.println(sum);
            }
            return;
        }

        for(int i = cur; i < nums.length-1; i++){
            int sum = 0;
            for(int j = cur; j <= i; j++){
                sum += nums[j];
            }
            if(set.contains(sum)) continue;
            else{
                set.add(sum);
                dfs(nums, m, i+1, count+1);
                set.remove(sum);
            }
        }
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _nums_size = 0;
        _nums_size = Integer.parseInt(in.nextLine().trim());
        int[] _nums = new int[_nums_size];
        int _nums_item;
        for(int _nums_i = 0; _nums_i < _nums_size; _nums_i++) {
            _nums_item = Integer.parseInt(in.nextLine().trim());
            _nums[_nums_i] = _nums_item;
        }

        int _m;
        _m = Integer.parseInt(in.nextLine().trim());

        res = calc(_nums, _m);
        System.out.println(String.valueOf(res));

    }
}

