import java.util.Arrays;

/**
 * 存在重复元素
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-06 16:16
 */

public class Problem217 {
    /**
     * 返回是否存在重复元素
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        // 将数组排序
        Arrays.sort(nums);
        for (int i =0;i<nums.length - 1;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
