package leetcode;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Num_35 {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int mid;
        while(l < r) {
            mid = (l+r)/2;
            if (target > nums[mid]) l = mid+1;
            else r = mid-1;
        }
        return r;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("leetcode/35.txt");
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
        System.setIn(in);
        Scanner sc = new Scanner(in);
        int n;
        while (sc.hasNext()) {
            n = sc.nextInt();
            sc.nextLine();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
        }
    }
}
