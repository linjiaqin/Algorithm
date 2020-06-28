package book.dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class combine {
    //按照一个顺序来可以避免重复
    public void dfs(int n, int k, int dep, List<Integer> l, List<List<Integer>> list){
        if (l.size() == k){
            list.add(new ArrayList<>(l));
            return;
        }
        for (int i = dep; i <= n; i++){
            l.add(i);
            dfs(n, k, i+1, l, list);
            l.remove(l.size()-1);
            //dfs(n, k, dep+1, l, list);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        LinkedList<Integer> l = new LinkedList<>();
        dfs(n, k, 1, l, list);
        return list;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        combine solve = new combine();
        //List<List<Integer>> list = solve.subsets(a);
        List<List<Integer>> list = solve.combine(4, 2);
        for (List<Integer> l: list){
            for (Integer e: l){
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
}
