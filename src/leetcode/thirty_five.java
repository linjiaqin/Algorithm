package leetcode;

import java.io.*;
import java.util.Scanner;

public class thirty_five {
    public static int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while (l <= r) {
            int mid = (l+r)/2;
            if (target > nums[mid]) l = mid+1;
            else if (target < nums[mid]) r = mid-1;
            else return mid;
        }
        return l;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("leetcode/35.txt");
        InputStream in = new BufferedInputStream(new FileInputStream(file));
        System.setIn(in);
        Scanner sc = new Scanner(in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] numString = s.split(",");
            int[] nums = new int[numString.length];
            int i = 0;
            for (String e : numString) {
                nums[i++] = Integer.parseInt(e);
            }
            int target = Integer.parseInt(sc.nextLine());
            int a = searchInsert(nums, target);
            System.out.println(a);
        }
    }
}
