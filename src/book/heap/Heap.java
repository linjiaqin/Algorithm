package book.heap;

//l = root*2+1
//r = root*2+2
//这个是最小堆
public class Heap {
    int heap[];
    int n;
    int count;   //count指向最后一个位置
    Heap(int n){
        heap = new int[n+1];
        count = 0;
    }
    public void insert(int x){
        heap[count++] = x;
        int pos = count-1;
        while (pos > 0){
            int p = (pos-1)/2;
            if(heap[pos] < heap[p]){
                int tmp = heap[pos];
                heap[pos] = heap[p];
                heap[p] = tmp;
                pos = p;
            }
            else break;
        }
    }
    public int pop(){
        int res = heap[0];
        int pos = count-1;
        heap[0] = heap[pos];
        int i = 0;
        while (i*2+1 < count-1){
            int a = i*2 + 1;
            int b = i*2 + 2;
            if(b < count && heap[b] < heap[a]) a = b;  //换更小的
            if(heap[i] > heap[a]) {
                int tmp = heap[i];
                heap[i] = heap[a];
                heap[a] = tmp;
                i = a;
            }
            else break;
        }
        count--;
        return res;
    }

    public static void main(String[] args) {
        int a[] = new int[]{9,10,3,4,5,6,7,8};
        Heap heap = new Heap(a.length);
        for (int e: a) heap.insert(e);
        for (int i =0 ;i < a.length; i++){
            System.out.println(heap.pop());
        }
    }
}
