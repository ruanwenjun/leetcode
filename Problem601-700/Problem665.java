/**
 * 非递减数列
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-31 21:48
 */

public class Problem665 {
    /**
     * 能否在最多改变1个元素的情况下将nums变成非递减
     *
     * @param nums
     * @return
     */
    public boolean checkPossibility(int[] nums) {
        // 记录违反非递减的次数
        int count = 0;
        if(nums.length <=1){
            return true;
        }
        // 记录最大的值
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] >= nums[i-1] ){
                continue;
            }else {
                // 违反次数加一
                count ++ ;
                boolean notOk = ((i-2>=0 && nums[i] < nums[i-2]) && (i + 1 <nums.length && nums[i+1] < nums[i-1])) ||
                        count >= 2;
                if(notOk){
                    return false;
                }
            }
        }
        return true;
    }
}
