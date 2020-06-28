package book.dfs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class phone {

    Map<Character, String> phone = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};
    public void dfs(String digits, int dep, StringBuilder res, List<String> result){
        if (dep == digits.length()){
            result.add(new StringBuilder(res).toString());
            return;
        }
        String value = phone.get(digits.charAt(dep));
        for(int i = 0; i < value.length(); i++){
            res.append(value.charAt(i));
            dfs(digits, dep+1, res, result);
            res.deleteCharAt(res.length()-1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> list = new LinkedList<>();
        if (digits.equals("")) return list;
        else {
            StringBuilder res = new StringBuilder("");
            dfs(digits, 0,  res, list);
            return list;
        }
    }

    public static void main(String[] args) {
        System.out.println(new phone().letterCombinations("23").toString());
    }
}