package book.sort;

//自顶向下划分，然后自底向上合并两个有序数组，划分成logN层，每层合并复杂度O(n）
public class mergesort {
    public void dfs(int a[], int l, int r){
        int mid = (l+r)/2;
        dfs(a, l ,mid);
        dfs(a, mid+1, r);
        int i = l;
        int j = mid+1;
        int tmp[] = new int[r-l+1];
        int index = 0;
        //合并两个有序数组
        while (i < mid && j < r){
            while (a[i++] < a[j]) tmp[index++] = a[i];
            while (a[j++] < a[i]) tmp[index++] = a[j];
        }
        while (i < mid) tmp[index++] = a[i++];
        while (j < r) tmp[index++] = a[j++];
        //将临时数组中的内容复制回去
        index=0;
        for (int k = l; k <= r; k++) a[k] = tmp[index++];
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
