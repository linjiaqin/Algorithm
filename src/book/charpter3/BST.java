package book.charpter3;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BST<T extends Comparable> {
    Node<T> root;
    int size = 0;
    public  BST(){
        root = null;
        size = 0;
    }

    public void insert(T val) {
        Node<T> newNode = new Node(val);
        size++;
        if(root == null) root = newNode;
        else {
            Node curNode = root;
            Node parent;
            while(true) {
                int cmp = val.compareTo(curNode.val);
                parent = curNode;
                if(cmp >= 0) {
                    curNode = curNode.right;
                    if(curNode == null) {
                        parent.right = newNode;
                        break;
                    }
                }
                else if(cmp < 0) {
                    curNode = curNode.left;
                    if(curNode == null) {
                        parent.left = newNode;
                        break;
                    }
                }
//                这样子是错的，因为curnode并不是这个BST树上的点，而只是指向这颗树上的点，需要改变这颗树上的点的指向
//                if(curNode == null) {
//                    curNode = newNode;
//                    break;
//                }
            }
        }
    }

    public void bfsTranverse() {
        System.out.println(size);
        if (root == null) return;
        Queue<Node<T>> queue = new LinkedList<Node<T>>();
        queue.add(root);
        HashMap<Node<T>,Integer> map = new HashMap<Node<T>,Integer>();
        int layer = 0;
        map.put(root, layer);
        while(!queue.isEmpty()) {
            Node tmp = queue.poll();
            System.out.println(tmp.val+" ");
            if (tmp.left != null) {
                queue.add(tmp.left);
            }
            if (tmp.right != null) {
                queue.add(tmp.right);
            }
        }
    }

    public static void main(String[] args) {
        BST<Integer>bst = new BST<>();
        int data[] = {2,8,7,4,9,3,1,6,7,5};
        for(int i = 0; i < data.length; i++) {
            bst.insert(data[i]);
        }
        bst.bfsTranverse();
    }



}
