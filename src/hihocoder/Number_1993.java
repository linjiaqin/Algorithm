package hihocoder;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Discount implements Comparable{
    public int a;
    public int b;

    public Discount(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(Object o) {
        Discount d = (Discount)o;
        if (this.a < d.a) return -1;
        else if (this.a == d.a) return 0;
        else return 1;
    }
}
public class Number_1993 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("hihocoder/1993.txt");
        InputStream in = new BufferedInputStream(new FileInputStream(file));
        System.setIn(in);
        Scanner sc = new Scanner(System.in);
        Discount[] discount;

        while(sc.hasNext()){
            int n,c;
            int a,b;
            int x,y,z;
            x=0;y=0;z=0;
            n = sc.nextInt();
            c = sc.nextInt();
            discount = new Discount[n];
            for(int i = 0; i < n; i++) {
                a = sc.nextInt();
                b = sc.nextInt();
                discount[i] = new Discount(a,b);
            }
            Arrays.sort(discount);

            for(int i = 0; i < n; i++) {
                if(c >= discount[i].a) {
                    x = discount[i].b;
                }
                else {
                    y = discount[i].a - c;
                    z = discount[i].b;
                    break;
                }
            }
            if (x >= discount[n-1].b) System.out.println(discount[n-1].b);
            else System.out.println(x+" "+y+" "+z);
        }
    }
}
