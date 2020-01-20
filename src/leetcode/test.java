package leetcode;

public class test {
    //这里实际上就把数组看成一个指针那样，即使未分配空间也能指向，但是不能操作。只有指向或者分配空间之后才能操作。
    public static void main(String[] args) {
        char[][] a = new char[3][5];
        //char[][] a = new char[3][];
        String a1 = "12345";
        String a2 = "6789";
        String a3 = "10";
        a[0] = a1.toCharArray();
        a[1] = a2.toCharArray();
        a[2] = a3.toCharArray();
        for(int i = 0; i < 3; i++){
            System.out.println(a[i]);
        }
    }
}
