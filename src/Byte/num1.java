package Byte;

import java.util.Scanner;
import java.util.Stack;

class MyOperator{
    int k;
    int op;
    String str;

    public MyOperator(int op, int k, String str) {
        this.k = k;
        this.op = op;
        this.str = str;
    }

    @Override
    public String toString() {
        return "MyOperator{" +
                "k=" + k +
                ", op=" + op +
                ", str='" + str + '\'' +
                '}';
    }
}
public class num1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String s;
        while (sc.hasNext()){
            n = sc.nextInt();
            sc.nextLine();
            StringBuilder res = new StringBuilder("");
            Stack<MyOperator> stack = new Stack<MyOperator>();
            for(int i = 0; i < n; i++){
                s = sc.nextLine();
                if (s.startsWith("1")){
                    String[] tmp = s.split(" ");
                    int len = tmp[1].length();
                    res.append(tmp[1]);
                    stack.add(new MyOperator(1, len, tmp[1]));
                }
                else if (s.startsWith("2")){
                    int resLen = res.length();
                    String[] tmp = s.split(" ");
                    int k = Integer.valueOf(tmp[1]);
                    String str = res.substring(resLen-k);
                    res.delete(resLen-k, resLen);
                    stack.add(new MyOperator(2, k, str));
                }
                else if (s.startsWith("3")){
                    String[] tmp = s.split(" ");
                    int k = Integer.valueOf(tmp[1]);
                    System.out.println(res.charAt(k-1));
                }
                else  if (s.startsWith("4")){
                    MyOperator last = stack.pop();
                    //System.out.println(last);
                    if (last.op == 1){
                        res.delete(res.length()-last.k, res.length());
                        //System.out.println("deletenow:"+res);
                    }
                    else if(last.op == 2){
                        res.append(last.str);
                        //System.out.println("appendnow:"+res);
                    }
                }
            }
        }
    }
}
