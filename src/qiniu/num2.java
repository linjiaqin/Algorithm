//package qiniu;
//
//import java.util.Scanner;
//
//public class num2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t;
//        String s;
//        t = sc.nextInt();
//        while (t-- > 0){
//            sc.nextLine();
//            s = sc.nextLine();
//            StringBuilder res = new StringBuilder("");
//            for(int i = 0; i < s.length()-1; i++){
//                if (s.charAt(i) == s.charAt(i+1)){
//                    i++;
//                }
//                else {
//                    res.append(s.charAt(i));
//                }
//            }
//            if (s.charAt(s.length()-1) != s.charAt(s.length()-2)){
//                res.append(s.charAt(s.length()-1));
//            }
//            StringBuilder tmp = new StringBuilder("");
//            while (true){
//                tmp.delete(0, tmp.length());
//                for(int i = 0; i < res.length()-1; i++){
//                    if (res.charAt(i) == res.charAt(i+1)){
//                        i++;
//                    }
//                    else {
//                        tmp.append(res.charAt(i));
//                    }
//                }
//                if (res.charAt(res.length()-1) == )
//                if (tmp.length() == 0 || tmp.length() == res.length()) break;
//                else res = tmp;
//            }
//            if (tmp.length() == 0) System.out.println("YES");
//            else System.out.println("NO");
//        }
//    }
//}
