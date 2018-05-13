import java.util.Arrays;

/**
 * 相对名次
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-06 21:22
 */

public class Problem506 {
    /**
     * 输出相对名次
     * 他们的成绩都不相等
     *
     * @param nums
     * @return
     */
    public String[] findRelativeRanks(int[] nums) {
        // 复制一个数组，然后排序
        int[] ints = Arrays.copyOf(nums, nums.length);
        Arrays.sort(ints);

        // 查看原来的数的名次
        for (int i = 0; i < nums.length; i++) {

            int i1 = Arrays.binarySearch(ints, nums[i]);
            nums[i] = nums.length - i1 -1;
        }
        String[] result = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[i] = "Gold Medal";
            } else if (nums[i] == 1) {
                result[i] = "Silver Medal";
            } else if (nums[i] == 2) {
                result[i] = "Bronze Medal";
            } else {
                result[i] = nums[i]+1 +"";
            }

        }
        return result;
    }
}
