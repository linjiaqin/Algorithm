package huawei.shixi;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class num1 {
    public static int mod = 1000000007;
    public static long getRes(int n, int l){
        long tmp = 1;
        long res = 0;
        for(int i = 1; i <= l; i++){
            tmp = tmp * n %mod;
            res = res%mod + tmp;
        }
        return res%mod;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File  file = new File("huawei/a.txt");
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
        System.setIn(in);
        Scanner sc = new Scanner(System.in);
        int n,l;
        while (sc.hasNext()){
            n = sc.nextInt();
            l = sc.nextInt();
            if (n == 0 && l == 0) break;
            System.out.println(getRes(n, l));
        }
    }
}
