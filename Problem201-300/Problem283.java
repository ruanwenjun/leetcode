/**
 * 移动零
 *
 * @Author RUANWENJUN
 * @Creat 2018-04-30 18:47
 */

public class Problem283 {
    /**
     * 将所有0移到末尾，保持非0元素的顺序
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        // 将非0元素移到前面
        int length = nums.length;
        int[] result = new int[length];
        // 记录新数组的下标
        int index =0;
        for(int var : nums){
            if(var != 0){
                result[index++] = var;
            }
        }
        index = 0;
        for(int var : result){
            nums[index++] = var;
        }
    }

    public static void main(String[] args) {
        int[] a = {0,1,0,3,12};
        moveZeroes(a);
    }
}
