package book.sort;

public class choosesort {
    public static void swap(int[] s, int a, int b){
        int tmp = s[a];
        s[a] = s[b];
        s[b] = tmp;
    }
    public static void main(String[] args) {
        int n = 10;
        int a[] = new int[]{9,8,5,6,7,1,2,3};
        for (int i = 0; i < a.length; i++){
            int tmp = i;
            for (int j = i+1; j < a.length; j++){
                if(a[j] < a[tmp]) tmp = j;
            }
            swap(a, i, tmp);
        }
        for (int e:
             a) {
            System.out.println(e);
        }

    }
}
