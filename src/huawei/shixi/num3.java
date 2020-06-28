package huawei.shixi;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class num3 {

    public static boolean isrow(int mat[][], int x){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < 9; i++){
            if (mat[x][i] != 0) {
                if (map.containsKey(mat[x][i])){
                    return false;
                }
                else {
                    map.put(mat[x][i], 1);
                }
            }
        }
        return true;
    }
    public static boolean iscol(int mat[][], int y){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < 9; i++){
            if (mat[i][y] != 0) {
                if (map.containsKey(mat[i][y])){
                    return false;
                }
                else {
                    map.put(mat[i][y], 1);
                }
            }
        }
        return true;
    }
    public static boolean isNine(int mat[][], int x, int y){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = x; i <x+3; i++){
            for(int j = y; j< y+3; j++){
                if (mat[i][j] != 0) {
                    if (map.containsKey(mat[i][y])){
                        return false;
                    }
                    else {
                        map.put(mat[i][y], 1);
                    }
                }
            }
        }
        return true;
    }
    public static boolean check(int x, int y){
        if (x < 0 || y <0 ||x >=9 ||y>=9) return false;
        return true;
    }
    public static boolean isok(int[][] mat){
        int sum = 0;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                sum += mat[i][j];
            }
        }
        if (sum == 45*9) return true;
        else return  false;
    }
    public static boolean isfill(int[][] mat){
        for (int i = 0; i< 9; i++)
            for (int j = 0; j < 9; j++){
                if (mat[i][j] == 0) return false;
            }
        return true;
    }
    //public static boolean[][] row = new boolean[9][9];
    public static int[][] res = new int[9][9];
    public static void skdo(int[][] mat, int x, int y){
//        for(int i = 0; i < 9; i++){
//            for (int j = 0; j < 9; j++){
//                System.out.print(mat[i][j]);
//                res[i][j] = mat[i][j];
//            }
//            System.out.println();
//        }
        if (isfill(mat)){
                for(int i = 0; i < 9; i++){
                    for (int j = 0; j < 9; j++){
                        System.out.print(mat[i][j]);
                        //res[i][j] = mat[i][j];
                    }
                    System.out.println();
                }
            return;
        }
        if (!check(x,y)) return;
        if (!isrow(mat, x) || !iscol(mat, y) || !isNine(mat,x,y)) return;
        if (mat[x][y] == 0) {
            for(int k = 1; k<= 9; k++){
                mat[x][y] = k;
                skdo(mat,x+1,y);
                skdo(mat, x-1, y);
                skdo(mat, x, y+1);
                skdo(mat, x, y-1);
                mat[x][y] = 0;
            }
        }
        else{
            skdo(mat,x+1,y);
            skdo(mat, x-1, y);
            skdo(mat, x, y+1);
            skdo(mat, x, y-1);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("huawei/c.txt");
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
        System.setIn(in);
        Scanner sc = new Scanner(System.in);
        String s;
        String tmp;
        int[][] mat = new int[9][9];
        while (sc.hasNext()){
            for(int i = 0; i < 9; i++){
                s = sc.nextLine();
                tmp = s.substring(1,18);
                String[] tmp1 = tmp.split(",");
                int j = 0;
                for (String e: tmp1){
                    mat[i][j++] = Integer.valueOf(e);
                }
            }
//            for(int i = 0; i < 9; i++){
//                for (int j = 0; j < 9; j++){
//                    System.out.print(mat[i][j]);
//                    res[i][j] = mat[i][j];
//                }
//                System.out.println();
//            }

            skdo(mat, 0, 0);
//            for (int i = 0; i < 9; i++){
//                System.out.print("{");
//                for (int j = 0; j < 8; j++) {
//                    System.out.print(res[i]+",");
//                }
//                System.out.println(res[8]+"}");
//            }

        }
    }
}
