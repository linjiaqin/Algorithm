package kuaishou;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Num_2 {
    HashMap<Character, String>map = new HashMap<>();
    List<String> list = new ArrayList<>();
    List<Character> tmp = new ArrayList<>();
    public void dfs(String s, int dep){
        if (dep == s.length()){
            StringBuilder res = new StringBuilder("");
            for(char e: tmp) res.append(e);
            list.add(res.toString());
            return;
        }
        char a = s.charAt(dep);
        String choice = map.get(a);
        for(int i = 0; i < choice.length(); i++) {
            tmp.add(choice.charAt(i));
            dfs(s, dep+1);
            tmp.remove(dep);
        }
    }
    public void solve(String s){
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8',"tuv");
        map.put('9', "wxyz");
        dfs(s, 0);
//        StringBuilder res = new StringBuilder("[");
//        for(int i = 0; i < list.size(); i++){
//            res.append(list.get(i));
//            if(i != list.size()-1) res.append(",");
//        }
//        res.append("]");
        System.out.println(list.toString());
    }
    void init(){
        list .clear();
        tmp.clear();
    }
    public static void main(String[] args){
        Num_2 app = new Num_2();
        app.solve("23");
        app.init();
        app.solve("34");
    }
}
