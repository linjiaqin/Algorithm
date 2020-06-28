package leetcode;

import java.util.Stack;
//
class MyQueue {

    Stack<Integer> s1,s2;

    /** Initialize your data structure here. */
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int top;
        while (s1.size() > 0) {
            top = s1.pop();
            s2.push(top);
        }
        top = s2.pop();
        while (s2.size() > 0) {
            s1.push(s2.pop());
        }
        return top;
    }

    /** Get the front element. */
    public int peek() {
        int top;
        while (s1.size() > 0) {
            top = s1.pop();
            s2.push(top);
        }
        top = s2.peek();
        while (s2.size() > 0) {
            s1.push(s2.pop());
        }
        return top;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.empty();
    }
}
public class Num_232 {
}
