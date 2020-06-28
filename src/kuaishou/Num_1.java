package kuaishou;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class Num_1{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("kuaishou/1.txt");
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
        System.setIn(in);
        Scanner sc = new Scanner(System.in);
        int n;
        while(sc.hasNext()){
            n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            int i = 0;
            int j = a.length-1;
            int lsum = 0;
            int rsum = 0;
            while(i < j){
                lsum += a[i];
                rsum += a[j];
                i++;
                j--;
            }
            System.out.println(Math.abs(lsum-rsum));
        }
    }
}

