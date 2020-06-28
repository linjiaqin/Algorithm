package book.dp;

import java.util.Arrays;
import java.util.Comparator;

import static book.dp.LIS.lengthOfLIS;

/**
 * 二位LIS， 信封嵌套问题
 * 这个解法的关键在于，对于宽度 w 相同的数对，要对其高度 h 进行降序排序。
 * 因为两个宽度相同的信封不能相互包含的，逆序排序保证在 w 相同的数对中最多只选取一个。
 *
 * 对宽从小到大排序之后，就可以不用考虑宽了。  然后宽相同时高度逆序是因为，宽相同时只能选一个，这样就变成高度上的LIS
 *
 */
public class dimetionLIS {
    public int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length;
        // 按宽度升序排列，如果宽度一样，则按高度降序排列
        Arrays.sort(envelopes, new Comparator<int[]>()
        {
            public int compare(int[] a, int[] b) {    //这里一个数组相当于二维数组的一个
                return a[0] == b[0] ?
                        b[1] - a[1] : a[0] - b[0];
            }
        });
        // 对高度数组寻找 LIS
        int[] height = new int[n];
        for (int i = 0; i < n; i++)
            height[i] = envelopes[i][1];

        return lengthOfLIS(height);
    }


    public static void main(String[] args) {

    }
}
