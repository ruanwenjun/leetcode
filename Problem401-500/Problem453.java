import java.util.Arrays;

/**
 * 最小移动次数使数组相等
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-04 16:27
 */

public class Problem453 {
    /**
     * 让数组中所有元素相等的最小移动次数，每次移动使N-1个元素+1
     * @param nums
     * @return
     */
    public int minMoves(int[] nums) {
        // 使用数学方法
        int count = 0;
        // 计算累和
        for (int i : nums){
            count += i;
        }
        // 排序
        Arrays.sort(nums);
        return count-nums[0]*nums.length;
    }

}
