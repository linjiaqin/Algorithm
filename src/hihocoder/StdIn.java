package hihocoder;

import java.io.*;
import java.util.Scanner;

public class StdIn {
    public static Scanner getScanner(int fileNumber){
        String path = String.format("hihocoder/%s.txt", fileNumber);
        File file = new File(path);
        InputStream in = null;
        try {
            in = new BufferedInputStream(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.setIn(in);
        return new Scanner(System.in);
    }

    public static void main(String[] args) {
        getScanner(1994);
    }
}
