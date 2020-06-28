//package leetcode;
//
//import java.io.BufferedInputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
//
////方法1： 直接两个for循环暴力,j=i+1是为了避免重复计算
////时间复杂度O(n^2)
//class Solution1 {
//    public int[] twoSum(int[] nums, int target) {
//        ArrayList<Integer> res = new ArrayList<Integer>();
//        for(int i = 0; i < nums.length; i++)
//            for (int j = i+1; j < nums.length; j++) {
//                if(nums[i] + nums[j] == target) {
//                    res.add(i);
//                    res.add(j);
//                }
//            }
//        int[] res_array = new int[res.size()];
//        int j = 0;
//        for (Integer e: res) {
//            res_array[j++] = e;
//        }
//        return res_array;
//    }
//}
////方法2：先排序，用target-其中一个数，对剩下的数二分查找,这里直接利用map来实现二分查找
////因为map是有序,同时可以存放
////时间复杂度O(nlogn)
//class Solution2 {
//    public
//    public int[] twoSum(int[] nums, int target) {
//        int[] res = new int[2];
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i = 0; i < nums.length; i++) {
//            if (map.containsKey(target - nums[i])) {
//
//            }
//            map.put(nums)
//        }
//    }
//}
//public class Num_1 {
//    public static void main(String[] args) throws FileNotFoundException {
//        String path = "leetcode/1.txt";
//        File file = new File(path);
//        BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
//        System.setIn(in);
//        Scanner sc = new Scanner(System.in);
//
//
//    }
//}
