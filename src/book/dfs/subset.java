package book.dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 *
 * 说明：解集不能包含重复的子集。
 *
 * 示例:
 *
 * 输入: nums = [1,2,3]
 * 输出:
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 *
 */

public class subset {
    //回溯法，排列树
    public void dfs1(int[] nums, int dep, LinkedList<Integer> subset, List<List<Integer>>res){
        //这里判断是去掉空集
        if (subset.size()>0){
            subset = new LinkedList<>(subset);  //这里要复制一份新的放进去,不然就是引用而已
            res.add(subset);
        }

        for(int i = dep; i < nums.length; i++){
            //有序可以这样，无序不行
//            if (dep ==0 || subset.get(dep-1) < nums[i]) {
//                subset.add(nums[i]);
//                dfs1(nums, dep+1, subset, res);
//                subset.remove(dep);
//            }
            subset.add(nums[i]);
            dfs1(nums, i+1, subset, res);
            subset.pollLast();
        }
    }
    //子集树，选或不选
    public void dfs2(int[] nums, int dep, LinkedList<Integer> subset, List<List<Integer>>res){
        if(dep >= nums.length) {
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[dep]);
        dfs2(nums, dep+1, subset, res);
        subset.pollLast();
        dfs2(nums, dep+1, subset, res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        LinkedList<Integer> l = new LinkedList<>();
        dfs2(nums, 0, l, list);
        return list;
    }
    //二进制枚举
    public List<List<Integer>> twobit(int[] nums){
        int n = nums.length;
        List<List<Integer>> l = new ArrayList<>();
        for(int i = 0; i < (1<<n); i++){
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++){
                if( ((i >> j) & 1)  == 1) {
                    list.add(nums[j]);
                }
            }
            l.add(list);
        }
        return l;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        subset solve = new subset();
        //List<List<Integer>> list = solve.subsets(a);
        List<List<Integer>> list = solve.twobit(a);
        for (List<Integer> l: list){
            for (Integer e: l){
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
}
