/**
 * 最大连续1的个数
 *
 * @Author RUANWENJUN
 * @Creat 2018-04-30 17:58
 */

public class Problem485 {
    /**
     * 计算最大连续1的个数
     *
     * @param nums
     * @return
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        // 遍历数组
        // 记录最大连续1的个数
        int max = 0;
        // 记录当前遍历的连续1的个数
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                index++;

                continue;
            }
            if (index > max) {
                max = index;
            }
            index = 0;
        }
        return max>index?max:index;
    }
}
