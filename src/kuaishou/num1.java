package kuaishou;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class num1 {
    public static void main(String[] args) {
        //File file = new File("kuaishou/1.txt");
        //BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
        //System.setIn(in);
        Scanner sc = new Scanner(System.in);
        String s;
        while(sc.hasNext()){
            s = sc.nextLine();
            char[] ss = s.toCharArray();
            Stack<Character> stack = new Stack<>();
            int l = 0;
            int r = 0;
            int pair = 0;
            char c1 = '(';
            char c2 = ')';
            for(int i = 0; i < ss.length; i++){
                if (ss[i] == '(' || ss[i] == ')') {
                    if (ss[i] == ')'){
                        if (stack.size() == 0) stack.push(ss[i]);
                        else {
                            char tmp = stack.peek();
                            if (tmp == '(') {
                                stack.pop();
                                pair++;
                            }
                            else {
                                stack.push(ss[i]);
                            }
                        }
                    }
                    else{
                        stack.push(ss[i]);
                    }
                }
            }
            while (!stack.isEmpty()){
                char tmp = stack.pop();
                if (tmp == '(') l++;
                else r++;
            }
            System.out.println(pair+" "+l+" "+r);
        }
    }
}
