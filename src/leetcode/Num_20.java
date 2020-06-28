package leetcode;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Num_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else {
                if (stack.empty()) return false;
                else {
                    char top = stack.peek();
                    if ( (c == ')' && top == '(') || (c =='}'&&top=='{') || (c ==']'&&top=='[')) stack.pop();
                    else stack.push(c);
                }
            }
        }
        if (stack.empty()) return true;
        else return false;
    }
    public static void main(String[] args) throws FileNotFoundException {
        String path = "leetcode/20.txt";
        File file = new File(path);
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
        System.setIn(in);
        Scanner sc = new Scanner(System.in);

        String s;
        Num_20 solve = new Num_20();
        while (sc.hasNext()) {
            s = sc.nextLine();
            System.out.println(solve.isValid(s));
        }
    }
}
