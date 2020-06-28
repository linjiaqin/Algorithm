package qushikeji;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
    Node(){}
}
public class num1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (sc.hasNext()){
            n = sc.nextInt();
            Node head = new Node(1);
            Node tmp = head;
            for(int i = 2; i <=n; i++){
                Node newNode = new Node(i);
                tmp.next = newNode;
                tmp = newNode;
            }
            tmp.next = head;
            int step = 0;
            int k = 1;
            Node cur = head;
            Node last = head;
            while (true){
                step = 0;
                while (step < k){
                    last = cur;
                    cur = cur.next;
                    step++;
                }
                k++;
                //System.out.println(cur.val);
                last.next = cur.next;
                cur = cur.next;
                if (cur.next == cur){
                    System.out.println(cur.val);
                    break;
                }
            }
        }
    }
}
