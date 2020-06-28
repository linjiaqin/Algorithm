package leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

//拓扑排序判断环，如果有环，一定会有一个点的入度不为0
//拓扑排序最后每个点的度数都为0，都会进入队列中
//还可以用dfs判断是否存在环
public class Num_207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n = prerequisites.length;
        int[] degree = new int[numCourses];
        Queue<Integer>queue = new LinkedList<Integer>();

        //邻接矩阵表示图
        Vector[] g = new Vector[numCourses];
        for(int i = 0; i < numCourses; i++) g[i] = new Vector<Integer>();
        for(int i = 0; i < n; i++){
            degree[prerequisites[i][1]]++;
            g[prerequisites[i][0]].add(prerequisites[i][1]);
        }
        for(int i = 0; i < numCourses; i++) {
            if (degree[i] == 0) queue.add(i);
        }
        int front = 0;
        while (!queue.isEmpty()) {
            front = queue.poll();
            numCourses --;
            for(int i = 0; i < g[front].size(); i++){
                int j = (int)g[front].elementAt(i);
                degree[j]--;
                if(degree[j] == 0) queue.add(j);
            }
        }
        return numCourses==0;
    }
}
