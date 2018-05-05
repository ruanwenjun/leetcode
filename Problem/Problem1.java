import com.sun.security.auth.NTNumericCredential;

import java.util.Arrays;

/**
 * 两数之和
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-04 14:08
 */

public class Problem1 {
    /**
     * 找出数组中值等于目标的元素的下标
     * 每个元素只能用一次
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        // 复制数组
        int[] ints = Arrays.copyOf(nums, nums.length);
        // 排序
        Arrays.sort(ints);
        int start = 0;
        int last = 0;
        for (int i = 0;i<ints.length;i++){
            int num = target - ints[i];
            int i1 = Arrays.binarySearch(ints, num);
            if(i1 != i && i1 >=0){
                start = ints[i];
                last = ints[i1];
                break;
            }
        }
        // 将得到的两个数的下标找出
        int fir = -1;
        int sec = -1;
        for (int j =0;j<nums.length;j++){
            if(fir == -1 && nums[j] == start){
                fir = j;
                continue;
            }else if(nums[j] == last) {
                sec = j;
            }
        }
        int[] result = new int[2];
        result[0] = Math.min(fir,sec);
        result[1] = Math.max(fir,sec);
        return result;

    }
}
