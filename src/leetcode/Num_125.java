package leetcode;

public class Num_125 {
    public int check(char a) {
        if(a>='0'&&a<='9') return 1;
        else if (a>='a' && a<='z') return 2;
        else if (a>='A' && a<='Z') return 3;
        else return 4;
    }
    public boolean isPalindrome(String s) {
        char[] s1 = s.toCharArray();
        StringBuilder s2 = new StringBuilder("");
        int c;
        for(int i = 0; i < s1.length; i++){
            c = check(s1[i]);
            if (c == 4) continue;
            else if (c == 3) s2.append((char)(s1[i]+32));
            else s2.append(s1[i]);
        }
        String s3 = s2.toString();
        String s4 = s2.reverse().toString();
        return s3.equals(s4);
    }

    public static void main(String[] args) {
        String a = "race a car";//"A man, a plan, a canal: Panama";
        System.out.println(new Num_125().isPalindrome(a));
    }
}
