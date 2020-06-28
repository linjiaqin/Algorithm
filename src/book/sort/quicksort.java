package book.sort;

public class quicksort {
    public void swap(int a[], int x, int y){
        int tmp = a[x];
        a[x] = a[y];
        a[y] = tmp;
    }
    public void dfs(int a[], int l, int r){
        if (l > r) return;
        int index = a[l];     //基准设置为最左边的数，所以要右边指针先动,因为j是要找比较小的，找不到一直移动
        int i = l;
        int j = r;
        while (i < j){
            while (i < j && a[j] > index) j--;  //为什么j要先移动?  6, 1, 2, 7,9 假设i先移动，最后交换的是6和7
            while (i < j && a[i] <= index) i++;
            if(i < j) swap(a, i , j);
        }
        a[l] = a[i];    //相遇节点和index交换
        a[i] = index;   //左边都是比index小的，右边都是比index大的, 第i个数归位
        dfs(a, l ,i-1);
        dfs(a, i+1, r);
    }

    public static void main(String[] args) {
        int[] a = new int[]{6, 3, 9, 1,4,8};
        new quicksort().dfs(a, 0, a.length-1);
        for (int e:a){
            System.out.print(e+" ");
        }
        System.out.println();

    }
}

