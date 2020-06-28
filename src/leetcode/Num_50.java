package leetcode;

//因为负的表示比正的多一位，相反的时候会溢出
public class Num_50 {
    //快速幂的迭代实现
    public double myPow(double x, int n) {
        double flag = 1;
        long nn = n;
        if(n < 0) {
            flag = -1;
            nn = -nn;
        }
        double res = 1;
        while (nn>0){
            if(nn%2 == 1) res = res*x;
            x = x*x;
            nn/=2;
        }
        if (flag > 0)return res;
        else return 1.0/res;
    }
    //快速幂的递归实现，参数的顺序也可认为重载
    double myPow1(double x, int n) {
        if (n == 0) { return 1; }
        if (n == 1) { return x; }
        if (n == -1) { return 1 / x; }
        double half = myPow1(x, n / 2);
        double rest = myPow1(x, n % 2);
        return rest * half * half;
    }

}
