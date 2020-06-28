package xiecheng;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * (A,B);(A,C);(C,B);(C,D);(D,B);
 */
public class num2 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    //返回的结果中，最外层的List的元素表示每个飞行方案，最里层List元素表示单个飞行方案经过的每个城市
    static List<List<String>>answer(String inputStr) {
        String[] pairs = inputStr.split(";");
        //int[][] g = new int[26][26];
        HashMap<String , List<String>> g = new HashMap<>();
        for(int i = 0; i < pairs.length; i++){
            String pair = pairs[i].substring(1, pairs[i].length()-1);
            String tmp[] = pair.split(",");
            String a = tmp[0];
            String b = tmp[1];
            if (!g.containsKey(a)){
                List<String> alist = new ArrayList<>();
                alist.add(b);
                g.put(a, alist);
            }
            else{
                List<String> alist = g.get(a);
                alist.add(b);
            }
        }
//        for(Map.Entry e: g.entrySet()){
//            System.out.println(e.getKey());
//            List<String> list = (List)e.getValue();
//            for(int i = 0; i < list.size(); i++){
//                System.out.print(list.get(i)+",");
//            }
//            System.out.println();
//        }
        List<List<String>> res = new ArrayList<>();
        List<String>tmpres = new ArrayList<>();
        tmpres.add("A");
        dfs(g, "A", "B", res, tmpres);
        return res;
    }
    public static  HashMap<String , Integer> vis = new HashMap<>();
    public static void dfs(HashMap<String, List<String>> g, String start, String end, List<List<String>> res, List<String>tmpres){
        if (start.equals(end)){
            res.add(new ArrayList<>(tmpres));
        }
        if (!g.containsKey(start)) return;
        else{
            List<String> list = g.get(start);
            for(int i = 0; i < list.size(); i++){
                String  tmp = list.get(i);
                if( !vis.containsKey(tmp) || vis.get(tmp) == 0){
                    vis.put(tmp, 1);
                    tmpres.add(tmp);
                    dfs(g, tmp, end, res, tmpres);
                    vis.put(tmp, 0);
                    tmpres.remove(tmp);
                }
            }
        }

    }
    /******************************结束写代码******************************/


    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String inputStr = cin.nextLine().trim();
        List<List<String>> result = answer(inputStr);
        if (result != null && result.size() > 0) {
            System.out.println(result);
        }
    }
}
