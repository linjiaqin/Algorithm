package qiniu;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

public class num2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        String s;
        t = Integer.valueOf(sc.nextLine());
        while (t-- > 0){
            s = sc.nextLine();
            StringBuilder tmp = new StringBuilder(s);
            Stack<Character>stack = new Stack<>();
            int flag = 0;
            while (true){
                stack.clear();
                for(int i  = 0; i < tmp.length(); i++){
                    if (!stack.isEmpty() && stack.peek() == tmp.charAt(i)){
                        stack.pop();
                    }
                    else {
                        stack.push(tmp.charAt(i));
                    }
                }
                if (stack.size() == 0){
                    flag = 1;  //YES
                    break;
                }
                else {
                    tmp.delete(0, tmp.length());
                    int stacksize = stack.size();
                    while (!stack.isEmpty()){
                        tmp.append(stack.pop());
                    }
                    tmp = tmp.reverse();
                    int i = 0;
                    for(i = 0; i < tmp.length()-1; i++){
                        if (tmp.charAt(i) == tmp.charAt(i+1)){
                            flag = 0;     //NO
                            break;
                        }
                    }
                    if (i == tmp.length()-1) flag = 2; //NO，可以跳出
                    if (flag != 0) break;
                }
            }
            if (flag == 1) System.out.println("Yes");
            else System.out.println("No");

        }
    }


}
