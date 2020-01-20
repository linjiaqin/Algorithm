package leetcode;

public class sixty_nine {
    public int mySqrt(int x) {
        if(x == 1) return 1;
        int l = 0;
        int r = x;
        int mid = 1;
        int pow;
        while(l < r-1) {
            mid = (l+r) / 2;
            //if(Integer.MAX_VALUE/mid > mid)原本是想用这样来判断溢出的
            pow = mid*mid;
            if (mid > x/mid) r = mid;
            else if (mid < x/mid) l = mid;
            else return mid;
        }
        return l;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++)
            System.out.println(i+" "+new sixty_nine().mySqrt(i));
    }
}
