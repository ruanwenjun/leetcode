/**
 * 移除元素
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-01 18:07
 */

public class Problem27 {
    /**
     * 移除所有值为val的数
     * 返回移除后的长度
     *
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        // 遍历一遍数组
        int length = nums.length;
        for(int i=0;i<length;i++){
            if(nums[i] == val){
                while (length>i && nums[length-1] == val){
                    length --;
                }
                if(length<=i){
                    break;
                }
                nums[i] = nums[--length];

            }

        }
        return length<=0?0:length;
    }

    public static void main(String[] args) {
        int[] nums = {4,5};
        removeElement(nums,5);
    }
}
