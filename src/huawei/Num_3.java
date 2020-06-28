package huawei;


//if(ch>='A'&&ch<='Z'){
//        char cc=Character.toLowerCase(ch);
//        if(cc=='z')
//        ss=ss+"a";
//        else
//        {
//        ss=ss+(char)(Integer.valueOf(cc)+1);
//        }
//        }
//        }
import java.util.*;
public class Num_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        for(int i = 0; i < 128; i++)
//            System.out.println((char)i);
        while(sc.hasNext()){
            String s;
            s = sc.nextLine();
            char[] ss = s.toCharArray();
            int[] n = new int[128];
            n['a'] = 2;
            n['b'] = 2;
            n['c'] = 2;
            n['d'] = 3;
            n['e'] = 3;
            n['f'] = 3;
            n['g'] = 4;
            n['h'] = 4;
            n['i'] = 4;
            n['j'] = 5;
            n['k'] = 5;
            n['l'] = 5;
            n['m'] = 6;
            n['n'] = 6;
            n['o'] = 6;
            n['p'] = 7;
            n['q'] = 7;
            n['r'] = 7;
            n['s'] = 7;
            n['t'] = 8;
            n['u'] = 8;
            n['v'] = 8;
            n['w'] = 9;
            n['x'] = 9;
            n['y'] = 9;
            n['z'] = 9;
            StringBuilder res = new StringBuilder("");
            for(int i = 0; i < ss.length; i++){
                if (ss[i] >= 'A' && ss[i] <= 'Z'){
                    int c = (int)ss[i]+32;
                    if ((char)(c) == 'z') res.append('a');
                    else
                        res.append((char)(c+1));
                }
                else if(ss[i] >= 'a' && ss[i]<='z') res.append(n[ss[i]]);
                else res.append(ss[i]);
            }
            System.out.println(res.toString());
        }
    }
}
