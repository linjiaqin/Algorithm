package huawei.shixi;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class num2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("huawei/b.txt");
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
        System.setIn(in);
        Scanner sc = new Scanner(System.in);
        int t;
        int n;
        String s ;
        t = sc.nextInt();
        while (t-- > 0){
            n = sc.nextInt();
            sc.nextLine();
            s = sc.nextLine();
            String tmp = null;
            int i = 0;
            char[] ss = s.toCharArray();
            while (i < n-1){
                StringBuilder tmps = new StringBuilder("");
                tmps.append(ss[i]);
                tmps.append(ss[i+1]);
                tmp = tmps.toString();
                if (tmp.equals("00")){
                    ss[i]='1';
                    ss[i+1]='0';
                }
                else if ( i > 0 &&ss[i-1] == '0' && tmp.equals("10")){
                    ss[i-1] = '1';
                    ss[i] = '0';
                    ss[i+1] = '1';
                }
                i++;
            }
            System.out.println(ss);
        }
    }
}
