package pingduoduo;


import java.util.*;

public class num2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        int n;
        t = sc.nextInt();

        while (t-- > 0){
              n = sc.nextInt();
              int a[] = new int[n];
              int sum = 0;
              for(int j = 0; j < n; j++){
                  a[j] = sc.nextInt();
                  sum += a[j];
              }

              if(sum%4 != 0){
                  System.out.println("NO");
              }
              else{
                  int len = sum/4;
                  Arrays.sort(a);
                  List<Integer> list = new ArrayList<Integer>();
                  for(int k = 0; k < a.length; k++) list.add(a[k]);
                  int flag = 0;
                  int lens[] = new int[4];
                  for(int k = 0; k < 4; k++) lens[k] = len;
                  for(int num = 0; num < 4; num++){
                      int last = lens[num];
                      while (lens[num] > 0){
                          for(int k = list.size()-1; k >=0; k--){
                              if (list.get(k) <= lens[num]){
                                  lens[num] = lens[num] - list.get(k);
                                  list.remove(k);
                                  break;
                              }
                          }
                          if(lens[num] == 0) {
                              flag+=1;
                              break;
                          }
                          if(lens[num] == last){
                              break;
                          }
                          last = lens[num];
                      }
                  }
                  if (flag == 4) System.out.println("YES");
                  else System.out.println("NO");
              }

        }

    }
}
