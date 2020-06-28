package leetcode;

public class Num_997 {
    public int findJudge(int N, int[][] trust) {
        int degree[] = new int[N+1];
        int out[] = new int[N+1];
        for(int i = 0; i < trust.length; i++) {
            degree[trust[i][1]]++;
            out[trust[i][0]]++;
        }
        int count = 0;
        int who = -1;
        for(int i = 1; i <= N; i++){
            if (degree[i] == N-1 && out[i] == 0) {
                count++;
                who = i;
            }
        }
        return count==1?who:-1;
    }
}
