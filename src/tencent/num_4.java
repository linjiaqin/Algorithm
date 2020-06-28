package tencent;

import java.util.Scanner;
import java.util.Stack;

public class num_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String s;
        while (sc.hasNext()){
            n = sc.nextInt();
            sc.nextLine();
            Stack<Integer>s1 = new Stack<>();   //临时栈， 有插入操作才放回存储栈
            Stack<Integer>s2 = new Stack<>();   //存储栈
            for(int i = 0; i < n; i++){
                s = sc.nextLine();
                if (s.equals("peek")){
                    if (!s1.isEmpty()){
                        System.out.println(s1.peek());
                    }
                    else {
                        int tmp;
                        while (s2.size()>1){
                            tmp = s2.pop();
                            s1.push(tmp);
                        }
                        tmp = s2.peek();
                        System.out.println(tmp);
                        while (!s1.isEmpty()){
                            tmp = s1.pop();
                            s2.push(tmp);
                        }
                    }
                }else if(s.equals("poll")){
                    if (!s1.isEmpty()){
                        s1.pop();
                    }
                    else{
                        int tmp;
                        while (s2.size()>1){
                            tmp = s2.pop();
                            s1.push(tmp);
                        }
                        if (!s2.isEmpty()) s2.pop();
                        //else continue;
                        //System.out.println(s2.pop());
                        while (!s1.isEmpty()){
                            tmp = s1.pop();
                            s2.push(tmp);
                        }
                    }

                }
                else if (s.startsWith("add")){
                    String tmp[] = s.split(" ");
                    int x  = Integer.valueOf(tmp[1]);
                    int tmps;
                    while (!s1.isEmpty()){
                        tmps = s1.pop();
                        s2.push(tmps);
                    }
                    s2.push(x);
                }
            }

        }
    }
}


