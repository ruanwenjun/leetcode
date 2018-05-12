import java.util.Arrays;

/**
 * 三个数的最大乘积
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-11 18:20
 */

public class Problem628 {
    /**
     * 输出数组中三个数的最大乘积
     * @param nums
     * @return
     */
    public int maximumProduct(int[] nums) {
        // 找出所有情况

        Arrays.sort(nums);
        int len = nums.length;
        int i1 = nums[len-1]*nums[len-2]*nums[len-3];
        int i2 = nums[0]*nums[1]*nums[2];
        int i3 = nums[0]*nums[len-1]*nums[len-2];
        int i4 = nums[0]*nums[1]*nums[len-1];
        return Math.max(i1,Math.max(i2,Math.max(i3,i4)));
    }


}
