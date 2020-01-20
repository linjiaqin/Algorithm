package leetcode;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 单调递增链表消除重复元素
 */
public class evity_three {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode curNode = head;
        ListNode scanNode = null;
        //用curNode去标记第一个不同的数字，用scan去扫描相同的数字，相同的跳过，不同的连起来，这里要特别注意要判断null
        while(curNode != null) {
            scanNode = curNode.next;
            while(scanNode != null && curNode.val == scanNode.val){
                scanNode = scanNode.next;
            }
            if(scanNode == null) {
                curNode.next = null;
            }
            else{
                curNode.next = scanNode;
            }
            curNode = curNode.next;
        }
        return head;
    }
    public static void showList(ListNode head){
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("leetcode/83.txt");
        InputStream in = new BufferedInputStream(new FileInputStream(file));
        System.setIn(in);
        Scanner sc = new Scanner(System.in);
        String s = null;

        while(sc.hasNext()){
            ListNode head = null;
            ListNode nextNode = head;
            s = sc.nextLine();
            ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(s.split("->")));
            for (String e : arrayList) {
                int digth = Integer.parseInt(e);
                if(head == null) {
                    nextNode = new ListNode(digth);
                    head = nextNode;
                }
                else {
                    nextNode.next = new ListNode(digth);
                    nextNode = nextNode.next;
                }
            }
            //nextNode.next = null;
            deleteDuplicates(head);
            showList(head);
        }

    }
}
