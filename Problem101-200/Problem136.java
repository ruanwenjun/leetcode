/**
 * 只出现一次的数字
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-02 13:47
 */

public class Problem136 {
    /**
     * 找出只出现一次的数字,只有一个元素出现一次，其余均出现两次
     * 要求算法具有线性时间复杂度,不使用额外空间？
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        // 使用异或来做
        int i = 0;
        for (int num : nums){
            i = i ^ num;
        }
        return i;
    }


}
