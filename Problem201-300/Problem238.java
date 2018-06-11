import java.util.HashMap;
import java.util.Map;

/**
 * 除自身以外数组的乘积
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-10 21:47
 */

public class Problem238 {
    /**
     * 不要使用除法
     *
     * @param nums
     * @return
     */
    public int[] productExceptSelf(int[] nums) {

        // 分别计算每一个数左边的乘积和右边的乘积
        Map<Integer, Integer> leftMap = new HashMap<>();
        leftMap.put(0, 1);
        for (int i = 1; i < nums.length; i++) {
            leftMap.put(i, leftMap.get(i - 1) * nums[i-1]);
        }
        Map<Integer, Integer> rightMap = new HashMap<>();
        rightMap.put(nums.length - 1, 1);
        for (int i = nums.length - 2; i >= 0; i--) {
            rightMap.put(i, rightMap.get(i + 1) * nums[i+1]);
        }
        int[] result = new int[nums.length];
        for (int i = 0 ; i < result.length;i++){
            result[i] = leftMap.get(i)*rightMap.get(i);
        }
        return result;
    }
}
