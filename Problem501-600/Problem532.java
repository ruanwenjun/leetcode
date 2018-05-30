import java.util.Arrays;

/**
 * 数组中的K-DIFF数对
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-29 21:59
 */

public class Problem532 {
    /**
     * 先对数组排序，然后找数组中值为nums[i] - k 的数
     * k = 0 是特殊情况
     *
     * @param nums
     * @param k
     * @return
     */
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int num = 0;
        if (k == 0) {
            // 找到有多少数是相同的
            for (int i = 1; i < nums.length; i++) {
                if(i < nums.length && nums[i] == nums[i - 1]){
                    num ++;
                }
                while (i < nums.length && nums[i] == nums[i - 1]) {
                    i++;
                }
            }
        }else if(k < 0){
            return num;
        }else {
            for (int i = 0; i < nums.length; i++) {
                int index = Arrays.binarySearch(nums, nums[i] - k);
                if (index >= 0 && index != i) {
                    num++;
                }
                // 找到下一个不等于当前值的
                while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                    i++;
                }
            }
        }
        return num;
    }
}
