package vivo;

/**
 * 在vivo产线上，每位职工随着对手机加工流程认识的熟悉和经验的增加，日产量也会不断攀升。
 * 假设第一天量产1台，接下来2天(即第二、三天)每天量产2件，接下来3天(即第四、五、六天)每天量产3件 ... ...
 * 以此类推，请编程计算出第n天总共可以量产的手机数量。
 */
public class Num_3 {
    public static void main(String[] args) {
        int i = 1;  //代表目前第几天
        int cur = 0;
        int sum = 0;
        int n = 11;
        while (i <= n){
            cur++;
            for(int j = 1; j <= cur; j++){
                sum += cur;
                i++;
                if (i > n) break;
            }
        }
        System.out.println(sum);
    }
}
