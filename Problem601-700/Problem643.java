/**
 * 子数组最大平均数
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-16 22:48
 */

public class Problem643 {

    /**
     * 找出子数组长度为K 且平均数最大的平均数
     * 暴力法会超时
     *
     * @param nums
     * @param k
     * @return
     */
    public double findMaxAverage(int[] nums, int k) {
        if (k > nums.length) {
            return 0;
        }
        double[] num = new double[nums.length - k + 1];
        double index = 0;
        for (int i = 0; i < k; i++) {
            index += nums[i];
        }
        num[0] = index;
        for (int i = 1; i < num.length; i++) {
            num[i] = num[i - 1] - nums[i - 1] + nums[i + k - 1];
            if (num[i] > index) {
                index = num[i];
            }
        }


        return index / k;
    }


    public static void main(String[] args) {
        Problem643 p = new Problem643();
        int[] nums = new int[]{1};
        double maxAverage = p.findMaxAverage(nums, 1);
        System.out.println(maxAverage);
    }
}
