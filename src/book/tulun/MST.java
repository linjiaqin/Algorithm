package book.tulun;

import java.util.*;
//       输入样例：
//        4 5
//        1 2 1
//        1 3 2
//        1 4 3
//        2 3 2
//        3 4 4
//        输出样例：
//        6

/**
 * 个人认为区别在于：类实现了comparable接口之后，可以直接调用排序方法；而当使用comparator时，不需要类实现，
 * 具体使用时（也就是调用某些方法时）的需要类和该comparator绑定起来来实现。comparable实现内部排序，Comparator是外部排序。
 * @param <T>
 */
class Edge<T> implements Comparable<Edge> {

    public T u,v;
    public int w;

    public Edge(T u, T v, int w){
        this.u = u;
        this.v = v;
        this.w = w;
    }

    @Override
    public int compareTo(Edge o) {
        int w1 = o.w;
        return this.w > o.w ? 1 : (this.w == o.w ? 0:-1);
    }
}
public class MST {
    public List[] matToAdjNoWeight(int n, int[][] graph, int start, int target) {
        // 将矩阵转为邻接表
        List<Integer>[] adj= new ArrayList [n];
        for (int[] edge:graph){
            int from=edge[0];
            int to=edge [1];
            if (adj[from]==null)
                adj[from]=new ArrayList<>();
            adj[from].add(to);
        }
        return adj;
    }

    public List[] matToAdjWeight(int n, int[][] graph, int start, int target) {
        // 将矩阵转为邻接表
        List<Integer>[] adj= new ArrayList [n];
        for (int[] edge:graph){
            int from=edge[0];
            int to=edge [1];
            if (adj[from]==null)
                adj[from]=new ArrayList<>();
            adj[from].add(to);
        }
        return adj;
    }

    public static int prim(List[] adj, int n, int start){
        int parent[] = new int[n+1];
        Arrays.fill(parent, -2);
        parent[start] = -1;
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(start);
        int minCost = 0;
        while (hashSet.size() < n){
            Edge<Integer> tmp = null;
            int minW = Integer.MAX_VALUE;
            for(int i = 1; i <= n; i++){
                if (parent[i] != -2){
                    List<Edge> list = adj[i];
                    if (list != null){
                        for(Edge e: list){
                            int cost = e.w;
                            if (!hashSet.contains(e.v) &&cost < minW) {
                                minW = e.w;
                                tmp = e;
                            }
                        }
                    }
                }
            }
            parent[tmp.v] = tmp.u;
            minCost += tmp.w;
            hashSet.add(tmp.v);
        }
        for(int i = 1; i <= n; i++){
            System.out.println(i +":" +parent[i]);
        }
        return minCost;
    }

    public static int Krusal(){
        return 0;
    }
    public static void main(String[] args) {
        int n,m;
        int u,v,w;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            n = sc.nextInt();    //n个点
            m = sc.nextInt();    //m条边
            List<Edge<Integer>>[] adj = new ArrayList[n];
            for(int i = 0; i < n; i++){
                u = sc.nextInt();
                v = sc.nextInt();
                w = sc.nextInt();
                if (adj[u] == null) adj[u] = new ArrayList<>();
                adj[u].add( new Edge<Integer>(u, v, w));
            }
            System.out.println(prim(adj, n, 1));
        }
    }
}
