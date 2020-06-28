package meituan;

/**
 * 某部队举办了一届军事运动会，其中有一个团体马拉松项目，有n名选手按顺序从起跑线出发，并且记录下他们到达终点的顺序。在跑步过程中超越了其他人的选手要给予表彰。
 *
 * 受表彰的选手需要满足的条件是，如果存在一名出发顺序排在选手X之后的选手Y先于X到达终点，则认为Y超越了X。
 *
 * 对于每一个选手，只要他超越了任意一个人，就有资格受到表彰。请你计算出有多少人可以得到表彰。
 * 输入
 * 输入第一行仅包含一个正整数n，表示选手数量。(1<=n<=10^5)
 *
 * 输入第二行包含n个正整数，是一个1-n的排列A，表示出发顺序，A[i]表示第i个出发的选手的编号。
 *
 * 输入第三行同样包含一个1-n的排列B，表示到达顺序，B[i]表示第i个到达的选手的编号。
 *
 * 输出
 * 输出仅包含一个整数，表示得到表彰的人数。
 *
 *
 * 样例输入
 * 5
 * 5 3 1 4 2
 * 2 4 5 1 3
 * 样例输出
 * 3
 */
import java.util.Scanner;

public class num2 {
    public static void main(String[] args) {
        int n;
        int x;
        String s;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            n = sc.nextInt();
            int a[] = new int[n+1];
            int b[] = new int[n+1];
            int pos[] = new int[100000];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
                pos[a[i]] = i;
            }
            for (int j = 1; j <= n; j++)
                b[j] = sc.nextInt();

            int sum = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    if (pos[b[i]] > pos[b[j]]){
                        sum++;
                        break;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
