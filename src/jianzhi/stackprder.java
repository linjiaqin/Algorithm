package jianzhi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stackprder {
    public static boolean  isPopOrder(int pPush[], int pPop[]){
        boolean bPossible = false;
        if(pPush.length == 0 || pPop.length == 0){
            bPossible = false;
        }
        Stack<Integer> stack = new Stack<Integer>();
        //用于标识弹出序列的位置
        int popIndex = 0;
        for (int i = 0; i < pPush.length; ++i) {
            stack.push(pPush[i]);
            while(!stack.isEmpty() && stack.peek() == pPop[popIndex]){
                stack.pop(); //出栈
                ++popIndex;
            }
        }
        if(stack.isEmpty() && pPop.length-1 == popIndex){
            bPossible = true;
        }else{
            bPossible = false;
        }
        return bPossible;
    }


    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        int[] b = new int[]{4,5,3,2,1};
        //System.out.println(IsPopOrder(a,b));
    }
}