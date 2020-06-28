package vivo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class Num_1 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        int output = solution(inputStr );
        System.out.println(output);
    }

    private static int solution(String str) {
//        Queue<Integer>q = new LinkedList<>();
//        q.offer();

        // TODO Write your code here
        Stack<Character> stack = new Stack<>();
        char[] strs = str.toCharArray();
        for(int i = 0; i < strs.length; i++){
            if(strs[i] == '0') return stack.size();
            else{
                if(strs[i] == '(') stack.push(strs[i]);
                else if (strs[i] == ')') stack.pop();
            }
        }
        return 0;
    }
}