package wangyi;
import java.util.Scanner;
public class Num_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s;
        int n;
        while(sc.hasNext()){
            n = sc.nextInt();
            sc.nextLine();
            s = sc.nextLine();
            char[] ss = s.toCharArray();
            int l = 0;
            int r = 0;
            for(int i = 0; i <n; i++){
                if (ss[i] == 'L') l++;
                if (ss[i] == 'R') r++;
            }
            int d = l-r;
            String res = "N";
            if(d == 0) res = "N";
            else if (d > 0) {
                while(d > 3) d = d%4;
                switch(d)
                {
                    case 0: res = "N"; break;
                    case 1: res = "W"; break;
                    case 2: res = "S"; break;
                    case 3: res = "E"; break;
                }
            }
            else {
                d = -d;
                while(d > 3) d = d%4;
                switch(d)
                {
                    case 0: res = "N"; break;
                    case 1: res = "E"; break;
                    case 2: res = "S"; break;
                    case 3: res = "W"; break;
                }
            }
            System.out.println(res);

        }
    }
}