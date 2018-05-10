/**
 * 至少是其他数字两倍的最大数
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-09 18:01
 */

public class Problem747 {
    /**
     * 输出数组中最大数的索引，要求最大数至少是其他数的两倍
     * 如果不满足，则输出-1
     * @param nums
     * @return
     */
    public int dominantIndex(int[] nums) {
        // 先找到最大数，然后判断最大数是不是其他数的两倍
        int max = 0;
        int index = 0;
        for (int i =0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
                index = i;
            }
        }
        for (int i =0;i<nums.length;i++){
            if(index != i && max<nums[i]*2){
                return -1;
            }
        }
        return index;
    }
}
