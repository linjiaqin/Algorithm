package leetcode;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//用long存储，判断是否大于Integer.MAX_VAULE
public class Num_7 {
    public int reverse(int x) {
        int d = 1;
        if (x < 0) {
            d = -1;
            x = -x;
        }
        long res = 0;
        int y = 0;
        while(x>0) {
            y = x%10;
            x = x/10;
            res = res*10 + y;
            if (res > Integer.MAX_VALUE) res = 0;
        }
        return (int)res*d;
    }
    public static void main(String[] args) throws FileNotFoundException {
        String path = "leetcode/7.txt";
        File file = new File(path);
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
        System.setIn(in);
        Scanner sc = new Scanner(System.in);

        int num;
        while(sc.hasNext()) {
            num = sc.nextInt();
            sc.nextLine();
            System.out.println(new Num_7().reverse(num));
        }
    }
}
