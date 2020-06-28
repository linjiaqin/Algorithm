package book.string;

/*leetcode 409
给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。

在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 */
/*0-9对应Ascii 48-57
 *A-Z 65-90
 *a-z 97-122
 *第33～126号(共94个)是字符，其中第48～57号为0～9十个阿拉伯数字
 */
public class ascii {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;
        int sum = 0;
        boolean flag = false;
        for(int i = 0; i < 128; i++){
            if (count[i] %2 == 1){
                if(!flag){
                    flag = true;
                    sum += count[i]/2*2+1;
                }
                else sum += count[i]/2*2;
            }
            else {
                sum += count[i];
            }
        }
        return sum;
    }
}
