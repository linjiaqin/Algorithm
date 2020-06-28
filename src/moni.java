import java.util.ArrayList;
import java.util.List;

public class moni {
    List<String> list;
    public void dfs(int depth, char[] a,StringBuilder res) {
        if(depth == a.length) {
            list.add(res.toString());
            return;
        }
        if(a[depth]>='a' && a[depth] <='z') {
            res.append(a[depth]);
            dfs(depth+1, a, res);
            res.deleteCharAt(depth);
            res.append((char)(a[depth] - 32));
            dfs(depth+1, a, res);
            res.deleteCharAt(depth);
        }
        else {
            res.append(a[depth]);
            dfs(depth+1, a, res);
            res.deleteCharAt(depth);
        }
    }
    public List<String> letterCasePermutation(String S) {
        list = new ArrayList<>();
        char[] a = S.toString().toLowerCase().toCharArray();
        StringBuilder res = new StringBuilder("");
        dfs(0,a,res);
        return list;
    }

    public static void main(String[] args) {
        String tmp = "A12b";
        new moni().letterCasePermutation(tmp);
    }
}
