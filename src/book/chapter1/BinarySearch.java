package book.chapter1;

import java.io.*;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int a[], int key){
        int l = 0;
        int r = a.length - 1;
        while(l < r) {
            int mid = (l + r) / 2;
            if (key < a[mid]) r = mid - 1;
            else if (key > a[mid]) l = mid + 1;
            else return mid;
        }
        return -1;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File directory = new File("");//设定为当前文件夹
        try{
            System.out.println(directory.getCanonicalPath());//获取标准的路径
            System.out.println(directory.getAbsolutePath());//获取绝对路径
        }
        catch(Exception e) {}
        File file = new File("a.txt");
        InputStream in = new BufferedInputStream(new FileInputStream(file));
        System.setIn(in);
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] a = new int[len];
        for(int i = 0; i < len; i++){
            a[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(binarySearch(a, key));
        sc.close();
    }
}
