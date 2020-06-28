package tencent;

import java.util.Scanner;

/*
2
4
0 0
0 1
1 0
1 1
2 2
2 3
3 2
3 3
4
0 0
0 0
0 0
0 0
0 0
0 0
0 0
0 0
 */
class Point{
    int x,y;
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class num_2 {
    public static double getdis(Point a, Point b){
        return Math.sqrt(Math.pow((a.x-b.x), 2)+Math.pow((a.y-b.y), 2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int x, y;
        int t;
        t = sc.nextInt();
        while (t-- > 0){
            n = sc.nextInt();
            Point[] a = new Point[n];
            Point[] b = new Point[n];
            for(int i = 0; i < n; i++){
                x = sc.nextInt();
                y = sc.nextInt();
                a[i] = new Point(x, y);
            }
            for(int i = 0; i < n; i++){
                x = sc.nextInt();
                y = sc.nextInt();
                b[i] = new Point(x, y);
            }
            double res = Double.MAX_VALUE;
            for (int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    res = Math.min(res, getdis(a[i], b[j]));
                }
            }
            System.out.println(String.format("%.3f",res));
        }

    }
}
