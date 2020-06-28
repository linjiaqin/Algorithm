package huawei;

import java.util.Scanner;

public class Num_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum;
        while (sc.hasNext()) {
            sum = 0;
            n = sc.nextInt();
            while (n > 0){
                if(n % 2 == 1) sum++;
                n = n/2;
            }
            System.out.println(sum);
        }
    }
}