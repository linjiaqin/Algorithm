package leetcode;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class twohundred {
    public static void show(char[][] grid){
        for(int i = 0; i < grid.length; i++)
            System.out.println(grid[i]);
        System.out.println();
    }
    int[][] direction ={{0,1},{0,-1},{1,0},{-1,0}};
    boolean checkBorder(int x, int y, int h, int w) {
        if (x < 0 || y < 0 || x >= w || y >= h) return false;
        return true;
    }
    public void dfs(char[][] grid, int x, int y) {
        grid[x][y] = '0';
        for (int i = 0; i < 4; i++){
            int new_x = x + direction[i][0];
            int new_y = y + direction[i][1];
            //System.out.println(new_x+","+new_y);
            if (checkBorder(new_x, new_y, grid[0].length, grid.length) && grid[new_x][new_y] == '1') {
                //show(grid);
                dfs(grid, new_x, new_y);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int sum = 0;
        for(int i = 0; i < grid.length; i++)
            for(int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    sum++;
                }
            }
        return sum;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("leetcode/200.txt");
        InputStream in = new BufferedInputStream(new FileInputStream(file));
        System.setIn(in);
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<String>();
        int a,b;
        while(sc.hasNext()){
            a = sc.nextInt();
            b = sc.nextInt();
            sc.nextLine();  //记住nexrInt只是把int读了，但是当前行的换行没读
            System.out.println(a+","+b);
            char[][] grid = new char[a][];
            for (int i = 0; i < a; i++){
                String s  = sc.nextLine();
                grid[i] = s.toCharArray();
            }
//            System.out.println(grid.length);
//            System.out.println(grid[0]);
//            show(grid);
            twohundred t = new twohundred();
            System.out.println(t.numIslands(grid));
        }

    }
}
