package hihocoder;

import java.util.HashMap;
import java.util.Scanner;

public class Number_1985 {
    enum State{
        CREATE, PAY, CANCEL
    }
    //public final static String state[] = {"CREATE","PAY","CANCEL"};
    public static void main(String[] args) {
        Scanner sc = StdIn.getScanner(1985);
        int n;
        String s;
        while(sc.hasNext()) {
            int pay = 0;
            int cancel = 0;
            int waiting = 0;
            int orderId;
            int money;
            HashMap<Integer, Integer> waittingList = new HashMap<Integer, Integer>();
            n = sc.nextInt();
            s = sc.nextLine();
            for(int i = 0; i < n; i++){
                s = sc.nextLine();
                //System.out.println(s);
                String ss[] = s.split(" ");
                State state = State.valueOf(ss[0]);
                orderId = Integer.parseInt(ss[1]);
                switch (state) {
                    case PAY:
                        pay += waittingList.get(orderId);
                        waittingList.remove(orderId);
                        break;
                    case CANCEL:
                        cancel += waittingList.get(orderId);
                        waittingList.remove(orderId);
                        break;
                    case CREATE:
                        waittingList.put(orderId,Integer.parseInt(ss[2]));
                        break;
                }
            }
            for (Integer value: waittingList.values()) {
                waiting += value;
            }
            System.out.println(pay+" "+cancel+" "+waiting);
        }
    }
}
