/**
 * 只出现一次的数字三
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-06 12:54
 */

public class Problem260 {
    /**
     * 数组中只有两个数只出现了一次，其他元素都出现了两次
     *
     * @param nums
     * @return
     */
    public int[] singleNumber(int[] nums) {
        int[] result = new int[2];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count ^ nums[i];
        }
        // 找到count中为1的那个数，并记录是第几位
        int index = 0;
        for (int i = 0; i < 32; i++) {
            if ((count & 1) == 1) {
                break;
            }
            count = count >> 1;
            index ++;
        }
        count = 1;
        for (int i = 0; i < index; i ++){
            count <<= 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & count) == 0) {
                result[0] = result[0] ^ nums[i];
            }else {
                result[1] = result[1] ^ nums[i];
            }
        }
        return result;

    }
}
