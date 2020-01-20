package leetcode;

import java.io.*;
import java.util.Scanner;

public class fifty {
    //采用快速幂，因为a的n次方，n=x+y，可以表示为a的x次方+a的y次方，a可以转换为2进制
    //27=(11011)
    //27/2=13...1,13/2=6..1, 6/2=3..0, 3/2=1..1, 1/2=1..1
    //从下到上为11011，即上面先除得到的是低位
    //a^27 = a^16 * a^8 * a^2 * a^1
    public double myPow(double x, int n) {
        long dight = n;
        dight = Math.abs(dight);    //要注意这里有一个用例超出了边界范围，不能直接取反，先赋值给更大的long
        double res = 1.0;
        while (dight > 0) {
            if (dight%2 == 1) {
                res *= x;
            }
            x = x*x;
            dight/=2;
        }
        if (n < 0) return 1/res;
        else return res;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("leetcode/50.txt");
        InputStream in = new BufferedInputStream(new FileInputStream(file));
        System.setIn(in);
        Scanner sc = new Scanner(in);
        double x = 0.0;
        int n = 1;
        fifty fif = new fifty();
        while(sc.hasNext()) {
            x = sc.nextDouble();
            n = sc.nextInt();
            System.out.println(fif.myPow(x, n));
        }
    }
}
