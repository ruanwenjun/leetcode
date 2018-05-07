import java.util.*;

/**
 * 数组的度
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-06 16:31
 */

public class Problem697 {
    /**
     * 数组的度是指数组中出现相同数字的最大值
     * 输出具有相同度的最短子数组的长度
     *
     * @param nums
     * @return
     */
    public int findShortestSubArray(int[] nums) {
        // 遍历一遍数组，记录每个元素出现的度
        int[] num = new int[50000];
        int minLen = 50000;
        for (int i = 0; i < nums.length; i++) {
            // 记录当前的度
            num[nums[i]]++;
        }
        // 找出度最大的
        int max = 0;
        for (int i = 0; i < 50000; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (num[nums[i]] == max) {
                set.add(nums[i]);
            }
        }
        for (int i : set) {
            // 找到长度
            int first = 500001;
            int last = -1;
            // 找到度相同的 比较他们的子序列长度,即第一个和最后一个元素下标
            for (int j = 0; j < nums.length; j++) {
                if (j < first && nums[j] == i) {
                    first = j;
                }
                if (nums[j] == i && j > last) {
                    last = j;
                }
            }
            minLen = Math.min(minLen, last - first);
        }
        return minLen + 1;
    }

    public static void main(String[] args) {
        Problem697 p = new Problem697();
        int[] t = new int[]{1, 2, 2, 3, 1, 4, 2};
        p.findShortestSubArray(t);
    }

}
