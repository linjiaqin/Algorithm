import java.util.Scanner;

public class huawei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String a,b;
       a = sc.nextLine();
       b = sc.nextLine();
       int d = 0;
       int len1 = a.length();
       int len2 = b.length();
       StringBuilder tmpa = new StringBuilder(a);
       StringBuilder tmpb = new StringBuilder(b);
       StringBuilder aa = tmpa.reverse();
       StringBuilder bb = tmpb.reverse();
       StringBuilder res = new StringBuilder("");
       for(int i = 0; i < Math.min(len1, len2); i++){
           int x = aa.charAt(i)-'0';
           int y = bb.charAt(i)-'0';
           res.append((x+y+d)%10);
           d = (x+y+d)/10;
       }
       for(int i = Math.min(len1, len2); i < Math.max(len1, len2); i++){
           if (i < aa.length()){
               int tmp = aa.charAt(i)-'0';
               res.append((tmp+d)%10);
               d = (tmp+d)/10;
           }
           else if (i < bb.length()){
               int tmp = bb.charAt(i)-'0';
               res.append((tmp+d)%10);
               d = (tmp+d)/10;
           }
       }
       if (d != 0) res.append(d);
        System.out.println(res.reverse());
    }
}
