/**
 * 删除排序数组中的重复项
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-09 12:10
 */

public class Problem26 {
    /**
     * 原地删除数组中重复的数字
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        // 返回数组的长度
        int len = 0;
        for (int i = 0;i<nums.length - 1;i++){
            // 如果当前元素与后面相同，则跳过
            if(nums[i] != nums[i+1]){
                len ++;
                nums[len] = nums[i+1];
            }
        }
        return len +1;
    }

    public static void main(String[] args) {
        Problem26 p = new Problem26();
        int[] a = new int[]{0,0,1,1,1,2,2,3,3,4};
        p.removeDuplicates(a);
    }
}
