/**
 * 旋转数组
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-24 17:00
 */

public class Problem189 {
    /**
     * 将数组中的元素向右移动K个位置
     * 要求原地移动
     *
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        if(nums.length == 0){
            return;
        }
        k = k%nums.length;
        if(k>nums.length/2){
            left(nums,nums.length-k);
            return;
        }
        // 向右移动k个位置
        for (int i = 0; i < k; i++) {
            int index = nums[0];
            // 将每一个元素向左移动1个位子
            for (int j = 1;j<nums.length;j++){
                int tem = nums[j];
                nums[j] = index;
                index = tem;
                // 0 1
            }
            nums[0] = index;
        }

    }

    /**
     * 把数组向左移k个位置
     *
     * @param nums
     * @param k
     */
    public void left(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int index = nums[nums.length - 1];
            // 将每一个元素向左移动1个位子
            for (int j = nums.length-2;j>=0;j--){
                int tem = nums[j];
                nums[j] = index;
                index = tem;
                // 0 1
            }
            nums[nums.length-1] = index;
        }
    }

    public static void main(String[] args) {
        Problem189 p = new Problem189();
        int[] num = new int[]{1, 2, 3, 4, 5, 6};
        p.rotate(num, 2);
    }
}
