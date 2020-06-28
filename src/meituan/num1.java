package meituan;

import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {
        int n;
        int x;
        String s;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            x = sc.nextInt();
            sc.nextLine();
            s = sc.nextLine();
            n = sc.nextInt();
            String tmp[] = s.split(":");
            int hour = Integer.valueOf(tmp[0]);
            int minute = Integer.valueOf(tmp[1]);
            int curMin = (x-1)*24*60 + hour*60 + minute;
            int week = 7*24*60;
            int lastMin = (curMin -n)%week;
            int resDay;
            int resMin;
            int resHour;
            int tmps;
            String outDay;
            String outHour;
            String outMin;
            if (lastMin > 0){
                resDay = lastMin/(24*60);//天数
                tmps = lastMin%(24*60);   //剩下多少分钟
                resHour = tmps/60;
                resMin = tmps%60;
                System.out.println((resDay+1)%7);
                if (resHour < 10) outHour = "0"+resHour;
                else outHour = ""+resHour;
                if (resMin < 10) outMin = "0"+resMin;
                else outMin = ""+resMin;
                System.out.println(outHour+":"+outMin);
            }
            else {
                lastMin = 7*24*60 - lastMin;
                resDay = lastMin/(24*60);
                tmps = lastMin%(24*60);
                resHour = tmps/60;
                resMin = tmps%60;
                System.out.println((resDay+1)%7);
                if (resHour < 10) outHour = "0"+resHour;
                else outHour = ""+resHour;
                if (resMin < 10) outMin = "0"+resMin;
                else outMin = ""+resMin;
                System.out.println(outHour+":"+outMin);
            }
        }

    }
}
