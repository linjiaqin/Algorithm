package book.sort;

public class insertsort {
    public static void swap(int[] s, int a, int b){
        int tmp = s[a];
        s[a] = s[b];
        s[b] = tmp;
    }
    public static void main(String[] args) {
        int n = 10;
        int a[] = new int[]{9,8,5,6,7,1,2,3};
        for (int i = 1; i < a.length; i++){
            for(int j = i; j > 0; j-- ){
                if (a[j] < a[i]) swap(a, i, j);
                else break;
            }
        }
        for (int e:a){
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
