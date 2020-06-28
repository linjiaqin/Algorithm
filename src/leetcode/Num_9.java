package leetcode;

//StringBuilder的反转是会改变原字符串的
public class Num_9 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        StringBuilder res1 = new StringBuilder("");
        int d = 0;
        while(x > 0) {
            d = x%10;
            x = x/10;
            res1.append(d);
        }
        String reverseString = res1.toString();
        StringBuilder originalString = res1.reverse();
        if (originalString.toString().equals(reverseString)) return true;
        else return false;
    }
    public static void main(String[] args) {
        int a[] = new int[]{121, -121, 10};
        for(int i = 0; i < a.length; i++) {
            System.out.println(new Num_9().isPalindrome(a[i]));
        }
        StringBuilder aa = new StringBuilder("hello");
        StringBuilder bb = aa.reverse();
        System.out.println(aa+","+bb) ;
    }
}
