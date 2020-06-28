package kuaishou;

import java.util.Scanner;

class Node{
    int val;
    Node l;
    Node r;
    Node(int val){
        this.val = val;
    }
    Node()
    {
        
    }
}

public class Num_4 {
    public  Node buildTree(int pre[], int in[], int s1, int e1, int s2, int e2){
            int rootVal = pre[s1];
            int index = s2;
            Node root = new Node(rootVal);
            for(int i = s2; i < e2; i++){
                if (in[i] == rootVal) index = i;
            }
            int offest = index -s2 + 1;
            Node left = buildTree(pre, in, s1+1, s1+1 + offest, s2,s2+offest);
            Node right = buildTree(pre, in, s1+1+offest+1, e1, index+1, e2);
            root.l = left;
            root.r = right;
            return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String[] ss1 = s1.split(" ");
        String[] ss2 = s2.split(" ");
        int[] a = new int[ss1.length];
        int[] b = new int[ss2.length];
        for(int i = 0; i < a.length; i++){
            a[i] = Integer.parseInt(ss1[i]);
        }
        for(int i = 0; i < b.length; i++){
            b[i] = Integer.parseInt(ss2[i]);
        }

    }
}
