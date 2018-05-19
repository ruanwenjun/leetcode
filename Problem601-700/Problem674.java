/**
 * 最长连续递增序列
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-18 8:49
 */

public class Problem674 {
    /**
     * 找到最长连续递增序列的长度
     *
     * @param nums
     * @return
     */
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        // 最大长度
        int maxLen = 1;
        // 遍历数组
        for (int i = 1; i < nums.length; i++) {
            // 当前长度
            int count = 1;
            while (i < nums.length && nums[i] > nums[i - 1]) {
                count++;
                i++;
            }
            maxLen = Math.max(maxLen, count);

        }
        return maxLen;
    }

    public static void main(String[] args) {
        Problem674 p = new Problem674();
        int[] a = new int[]{1, 3, 5,4, 7};
        int lengthOfLCIS = p.findLengthOfLCIS(a);
        System.out.println(lengthOfLCIS);
    }
}
