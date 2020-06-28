package Byte;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class Strings{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Byte/1.txt");
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
        System.setIn(in);
        Scanner sc = new Scanner(System.in);
        int n;
        while(sc.hasNext()){
            n = sc.nextInt();
            sc.nextLine();
            String s;
            for(int i = 0; i < n; i++){
                s = sc.nextLine();

                char[] tmp = s.toCharArray();
                char one = tmp[0];
                char two = tmp[1];
                StringBuilder res = new StringBuilder("");
                res.append(one);
                res.append(two);
                for(int j = 2; j < tmp.length; j++) {
                    if(two != one){
                        res.append(tmp[j]);
                        one = two;
                        two = tmp[j];
                    }
                    else {
                        if (tmp[j] == two) continue;
                        else{
                            res.append(tmp[j]);
                            one = two;
                            two = tmp[j];
                        }
                    }
                }
                char[] tmp1 = res.toString().toCharArray();
                char a = tmp1[0];
                char b = tmp1[1];
                char c = tmp1[2];
                StringBuilder res1 = new StringBuilder("");
                res1.append(a);
                res1.append(b);
                res1.append(c);
                for(int j = 3; j < tmp1.length; j++) {
                    if (a==b) {
                        if(c==tmp1[j]) continue;
                        else {
                            a = b;
                            b = c;
                            c = tmp1[j];
                            res1.append(tmp1[j]);
                        }
                    }else{
                        a = b;
                        b = c;
                        c = tmp1[j];
                        res1.append(tmp1[j]);
                    }
                }

                System.out.println(res1.toString());
            }
        }
    }
}