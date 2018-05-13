/**
 * 缺乏数字
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-02 17:19
 */

public class Problem268 {
    /**
     * 找出没有出现在数字中的那个数，算法应该是线性时间复杂度，恒定的额外空间复杂度
     *
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        // 使用数学方法做更好，利用等差公式计算nums的和，然后减去每一个元素得到的就是结果，只用遍历一遍数组
        int[] a = new int[nums.length+1];
        for (int i : nums) {
            a[i] = 1;
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 0){
                return i;
            }
        }
        return 0;
    }
}
