package wangyi;

import java.util.Scanner;
class Time{
    int hour;
    int minute;
    Time(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }
    int getValue(){
        return hour*60+minute;
    }

    @Override
    public String toString() {
        return hour+" "+minute;
    }
}
public class Num_1{
    public static boolean late(Time now, Time end){
        if (now.getValue() > end.getValue()) return  true;
        else return false;
    }
    public static Time addTime(Time now, int m){
        int resM = (now.minute + m)%60 ;
        int resH = now.hour + (now.minute+m)/60;
        return new Time(resH, resM);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,a,b,x;
        int h,m;
        while(sc.hasNext()){
            n = sc.nextInt();
            Time time[] = new Time[n];
            for(int i = 0; i < n; i++) {
                h = sc.nextInt();
                m = sc.nextInt();
                time[i] = new Time(h,m);
            }
            x = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            Time end = new Time(a,b);
            Time tmp;
            Time res = null;
            for(int i = 0; i < n; i++){
                tmp = addTime(time[i],x);
                if (!late(tmp, end)){
                    if(res == null) res = time[i];
                    else {
                        if(late(time[i], res)){
                            res = time[i];
                        }
                    }
                }
            }
            System.out.println(res.toString());
        }
    }
}