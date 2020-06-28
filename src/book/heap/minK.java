package book.heap;

import java.util.ArrayList;

//用一个最大堆维护着最小的K个数，
//当前数比堆的最大元素小，删掉最大元素，插入。
//当前数大于最大元素，直接丢弃。
class MyHeap{
    int a[];
    int n;
    int count;
    public MyHeap(int n){
        this.n = n;
        count = 0;
        a = new int[n+1];
    }
    public void swap(int x, int y){
        int tmp = a[x];
        a[x] = a[y];
        a[y] = tmp;
    }
    public void insert(int x){
        if (count < n){
            a[count++] = x;
        }
        else a[count-1] = x;
        int tmp = count-1;
        while (tmp > 0){
            int fa = (tmp-1)/2;
            if(a[tmp] > a[fa]){
                swap(tmp, fa);
                tmp = fa;
            }else break;
        }
    }
    public int pop(){
        int res = a[count-1];
        swap(count-1, 0);
        int tmp = 0;
        while (tmp < count-1){
            int x = 2*tmp+1;
            int y = 2*tmp+2;
            if(y < count-1 && a[x] < a[y]) x= y;
            if(a[tmp] < a[x]) {
                swap(tmp, x);
                tmp = x;
            }else break;
        }
        return res;
    }
}
public class minK {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        MyHeap myHeap = new MyHeap(k);
        for(int i = 0; i < input.length; i++){
            if (myHeap.count < k) myHeap.insert(input[i]);
            else{
                if(input[i] < myHeap.a[0]) {
                    myHeap.pop();
                    myHeap.insert(input[i]);
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < k; i++){
            list.add(myHeap.a[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int a[] = new int[]{4,5,1,6,2,7,3,8};
        minK solve = new minK();
        ArrayList<Integer> list = solve.GetLeastNumbers_Solution(a, 4);
        list.forEach(x-> System.out.println(x));

    }
}
