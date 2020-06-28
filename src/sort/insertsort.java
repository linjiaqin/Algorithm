package sort;

public class insertsort {
    //插入排序
    public static void insertSort(int a[]) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int temp = a[i];              //记录当前这个位置的数
            int j = i;
            while (j >= 1 && temp < a[j-1]) {  //向前比较，比将这些数向后移
                a[j] = a[j-1];
                j--;
            }
            a[j] = temp;                  //将当前要比较的数放到空位
        }
    }
    //选择排序
    public static void chooseSort(int[] a){
        int n = a.length;

    }

    //冒泡排序
    public static void bubleSort(int[] a) {
        int n = a.length;
        int tmp;
        for (int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-i-1; j++) {
                if (a[j] > a[j+1]) {
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {38, 65, 97, 76, 13, 27, 49};
        insertSort(a);
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
