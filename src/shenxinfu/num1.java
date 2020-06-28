package shenxinfu;

import java.util.Arrays;
import java.util.Scanner;

class Record implements Comparable{
    int day;
    int second;
    int sell;

    @Override
    public int compareTo(Object o) {
        Record tmp = (Record)o;
        return this.second-tmp.second;
    }

    @Override
    public String toString() {
        return "Record{" +
                "day=" + day +
                ", second=" + second +
                ", sell=" + sell +
                '}';
    }
}
public class num1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (sc.hasNext()){
            n = sc.nextInt();
            Record[] record= new Record[n];
            for(int i = 0; i < n; i++){
                record[i] = new Record();
                record[i].day =sc.nextInt();
                record[i].second = sc.nextInt();
                record[i].sell = sc.nextInt();
            }
            Arrays.sort(record);
//            for(int i = 0; i < n; i++){
//                System.out.println(record[i]);
//            }
            int max_sell = 0;
            int index = 0;
            int sum[] = new int[n+1];
            sum[0] = 0;
            for(int i = 1; i < n; i++){
                sum[i] = sum[i-1]+ record[i-1].sell;
            }
            sum[n] = sum[n-1]+record[n-1].sell;

            int l = 0;
            int r = 0;
            int sell = 0;
            while (r < n){
                if(record[r].second <= record[l].second+7200){
                    sell = sum[r+1]-sum[l];
                    if (sell > max_sell){
                        max_sell = sell;
                        index = l;
                    }
                    r++;
                }
                else{
                    l++;
                }
            }
            System.out.println(record[index].second+" "+max_sell);


        }
    }
}
