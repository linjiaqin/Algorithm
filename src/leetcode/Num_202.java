package leetcode;

//题解：观察规律，只要含有4的一定会陷入死循环，一定不是快乐数
//采用递归的写法
public class Num_202 {
    public boolean isHappy(int n) {
        if (n == 4) return false;
        else if (n == 1) return true;
        int res = 0;
        while (n>0) {
            res += Math.pow(n%10, 2);
            n = n/10;
        }
        return isHappy(res);
    }
        public static void main(String[] args) {

    }
}
